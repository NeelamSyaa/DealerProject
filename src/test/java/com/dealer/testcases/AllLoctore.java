package com.dealer.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLoctore {

	public static void main(String[] args) throws IOException {
		//cssSelecter 
		 WebDriver driver = new  ChromeDriver();
		 driver.get("");
		 driver.findElement(By.cssSelector(""));
	//Write code to handle dropdowns (Select class).
     WebElement btnclcik = driver.findElement(By.id(""));
     Select s = new Select(btnclcik);
		  s.selectByIndex(0);
		  s.selectByValue(null);
		  s.selectByVisibleText(null);
		  
		  //Write code to switch between frames.
		 WebElement iframe = driver.findElement(By.xpath(""));
		 
		  driver.switchTo().frame(iframe); 
		//  Write code to handle multiple windows/tabs.
	

	 String presentwindow = driver.getWindowHandle();
	             Set<String> multiplewindow = driver.getWindowHandles();
	            
	             for( String allwind : multiplewindow) {
	            	  if(!allwind .equals(presentwindow)) {
	            		  driver.switchTo().window(presentwindow);
	            	  }
	             }
	             
	             //How to take a screenshot and save it with a dynamic name.
	            
	         	int counter = 1;
	         
	         	driver.get("https://developer.hdfcbank.com/");
	         		TakesScreenshot ts = (TakesScreenshot) driver;
	         		File src = ts.getScreenshotAs(OutputType.FILE);

	         		String testName = null;
	         		// File name = testName + Fail + counter
	         		String fileName = testName + "_Fail_" + (counter++) + ".png";

	         		// Save inside ./data/ folder
	         		File desh = new File("./data/" + fileName);
	         		
	         	//	Write a reusable method to wait for an element (Explicit Wait).
	         		
	         		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
	         		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	         		//Write code to upload a file using Selenium.
	}

}
