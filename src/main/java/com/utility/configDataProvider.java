package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configDataProvider {
	public static configDataProvider pro;
	public configDataProvider() throws Exception {
String pathfile="C:\\Users\\dharm\\eclipse-workspace\\maven\\Config\\config.properties";
FileInputStream file=new FileInputStream(pathfile);
pro=new configDataProvider();
pro.load(file);
	}
	private void load(FileInputStream file) {
		// TODO Auto-generated method stub
		
	}
	public String getbaseurl(){
		return pro.getbaseurl();
	}
	
}
