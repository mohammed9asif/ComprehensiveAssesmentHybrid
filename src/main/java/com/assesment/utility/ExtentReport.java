package com.assesment.utility;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport {
	
	ExtentReports extent;
	ExtentHtmlReporter reporter;
	ReadPropertyFiles prop;
	public ExtentReport() throws IOException {
		prop = new ReadPropertyFiles();
		reporter = new ExtentHtmlReporter(new File(prop.getExtentReportPath()));
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
	}
	
	public ExtentTest createNewTest(String name) {
		ExtentTest test = extent.createTest(name);
		return test;
	}
	
	public void flush() {
		extent.flush();
		
	}
}
