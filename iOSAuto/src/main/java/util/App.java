package util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class App {

	@SuppressWarnings("rawtypes")
	public static AppiumDriver Driver = null;

	// start APP
	public static void run(HashMap<String, String> params) {
		File app = new File("apps/" + params.get("APK Name") + ".app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.3");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", app.getAbsolutePath());
		try {
			Driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		Driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
