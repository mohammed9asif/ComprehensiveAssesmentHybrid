package com.assesment.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	
	public By travelOptions = By.xpath("//div[@class='row ng-star-inserted']//div");
	public By oneWayTripOption = By.id("oneway_radio");
	public By roundTripOption = By.id("out_radio");
	public By FromOption = By.id("fromCityList");
	public By outstationToOption = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	public By DatePicker = By.xpath("//input[@placeholder='dd-mm-yyyy']");
	public By TimePicker = By.id("pickUpTime");
	public By selectCarButton = By.xpath("//button[@class='book-button btn']");
	public By airportTripOption = By.xpath("//select[@formcontrolname='frmLocalSubTripType']");
	
	public By airportPickupAddress = By.id("search_places");
	
	public By downloadAppLink = By.xpath("//a[@href='http://bit.ly/savaari-mobile-app']");
	
	public By signIn = By.xpath("//div[@class='bg-signin m-auto']");
	
	public By aboutUs = By.linkText("About Us");
	
	public By localCarRentalOption = By.linkText("Local Car Rentals");
	
	public By oneWayCab = By.linkText("One way cabs");
	
	public By contactUs = By.linkText("Contact Us");
	
	public By carBookingApp = By.xpath("//a[@href='https://www.savaari.com/mobile-app']");
	
	
	

}
