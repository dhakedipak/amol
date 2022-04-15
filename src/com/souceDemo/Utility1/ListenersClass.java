package com.souceDemo.Utility1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener
{   
	public void onTestStart (ITestResult result)
	{
		System.out.println("Execution start");
	}
	
	public void onTestSuccess (ITestResult result)
	{
		System.out.println("TestCase Success");
	}
	
	public void onTestFailure (ITestResult result)
	{
		System.out.println("TestCase Failed");

	}
	
	public void onTestSkipped (ITestResult result)
	{
		System.out.println("TestCase Skipped");
	}
	
	public void onTestFailedButWithinSuccessPercentage (ITestResult result)
	{
		System.out.println("Test Failed But Within Success Percentage");
	}
	
	public void onStart (ITestResult result)
	{
		System.out.println("Starts of Test Execution");
	}
	
	public void onFinish (ITestResult result)
	{
		System.out.println("End Of Test Execution");
	}
	
	
	
	
	
	
	
}
