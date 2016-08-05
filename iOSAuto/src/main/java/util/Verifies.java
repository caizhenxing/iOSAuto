package util;

import common.Elements;
import util.App;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Verifies {
	// Assert.assertEquals(actual, expected);
	// Text
	public static void text(HashMap<String, String> params) {
		WebElement element = Elements.find(params, App.Driver);
		Assert.assertEquals(element.getText(), params.get("Text"));
        System.out.println("element " + params.get("ID") + "\'s Text is" + params.get("Text"));
	}
    
    public static void textContain(HashMap<String, String> params) {
		WebElement element = Elements.find(params, App.Driver);
		Assert.assertTrue(element.getText().contains(params.get("Text")));
        System.out.println("element " + params.get("ID") + "\'s Text contains" + params.get("Text"));
	}

	// CheckBox
	public static void checkbox(HashMap<String, String> params) {
		WebElement element = Elements.find(params, App.Driver);
		Assert.assertEquals(element.isSelected(), params.get("Is Checked").equals("true"));
        System.out.println("Checkbox " + params.get("ID") + "is Checked.");
	}

	// Exist
	public static void isExisted(HashMap<String, String> params) {
		List<WebElement> elements = Elements.findAll(params, App.Driver);
		Assert.assertNotEquals(elements.size(), 0);
		System.out.println("element " + params.get("ID") + " is existed.");
	}

	// Not Exist
	public static void notExisted(HashMap<String, String> params) {
		List<WebElement> elements = Elements.findAll(params, App.Driver);
		Assert.assertEquals(elements.size(), 0);
		System.out.println("element " + params.get("ID") + " is not existed.");
	}
	
	// Attribute
	public static void attribute(HashMap<String, String> params) {
		WebElement element = Elements.find(params, App.Driver);
		Assert.assertEquals(element.getAttribute(params.get("Attribute Name")), params.get("Value"));
        System.out.println("element " + params.get("ID") + " \'s " + params.get("Attribute Name") + "is" + params.get("Value"));
	}

}
