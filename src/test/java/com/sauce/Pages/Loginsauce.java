package com.sauce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginsauce {
	
	WebDriver driver;
	
	public Loginsauce(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "user-name")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginbtn;
	
	public void login_sauce(String uname , String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

}