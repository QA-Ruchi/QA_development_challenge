package pageEvents;

import pageObjects.HomePageElements;

public class HomePage extends HomePageElements{
	
	HomePageElements homePageEle = new HomePageElements();
	
	public void inventoryFeature() {
		homePageEle.inventory.click();
	}
	
	// Selecting Product from Product dropdown
	public void productSelection() {
		
		homePageEle.products.click();
		homePageEle.productsSelection.click();
		homePageEle.createBtn.click();
		
		
	}
	
	//Creating new Product with qty > 10
	
	public void createNewProduct()
	{
		homePageEle.productName.sendKeys("Product246");
		String productNameVerify = productName.getText();
		homePageEle.updateQty.click();
		homePageEle.createRecord.click();
		homePageEle.countedQty.sendKeys("11");
		
		homePageEle.saveBtn.click();
		
	}
	
	//Navigating back to Home page
	
	public void homeMenuDisplay()
	{
		homePageEle.homeMenu.click();
		
	}
	
}
