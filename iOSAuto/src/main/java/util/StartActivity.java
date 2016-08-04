package util;

import java.util.HashMap;

import io.appium.java_client.android.AndroidDriver;
import util.App;

public class StartActivity {

	@SuppressWarnings("rawtypes")
	public static void run(HashMap<String, String> params) {
		((AndroidDriver) App.Driver).startActivity(params.get("Package"), params.get("Activity"));
	}
	
}
