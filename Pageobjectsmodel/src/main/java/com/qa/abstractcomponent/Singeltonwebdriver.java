package com.qa.abstractcomponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singeltonwebdriver {
	public static WebDriver driver=null;
//	public static String browser="chrome";
	public static void init() {
		
		if(driver==null) {
			if(Constants.browsername.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
				 driver=new ChromeDriver();
				
			}
			
			else if(Constants.browsername.equalsIgnoreCase("FF")){
				
			}
				
			}
		driver.get(Constants.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.hashCode());
			
		}
	public static void quit() {
	
		
		driver.quit();
		driver=null;
	}
	public static void close() {
		
		driver.close();
		driver=null;
	}
	}


