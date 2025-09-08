package com.dealer.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public  void openbrowser() throws InterruptedException {
		
	WebDriver driver = new  ChromeDriver();
	driver.get("https://pro.smlsaarthi.com/login?redirect=%2F");
	driver.manage().window().maximize();
	driver.findElement(By.id("outlined-size-small")).sendKeys("SMLHR");
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Smlhr@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[3]/form/div/div[3]/span/input")).click();
	driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
	Thread.sleep(3000);
	WebElement homepage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/h4[1]"));
    String actualResult = homepage.getText();

    // Expected result (whatever text appears on dashboard)
    String expectedResult = "Dashboard";

    // Validation
    Assert.assertEquals(actualResult, expectedResult, "Login validation failed!");
	driver.quit();
	
	}
}
