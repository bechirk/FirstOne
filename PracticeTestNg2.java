package batch_6_framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNg2 {
	@Test(priority = 0)
public void test1class2() {
	System.out.println("This is test1");
}
	@Test
	public void test2calss2() {
	System.out.println("This is test2");
}
	@Test(priority = 1, groups = "regression")
public void test3class2() {
	System.out.println("This is test3");
}
	@BeforeClass
	public void befreclass() {
		System.out.println("This is before");
	}
@AfterClass
	public void after() {
		System.out.println("This is after");
	}

}
