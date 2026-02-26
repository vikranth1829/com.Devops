package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CRM.pages.HomePage;
import com.CRM.pages.LoginPage;

public class LoginPageTestCases extends BaseClass{
	
	@BeforeClass
	public void pagesetup() {
		HomePage hp = new HomePage(driver);
		hp.clickSignIn();
	}
	
	@Test(priority=1)
	public void verifySuccessfulLogin() {
		//HomePage hp= new HomePage(driver);
		//hp.clickSignIn();
		LoginPage lp = new LoginPage(driver);
		lp.Login("vikranth1829@gmail.com","Vikr9787060672");
		Assert.assertTrue(lp.verifyLogginIn(),"User not Logged in successfully !");
		
	}

}
