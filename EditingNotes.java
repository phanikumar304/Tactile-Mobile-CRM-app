package Tact1.Tact1_Opt;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class EditingNotes {
	
	// POM Element
	static By editNote = By.xpath("//android.widget.LinearLayout[@resource-id = 'com.tactile.tact:id/notebook_list_item_linear_layout']");
	static By Edit = By.xpath("//android.widget.ImageView[@resource-id = 'com.tactile.tact:id/imageview_secondary_2']");
	static By Toggle = By.xpath("//android.widget.ToggleButton[@resource-id = 'com.tactile.tact:id/sync_sf_toggle']");
	static By Save = By.xpath("//android.widget.Button[@resource-id = 'com.tactile.tact:id/save_btn']");
	static By Menu = By.xpath("//android.widget.ImageView[@resource-id = 'com.tactile.tact:id/fragment_menu_button']");
	
	//POM Method
	public static void eNotes(AndroidDriver eNote){
		eNote.findElement(editNote).click();
		eNote.findElement(Edit).click();
		eNote.findElement(Toggle).click();
		eNote.findElement(Save).click();
		eNote.findElement(Menu).click();
		
	}

}
