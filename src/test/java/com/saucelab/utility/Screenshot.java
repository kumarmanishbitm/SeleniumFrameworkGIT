package com.saucelab.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
public void captureScreenshot(WebDriver driver, String testName) throws IOException{
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "./Screenshot/" + testName + ".png");
		
		FileUtils.copyFile(source, dest);
		
}
}
