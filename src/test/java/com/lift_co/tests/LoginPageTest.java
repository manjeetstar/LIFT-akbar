package com.lift_co.tests;

import java.io.File;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TestNG_listener.CustomListener;
import com.lift_co.base.Base;
import com.lift_co.pages.AgeGatePage;
import com.lift_co.pages.HomePage;
import com.lift_co.pages.LoginPage;
import com.lift_co.pages.ReadReviewPage;
import com.lift_co.pages.WriteReviewPage;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Sheet;
import jxl.Workbook;

@Listeners(CustomListener.class)
public class LoginPageTest extends Base
{
	AgeGatePage ageGate;
	HomePage objhomePage;
	LoginPage objLoginPage;
	ReadReviewPage objReadReviewPage;
	WriteReviewPage objWriteReviewPage;
	
	SoftAssert sa=new SoftAssert();
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		ageGate = new AgeGatePage();
		objhomePage = new HomePage();
		objLoginPage = new LoginPage();
		objReadReviewPage = new ReadReviewPage();
		objWriteReviewPage = new WriteReviewPage();
	}
	
	@Test(priority=1, enabled=false)
	public void loginPageTitleTest()
	{
		String title = objLoginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Lift & Co." , "Login page title is wrong");
	}
	
	@Test(priority=2, enabled=false)
	public void loginTest() throws Exception
	{
		create_ext_Test("User Login Test");
		wait(objhomePage.login_Btn);
		objhomePage.login_Btn.click();
		wait(objLoginPage.username);
		
		   // Open Excel file in Read mode using JXL
		try {
				File f=new File("Login_Module.xls");
				Workbook rwb=Workbook.getWorkbook(f);
				Sheet rsh=rwb.getSheet(0);   //indicate sheet 1
				int nour=rsh.getRows();
		
		   // Get Data from Sheet & Start DDT from 2nd Row i.e; index-1 bcoz, 1St Row is for Column Headings
			for(int i=1; i<nour; i++)
		    {
			   String bname=rsh.getCell(0,i).getContents();
		       String u=rsh.getCell(1,i).getContents();			   
			   String uc=rsh.getCell(2,i).getContents();
			   String p=rsh.getCell(3,i).getContents();
			   String pc=rsh.getCell(4,i).getContents();
				
	      try {	
	     // length==0 means field is blank
		  if(u.length()==0 && driver.findElement(By.xpath("//div[text()='username is a required field']")).isDisplayed())
	      {
	    	  et.log(LogStatus.PASS,"Blank uid test passed");
	      }
	      else if(uc.contains("invalid") && driver.findElement(By.xpath("//div[@class='row column mb-hg']/div[2]")).isDisplayed())
	      {
	    	  et.log(LogStatus.PASS,"Invalid uid test passed");
	      }
	      else if(p.length()==0 && driver.findElement(By.xpath("//div[text()='password is a required field']")).isDisplayed())
          {
       	      et.log(LogStatus.PASS,"Blank pwd test passed");
          }
          else if(pc.contains("invalid") && driver.findElement(By.xpath("//div[text()='Incorrect password']")).isDisplayed())
          {
       	      et.log(LogStatus.PASS,"Invalid pwd test passed");
          }
          else     //(uc.contains("valid") && pc.contains("valid"))
          {
       	      objLoginPage.signinBtn.click();
        	  et.log(LogStatus.PASS,"Login Test is passed");   
          }
	    } catch(Exception ex)
	    {
	    	et.log(LogStatus.FAIL, "Login Test is failed");
	    }
	  } 
     } catch(Exception ex)
		{
    	    et.log(LogStatus.ERROR, ex.getMessage());
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		//close_ext_Report();
	}
}
