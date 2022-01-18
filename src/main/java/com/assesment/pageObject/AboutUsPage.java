package com.assesment.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.AboutUsUI;

public class AboutUsPage extends AboutUsUI {
	
	WebDriver driver;
	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCeoName() {
		return driver.findElement(ceoName);
	}

}
