package com.souceDemo.TestClasses1;

import org.testng.annotations.Test;

public class Practice_TestNG
{

	@Test (priority = -2)
	public void method1()
	{
		System.out.println("sssdcs");
	}
	
	@Test (priority= -1)
	
	public void method2()
	{
		System.out.println("Method -2");
	}
	
	@Test (priority= 4, dependsOnMethods= {"Login"})
	public void Logout()
	{
		System.out.println("Logout");
		
	}
	
	@Test (priority= -3)
	public void Login()
	{
		System.out.println("Login");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
