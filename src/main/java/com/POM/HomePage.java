package com.POM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBaseClass;

public class HomePage extends TestBaseClass {

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='SHOP MEN']")
	private WebElement men_btn;

	public WebElement getMen_btn() {
		return men_btn;
	}
	
	
	
}
