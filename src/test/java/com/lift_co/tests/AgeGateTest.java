package com.lift_co.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
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
public class AgeGateTest extends Base
{	
	AgeGatePage ageGate;
	HomePage objhomePage;
	SoftAssert sa = new SoftAssert();
	
	public AgeGateTest()
	{
		super();
	}
	
	@BeforeSuite
	public void createReport()
	{
		create_ext_Report("Lift&CO_Demo "+Utility.date_Time().toString());
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		ageGate = new AgeGatePage();
		objhomePage = new HomePage();
	}
	
	@Test(priority=1, enabled=true)
	public void AgeGatePopup_DisplayTest() throws Throwable
	{
     try{
    	 create_ext_Test("Age Gate Popup Display Test");
		boolean flag = ageGate.ageTitle.isDisplayed();
		sa.assertTrue(flag, "Age Gate Title is Not appeared");
		if(flag==false){
			et.log(LogStatus.FAIL, "Age Gate Title is Not displayed");}
		else { et.log(LogStatus.PASS, "Age Gate Title is displayed");}
		
		boolean flag1 = ageGate.ageMsg.isDisplayed();
		sa.assertTrue(flag1, "Age Gate Msg is Not appeared");
		if(flag1==false){
			et.log(LogStatus.FAIL, "Age Gate Msg is Not displayed");}
		else { et.log(LogStatus.PASS, "Age Gate Msg is displayed");}
		
		boolean flag2 = ageGate.yesBtn.isDisplayed();
		sa.assertTrue(flag2, "Yes button is Not appeared");
		if(flag2==false){
			et.log(LogStatus.FAIL, "Yes button is Not displayed");}
		else { et.log(LogStatus.PASS, "Yes button is displayed");}
		
		boolean flag3 = ageGate.noBtn.isDisplayed();
		sa.assertTrue(flag3, "No button is Not appeared");
		if(flag3==false){
			et.log(LogStatus.FAIL, "No button is Not displayed");}
		else { et.log(LogStatus.PASS, "No button is displayed");}
		
		boolean flag4 = ageGate.policy.isDisplayed();
		sa.assertTrue(flag4, "Policy link is Not appeared");
		if(flag4==false){
			et.log(LogStatus.FAIL, "Policy link is Not displayed");}
		else { et.log(LogStatus.PASS, "Policy link is displayed");}
		
		boolean flag5 = ageGate.termsCondition.isDisplayed();
		sa.assertTrue(flag5, "Terms & Conditions is Not appeared");
		if(flag5==false){
			et.log(LogStatus.FAIL, "Terms & conditions is Not displayed");}
		else { et.log(LogStatus.PASS, "Terms & conditions is displayed");}
		
	    sa.assertAll();
		}catch(Exception ex)
		{
			et.log(LogStatus.ERROR, ex.getMessage());
		}	
	}

	@Test(priority=2, enabled=true)
	public void AgeVerificationTest() throws Throwable 
	{
      try{
    	    create_ext_Test("Age Verification Test");
			String age=prop.getProperty("isAgeMoreThan_18?");
			if(age.equalsIgnoreCase("yes"))
			{
				Assert.assertEquals(age, "yes");
				ageGate.yesBtn.click();
				wait(objhomePage.login_Btn);
				Assert.assertTrue(objhomePage.login_Btn.isDisplayed());
				et.log(LogStatus.PASS, "18+ Age Verified");
			}else {
				ageGate.noBtn.click();
				Assert.assertTrue(ageGate.sorryMsg.isDisplayed());
				et.log(LogStatus.PASS, "Less than 18 years Age detected");
			}
		}catch(Exception ex)
		{
			et.log(LogStatus.ERROR, ex.getMessage());
		}
	}
	
	@Test(priority=3, enabled=false)
	public void validate_forAgeLessThan18() throws Throwable
	{
		try{
			String age=prop.getProperty("isAgeMoreThan_18?");
			Assert.assertEquals(age, "no");
			ageGate.noBtn.click();
			Thread.sleep(1000);
			Assert.assertTrue(ageGate.sorryMsg.isDisplayed());
		}catch(Exception ex)
		{
			et.log(LogStatus.FAIL, "Less than 18 years Age gate Test failed");
		}
	}
	
	
	@Test(priority=4, enabled=false)
	public void validate_forAgeMoreThan18() throws Throwable
	{
		try{
			String age=prop.getProperty("isAgeMoreThan_18?");
			Assert.assertEquals(age, "yes");
			ageGate.yesBtn.click();
			Thread.sleep(1000);
			Assert.assertTrue(objhomePage.login_Btn.isDisplayed());
		}catch(Exception ex)
		{
			et.log(LogStatus.FAIL, "More than 18 years Age gate Test failed");
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void closeReport()
	{
		close_ext_Report();
	}

}
