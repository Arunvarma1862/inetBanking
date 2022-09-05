package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
   public void loginTest() {
		
		
		  driver.get(baseURL);
		  extentTest.info("<b><i>Navigate to url</i></b>");
		
		  LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		extentTest.info("<b><i>Enter valid userID</i></b>");
		logger.info("Enter username");
		
		lp.setPassword(password);
		extentTest.info("<b><i>Enter valid Password</i></b>");
		logger.info("enter password");
		
		lp.clickSubmit();
		extentTest.log(Status.INFO,"<b><i>Click on login</i></b>");
    	logger.info("click on login button");
		
	
		
	
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			extentTest.log(Status.INFO,"<b><i>home page opened</i></b>");
			logger.info("login test passed");
		}
		else
		{
			extentTest.log(Status.INFO,"<b><i>Invalid Credintials</i></b>");
			logger.info("login test failed");
			Assert.assertTrue(false);
		
		}
	   
   }

}
