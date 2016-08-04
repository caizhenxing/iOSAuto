package util;

import util.App;

public class CloseApp {

	public static void run() {
		if (App.Driver != null)
			App.Driver.closeApp();
	}
	
}
