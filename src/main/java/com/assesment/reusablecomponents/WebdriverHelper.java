package com.assesment.reusablecomponents;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assesment.utility.Logs;
import com.assesment.utility.ReadPropertyFiles;

public class WebdriverHelper {
	
	WebDriver driver;
	ReadPropertyFiles reader;
	Logs log;
	public WebdriverHelper() throws IOException {
		reader = new ReadPropertyFiles();
		log = new Logs();
	}
	
	public WebDriver getDriver() {
		String browser = reader.getBrowset();
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", reader.getDriverPath());
			driver = new ChromeDriver();
		}
		else {
			log.error("Browser is not specified as Chrome...In this app version only chrome supports ");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public void OpenBrowser() {
		String url = reader.getUrl();
		if(driver!=null)
			driver.get(url);
		else
			throw new RuntimeException("driver is not initialized");
		
	}
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
