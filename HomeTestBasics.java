package batch_6_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import UtilityLibrary.SeleniumFunctionalMethod;

public class HomeTestBasics {

	static WebDriver driver;
	static SeleniumFunctionalMethod drive;

public static void startTest() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

	driver = new ChromeDriver();
	String url = "https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	drive = new SeleniumFunctionalMethod(driver);
	drive.openUrl(url);
}

	@AfterMethod
	public static void endTest() {

		driver.close();
		driver.quit();
	}

}