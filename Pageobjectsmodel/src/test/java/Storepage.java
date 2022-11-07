import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Storepage {
	WebDriver driver;
	
	public Storepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(name="s")
WebElement producttextbox;
public void entertext(String text) {
	producttextbox.sendKeys(text);
}
public void clickbutton(String button) {
	driver.findElement(By.xpath("//button[text()='"+button+"']")).click();
	
}



}
