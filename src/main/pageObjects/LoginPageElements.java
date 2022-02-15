package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.baseTest;

public class LoginPageElements extends baseTest{
	
	//Locators for login page
	
	public WebElement email = driver.findElement(By.xpath("//input[@id='login']"));
	public WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
	public WebElement loginButton = driver.findElement(By.xpath("//button[@class =\"btn btn-primary btn-block\"]"));
	
}



