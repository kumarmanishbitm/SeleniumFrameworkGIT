package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;

	public AddToCartPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addToCartBtn;

	@FindBy(id="checkout")
	WebElement checkoutBtn;

	public void clickOnAddToCartBtn(){
		addToCartBtn.click();
	}

	public void clickOnCheckoutBtn(){
		checkoutBtn.click();
	}

}
