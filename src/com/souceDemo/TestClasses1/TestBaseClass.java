package com.souceDemo.TestClasses1;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.souceDemo.POMClasses1.HomePage;
import com.souceDemo.POMClasses1.LoginPage;
@Listeners (com.souceDemo.Utility1.ListenersClass.class)

public class TestBaseClass
{	WebDriver driver;

	@BeforeClass
	public void setUpMethod()
	{		
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\MAIN softwares\\automation\\crome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@BeforeMethod
	public void LoginMethod()
	{	
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername();
		lp.enterPassword();
		lp.ClickLogin();
	}
	
	@AfterMethod
	public void tearDownMethod()
	{  
		HomePage hp= new HomePage(driver);
		hp.ClickMenu();
		hp.ClickLogout();
	}
	@AfterClass
	public void CloseMethod()
	{
		driver.quit();		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
}
