package com.assesment.utility;

import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Logs log =new Logs();
		log.info(result.getName()+"Has Started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Logs log =new Logs();
		log.info(result.getName()+"Has successful");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		TakeScreenshot screenshot = new TakeScreenshot(new ChromeDriver());
		try {
			screenshot.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
