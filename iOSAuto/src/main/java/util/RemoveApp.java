package util;

import java.util.HashMap;

import util.App;

public class RemoveApp {

	public static void run(HashMap<String, String> params) {
		App.Driver.removeApp(params.get("Package Name"));
	}
	
}
