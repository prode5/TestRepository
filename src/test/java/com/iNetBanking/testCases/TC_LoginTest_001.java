package com.iNetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

	@Test
	public void LoginTest() throws InterruptedException
	{
		driver.get(baseURl);
		Thread.sleep(3000);
		LoginPage2 lp=new LoginPage2(driver);
		lp.setUserName(username);
		lp.setPassword(password);
	
	    lp.clickSubmit();
	    System.out.println(driver.getTitle());
	    
	   if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else 
	    {
	    	Assert.assertTrue(false);
	    }
	}
	
	
	
	
	
	
}
