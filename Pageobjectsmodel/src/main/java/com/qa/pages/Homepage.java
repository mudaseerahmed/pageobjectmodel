package com.qa.pages;

import java.util.List;

import org.apache.poi.ss.excelant.ExcelAntEvaluateCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	Xls_Reader excel=new Xls_Reader("C:\\Users\\HP\\eclipse-workspace\\Pageobjectsmodel\\Testdata.xlsx");
  
	WebDriver driver;
//	Xls_Reader excel;
	
	
	
	public Homepage(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
}
	
	@FindBy(xpath="(//li/a[text()='Shop'])[2]")
	@CacheLookup
	WebElement shop;
	
	@FindBy(xpath="//ul[@class='product-categories']//a")
	List<WebElement>products;
	@FindBy(xpath="//ul[@class='product-categories']//li/span")
	List<WebElement>countone;
	@FindBy(xpath="//p")
	List<WebElement>texts;
	
	
	
	public void clickshop() {
	shop.click();
	}
	public void clickproductonebyonegettext() throws InterruptedException {
		String finresult = null;
		int i;
		for( i=0;i<products.size();i++) {
			
			products.get(i).click();
			String text=countone.get(i).getText();
			text=text.replace("(", "");
			text=text.replace(")", "");
			int val=Integer.parseInt(text);
			System.out.println(text+"is the count");
			System.out.println("the value int integer is "+val);
			String texttwo="(//p[@class='woocommerce-result-count'])[1]";
			String result=driver.findElement(By.xpath(texttwo)).getText();
			Thread.sleep(2000);
			String results[]=result.split(" ");
			
			if(val==1) {
				finresult=results[2];
				finresult=finresult.replace("single","1");
				System.out.println(finresult+"--is the result");
				
			}
			else if(val==2) {
				finresult=results[2];
				System.out.println(finresult+"--is the result");
			}
			else if(val>9) {
				finresult=results[3];
				System.out.println(finresult+"--is the result");
			//	excel.
				
				
			}
			String p=excel.path;
			System.out.println(p+" is the path");
		//	int excelval=Integer.parseInt(finresult);
			Thread.sleep(3000);
			List<WebElement>a=driver.findElements(By.xpath("//div[contains(@class,'bottom')]//p[contains(text(),'Showing')]//preceding::ul[@class='page-numbers']//li"));
			int page=a.size();
			if(page>1) {
				System.out.println("more than 1 page for"+"--"+val);
			}
			else {
				System.out.println("only 1 page for"+" "+val);
			}
			
		
			boolean t=excel.isSheetExist("Sheet2");
			System.out.println("sheet exists"+t);
			
		excel.setCellData("Sheet2", "Count", i+2,text);
		excel.setCellformula("Sheet2","Count",15,"COUNTA(A2:A14)");
			
		}

		
	}
	public void gettextofall()
	{
		
		for(int i=0;i<texts.size();i++) {
			String ptext=texts.get(i).getText();
			System.out.println(ptext+"is ----> "+i);
		}
	}
	public void gettextofproducts() {
	List<WebElement>co=driver.findElements(By.xpath("//h3[@class='product-name']"));
	int n=co.size();
	for(int i=1;i<n;i=i+2)
	{		String tex="(//h3[@class='product-name'])["+i+"]";
	        String texts=driver.findElement(By.xpath(tex)).getText();
	        excel.setCellData("Sheet2", "bulbdetails", i+1,texts);
	        
	        excel.setCellformula("Sheet2","bulbdetails",20,"COUNTA(B2:B34)");
	
	}
}

}
