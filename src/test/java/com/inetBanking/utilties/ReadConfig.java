package com.inetBanking.utilties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	
      
	Properties pro;
	
	public ReadConfig()  {
		
		
	File file = new File("./Configurations/config.properties");

	
	try {
		
		FileInputStream fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);
		
	} catch (Exception e) {
	
		System.out.println("exception is"+ e.getMessage());
	} 
	}
	
	
	
	
	public String getApplication()  {
	String url=	pro.getProperty("baseURL") ;
	return url;
	}
	
	public String getusername() {
		String User= pro.getProperty("username") ;
		return User;
		}
	public String getpassword()  {
		String pass=	pro.getProperty("password") ;
		return pass;
		}

}
