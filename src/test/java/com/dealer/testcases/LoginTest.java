package com.dealer.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public  void openbrowser() {
		
	WebDriver driver = new  ChromeDriver();
	driver.get("https://pro.smlsaarthi.com/login?redirect=%2F");
	driver.manage().window().maximize();
	driver.findElement(By.id("outlined-size-small")).sendKeys("SMLHR");
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Smlhr@123");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[3]/form/div/div[3]/span/input")).click();
	driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
	
	}
}
