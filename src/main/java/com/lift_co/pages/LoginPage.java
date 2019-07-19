package com.lift_co.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lift_co.base.Base;

public class LoginPage extends Base
{
	@FindBy(xpath="//div[@class='header container']/descendant::*[5]")
	public WebElement logo_lift_co; 
	
	@FindBy(xpath="//h1[text()='Login']")
	public WebElement login_img; 
	
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;

	@FindBy(xpath="//a[text()='Forgot password?']")
	public WebElement forgotpwd;
	
	@FindBy(xpath="//div[text()='Sign in']")
	public WebElement signinBtn;
	
	@FindBy(xpath="//div[text()='username is a required field']")
	public WebElement blankUid;
	
	@FindBy(xpath="//div[text()='password is a required field']")
	public WebElement blankPwd;
	
	@FindBy(xpath="//div[@class='row column mb-hg']/div[2]")
	public WebElement incorrectUid;
	
	@FindBy(xpath="//div[text()='Incorrect password']")
	public WebElement incorrectPwd;
	
	@FindBy(xpath="//div[@class='login']/form/div/div[2]")
	public WebElement both_Uid_n_Pwd_Invalid;
	
	// Constructor of class
	public LoginPage()
	{
		PageFactory.initElements(driver, this);   // Initialize elements
	}
	    
	// Operations
	public void signIn(String uid, String pwd) throws Exception
	{
		username.clear();
		username.sendKeys(uid);
		password.clear();
		password.sendKeys(pwd);
		signinBtn.click();
		Thread.sleep(1000);
	}
	
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verify_Lift_Logo()
	{
		return logo_lift_co.isDisplayed();
	}
	
}
