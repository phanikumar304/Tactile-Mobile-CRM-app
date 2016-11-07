package Tact.Tactile_Optimized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;



public class DesiredCap {
	
	public  static void desiredCapb(AndroidDriver driv) {
		
		String file = "/Users/NIS1651m/Documents/phani/Tactile-Optimized/DesiredCap.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", prop.getProperty("automationName"));
		capabilities.setCapability("platformName", prop.getProperty("platformName"));
		capabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
		capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
		capabilities.setCapability("app", prop.getProperty("app"));
		capabilities.setCapability("appPackage", prop.getProperty("appPackage"));
		capabilities.setCapability("appActivity", prop.getProperty("appActivity"));
		
		driv = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driv.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
}
}
