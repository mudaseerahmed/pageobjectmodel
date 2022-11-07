import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.Loginpageone;

public class Logintestone {
	@Test
	public void validatelogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.kapoorlampshades.com/my-account/");
		Loginpageone lp=new Loginpageone(driver);
		lp.loginapplication("hello", "hello");
		lp.loginapplication("hellohow491@gmail.com", "Vaayoo123$");
		
		

}
}
