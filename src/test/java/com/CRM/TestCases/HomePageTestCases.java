package com.CRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.CRM.pages.HomePage;

public class HomePageTestCases extends BaseClass {
	
	
	@Test(priority=1)
	public void verifyUrl() throws IOException {
		HomePage hp=new HomePage(driver); //creating object
		String acturl=hp.geturl();
		Assert.assertTrue(acturl.contains("crm"),"Url is mismathed !");		
		System.out.println("TestCase_01 passed ");
	}
	
	@Test(priority=2)
	public void verifyTitle() throws IOException {
		HomePage hp=new HomePage(driver); //create the object
		String pagetitle=hp.getTitle();
		System.out.println(pagetitle+"---->");
		Assert.assertTrue(pagetitle.contains("Customer"), "Page Title is Mismatched !");
		System.out.println("TestCase_02 is Passed");
	}
	
	@Test(priority=3)
	public void validateSignin() throws IOException {
		HomePage hp=new HomePage(driver); //Create Object
		String acturl = hp.clickSignInButton();
		Assert.assertTrue(acturl.contains("login"),"Login page is not opened !");
		System.out.println("TestCase_03 is Passed");
	}
}
