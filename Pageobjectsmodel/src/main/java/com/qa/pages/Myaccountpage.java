package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccountpage {
	
	
	WebDriver driver;
	public Myaccountpage(WebDriver driver) {
		this.driver=driver;
PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	
	
	

	
/*	By username=By.id("username");
	By password=By.id("password");
	By login=By.name("login");
	*/
	public void enterusername(String text) {
		username.sendKeys(text);
		//driver.findElement(By.id("username")).sendKeys(text);
		
		
		
	}
			
	public void enterpassword(String text) {
		password.sendKeys(text);

	}
	public void clickloginbutton() {
		login.click();
	
	}
	
	
			
}
