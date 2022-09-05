package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	
	@FindBy(how=How.NAME ,using="btnLogin")
	WebElement login;
	

	@FindBy(name="btnLogin")
	WebElement butLogin;

	@FindBy(xpath="//a[text()='Log out']")
	WebElement butLogout;
	
	
	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	
	public void setPassword(String pName) {
		txtPassword.sendKeys(pName);
	}
	
	public void clickSubmit( ) {
		butLogin.click();
	}
	public void clicklogout( ) {
		butLogout.click();
	}
}
