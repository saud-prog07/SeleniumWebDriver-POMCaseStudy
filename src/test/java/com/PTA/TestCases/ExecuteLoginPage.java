package com.PTA.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PTA.pages.LoginPTA;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome" ,
				"https://practicetestautomation.com/practice-test-login/");
		LoginPTA loginpta = PageFactory.initElements(driver , LoginPTA.class);
		
		loginpta.login_PTA("student", "Password123");
	}

}