package com.inetBanking.utilties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XlUtlities {


		
		 @DataProvider
		 public String[][] getData () throws Exception {
	    	 
			File file = new File("C:\\eclipse project\\inetBankingV1\\src\\test\\java\\com\\inetBanking\\testData\\LoginData.xlsx");
		//	System.out.println(file.exists());
			
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowcount =  sheet.getPhysicalNumberOfRows();
	        int columncount= sheet.getRow(0).getLastCellNum();

			String[][] data= new String[rowcount-1][columncount];
			for (int i = 0; i < rowcount-1; i++) 
			{
				for (int j = 0; j <  columncount; j++)
				{
					DataFormatter df= new DataFormatter();
				    data[i][j]=	df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			     }
				
			
			    }
			
			
			   workbook.close();
			   fis.close();
	     
			  return data;
			  
			 
		 
		}
	
}
