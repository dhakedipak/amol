package com.souceDemo.TestClasses1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.souceDemo.Utility1.UtilityClass;

@Listeners (com.souceDemo.Utility1.ListenersClass.class)

public class TC01_LoginFunctionality extends TestBaseClass 
{ 
	@Test (priority = 0)
	public void VarifyLoginFunctionality()
	{   
		
		String ExpectedURL = "https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
	}
	
	@Test (priority = 2)
	public void Method4() throws IOException
	{
		String ExpectedTitle = "https://.saucedemo.com/inventory.html";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		if (ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("ok");
		}
		else
		{
			UtilityClass.ScreenShot(driver);
			
		}
		
		
		
	}	
	
	@Test (priority = 1)
	public void sampleTest()
	{
		int a = 50;
		int b = 60;
		
		Assert.assertTrue(a<=b);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
