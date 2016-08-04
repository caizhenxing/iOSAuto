package util;

import java.io.IOException;

import util.App;

public class ResetApp {

	public static void run() {
		App.Driver.resetApp();
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("taskkill /F /IM firefox.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
