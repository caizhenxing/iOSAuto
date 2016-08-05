package util;

import common.Elements;
import util.App;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public class GetAttribute {

	public static String run(HashMap<String, String> params) {
		WebElement element = Elements.find(params, App.Driver);
		return element.getAttribute(params.get("Attribute Name"));
	}

}
