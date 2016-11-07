package Tact1.Tact1_Opt;

import javax.naming.InitialContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TactLogin {

	// POM Element
	static By SignIN = By.xpath("//android.widget.Button[@text = 'Sign In']");
	static By UserName = By.xpath("//android.widget.EditText[@text = 'E-mail']");
	static By Pwd = By.xpath("//android.widget.EditText[@resource-id = 'com.tactile.tact:id/password_text']");
	
	//POM Method
	public static void signIn(AndroidDriver tSignIn){
		tSignIn.findElement(SignIN).click();
	}
	
	//POM Method
	public static void userName(AndroidDriver uSername){
		uSername.findElement(UserName).sendKeys("phanikumar851@gmail.com");
	}
	
	//POM Method
	public static void passWord(AndroidDriver pWord){
		pWord.findElement(Pwd).sendKeys("jaisairam1");
	}
	
	
}
