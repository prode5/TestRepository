package com.iNetBanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BaseClass {

   WebDriver ldriver;
	
   LoginPage2(WebDriver rdriver)
   {
	   ldriver=rdriver;
	   PageFactory.initElements(rdriver, this);
   }
   @FindBy(name="uid")
	WebElement txtUserName;
	
   @FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
   @FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	
	

	public void setUserName(String username) 
	{
		txtUserName.sendKeys("mngr356882");
	}
	
	public void setPassword(String password) 
	{
		txtUserName.sendKeys("YhEvemY");
	}
	
	public void clickSubmit() 
	{
		loginbtn.click();
	}
	
}
