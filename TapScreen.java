package Tact1.Tact1_Opt;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

public class TapScreen {
	
	//Element to tap on the screen
	static By TapElem = By.className("android.view.View");

	//Method to tap on the screen
	public static void tapScreen(MobileDriver tapS){
		WebDriverWait wait = new WebDriverWait(tapS, 1000); 
	    WebElement messageElement = wait.until(ExpectedConditions.presenceOfElementLocated(TapElem));
	    TouchAction action = new TouchAction(tapS);
	    action.longPress(messageElement).release().perform();
	    System.out.println("Tap got applied");
	}

}
