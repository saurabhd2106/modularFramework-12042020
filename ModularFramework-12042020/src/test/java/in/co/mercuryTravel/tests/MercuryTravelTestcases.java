package in.co.mercuryTravel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MercuryTravelTestcases extends BaseTest {

	@Test
	public void verifyUserLoginWithCorrectCredentials() throws Exception {

		String username = configProperties.getProperty("userEmailId");
		String password = configProperties.getProperty("userPassword");

		homepage.userLogin(username, password);

		String expectedWelcomeText = configProperties.getProperty("expectedWelcomeText");

		String actualWelcomeText = homepage.getWelcomeMessage();

		Assert.assertEquals(actualWelcomeText, expectedWelcomeText);

	}

}
