package batch_6_framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import batch_6_framework.HomeTestBasics;
public class HomeTest extends HomeTestBasics{
	
	
		public void test() {
				HomeTestBasics driver;
				setDriver(driver, url);
				
			
			
			
			
				HomeTestBasics.goToWebsite(driver, url);;
				driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Selenium");
				//===> this code wil locate the element in the main page
				driver.switchTo().frame("globalSqa");
				driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Selenium");
				//===> this code wil locate the element in the iframe
				driver.findElement(By.id("current_filter")).click();
				List<WebElement> optionsElem = driver.findElements(By.xpath("//ul[@id='filter_list']//li/div"));
				for (WebElement option : optionsElem) {
					if (option.getText().equalsIgnoreCase("automation")) {
						option.click();
						break;
					}
					
				}
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//span[text()='Sortable']")).click();
				
			

	}
}
