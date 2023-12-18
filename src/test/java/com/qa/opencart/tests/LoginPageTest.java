package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest{
	
	
	
	@Test(priority=1)
	public void loginPageTitletest() {
		
		String actTitle=loginPage.getLoginPageTitle();
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test(priority=2)
	public void loginPageURLtest() {
		String actURL=loginPage.getLoginPageURL();
		Assert.assertTrue(actURL.contains("account/login"));
	}
	@Test(priority=3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
		@Test(priority=4)
	public void appLogoExistTest() {
		Assert.assertTrue(loginPage.isLogoExist());
	}
		
	
	@Test(priority=5)
	public void logintest() {
		Assert.assertTrue(loginPage.doLogin("abc20244@opencart.com", "Selenium@22332"));;
		
	}
	}
	