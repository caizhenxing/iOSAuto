package util;

import io.appium.java_client.android.AndroidDriver;
import util.App;

public class OpenNotifications {

	@SuppressWarnings("rawtypes")
	public static void run() {
//		System.out.println(((AndroidDriver) App.Driver).currentActivity());
		((AndroidDriver) App.Driver).openNotifications();
	}
	
}