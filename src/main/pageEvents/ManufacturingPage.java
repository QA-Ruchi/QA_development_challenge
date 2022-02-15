package pageEvents;

import org.openqa.selenium.By;

import pageObjects.ManufacturingPageElements;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ManufacturingPage extends ManufacturingPageElements{
	
	ManufacturingPageElements manufacturePageEle = new ManufacturingPageElements();
	
	public void manufactureFeature() {
		manufacturePageEle.manufacturingOption.click();
		
	}
	
	public void manufactureOrder() {
		manufacturePageEle.createBtn.click();
		
	}
	
	//Search product from this list
	
	public void searchProduct() {
		manufacturePageEle.productList.click();

		Select select = new Select(productListText);
		select.selectByVisibleText("Product246");
		
	}
	
	//select avilable product and mark as done
	
	public void confirmAndDone() {
		manufacturePageEle.confirmBtn.click();
		manufacturePageEle.doneBtn.click();
		
	}
	
	
	// Validation of new Manufacturing Order
	
	public void orderValidation() {
		String productIdValue = product_id.getText();
		String status = componentStatus.getText();
		
		Assert.assertEquals(status, "Available");
		
		
	}

}
