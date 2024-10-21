package com.saucelab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver driver;

	public LogoutPage(WebDriver driver){

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="react-burger-menu-btn")
	WebElement hamBurgerIcon;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logoutBtn;
	
	
	public void clickOnHamburgerIcon(){
		hamBurgerIcon.click();
	}
	
	public void clickOnlogoutBtn(){
		logoutBtn.click();
	}

}
