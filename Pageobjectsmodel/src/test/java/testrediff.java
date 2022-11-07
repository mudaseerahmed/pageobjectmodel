import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.rediffregistrationpage;

public class testrediff {
	@Test
	public void rediff() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		rediffregistrationpage rp=new rediffregistrationpage(driver);
		rp.entertext("Full Name", 1,"hello");
		rp.entertext("Choose", 1,"hello");
		rp.entertext("Alternate", 1,"hello");
		rp.entertext("Password", 1,"hello");
	    rp.entertext("Retype", 1, "hello");
	    rp.entertext("Mobile", 2, "983451");
	    rp.entertext("Enter the", 1, "hello");
	    
		
		
}
}

