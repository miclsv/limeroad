package com.testrunner;
import com.BaseClass.TestBaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\LENOVO\\limeroad\\src\\test\\java\\com\\feature\\limeroad.feature",glue = "com.stepdefinition",
tags="@tag1",

plugin = {"pretty","html:res/lime.html","json:res/lime.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		 )
public class TestRunner extends TestBaseClass {
		
	@BeforeClass
	public static void launch()
	{
		getDriver("chrome");
				
	}
	
	
}
