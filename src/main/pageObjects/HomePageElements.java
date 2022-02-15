package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import tests.baseTest;

public class HomePageElements extends baseTest{
	
	//Locators for Inventory page and home page
	
	public WebElement inventory = driver.findElement(By.xpath("//*[@id='result_app_1']"));
	public WebElement products = driver.findElement(By.xpath("//span[text()='Products']"));
	public WebElement productsSelection = driver.findElement(By.xpath("//a[@href='#menu_id=124']"));
	public WebElement createBtn = driver.findElement(By.xpath("//button[@class= \"btn btn-primary o-kanban-button-new\"]"));
	public WebElement productName = driver.findElement(By.xpath("//input[@id=\"o_field_input_11\"]"));
	public WebElement updateQty = driver.findElement(By.xpath("//span[text()='Update Quantity']"));
	public WebElement createRecord = driver.findElement(By.xpath("//button[@class='btn btn-primary o_list_button_add']"));
	public WebElement countedQty = driver.findElement(By.xpath("//input[@name='inventory_quantity']"));
	public WebElement applyBtn = driver.findElement(By.xpath("//span[text()='Apply']"));
	public WebElement saveBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary o_list_button_save']"));
	public WebElement homeMenu = driver.findElement(By.xpath("//a[@title='Home menu']"));
	
	
	
	
	

	

}
