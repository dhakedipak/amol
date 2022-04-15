package com.souceDemo.Utility1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{   
	public static void ScreenShot(WebDriver driver) throws IOException
	{ 	
		Date date = new Date();
	    DateFormat f = new SimpleDateFormat("Mmddyyyy_hhmmss");
	    String Date = f.format(date);
	    
		TakesScreenshot t = (TakesScreenshot) driver ;
		File SourceFile = t.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("E:\\ScreenShot JaVa\\"+Date+".jpg");
		FileHandler.copy(SourceFile, DestFile);
			
		
	}
}
