package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class validatecount {
	@Test
	public void validatelogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.kapoorlampshades.com/product-category/ceiling-lights/");
		
		String count=driver.findElement(By.className("woocommerce-result-count")).getText().split(" ")[3];
		System.out.println(count);
		int act=Integer.parseInt(count);
		List<WebElement>countlamp=driver.findElements(By.xpath("//div[@class='gridview']//h3"));
		List<String>arr=new ArrayList<String>();
		WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
		for(WebElement a2:countlamp) {
			arr.add(a2.getText());
			
		}
		
	//	System.out.println(arr.size());
		while(true) {
			
			Thread.sleep(3000);
			next.click();
			countlamp=driver.findElements(By.xpath("//div[@class='gridview']//h3"));
			for(WebElement a2:countlamp) {
				arr.add(a2.getText());
			}
		
		try {
			next=driver.findElement(By.xpath("//a[text()='Next']"));
			
	
			
		}
		catch(Exception e) {
			break;
			
		}

		}
		Assert.assertEquals(act,arr.size());
		System.out.println(arr.size()+"is the final count");
		System.out.println(arr);
		
	}
}
