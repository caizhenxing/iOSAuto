package util;

import java.util.HashMap;

import util.App;

public class InstallApp {

	public static void run(HashMap<String, String> params) {
		App.Driver.installApp("apps/" + params.get("APK Name") + ".apk");
	}
	
}
