import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingHomepage {

	WebDriver driver;
	public ShoppingHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//div[@id='primary']//div[contains(@class,'buttons')]/div/a[text()='Shop Now'])[1]")
	WebElement shop;
	
	public void clickshop() {
		shop.click();
	}
	
	
	
}
