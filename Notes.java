package Tact1.Tact1_Opt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Notes {
	
	// POM Elements
	static By ExMenu = By.xpath("//android.widget.ImageButton[@resource-id = 'com.tactile.tact:id/fab_expand_menu_button']");
	static By AdNote = By.xpath("//android.widget.TextView[@text = 'Add Note']");
	static By Title = By.xpath("//android.widget.TextView[@text = 'Title']");
	static By Body = By.xpath("//android.widget.TextView[@text = 'Body']");
	static By Save = By.xpath("//android.widget.Button[@resource-id = 'com.tactile.tact:id/save_btn']");
	static By bButton = By.xpath("//android.widget.ImageView[@resource-id = 'com.tactile.tact:id/fragment_menu_button']");
	static By Menu = By.xpath("//android.widget.ImageView[@resource-id = 'com.tactile.tact:id/menu_button']");
	static By nBook = By.xpath("//android.widget.LinearLayout[@resource-id = 'com.tactile.tact:id/drawer_notebook_field']");
	
	//POM Method
	public static void goToNotes(AndroidDriver gTnotes){
		
		gTnotes.findElement(ExMenu).click();
		gTnotes.findElement(AdNote).click();	
	}
	
	//POM Method
public static void addNotes(AndroidDriver aNotes){
		
		for (int i=0;i<=2;i++){
			
		WebElement title = aNotes.findElement(Title);
		title.click();
		title.sendKeys("Sales Executive Meet"+" "+ i);
		aNotes.findElement(Body).sendKeys("Sales Executive Meet @Tact"+" "+ i);
		aNotes.findElement(Save).click();
		
		if (i<=1){
			aNotes.findElement(ExMenu).click();
			aNotes.findElement(AdNote).click();	
		}
		
		else if (i>1){
			break;
		}
		
		}
		aNotes.findElement(bButton).click();
		aNotes.findElement(Menu).click();
		aNotes.findElement(nBook).click();

}
}
