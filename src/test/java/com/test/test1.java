package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.page.loginpom;
import com.utility.Baseclass;
import com.utility.Library;

public class test1 extends Baseclass {
@Test
public void verify_test1() {
	
	loginpom login=PageFactory.initElements(driver, loginpom.class);
	Library.custom_sendKeys(login.getEmail(), excel.getSringData("Sheet1",0,0));
	Library.custom_sendKeys(login.getPass(), excel.getSringData("Sheet1",0,1));
	Library.custom_click(login.getLogin());
}
}
