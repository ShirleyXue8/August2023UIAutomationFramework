package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// By locators: OR
	private By userName = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
    private By logo=By.cssSelector("img[title='naveenopencart']");
    
	// page const...
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil=new ElementUtil(driver);
	}

	// page actions/methods:
	public String getLoginPageTitle() {
       String title= eleUtil.waitForTitleIs("Account Login", 5);
		System.out.println("login page title:" + title);
		return title;
	}

	public String getLoginPageURL() {
		String url= eleUtil.waitForURLContains("account/login", 5);
		System.out.println("login page url:" + url);
		return url;
	}
	
	public boolean isForgotPwdLinkExist() {
	return eleUtil.waitForVisibilityOfElement(forgotPwdLink, 5).isDisplayed();
		
		
	}
	
	public boolean isLogoExist() {
		
		return eleUtil.waitForVisibilityOfElement(logo,5).isDisplayed();
	}

	public boolean doLogin(String username,String pwd) {
		eleUtil.waitForVisibilityOfElement(userName, 10).sendKeys(username);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		System.out.println("user is logged in");
		return true;
	}
	
	
}
