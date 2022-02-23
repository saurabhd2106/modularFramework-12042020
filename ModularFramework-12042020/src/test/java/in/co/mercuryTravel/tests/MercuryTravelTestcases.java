package in.co.mercuryTravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utils.TestDataProvider;

public class MercuryTravelTestcases extends BaseTest {

	@Test(enabled = false)
	public void verifyUserLoginWithCorrectCredentials() throws Exception {
		
		extentTest = extent.createTest("TC-001 - Verify UserLogin with correct credentials");

		String username = configProperties.getProperty("userEmailId");
		extentTest.log(Status.INFO, "User Email Id - " + username);
		String password = configProperties.getProperty("userPassword");
		extentTest.log(Status.INFO, "User Password - " + password);
		
		homepage.userLogin(username, password);
		
		

		String expectedWelcomeText = configProperties.getProperty("expectedWelcomeText");

		String actualWelcomeText = homepage.getWelcomeMessage();

		Assert.assertEquals(actualWelcomeText, expectedWelcomeText);
		extentTest.log(Status.INFO, "User Login Successful" );
		
		homepage.logOut();
	}
	
	
	@Test(dataProvider = "getUserData", dataProviderClass = TestDataProvider.class)
	public void verifyUserLoginWithCorrectCredentials(String username, String password, String expectedWelcomeText) throws Exception {
		
		extentTest = extent.createTest("TC-001 - Verify UserLogin with correct credentials " + username + " and " + password);

		extentTest.log(Status.INFO, "User Email Id - " + username);
		extentTest.log(Status.INFO, "User Password - " + password);
		
		homepage.userLogin(username, password);
		
		


		String actualWelcomeText = homepage.getWelcomeMessage();

		Assert.assertEquals(actualWelcomeText, expectedWelcomeText);
		extentTest.log(Status.INFO, "User Login Successful" );
		
		homepage.logOut();
	}
	


}
