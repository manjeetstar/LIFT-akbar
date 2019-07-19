package com.lift_co.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lift_co.base.Base;

public class ReadReviewPage extends Base
{
	@FindBy(xpath="//h1[text()='Read the latest reviews']")
    public WebElement readReview_Header;
	
	

	// Constructor method
	public ReadReviewPage()
	{
		PageFactory.initElements(driver,this);
	}

}
