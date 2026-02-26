package com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private By signinbutton = By.id("SignIn");
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	public void clickSignIn() {
		driver.findElement(signinbutton).click();;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String clickSignInButton() {
		driver.findElement(signinbutton).click();
		return driver.getCurrentUrl();
	}
	
}
