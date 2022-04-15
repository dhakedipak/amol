package com.souceDemo.POMClasses1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='user-name']")
    private WebElement Username;	
	
	@FindBy (xpath="//input[@id='password']")
    private WebElement Password;	
	
	@FindBy (xpath="//input[@id='login-button']")
    private WebElement Login;	
	
	
//============
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//============
	
	public void enterUsername()
	{
		Username.sendKeys("standard_user");
	}
	
	public void enterPassword()
	{
		Password.sendKeys("secret_sauce");
	}
	
	public void ClickLogin()
	{
		Login.click();
	}
	
	
	
	
	
	
	
	
}
