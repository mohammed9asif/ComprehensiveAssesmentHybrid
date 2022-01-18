package com.assesment.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcelData {
	
	XSSFWorkbook workbook ;
	XSSFSheet sheet;
	ReadPropertyFiles prop;
	public ReadExcelData() throws IOException {
		prop = new ReadPropertyFiles();
		FileInputStream fis = new FileInputStream(new File(prop.getExcelFilePath()));
		workbook = new XSSFWorkbook(fis);
		
		
	}
	
	public void readDataFromExcel() {
		
		
		sheet = workbook.getSheetAt(0);
		
		Iterator<Row> row = sheet.rowIterator();
		
		while(row.hasNext()) {
			
			Iterator<Cell> cell = row.next().cellIterator();
			
			while(cell.hasNext()) {
				
				System.out.println();
			}
		}
	}

}
