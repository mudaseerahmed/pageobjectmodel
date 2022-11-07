package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.Homepage;

public class Validatetext {
	@Test
	public void validatelogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.kapoorlampshades.com/product-category/ceiling-lights/");
		Homepage hp=new Homepage(driver);
		hp.gettextofproducts();
		

}
}
