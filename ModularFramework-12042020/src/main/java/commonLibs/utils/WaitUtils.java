package commonLibs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	public static void waitTillAlertIsPresent(WebDriver driver, int timeOutInSeconds) throws Exception{
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
	}

}
