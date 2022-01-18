package com.assesment.uistore;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	public By email = By.xpath("//input[@placeholder='Email']");
	
	public By password = By.xpath("//input[@placeholder='Password']");
	
	public By forgotPassword = By.linkText(" Forgot Password? ");
	
	public By buttons = By.xpath("//div[@class='float-left w-100']//button");

}
