package Tact.Tactile_Optimized;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TactAccount {

	AndroidDriver driver;

	@BeforeClass
	public void capb() throws IOException {

		DesiredCap.desiredCapb(driver);

	}

}
