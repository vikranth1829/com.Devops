package com.CRM.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Utility.ScreenshotUtility;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By emailTextbox = By.id("email-id");
	private By passwordTextbox = By.id("password");
	private By submitButton = By.name("submit-name");
	private By signOutButton = By.cssSelector("a[href=\"sign-out.html\"]");
	
	public void Login(String email,String pswd) throws IOException {
		driver.findElement(emailTextbox).sendKeys(email);
		ScreenshotUtility.getScreenshot(driver);
		driver.findElement(passwordTextbox).sendKeys(pswd);
		driver.findElement(submitButton).click();
	}
	
	public Boolean verifyLogginIn() throws IOException {
		ScreenshotUtility.getScreenshot(driver);
		return driver.findElement(signOutButton).isDisplayed();
	}
}
