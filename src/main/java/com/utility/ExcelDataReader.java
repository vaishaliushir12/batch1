package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	XSSFWorkbook wb;
	public ExcelDataReader() throws Exception {
String path="C:\\Users\\dharm\\eclipse-workspace\\maven\\TestData\\data.xlsx";
FileInputStream fis=new FileInputStream(path);
wb=new XSSFWorkbook(fis);
}
	public String getSringData(String sheetname, int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
}