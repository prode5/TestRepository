package com.iNetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	WebElement txtUserName=driver.findElement(By.name("uid"));
	
	WebElement txtPassword=driver.findElement(By.name("password"));
	
	WebElement loginbtn=driver.findElement(By.name("btnLogin"));
	
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void setUserName(String uname) 
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) 
	{
		txtUserName.sendKeys(pwd);
	}
	
	public void clickSubmit() 
	{
		loginbtn.click();
	}
	
	
}
