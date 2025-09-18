package com.dealer.baseclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

protected Logger log = LogManager.getLogger(this.getClass());
public	WebDriver driver;
	@BeforeMethod
	public void openwebpage() {
	
		driver = new  ChromeDriver();
		log.info("Launching application URL");
		driver.get("https://pro.smlsaarthi.com/login?redirect=%2F");
		log.info(" web page is opon");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardwon() {
		
	        //driver.quit();  // Close browser only if it was launched
	    }
	
}
