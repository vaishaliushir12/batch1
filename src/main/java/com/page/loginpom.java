package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement email;
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement pass;
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	private WebElement login;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
