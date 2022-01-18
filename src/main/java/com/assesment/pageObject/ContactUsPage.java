package com.assesment.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.ContactUsUI;

public class ContactUsPage extends ContactUsUI {
	
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getContactNumber() {
		
				   
		return  driver.findElement(contactUs);
			
	}

}
