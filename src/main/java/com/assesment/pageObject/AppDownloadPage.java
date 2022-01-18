package com.assesment.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.AppDownloadUI;

public class AppDownloadPage extends AppDownloadUI{
	
	WebDriver driver;
	
	public AppDownloadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAddToWishlist() {
		return driver.findElement(addtoWishlist);
	}

}
