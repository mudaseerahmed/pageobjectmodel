package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.abstractcomponent.Singeltonwebdriver;

public class Freecrm {
@BeforeClass
public void setup() {
	Singeltonwebdriver.init();
	

}

@Test
public void verifytitle() {
	String title=Singeltonwebdriver.driver.getTitle();
	
	System.out.println(title+"is the title");
	
}
@AfterClass
public void quitbrowser() {
	Singeltonwebdriver.quit();
	
}
}
