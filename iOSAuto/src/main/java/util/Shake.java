package util;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import util.App;

/*
 * ios has
 * android not
 */
public class Shake {
	public static void run() {
		((IOSDriver) App.Driver).shake();
	}
}
