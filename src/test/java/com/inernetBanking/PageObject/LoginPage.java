package com.inernetBanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement textUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement textPassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLonig;

	@FindBy(xpath = "//*[text()='Log out']")
	@CacheLookup
	WebElement lnklogout;

	public void setUserName(String UserName) {
		textUserName.sendKeys(UserName);
	}

	public void setpassword(String pwd) {
		textPassword.sendKeys(pwd);
	}

	public void clicksubmit() {
		btnLonig.click();
	}

	public void clicklogOut() {
		lnklogout.click();
	}

}
