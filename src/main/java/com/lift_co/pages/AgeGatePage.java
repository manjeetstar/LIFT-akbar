package com.lift_co.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lift_co.base.Base;

public class AgeGatePage extends Base
{
	@FindBy(xpath="//div[text()='Yes']")
	public WebElement yesBtn;
	
	@FindBy(xpath="//div[text()='No']")
	public WebElement noBtn;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	public WebElement termsCondition;
	
	@FindBy(xpath="(//a[text()='Privacy Policy'])[2]")
	public WebElement policy;
	
	@FindBy(xpath="//div[@class='column centered small-11 ageConfirmation__negativeAnswer']")
	public WebElement sorryMsg;
	
	@FindBy(xpath="//p[contains(text(),'Are you the age of majority in your province?')]")
	public WebElement ageMsg;
	
	@FindBy(xpath="//h1[text()='Can we see some ID, please?']")
	public WebElement ageTitle;
	
	//Constructor Initialization
	public AgeGatePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// Methods
	
	public void validAge() throws Exception
	{
		yesBtn.click();
		Thread.sleep(1000);
	}
}
