package com.altoro.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.altoro.Pages.Loginaltoro;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome" ,
				"https://altoro.testfire.net/login.jsp");
		Loginaltoro loginaltoro = PageFactory.initElements(driver , Loginaltoro.class);
		
		loginaltoro.login_altoro("jsmith", "demo123");
	}

}