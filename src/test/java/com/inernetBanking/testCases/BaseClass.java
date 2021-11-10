package com.inernetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.internetBanking.utilities.ReadConfig;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	
	public String URL=readconfig.getApplicationURL();
	public String UserName=readconfig.getUsername();
	public String pwd=readconfig.getPssword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("Browser")
	@BeforeClass
	public void setUp(String br)
	{
		logger=Logger.getLogger("eBanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver",readconfig.getChromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firebox")) {
			System.setProperty("WebDriver.gecko.driver",readconfig.getfirefoxpath());
			driver=new FirefoxDriver();
		}
		else if(br.equals("IE"))
		{
			System.setProperty("WebDriver.ie.driver",readconfig.getIEpath());
			driver=new InternetExplorerDriver();
		}
		driver.get(URL);

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
