package util;

import util.App;

import java.util.HashMap;

import org.openqa.selenium.Dimension;

public class Swipe {

	public static void run(HashMap<String, String> params) {
		int startX = Integer.parseInt(params.get("startX"));
		int startY = Integer.parseInt(params.get("startY"));
		int endX = Integer.parseInt(params.get("endX"));
		int endY = Integer.parseInt(params.get("endY"));
		App.Driver.swipe(startX, startY, endX, endY, 200);
	}

	// 向左滑动一个屏幕 & 向右翻页
	public static void left(HashMap<String, String> params) {
		Dimension size = App.Driver.manage().window().getSize();
		int startX = (int) size.width - 1;
		int startY = (int) size.height / 2;
		int endX = 1;
		int endY = (int) size.height / 2;
		App.Driver.swipe(startX, startY, endX, endY, 200);
	}

	// 向右滑动一个屏幕 & 向左翻页
	public static void right(HashMap<String, String> params) {
		Dimension size = App.Driver.manage().window().getSize();
		int startX = 1;
		int startY = (int) size.height / 2;
		int endX = (int) size.width - 1;
		int endY = (int) size.height / 2;
		App.Driver.swipe(startX, startY, endX, endY, 200);
	}

	// 向上滑动一个屏幕 & 向下翻页
	public static void up(HashMap<String, String> params) {
		Dimension size = App.Driver.manage().window().getSize();
		int startX = (int) size.width / 2;
		int startY = (int) size.height - 1;
		int endX = (int) size.width / 2;
		int endY = 1;
		App.Driver.swipe(startX, startY, endX, endY, 200);
	}

	// 向下滑动一个屏幕 & 向上翻页
	public static void down(HashMap<String, String> params) {
		Dimension size = App.Driver.manage().window().getSize();
		int startX = (int) size.width / 2;
		int startY = 1;
		int endX = (int) size.width / 2;
		int endY = (int) size.height - 1;
		App.Driver.swipe(startX, startY, endX, endY, 200);
	}

}
