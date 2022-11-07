package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class rediffregistrationpage {

	
	WebDriver driver;
	public rediffregistrationpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void entertext(String text,int n,String value) {
		
		String texts="//td[contains(text(),'"+text+"')]//following::input["+n+"]";
		driver.findElement(By.xpath(texts)).sendKeys(value);
	}
	
	
	
}
