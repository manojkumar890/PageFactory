package com.abc.magentoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {

	WebDriver driver;
	@FindBy(linkText="My Account")
	WebElement myacc;
	public Main (WebDriver driver) {
         this.driver=driver;
         PageFactory.initElements(driver, this);
	}
	public void cilckOnMyAcc() 
	{
		myacc.click();
	}
	
	
}
