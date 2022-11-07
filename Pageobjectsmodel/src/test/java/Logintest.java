import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.Homepage;
import com.qa.pages.Loginpage;

public class Logintest {

	@Test
	public void validatelogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.kapoorlampshades.com/my-account/");
		Loginpage lp=new Loginpage(driver);
	//	lp.loginapplication("hello", "vaayooo");
		lp.loginapplication("hellohow491@gmail.com", "Vaayoo123$");
		Homepage hp=new Homepage(driver);
		hp.clickshop();
		hp.clickproductonebyonegettext();
	//	hp.gettextofall();
		
		
		
	}
}
