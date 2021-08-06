package batch_6_framework;

import org.testng.annotations.Test;

import Bora_Pages.AddEducationPage;
import Bora_Pages.DashBoardPage;
import Bora_Pages.HomePage;
import Bora_Pages.LoginPage;
import ProjectData.Boratech_Data;
import UtilityLibrary.BasePage;

public class TestCase1 extends BasePage {
@Test
	public  void Test() {

	

		HomePage.clickOnlogInButton();

		// enter userName / Password
		LoginPage.logIn(Boratech_Data.userName_1, Boratech_Data.password_1);
		

		// clcik Add Experience

		//DashBoardPage.clickOnAddExperience();

		// add Experience Page
		AddExperiencePage.addExperience();

		DashBoardPage.clickOnAddEducation();

		// add Education Page
		AddEducationPage.eddEducation();
		endTest();
	}

	public static void waitFor(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
