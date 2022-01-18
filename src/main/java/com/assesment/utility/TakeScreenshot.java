package com.assesment.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	WebDriver driver;
	
	public TakeScreenshot(WebDriver driver) {
		this.driver =driver;
	}
	
	
	public void getScreenshot(String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./screenshot/"+name+" screenshot.png"));
		
	}

}
