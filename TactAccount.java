package Tact1.Tact1_Opt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TactAccount {

	AndroidDriver driver;

	@Before
	public void capb() throws IOException, IOException {

		// Importing the desired capabilities using Object Repository
		String file = "/Users/NIS1651m/Documents/phani/Tactile-Optimized/DesiredCap.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", prop.getProperty("automationName"));
		capabilities.setCapability("platformName", prop.getProperty("platformName"));
		capabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
		System.out.println(prop.getProperty("platformVersion"));
		System.out.println(prop.getProperty("deviceName"));
		capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
		capabilities.setCapability("app", prop.getProperty("app"));
		capabilities.setCapability("appPackage", prop.getProperty("appPackage"));
		capabilities.setCapability("appActivity", prop.getProperty("appActivity"));

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@Test
	public void callMet() throws Throwable {
		// Using POM MODEL TO IDENTIFY THE ELEMENTS 
		TactLogin.signIn(driver);
		TactLogin.userName(driver);
		TactLogin.passWord(driver);
		TactLogin.signIn(driver);
		Thread.sleep(2000);
        TapScreen.tapScreen(driver);
        Contacts.clickMenu(driver);
        Thread.sleep(500);
        Contacts.clickContacts(driver);
        TapScreen.tapScreen(driver);
        ScrollPage.scrollContacts(driver);
        Contacts.sContact(driver);
        Notes.goToNotes(driver);
        Notes.addNotes(driver);
        EditingNotes.eNotes(driver);
        LogToSalesforce.logSalesforce(driver);
        ScrollPage.scrollContacts(driver);
        LogToSalesforce.adToSFContacts(driver);
	}

}
