package in.co.mercuryTravel.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.AlertControl;
import commonLibs.implementation.CommonElement;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.FrameControl;
import commonLibs.implementation.MouseControl;

public class BasePage {

	protected AlertControl alertControl;

	protected CommonElement elementControl;

	protected DropdownControl dropdownControl;

	protected FrameControl frameControl;

	protected MouseControl mouseControl;

	public BasePage(WebDriver driver) {

		alertControl = new AlertControl(driver);

		elementControl = new CommonElement();

		dropdownControl = new DropdownControl();

		frameControl = new FrameControl(driver);

		mouseControl = new MouseControl(driver);

	}

}
