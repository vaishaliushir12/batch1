package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/your-account");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("sarree");
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		WebElement all=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		all.sendKeys("alexa skill");
		
	}

}
