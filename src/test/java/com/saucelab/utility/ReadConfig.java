package com.saucelab.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	String filePath = "C:\\Users\\admin\\workspace\\SeleniumFrameworkSeptember\\Configuration\\Config.properties";

	public ReadConfig(){

		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);

		} catch(Exception e){
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

	public String getBaseURL(){

		String urlValue = prop.getProperty("URL");

		// Check if URL value is not null

		if(urlValue!=null)
			return urlValue;

		else
			throw new RuntimeException("URL value is not present in config file.");
	}

	public String getbrowser(){

		String browserValue = prop.getProperty("browser");

		// Check if URL value is not null

		if(browserValue!=null)
			return browserValue;

		else
			throw new RuntimeException("Browser value is not present in config file.");
	}

}
