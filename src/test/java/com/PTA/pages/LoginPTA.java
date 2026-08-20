package com.PTA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPTA {
	
	WebDriver driver;
	
	public LoginPTA(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='submit']")
	WebElement loginbtn;
	
	public void login_PTA(String uname , String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

}