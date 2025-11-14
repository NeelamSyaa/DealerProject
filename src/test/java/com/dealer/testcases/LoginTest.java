package com.dealer.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dealer.baseclass.BaseTest;
import com.dealer.page.PageObjectModelLoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginpage() throws InterruptedException {
		
         
		PageObjectModelLoginPage pg = new PageObjectModelLoginPage(driver);
		pg.EnterUsername("SMLHR");
		pg.Enterpassword("SMLhr@123");
		pg.clickloginbtn();
				
	}
}
