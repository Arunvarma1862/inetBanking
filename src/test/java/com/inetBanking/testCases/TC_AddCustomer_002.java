package com.inetBanking.testCases;


import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomer_002  extends BaseClass {
	
	@Test
	public void AddCustomer() throws Exception {

		  driver.get(baseURL);
		  extentTest.info("Navigate to url");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		extentTest.info("Enter valid userID");
		lp.setPassword(password);
		extentTest.info("Enter valid Password");
		lp.clickSubmit();
		extentTest.info("Click on login");
		
		
		
		
		
		AddCustomerPage adp= new AddCustomerPage(driver);
		
		adp.clickAddnewCustomer();
		extentTest.info("Click on New Customer link");
		extentTest.info("Providing customer details....");
		adp.custName("virat");
		adp.custgender();
		adp.dateEnter("11","12", "2001");
		Thread.sleep(3000);
		adp.txtAddress("indian");
		adp.txtcity("vizag");
		adp.txtstate("ap");
		adp.txtpin(530044);
	//	String pin=randomnum();
	//	adp.txtpin(pin);
        adp.txttel("9662488855");
        String email= randomstring()+"@gmail.com";
        adp.txtmail(email);
        adp.txtsubmit();
        extentTest.info("Click on Submit");
        
    	Thread.sleep(3000);
    	extentTest.info("validation started...");
    	
        boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
    		
 
        if(res==true) {
      	  Assert.assertTrue(true);
      	  extentTest.pass("Registration success ");
        }
        else
        {
      	  extentTest.fail("Registration not success on some issue");
      	  Assert.assertFalse(false);
        }
		
		
	}
	
}
