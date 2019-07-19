package com.lift_co.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lift_co.base.Base;

public class WriteReviewPage extends Base
{	    
	// ===== WebElements for create-review/1 Page- Ratings Page....for writing a Review for Logged user
	
			@FindBy(xpath="//input[@placeholder='Search']")
		    public WebElement searchBox;
			
			@FindBy(xpath="//h3[text()='Click to review']")
		   	public WebElement review_header;
			
			@FindBy(xpath="//div[text()='Argyle Oil']")
		   	public WebElement argyleOil_Brand;

		    @FindBy(xpath="//div[text()='What would you rate this Product?']")
			public WebElement rating_Msg;
		    
		    @FindBy(xpath="//div[text()='Would you purchase this product again?']")
			public WebElement likeToPurchaseAgain_Msg;
			
		    WebElement starRatings = driver.findElement(By.xpath("//span[@class='starRating']/span["+prop.getProperty("rating")+"]"));
		    
		    @FindBy(xpath="//span[@class='starRating']/span[5]")
			public WebElement rating;
		    
		    @FindBy(xpath="(//label[@class='radioGroup__label'])[1]")
			public WebElement yes_Btn;
			
			@FindBy(xpath="(//label[@class='radioGroup__label'])[2]")
			public WebElement no_Btn;
			
			@FindBy(xpath="//div[text()='Continue']")
			public WebElement continueBtn;
			
			// ===== WebElements for create-review/2 Page- Upload Receipt....for writing a Review for Logged user
			
			@FindBy(xpath="//div[text()='Upload receipt']")
			public WebElement uploadReceipt_Tab;
			
			@FindBy(xpath="//a[text()='Choose files']")
			public WebElement chooseFiles_link;
			
			@FindBy(xpath="//div[text()='Next']")
			public WebElement nextBtn;
			
			@FindBy(xpath="//div[text()='Back']")
			public WebElement backBtn;
			
			// ===== WebElements for create-review/3 Page- Effects....for writing a Review for Logged user
			
			@FindBy(xpath="//div[text()='Effect']")
			public WebElement effect_Tab;
			
			@FindBy(xpath="//div[text()='Select a positive effect here']")
			public WebElement positiveEffect_Dpdwn;
			
			@FindBy(xpath="//div[text()='Select a negative effect here']")
			public WebElement negativeEffect_Dpdwn;
			
			@FindBy(xpath="//div[text()='Select a symptom here']")
			public WebElement symptomsHelp_Dpdwn;
			
			@FindBy(xpath="//div[text()='Select an activity here']")
			public WebElement activities_Dpdwn;
			
			// ===== WebElements for create-review/4 Page- Consumption....for writing a Review for Logged user
			
			@FindBy(xpath="//div[text()='Consumption']")
			public WebElement consumption_Tab;
			
			@FindBy(xpath="(//div[text()='Select duration...'])[1]")
			public WebElement durationOfEffect_Dpdwn;
			
			@FindBy(xpath="(//span[@class='Select-arrow-zone'])[2]")
			public WebElement onsetBeforeEffect_Dpdn;
			
			@FindBy(xpath="//div[text()='Select a flavour here']")
			public WebElement scent_Dpdwn;
			
			       // Preferred methods of consumption
			@FindBy(xpath="//div[text()='Vaporizer']")
			public WebElement vaporizer;
			
			@FindBy(xpath="//div[text()='Joint']")
			public WebElement joint;
			
			@FindBy(xpath="//div[text()='Edibles']")
			public WebElement edibles;
			
			       // Preferred Time of Consumption
			@FindBy(xpath="//div[text()='Morning']")
			public WebElement morningTime;
			
			@FindBy(xpath="//div[text()='Daytime']")
			public WebElement dayTime;
			
			@FindBy(xpath="//div[text()='Evening']")
			public WebElement eveningTime;
			
			// ===== WebElements for create-review/5 Page....for writing a Review for Logged user
			
			@FindBy(xpath="//div[text()='Review']")
			public WebElement review_Tab;
			
			@FindBy(xpath="//input[@id='title']")
			public WebElement reviewTitle_Field;
			
			@FindBy(xpath="//div[@aria-label='rdw-editor']")
			public WebElement reviewEditorBody;
			
			@FindBy(xpath="//textarea[@id='message']")
			public WebElement reviewComments_Field;
			
			// ===== WebElements for create-review/6 Page....for writing a Review for Logged user
			
			@FindBy(xpath="//div[text()='Upload a photo']")
			public WebElement uploadPhoto_Tab;
			
			@FindBy(xpath="(//div[text()='Submit'])[2]")
			public WebElement submitBtn;
			
			// ===== WebElements for review-submit success Page....for writing a Review for Logged user
			
			@FindBy(xpath="//a[text()='Write another review']")
			public WebElement writeAnotherReview_Btn;
			
			@FindBy(xpath="//a[text()='Redeem rewards']")
			public WebElement redeemRewards_Btn;
			
			@FindBy(xpath="//h2[text()='Thanks for sharing your experience!']")
			public WebElement thanksMsg;
			
			@FindBy(xpath="//div[contains(text(),'Your review has been submitted and is pending approval.')]")
			public WebElement reviewSubmitMsg;
			
			@FindBy(xpath="//div[contains(@class,'reviewSubmitSuccessPage__pointsText')]")
			public WebElement liftPoints;
			
			@FindBy(xpath="//div[@class='reviewSubmitSuccessPage__effectName']")
			public WebElement pointsEarnedThisMonth_Msg;
			
			@FindBy(xpath="//span[contains(@class,'reviewSubmitSuccessPage')]")
			public WebElement points_earnedThisMonth;
			
			@FindBy(xpath="//div[contains(text(),'please contact us at hello@lift.co')]")
			public WebElement liftPoint_Msg;
			
			@FindBy(xpath="//a[text()='Close']")
			public WebElement closeBtn;
	   
			// Constructor method
			public WriteReviewPage()
			{
				PageFactory.initElements(driver,this);
			}		
}
