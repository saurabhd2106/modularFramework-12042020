package in.co.mercuryTravel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.utils.WaitUtils;

public class HomePage extends BasePage {

	@FindBy(linkText = "International Holidays")
	private WebElement internationHaolidayLink;

	@FindBy(linkText = "Indian Holidays")
	private WebElement indianHolidayLink;

	@FindBy(linkText = "Luxury Rails")
	private WebElement luxuryHolidayLink;

	@FindBy(linkText = "Customer Login")
	private WebElement customerLogin;

	@FindBy(linkText = "User Login")
	private WebElement userLogin;

	@FindBy(linkText = "Register")
	private WebElement register;

	@FindBy(id = "sign_user_email")
	private WebElement signUserEmailId;

	@FindBy(id = "sign_user_password")
	private WebElement signUserPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement userButton;

	@FindBy(xpath = "(//button[@class='close'])[2]")
	private WebElement closeInitialModalButton;

	@FindBy(partialLinkText = "Welcome,")
	private WebElement welcomeText;
	
	@FindBy(partialLinkText = "Log Out")
	private WebElement logoutLink;

	public HomePage(WebDriver driver) {

		super(driver);

		PageFactory.initElements(driver, this);

	}

	public void closeInitialModal() throws Exception {
		elementControl.clickElement(closeInitialModalButton);
	}

	public void userLogin(String username, String password) throws Exception {

		mouseControl.moveToElement(customerLogin);

		mouseControl.moveToElementAndClick(userLogin);

		WaitUtils.waitForSeconds(3);

		elementControl.setText(signUserEmailId, username);

		WaitUtils.waitForSeconds(3);

		elementControl.setText(signUserPassword, password);

		elementControl.clickElement(userButton);
	}

	public String getWelcomeMessage() throws Exception {

		return elementControl.getText(welcomeText);
	}
	
	public void logOut() throws Exception{
		
		mouseControl.moveToElement(welcomeText);
		
		mouseControl.moveToElementAndClick(logoutLink);
		
	}

}
