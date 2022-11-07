package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logintwopage {
	
	WebDriver driver;
	public Logintwopage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	/*By username=By.id("username");
	By password=By.id("password");
	By loginbutton=By.name("login");
	
	*/
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(name="login")
	WebElement loginbutton;
	
public void enterusername(String text) {
	username.sendKeys(text);
	
	
	
}
public void enterpassword(String text) {
	password.sendKeys(text);
	
   
}
public void clickonloginbutton() {
	loginbutton.click();

}
	
	
}