package com.saucelab.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucelab.pageObject.AddToCartPage;
import com.saucelab.pageObject.CompletePage;
import com.saucelab.pageObject.InformationPage;
import com.saucelab.pageObject.LoginPage;
import com.saucelab.pageObject.LogoutPage;
import com.saucelab.pageObject.OverviewPage;
import com.saucelab.pageObject.ProductPage;
import com.saucelab.utility.Screenshot;

public class LoginTest extends BaseClass {
	
	@Test
	public void verifyLogin() throws IOException{
		
		driver.get(url);
		logger.info("URL has been launched.");
		
		LoginPage lp = new LoginPage(driver);
		Screenshot s = new Screenshot();
		lp.enterUsername();
		logger.info("Username has enetred.");
		lp.enterPassword();
		logger.info("Password has enetred.");
		lp.clickOnLoginBtn();
		logger.info("Login button has clicked.");
		
		String title  = driver.getTitle();
		System.out.println("Product Page title is :"+title);
		
		if(title.equals("Swag Labs")){
			logger.info("Product page title verification passed.");
			Assert.assertTrue(true);
			System.out.println("Product Page title is :"+title);
		}
		else{
			s.captureScreenshot(driver, "Verify Product page title");
			logger.info("Product page title verification Failed.");
			Assert.assertTrue(false);
		}
		
		ProductPage prodPage = new ProductPage(driver);
		
		prodPage.clickOnItemLink();
		logger.info("Item link has clicked.");
		prodPage.clickOnAddToCartBtn();
		logger.info("Add To Cart button has clicked.");
		
		String prodPageUrl = driver.getCurrentUrl();
		System.out.println("Product Page URL is :"+prodPageUrl);
		
		if(prodPageUrl.equals("https://www.saucedemo.com/inventory-item.html?id=4")){
			logger.info("Product page URL verification passed.");
			Assert.assertTrue(true);
			System.out.println("Product Page URL is :"+prodPageUrl);
		}
		else{
			s.captureScreenshot(driver, "Verify Product page URL");
			logger.info("Product page URL verification Failed.");
			Assert.assertTrue(false);
		}
		
		AddToCartPage cart = new AddToCartPage(driver);
		
		cart.clickOnAddToCartBtn();
		logger.info("AddToCart button has clicked.");
		cart.clickOnCheckoutBtn();
		logger.info("Checkout button has clicked.");
		
		String infoPageUrl = driver.getCurrentUrl();
		System.out.println("Information Page URL is :"+infoPageUrl);
		
		if(infoPageUrl.equals("https://www.saucedemo.com/checkout-step-one.html")){
			logger.info("Information page URL verification passed.");
			Assert.assertTrue(true);
			System.out.println("Information Page URL is :"+infoPageUrl);
		}
		else{
			s.captureScreenshot(driver, "Verify Information page URL");
			logger.info("Information page URL verification Failed.");
			Assert.assertTrue(false);
		}
		
		InformationPage ip = new InformationPage(driver);
		
		ip.enterFirstName();
		logger.info("First Name has entered");
		ip.enterLastName();
		logger.info("Last Name has entered");
		ip.enterZipCode();
		logger.info("Zip Code has entered");
		ip.clickOnContinueBtn();
		logger.info("Continue button has clicked.");
		
		String overviewPageUrl = driver.getCurrentUrl();
		System.out.println("Overview Page URL is :"+overviewPageUrl);
		
		if(overviewPageUrl.equals("https://www.saucedemo.com/checkout-step-two.html")){
			logger.info("Overview page URL verification passed.");
			Assert.assertTrue(true);
			System.out.println("Overview Page URL is :"+overviewPageUrl);
		}
		else{
			s.captureScreenshot(driver, "Verify Overview page URL");
			logger.info("Overview page URL verification Failed.");
			Assert.assertTrue(false);
		}
		
		OverviewPage overviewpg = new OverviewPage(driver);
		overviewpg.clickOnFinishBtn();
		logger.info("Finish button has clicked.");
		
		String finishPageUrl = driver.getCurrentUrl();
		System.out.println("Finish Page URL is :"+finishPageUrl);
		
		if(finishPageUrl.equals("https://www.saucedemo.com/checkout-complete.html")){
			logger.info("Finish page URL verification passed.");
			Assert.assertTrue(true);
			System.out.println("Finish Page URL is :"+finishPageUrl);
		}
		else{
			s.captureScreenshot(driver, "Verify Finish page URL");
			logger.info("Finish page URL verification Failed.");
			Assert.assertTrue(false);
		}
		
		CompletePage cp = new CompletePage(driver);
		
		cp.getsuccessMessage();
		logger.info("Success message displayed.");
		cp.clickOnbackHomeBtn();
		logger.info("Back Home button has clicked.");
		
		// Logout button functionality
		LogoutPage logOut = new LogoutPage(driver);
		
		logOut.clickOnHamburgerIcon();
		logger.info("HamburgerIcon has clicked.");
		logOut.clickOnlogoutBtn();
		logger.info("logoutBtnn has clicked.");
	}
	
	
	

}
