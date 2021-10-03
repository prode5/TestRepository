package com.iNetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURl="http://demo.guru99.com/V1";
	public String username="mngr356882";
	public String password="YhEvemY";
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();;
	}
	
	
	
}
