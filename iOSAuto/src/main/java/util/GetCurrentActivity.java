package util;

import io.appium.java_client.android.AndroidDriver;
import util.App;

public class GetCurrentActivity {

	@SuppressWarnings("rawtypes")
	public static String run() {
//		System.out.println(((AndroidDriver) App.Driver).currentActivity());
		return ((AndroidDriver) App.Driver).currentActivity();
	}
	
}
