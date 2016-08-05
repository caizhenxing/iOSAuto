package util;

import util.App;

public class GetAppStrings {

	@SuppressWarnings("deprecation")
	public static String run(Object params) {
		return App.Driver.getAppStrings();
	}

}
