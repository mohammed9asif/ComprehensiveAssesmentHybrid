package com.assesment.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.LoginPageUI;

public class LoginPage extends LoginPageUI {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getForgotPassword() {
		return driver.findElement(forgotPassword);
	}
	
	public WebElement getRegisterButton() {
		List<WebElement> list = driver.findElements(buttons);
		
		return list.get(1);
	}
	
	public WebElement getLoginButton() {
		List<WebElement> list = driver.findElements(buttons);
		
		return list.get(0);
	}
}
