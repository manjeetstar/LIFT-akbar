package com.lift_co.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lift_co.base.Base;

public class HomePage extends Base
{
	// ====Header Elements
	@FindBy(xpath="//div[@class='header container']/descendant::*[4]")
	public WebElement logo_list_co;
	
	@FindBy(xpath="//div[text()='Login']")
	public WebElement login_Btn;
	
	@FindBy(xpath="//div[text()='Join']")
	public WebElement join_Btn;
	
	@FindBy(xpath="//div[@class='userDropdown__avatar']")
	public WebElement profile_setting;
	
	@FindBy(xpath="(//input[@placeholder='Search for strains, oils, producers ...'])[1]")
	public WebElement searchfield_Global;
	
	@FindBy(xpath="//div[text()='No results found.']")
	public WebElement searchfield_Global_noResult;
	
	@FindBy(xpath="(//span[contains(@class,'link mainMenu')])[1]")
	public WebElement products_List;
	
	@FindBy(xpath="(//span[contains(@class,'link mainMenu')])[2]")
	public WebElement business_List;
	
	@FindBy(xpath="(//span[contains(@class,'link mainMenu')])[3]")
	public WebElement reviews_List;

	@FindBy(xpath="(//div[@class='mainMenu__item']/a)[1]")
	public WebElement rewards_link;
	
	@FindBy(xpath="(//div[@class='mainMenu__item']/a)[2]")
	public WebElement magazine_link;
	
	@FindBy(xpath="(//div[@class='mainMenu__item']/a)[3]")
	public WebElement learn_link;

	@FindBy(xpath="(//ul[@class='secondaryMenu']/li/a)[2]")
	public WebElement forum_link;
	
	@FindBy(xpath="(//ul[@class='secondaryMenu']/li/a)[1]")
	public WebElement investors_link;
	
	@FindBy(xpath="//div[text()='Get started']")
	public WebElement getStarted_Btn;
	
	// ==== Header inner Elements
	
	@FindBy(xpath="(//a[text()='Explore Strains'])[1]")
	public WebElement exploreStrains_link;
	
	@FindBy(xpath="(//a[text()='Explore Oils'])[1]")
	public WebElement exploreOils_link;
	
	@FindBy(xpath="(//a[text()='Recreational Brands'])[1]")
	public WebElement recreationalBrands_link;
	
	@FindBy(xpath="(//a[text()='Medical Producers'])[1]")
	public WebElement medicalProducers_link;
	
	@FindBy(xpath="(//a[text()='Clinics'])[1]")
	public WebElement clinics_link;
	
	@FindBy(xpath="(//a[text()='Write a review'])[1]")
	public WebElement writeReview_link;
	
	@FindBy(xpath="(//a[text()='Read reviews'])[1]")
	public WebElement readReviews_link;
	
	@FindBy(xpath="//a[@class='userDropdown__username']")
	public WebElement username_link;
	
	@FindBy(xpath="(//a[text()='Profile'])[1]")
	public WebElement profile_link;
	
	@FindBy(xpath="(//a[text()='My Reviews'])[1]")
	public WebElement myReviews_link;
	
	@FindBy(xpath="(//a[text()='Favourites'])[1]")
	public WebElement favorites_link;
	
	@FindBy(xpath="(//a[text()='Change Password'])[1]")
	public WebElement changePassword_link;
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	public WebElement logout_link;
	
	// ==== Recommendation Elements
	
	@FindBy(xpath="//h2[text()='How do you want to feel?']")
	public WebElement msg_HowDoYouFeel;
	
	@FindBy(xpath="//p[text()='Uplifted']")
	public WebElement uplifted;
	
	@FindBy(xpath="//p[text()='Energized']")
	public WebElement energized;
	
	@FindBy(xpath="//p[text()='Focused']")
	public WebElement focused;
	
	@FindBy(xpath="//p[text()='Relaxed']")
	public WebElement relaxed;
	
	@FindBy(xpath="//p[text()='Sleepy']")
	public WebElement sleepy;
	
	@FindBy(xpath="//p[text()='Pain relief']")
	public WebElement painRelief;
	
	@FindBy(xpath="//div[text()='Find Strains']")
	public WebElement findStrains_Btn;
	
	@FindBy(xpath="//a[text()='Register now']")
	public WebElement registerNow_Btn;
	
	// ===== Body Elements
	@FindBy(xpath="//h2[text()='Featured Products']")
   	public WebElement featured_Products_Header;
	
	@FindBy(xpath="//h2[text()='Lift & Co. Magazine']")
   	public WebElement liftCo_Magazine_Header;
	
	@FindBy(xpath="//h2[text()='Featured press']")
   	public WebElement featrured_Press_Header;
	
	// Constructor method
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// ====Actions 
	public void search(String text)
	{
		Actions act = new Actions(driver);
		act.sendKeys(searchfield_Global, text).build().perform();
	}
}