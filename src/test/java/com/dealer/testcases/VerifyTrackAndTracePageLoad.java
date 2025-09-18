package com.dealer.testcases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dealer.baseclass.BaseTest;

import sun.net.ftp.FtpDirEntry.Type;

public class VerifyTrackAndTracePageLoad  extends BaseTest{

@Test
	public  void tracktrace() throws InterruptedException, IOException {
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
   File src = ts.getScreenshotAs(OutputType.FILE);
   File Desh = new File("./data/Sceenshort.png");
   FileUtils.copyFile(src, Desh);
	}


}
