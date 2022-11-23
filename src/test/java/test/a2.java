package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.unitconverters.net/temperature/celsius-to-fahrenheit.htm");
		driver.manage().window().maximize();
		WebElement from=driver.findElement(By.xpath("//input[@type='text']"));
		from.sendKeys("25");

	}

}
//input[@type='text']