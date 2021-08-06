package batch_6_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

import Bora_Pages.AddEducationPage;
import Bora_Pages.DashBoardPage;
import Bora_Pages.HomePage;
import Bora_Pages.LoginPage;
import ProjectData.Boratech_Data;
import UtilityLibrary.BasePage;

public class ProrityTestScenario extends BasePage {
	@Test(priority = 15)
	public void verifyExpirence() {

		HomePage.clickOnlogInButton();

		LoginPage.logIn(Boratech_Data.userName_1, Boratech_Data.password_1);
		DashBoardPage.clickOnAddExperience();

		Bora_Pages.AddExperiencePage.addExperience();
		System.out.println("testpriority 15");

	}

	@Test(priority = 1,groups = {"sanity","})
	public void verifyEducation() {

		HomePage.clickOnlogInButton();

		LoginPage.logIn(Boratech_Data.userName_1, Boratech_Data.password_1);

		DashBoardPage.clickOnAddEducation();

		AddEducationPage.eddEducation();
		System.out.println("testpriority 1");
	}

	@Test(priority = 2, dependsOnMethods = "createUser" , alwaysRun = true, groups = "sanity")
	public void verifyLogin() {

		HomePage.clickOnlogInButton();

		LoginPage.logIn(Boratech_Data.userName_1, Boratech_Data.password_1);
		System.out.println("testpriority 2");
//		dashboard.verifyPage();
	}

	@Test(priority =15,enabled = true, groups = "sanity")
	public void createUser() {

		HomePage.clickOnlogInButton();

		// enter userName / Password
		LoginPage.logIn(Boratech_Data.userName_1, Boratech_Data.password_1);
		String message= "Invalid credential";
		//Assert.assertEquals(message, "Invalid");
		System.out.println("testpriority 1");

//		dashboard.verifyPage();

	}
}
