package com.assesment.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.IndividualCarPageUI;

public class IndividualCarPage extends IndividualCarPageUI{
	
	WebDriver driver;
	public IndividualCarPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCarType() {
		return driver.findElements(contentValues).get(2);
	}
	
	public WebElement getCarPrice() {
		return driver.findElements(contentValues).get(3);
	}
}
