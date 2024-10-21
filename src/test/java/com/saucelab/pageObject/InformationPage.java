package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
	
	WebDriver driver;

	public InformationPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="postalCode")
	WebElement zipCode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public void enterFirstName(){
		firstName.sendKeys("TestFName");
	}
	public void enterLastName(){
		lastName.sendKeys("TestLName");
	}
	public void enterZipCode(){
		zipCode.sendKeys("210301");
	}
	public void clickOnContinueBtn(){
		continueBtn.click();
	}

}
