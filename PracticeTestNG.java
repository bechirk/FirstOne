package batch_6_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	@Test
public void test1() {
	System.out.println("This is test1");
}
	@Test
public void test2() {
	System.out.println("This is test2");
}
	@Test
public void test3() {
	System.out.println("This is test3");
}
	@BeforeClass
	public void befre() {
		System.out.println("This is before");
	}
@AfterClass
	public void after() {
		System.out.println("This is after");
	}
}
