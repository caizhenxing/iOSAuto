package util;

import java.util.HashMap;

import io.appium.java_client.android.AndroidDriver;
import util.App;

public class PressKeyCode {

	@SuppressWarnings("rawtypes")
	public static void run(HashMap<String, String> params) {
		((AndroidDriver) App.Driver).pressKeyCode(Integer.parseInt(params.get("Key Code")));
	}
	
}
