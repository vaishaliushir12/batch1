package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public  static ExcelDataReader excel;
	public static configDataProvider config;
	@BeforeSuite 
	public void Baseclass1() throws Exception{
		excel=new ExcelDataReader();
		config=new configDataProvider ();
	}
	
	@Parameters({"BowserName"})
	@BeforeMethod
	public void bm(String BowserName ) {
		if(BowserName.equalsIgnoreCase("Chrome")){
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		}
		else if(BowserName.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
			}
		else if(BowserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
			}
		driver.get(config.getbaseurl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void teardown() {
      driver.close();
	}
}
