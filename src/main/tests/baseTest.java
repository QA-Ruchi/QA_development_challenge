package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.ApplicationUrl;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



public class baseTest {

	public static WebDriver driver;
	
	
	@BeforeMethod
	@Parameters(value= {"browserName"})
	public void beforeMethod(String browserName) {
		setupDriver(browserName);
		driver.get(ApplicationUrl.url);
		driver.manage().window().maximize();	
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	
	}
	
	public void setupDriver(String browserName)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Administrator/eclipse-workspace/Aspire_QA_Assignment/drivers/chromedriver");
		driver = new ChromeDriver();
	}
	
}
