import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchpage {
	
	WebDriver driver;
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[contains(@class,'summary-wrap')]//h2")
	List<WebElement>blue;
	@FindBy(xpath="//span[@class='price']/span")
	List<WebElement>first;
	@FindBy(xpath="")
	List<WebElement>second;
	
	
	public void validatebluetext(String textval) {
		for(int i=0;i<blue.size();i++) {
			String text=blue.get(i).getText();
			text=text.trim();
			System.out.println(text);
			Boolean blue=text.contains(textval);
			
	//	Assert.assertTrue(blue);
			
					
		}
		
			
		}
	public void gettextofproduct() {
		String text="//span[@class='price']/span";
		String text2="//span[@class='price']/span/../..//h2";
		String othertext="//span[@class='price']//del/..//ins/../..//h2";
		String otherprice="//span[@class='price']//del/..//ins";
		
		
		List<WebElement>price2=driver.findElements(By.xpath(othertext));
		List<WebElement>price23=driver.findElements(By.xpath(otherprice));
		int n2=price2.size();
		
		List<WebElement>price=driver.findElements(By.xpath(text));
		List<WebElement>textproduct=driver.findElements(By.xpath(text2));
		int n=price.size();
		for(int i=0;i<n;i++) {
			String priceofproduct=price.get(i).getText();
			String textofproduct=textproduct.get(i).getText();
			System.out.println(textofproduct+"---->>>"+priceofproduct);
		//	String textother=price2.get(i).getText();
		//	String price28=price23.get(i).getText();
			
		//	System.out.println(textother+"---->"+price28);
			
			
		}
		for(int i=0;i<n2;i++) {
			String textother=price2.get(i).getText();
			String price28=price23.get(i).getText();
			
			System.out.println(textother+"---->"+price28);
			
			
			
		}
		
	
		
		
	}
	

}
