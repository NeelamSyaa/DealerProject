package com.dealer.testcases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t {

public static void main(String[] args) {
	int counter = 1;
WebDriver driver = new ChromeDriver();
driver.get("https://developer.hdfcbank.com/");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);

	String testName = null;
	// File name = testName + Fail + counter
	String fileName = testName + "_Fail_" + (counter++) + ".png";

	// Save inside ./data/ folder
	File desh = new File("./data/" + fileName);
	
}
}
