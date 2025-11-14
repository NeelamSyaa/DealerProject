package com.dealer.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  PageObjectModelLoginPage {
/*Questions:

What is POM and why do we use it?

Create a simple login test using Page Object Model.

How do you maintain test data and locators separately?

What are advantages of using @FindBy with PageFactory?
 
 */
	WebDriver driver;
	@FindBy(id ="username")
	WebElement  username ;
	
	@FindBy(id ="password")
	WebElement  password ;
	@FindBy(id ="logintbn")
	WebElement  logintbn ;
	@FindBy(xpath = "//div[@id='testdata']")
	WebElement footerDashboard;

	
	 public PageObjectModelLoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	public  void EnterUsername(String User) throws InterruptedException {
		Thread.sleep(2000);
		username.sendKeys(User);
		
	}
public  void Enterpassword(String pwd) {
	password.sendKeys();
	
	}
public  void clickloginbtn() {
	logintbn.click();
	
	
}

public void varifyfooterdeshboad() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//navigate for up
	js.executeScript("window.scrollBy(0, 3000)");
	//To scroll up, use a negative value:

		js.executeScript("window.scrollBy(0, -1000)");
	
	footerDashboard.click();
}

}
