package common;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;


public class Elements {

	public static WebElement find(HashMap<String, String> params, AppiumDriver Driver) {

		WebElement foundElement = null;

		switch ((String) params.get("ID Type")) {
		case "Name":
			foundElement = Driver.findElement(By.name((String) params.get("ID")));
			break;
		case "ID":
			foundElement = Driver.findElement(By.id((String) params.get("ID")));
			break;
		//Xpath, get from properties
		case "Xpath":
			foundElement = Driver.findElement(By.id(Elements.getXpath((String) params.get("ID"))));
			break;
		//Property,default:resource-id, get from properties
		case "Property":
            foundElement = Driver.findElement(By.id(Elements.getId((String) params.get("ID"))));
            break;
		default:
			foundElement = Driver.findElement(By.id(Elements.getId((String) params.get("ID"))));
		}

		return foundElement;
	}
	
	public static List<WebElement> findAll(HashMap<String, String> params, AppiumDriver Driver) {
		List<WebElement> foundElements;
		switch (params.get("ID Type")) {
		case "Name":
			foundElements = Driver.findElements(By.name((String) params.get("ID")));
			break;
		case "ID":
			foundElements = Driver.findElements(By.id((String) params.get("ID")));
			break;
		//Xpath, get from properties
		case "Xpath":
			foundElements = Driver.findElements(By.id(Elements.getXpath((String) params.get("ID"))));
			break;
		//Property,default:resource-id, get from properties
		case "Property":
            foundElements = Driver.findElements(By.id(Elements.getId((String) params.get("ID"))));
            break;
		default:
			foundElements = Driver.findElements(By.id(Elements.getId((String) params.get("ID"))));
		}
		return foundElements;
	}

	/*
	 * Read properties
	 */
	public static Properties readProperties(String filePath) {

		Properties p = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(filePath));
			p.load(in);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}

	/*
	 * read key-value (param-pr)
	 * 
	 */
	public static String getId(String param) {
		String filePath = "./config/elementId.properties";
		Properties p = readProperties(filePath);
		String pr = p.getProperty(param);
		return pr;
	}
	
	public static String getXpath(String param)  {
		String filePath = "./config/elementXpath.properties";
		Properties p = readProperties(filePath);
		String pr = p.getProperty(param);
		return pr;
	}

}
