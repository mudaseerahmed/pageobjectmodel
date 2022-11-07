import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Searchbluetest {
	@Test
	public void validatelogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\New folder (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://askomdch.com/");
		ShoppingHomepage sh=new ShoppingHomepage(driver);
		sh.clickshop();
		Storepage sp=new Storepage(driver);
		sp.entertext("men");
		sp.clickbutton("Search");
		Searchpage sp3=new Searchpage(driver);
		sp3.validatebluetext("men");
		sp3.gettextofproduct();
		
		
		
}
}
