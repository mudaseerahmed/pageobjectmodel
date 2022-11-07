package com.qa.abstractcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractcomponent{
	WebDriver driver;
	public Abstractcomponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void waitforelementtoappear(By findby) {
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(findby));
		
		
	}

}
