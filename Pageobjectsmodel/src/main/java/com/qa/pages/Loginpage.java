package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.abstractcomponent.Abstractcomponent;

public class Loginpage extends Abstractcomponent{
	
	WebDriver driver;
	
	
	public Loginpage(WebDriver driver) {
		super(driver);
	this.driver=driver;
	
		PageFactory.initElements(driver,this);
	

	}

//	WebElement username=driver.findElement(By.id(" "));
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.ID,using="username")
	WebElement test;
	@FindBy(xpath="//button[text()='Log in']")

	WebElement submit;
	
	public void loginapplication(String un,String pwd) {
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		submit.click();
	}

	
	
}
