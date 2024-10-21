package com.saucelab.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.saucelab.utility.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseURL();
	String browser = readConfig.getbrowser();

	@BeforeClass
	public void setup(){
		
		switch(browser.toLowerCase()){
		
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			driver=null;
			break;
		}
		
		driver.manage().window().maximize();
	//	logger.info("Browser has maximized.");
		logger = LogManager.getLogger("SeleniumFrameworkSeptember");
	}
	
//	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
//	public void captureScreenshot(WebDriver driver, String testName) throws IOException{
//		
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//		
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File(System.getProperty("user.dir") + "./Screenshot/" + testName + ".png");
//		
//		FileUtils.copyFile(source, dest);
//		
//	}

}
