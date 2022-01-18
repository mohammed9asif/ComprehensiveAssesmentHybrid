package com.assesment.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.CarBookingAppUI;

public class CarBookingPage extends CarBookingAppUI{
	
	WebDriver driver;
	public CarBookingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHeading() {
		return driver.findElement(heading);
	}

}
