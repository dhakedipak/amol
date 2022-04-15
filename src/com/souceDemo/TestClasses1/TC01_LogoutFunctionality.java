package com.souceDemo.TestClasses1;

import org.testng.annotations.Test;

import com.souceDemo.POMClasses1.HomePage;

public class TC01_LogoutFunctionality extends TestBaseClass
{
	
	@Test
	public void VarifyLogoutFunctionality()
	{   
		HomePage hp= new HomePage(driver);
		hp.ClickMenu();
		hp.ClickLogout();
	
		String Expectedurl = "https://www.saucedemo.com/";
		String Actualurl = driver.getCurrentUrl();
		
		
			
	}
	
}
