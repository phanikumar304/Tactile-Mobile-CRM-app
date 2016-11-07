package Tact1.Tact1_Opt;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;

public class LogToSalesforce {

	// POM Elements
	static By Mbutton = By
			.xpath("//android.widget.ImageButton[@resource-id = 'com.tactile.tact:id/fab_expand_menu_button']");
	static By LogToSf = By.xpath("//android.widget.TextView[@text = 'Log to Salesforce']");
	static By SelContact = By.xpath("//android.widget.TextView[@text = 'Contact']");
	static By SelectContact = By.xpath(
			"//android.widget.TextView[contains(@resource-id,'com.tactile.tact:id/contact_name_text_view') and @text = 'Alounge']");
	static By Subject = By.xpath("//android.widget.TextView[@text = 'Subject']");
	static By Save = By.xpath("//android.widget.Button[@resource-id= 'com.tactile.tact:id/save_btn']");

	//POM Method
	public static void logSalesforce(AndroidDriver logsf) {
		logsf.findElement(Mbutton).click();
		logsf.findElement(LogToSf).click();
		logsf.findElement(SelContact).click();

	}

	//POM Method
	public static void adToSFContacts(AndroidDriver sfContacts) {

		sfContacts.findElement(SelectContact).click();
		sfContacts.findElement(Subject).sendKeys("Sales Executive Meet logging at SalesF");
		sfContacts.findElement(Save).click();
	}

}
