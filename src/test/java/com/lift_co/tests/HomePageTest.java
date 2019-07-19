package com.lift_co.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.TestNG_listener.CustomListener;
import com.lift_co.base.Base;
import com.lift_co.pages.AgeGatePage;
import com.lift_co.pages.HomePage;
import com.lift_co.util.Utility;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(CustomListener.class)
public class HomePageTest extends Base
{
	AgeGatePage ageGate;
	HomePage objhomePage;
	SoftAssert sa=new SoftAssert();
	
	public HomePageTest()
	{
		super();
	}
	
//	@BeforeClass
//	public void createReport()
//	{
//		create_ext_Report("Page_Module ");
//	}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		initialization();
		ageGate = new AgeGatePage();
		objhomePage = new HomePage();
		ageGate.validAge();
	}
	
	@Test(priority=1)        // ID: HomePage_1
	public void verify_HomePage_Elements() throws Throwable
	{
		try{
			 create_ext_Test("Displaying Homepage Elements Test");
			  // Verifying that Register Now button is available or not
			  boolean flag = objhomePage.registerNow_Btn.isDisplayed();
			    sa.assertTrue(flag, "Register Now button is not displayed");
				if(flag==false){
					Utility.screenshot_Fail("Register Now button is not displayed");}
				else { et.log(LogStatus.PASS, "Register Now button is displayed");}
			  
			  // Verifying that Featured products is available or not
			  boolean flag1 = objhomePage.featured_Products_Header.isDisplayed();
			    sa.assertTrue(flag1, "Featured products is not displayed");
				if(flag1==false){
					Utility.screenshot_Fail("Featured products is not displayed");}
				else { et.log(LogStatus.PASS, "Featured products is displayed");}
						
			  // Verifying that Lift & Co Magazine is available or not
			  boolean flag3 = objhomePage.liftCo_Magazine_Header.isDisplayed();
			    sa.assertTrue(flag3, "Lift & Co Magazine is not displayed");
				if(flag3==false){
					Utility.screenshot_Fail("Lift & Co Magazine is not displayed");}
				else { et.log(LogStatus.PASS, "Lift & Co Magazine is displayed");} 
              
             // Verifying that Featured Press is available or not
		 	  boolean flag2 = objhomePage.featrured_Press_Header.isDisplayed();
			    sa.assertTrue(flag2, "Featured Press is not displayed");
				if(flag2==false){
					Utility.screenshot_Fail("Featured Press is not displayed");}
				else { et.log(LogStatus.PASS, "Featured Press is displayed");}
              
				 sa.assertAll();
		 }catch(Exception ex){
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
