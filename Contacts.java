package Tact1.Tact1_Opt;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Contacts {

	// POM Elements
	static By Menu = By.xpath("//android.widget.ImageView[@resource-id = 'com.tactile.tact:id/menu_button']");
	static By Contacts = By.xpath("//android.widget.TextView[@text='Contacts']");
	static By SelectContact = By.xpath("//android.widget.TextView[contains(@resource-id,'com.tactile.tact:id/contact_name_text_view') and @text = 'Alounge']");
	
	
	//POM Method
	public static void clickMenu(AndroidDriver meNu){
		meNu.findElement(Menu).click();
	}
	//POM Method
	public static void clickContacts(AndroidDriver contacts){
		contacts.findElement(Contacts).click();
	}
	//POM Methods
	public static void sContact(AndroidDriver Scontacts){
		Scontacts.findElement(SelectContact).click();
	}
}
