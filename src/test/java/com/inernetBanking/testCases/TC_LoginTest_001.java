package com.inernetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inernetBanking.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest()
	{
		logger.info("url is opend");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(UserName);
		logger.info("User Name is Entered");
		lp.setpassword(pwd);
		logger.info("password is entered");
		lp.clicksubmit();

		if(driver.getTitle().equals("guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(false);
			logger.info("logger test pass");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("logger test failed");
		}
	}

}
