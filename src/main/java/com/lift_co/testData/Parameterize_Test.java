package com.lift_co.testData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.lift_co.util.ApachePOI_ExcelReading;

public class Parameterize_Test
{
	public static void main(String[] args)
	{
		// Opening of Browser 
		   WebDriver driver;
		   DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		   capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, false);
		   System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
		   driver=new ChromeDriver(capabilities); 
		
		// Get Test data from Excel
		ApachePOI_ExcelReading reader = new ApachePOI_ExcelReading("D:\\puru_lift\\lift_co\\src\\main\\java\\com\\lift_co\\testData\\LoginModule.xlsx");
		int rowCount = reader.getRowCount("loginData");
		
		// Parameterization
		for(int rowNum=2; rowNum<=rowCount; rowNum++)
		{
			String bname = reader.getCellData("loginData", "bname", rowNum);
			String u = reader.getCellData("loginData", "u", rowNum);
			String uc = reader.getCellData("loginData", "uc", rowNum);
			String p = reader.getCellData("loginData", "p", rowNum);
			String pc = reader.getCellData("loginData", "pc", rowNum);
			
			// Login the App
			
			
		}
		
		
	}

}
