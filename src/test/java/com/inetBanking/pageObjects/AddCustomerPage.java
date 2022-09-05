package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver){
		
	this.	driver= driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newc;
	
	@FindBy(name="name")
	WebElement CName;
	
	@FindBy(xpath="//input[@name='rad1'][2]")
	WebElement MF;
	
	@FindBy(name="dob")
	WebElement db;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement cities;
	
	@FindBy(name="state")
	WebElement states;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement telph;
	
	@FindBy(name="emailid")
	WebElement mail;
	
	@FindBy(name="sub")
	WebElement subbmit;
	
	
	public void clickAddnewCustomer() {
		newc.click();
		
	}
	
	public void custName(String cName) {
		CName.sendKeys(cName);
		
	}
	public void custgender() {
		MF.click();
		
	}
	public void dateEnter(String dd , String mm, String yyyy) {
		db.sendKeys(dd);
		db.sendKeys(mm);
		db.sendKeys(yyyy);
		
	}
	public void txtAddress(String tadd) {
		address.sendKeys(tadd);
		
	}
	public void txtcity(String tcity) {
		cities.sendKeys(tcity);
		
	}
	public void txtstate(String tstate) {
		states.sendKeys(tstate);
		
	}
	public void txtpin(int tpin) {
		pin.sendKeys(String.valueOf(tpin));
		
	}
	public void txttel(String ttel) {
		telph.sendKeys(ttel);
		
	}
	public void txtmail(String tmail) {
		mail.sendKeys(tmail);
		
	}
	public void txtsubmit() {
		subbmit.click();
		
	}
	
}
