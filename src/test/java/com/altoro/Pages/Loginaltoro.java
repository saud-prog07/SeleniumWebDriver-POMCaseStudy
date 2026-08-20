package com.altoro.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginaltoro {
	
	WebDriver driver;
	
	public Loginaltoro(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "uid")
	WebElement email;
	
	@FindBy(name = "passw")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='btnSubmit']")
	WebElement loginbtn;
	
	public void login_altoro(String uname , String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}

}