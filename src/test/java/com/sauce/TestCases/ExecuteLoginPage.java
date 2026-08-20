package com.sauce.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sauce.Pages.Loginsauce;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome" ,
				"https://www.saucedemo.com/");
		Loginsauce loginsauce = PageFactory.initElements(driver , Loginsauce.class);
		
		loginsauce.login_sauce("visual_user", "secret_sauce");
	}

}