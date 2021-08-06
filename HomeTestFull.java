package batch_6_framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import UtilityLibrary.HomeTestFullBasic;

public class HomeTestFull  {
	@Test
	public static void hello() {

		// 1, go to http://www.seleniumframework.com/Practiceform/
		HomeTestFullBasic.startTest();
		// 2, click on New Browser Tab button
		HomeTestFullBasic.clickonNewBrowserTab();
		// 3, switch on to the new tab

		HomeTestFullBasic.SwitchtoNewTab();
		// Validation + click on the Element
		HomeTestFullBasic.validateAndClick();
		HomeTestFullBasic.goBacktOpp();

	}
	
	@AfterMethod
	private void ensTask() {
		System.out.println("TestDone");

	}
}
