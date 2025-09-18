package com.dealer.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dealer.baseclass.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void loginpage() throws InterruptedException, IOException {
		driver.findElement(By.id("outlined-size-small")).sendKeys("SMLHR");
		log.info("user enter the username");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Smlhr@123");
		driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div[3]/form/div/div[3]/span/input")).click();
		driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
		Thread.sleep(3000);
		WebElement homepage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[1]/h4[1]"));
		String actualResult = homepage.getText();

		// Expected result (whatever text appears on dashboard)
		String expectedResult = "Dashboard";

		// Validation
		Assert.assertEquals(actualResult, expectedResult, "Login validation failed!");
//
//		WebElement clicksidebar = driver.findElement(By.xpath(
//				"//*[@id=\"root\"]/div/div/div/div/div/div[2]//ul/li[2]/a/div[2]/span[text()=\"Track and Trace\"]"));
//		clicksidebar.click();
		WebElement trackAndTraceMenu = driver.findElement(By.xpath("//span[text()='Track and Trace']"));
        Assert.assertTrue(trackAndTraceMenu.isDisplayed(), "Track and Trace menu is not displayed!");
        
        // Click menu
        trackAndTraceMenu.click();

		TakesScreenshot ts = (TakesScreenshot)driver;
		
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File Desh = new File("./data/Sceenshort.png");
	   FileUtils.copyFile(src, Desh);
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
WebElement filterbt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div[2]/div/div/div/div/div[@class=\"MuiBox-root css-el4tjo\"]//button"));
Thread.sleep(2000);
filterbt.click();
Thread.sleep(2000);
WebElement filterbtn = driver.findElement(By.xpath("//*[@id=\"popover-filter\"]/div[3]/div/div[1]//ul/div[2]//span[text()=\"Filter\"]"));
Thread.sleep(2000);
filterbtn.click();
WebElement fitercheckbox = driver.findElement(By.xpath("//*[@id=\"popover-filter\"]/div[3]/div/div[2]/div/div/table/tbody/tr[5]/td/fieldset/label[1]//input[@type=\"checkbox\"]"));
Thread.sleep(2000);
fitercheckbox.click();
WebElement filterbtnapply = driver.findElement(By.xpath("//button[text()=\"APPLY\"]"));
Thread.sleep(2000);
filterbtnapply.click();
	}
}
