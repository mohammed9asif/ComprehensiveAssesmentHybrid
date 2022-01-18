package com.assesment.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {

	Properties prop;
	String propPath="./test-data/config.properties";
	public ReadPropertyFiles() throws IOException {
		FileInputStream fis = new FileInputStream(new File(propPath));
		prop = new Properties();
		prop.load(fis);

	}


	public String getUrl() {
		String url = prop.getProperty("url");

		if(url!=null)
			return url;

		throw new RuntimeException("Url is not specified");
	}

	public String getDriverPath() {
		String driverPath = prop.getProperty("driverPath");

		if(driverPath!=null)
			return driverPath;

		throw new RuntimeException("driver Path is not specified");
	}

	public String getBrowset() {
		String browser = prop.getProperty("browser");

		if(browser!=null)
			return browser;

		throw new RuntimeException("browser is not specified");
	}
	
	public String getExcelFilePath() {
		String excelFile = prop.getProperty("excelFilePath");

		if(excelFile!=null)
			return excelFile;

		throw new RuntimeException("excelFile Path is not specified");
	}
	
	public String getExtentReportPath() {
		String reportPath = prop.getProperty("extentReportsPath");
		if(reportPath!=null)
			return reportPath;

		throw new RuntimeException("report Path is not specified");
	}
}
