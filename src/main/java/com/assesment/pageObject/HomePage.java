package com.assesment.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.HomePageUI;

public class HomePage extends HomePageUI {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getOutStationOption() {
		
		List<WebElement> list = driver.findElements(travelOptions);
		
		return list.get(0);
	}
	
	public WebElement getLocalOption() {
		
		List<WebElement> list = driver.findElements(travelOptions);
		
		return list.get(1);
	}
	
	public WebElement getAirportOption() {
		
		List<WebElement> list = driver.findElements(travelOptions);
		
		return list.get(2);
	}
	
	public WebElement getOneWayRadio() {
		return driver.findElement(oneWayTripOption);
	}
	
	public WebElement getRoundTrip() {
		return driver.findElement(roundTripOption);
	}
	
	public WebElement getFromInput() {
		return driver.findElement(FromOption);
				
	}
	
	public WebElement getToInput() {
		return driver.findElement(outstationToOption);
	}
	
	public WebElement getPickUpCalender() {
		return driver.findElement(DatePicker);
	}
	
	public WebElement getPickUpAtSelect() {
		return driver.findElement(TimePicker);
	}
	
	public WebElement getSelectCarButton() {
		return driver.findElement(selectCarButton);
	}
	
	public WebElement getAirportTripOption() {
		return driver.findElement(airportTripOption);
	}
	
	public WebElement getAirportAddressOption() {
		return driver.findElement(airportPickupAddress);
	}
	
	public WebElement getAppDownloadLink() {
		return driver.findElement(downloadAppLink);
	}
	
	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}
	
	public WebElement getAboutUs() {
		return driver.findElement(aboutUs);
	}
	
	public WebElement getLocalCarRentalLink() {
		return driver.findElement(localCarRentalOption);
	}
	
	public WebElement getOneWayCabLink() {
		return driver.findElement(oneWayCab);
	}
	
	public WebElement getContactUs() {
		return driver.findElement(contactUs);
	}
	
	public WebElement getCarBookingApp() {
		return driver.findElement(carBookingApp);
	}
}
