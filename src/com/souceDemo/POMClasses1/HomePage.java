package com.souceDemo.POMClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement Menu;
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logout;
	
	
//==============
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
//==============
	
	public void ClickMenu()
	{
		Menu.click();
	}
	
	public void ClickLogout()
	{
		Logout.click();
	}
	
	
	
	
	
	
	
	
	
	
}
