package com.utility;

import org.openqa.selenium.WebElement;

public class Library {
public static void isElementenabled(WebElement element ,String value) {
	boolean value1=element.isEnabled();
	if(value1=true) {
		element.sendKeys(value);
	}
}
public static void custom_sendkeys(WebElement element,String value) {
	try {
		element.sendKeys(value);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}
public static void custom_sendKeys(WebElement email, String sringData) {
	// TODO Auto-generated method stub
	
}
public static void custom_click(WebElement element) {
	try {
		element.click();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}

