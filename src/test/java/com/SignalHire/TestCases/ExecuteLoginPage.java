package com.SignalHire.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SignalHire.Pages.LoginSignalHire;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome" ,
				"https://www.signalhire.com/login");
		LoginSignalHire loginsignalhire = PageFactory.initElements(driver , LoginSignalHire.class);
		
		loginsignalhire.login_SignalHire("saud.sayeed261005@gmail.com", "Mailonly123_");
	}

}