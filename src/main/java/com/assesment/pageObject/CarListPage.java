package com.assesment.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assesment.uistore.CarListUI;

public class CarListPage extends CarListUI {
	WebDriver driver;
	public CarListPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getCarFromList(int i) {
		List<WebElement> list = driver.findElements(carList);
		
		return list.get(i-1);
	}
	
	

}
