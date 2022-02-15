package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.baseTest;

public class ManufacturingPageElements extends baseTest{
	
	// Locators for Manufacturing page
	
	public WebElement manufacturingOption = driver.findElement(By.xpath("//*[@id=\"result_app_2\"]"));
	public WebElement createBtn = driver.findElement(By.xpath("//button[@class= 'btn btn-primary o_list_button_add']"));
	
	public WebElement productList = driver.findElement(By.xpath("//input[@id='o_field_input_267']"));
	public WebElement productListText = driver.findElement(By.xpath("//a[@class='dropdown-item ui-menu-item-wrapper']"));
	public WebElement confirmBtn = driver.findElement(By.xpath("//span[text()='Confirm']"));
	public WebElement doneBtn = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]/span[contains(text(), 'Mark as Done')]"));
	

	// Locators for validation
	
	public WebElement product_id = driver.findElement(By.xpath("//a[@name='product_id']"));
	public WebElement componentStatus = driver.findElement(By.xpath("//span[@name='components_availability']"));
	
	
	

}
