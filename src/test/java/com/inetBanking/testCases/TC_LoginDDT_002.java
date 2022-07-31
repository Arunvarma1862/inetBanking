package com.inetBanking.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilties.XlUtlities;

public class TC_LoginDDT_002 extends BaseClass{
	@Test( dataProvider = "getData", dataProviderClass = XlUtlities.class)
	   public void loginTest2(String usernam,String passwor) throws Exception {
		
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get(baseURL);
		   extentTest.info("Navigate to url");
			
			LoginPage lp = new LoginPage(driver);
			
			lp.setUserName(usernam);
			  extentTest.info("Enter valid userID");
			lp.setPassword(passwor);
			  extentTest.info("Enter valid password");
			lp.clickSubmit();
			Thread.sleep(3000);
			  extentTest.log(Status.INFO,"<b><i>Click login</i></b>");
			
			if(isAlertPresent()==true) {
				driver.switchTo().alert().accept();  // close alert
				driver.switchTo().defaultContent(); 
				  extentTest.info ("login  details failed");
			    Assert.assertTrue(false);
			  
			    
			}
			else {
				Assert.assertTrue(true);
				extentTest.info("login passed");
				lp.clicklogout();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();   // close logout alert
				extentTest.info ("Click logout");
				driver.switchTo().defaultContent();
			}
		
		
	}
	
	
	public boolean isAlertPresent() {        // user defined method created to check alert is present or not
		
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}

}
