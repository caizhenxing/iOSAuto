package util;

import util.App;
import java.util.HashMap;

import org.testng.Assert;

public class VerifyAppIsInstalled {

	public static void run(HashMap<String, String> params){
		Assert.assertEquals(App.Driver.isAppInstalled(params.get("Pacakage Name")), true);
	}
	
}
