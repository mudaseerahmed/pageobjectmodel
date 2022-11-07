package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpageone {
	WebDriver driver;
	
	
	public Loginpageone(WebDriver driver) {
	this.driver=driver;


	}
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.xpath("//button[text()='Log in']");
	
	public void loginapplication(String un,String pwd) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(submit).click();
	}
	
	
	
	

}
