package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CompletePage {
	
	WebDriver driver;

	public CompletePage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	WebElement successMessage;
	
	@FindBy(id="back-to-products")
	WebElement backHomeBtn;
	
	public void getsuccessMessage(){
		
		String msg = successMessage.getText();
		System.out.println("Success Message is :"+msg);
		
		if(msg.equals("Thank you for your order!")){
			
			Assert.assertTrue(true);
			System.out.println("Success message found.");
		}
		else{
			Assert.assertTrue(false);
			System.out.println("Success message not found.");
		}
	}
	
	public void clickOnbackHomeBtn(){
		
		backHomeBtn.click();
	}

}
