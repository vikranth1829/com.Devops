package com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By emailTextbox = By.id("email-id");
	private By passwordTextbox = By.id("password");
	private By submitButton = By.name("submit-name");
	private By signOutButton = By.cssSelector("a[href=\"sign-out.html\"]");
	
	public void Login(String email,String pswd) {
		driver.findElement(emailTextbox).sendKeys(email);
		driver.findElement(passwordTextbox).sendKeys(pswd);
		driver.findElement(submitButton).click();
	}
	
	public Boolean verifyLogginIn() {
		return driver.findElement(signOutButton).isDisplayed();
	}
}
