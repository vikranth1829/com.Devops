package com.CRM.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

	public static void getScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;  
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")
						+"//Screenshots//"
						+System.currentTimeMillis()
						+".png";
		
		File dest = new File(path);
		
		FileHandler.copy(temp, dest);
		
	}
	
}
