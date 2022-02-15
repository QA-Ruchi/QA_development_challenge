package tests;

import org.testng.annotations.Test;

import pageEvents.HomePage;
import pageEvents.LoginPage;
import pageEvents.ManufacturingPage;
import org.testng.Assert;



public class ApplicationTest extends baseTest{


	@Test(priority=1)
	public void loginIntoApplication() {

		LoginPage loginPage = new LoginPage();

		loginPage.enterCredentials();

	}

	@Test(priority=2)
	public void inventoryFeatureTest() {

		HomePage homePage = new HomePage();

		homePage.inventoryFeature();
		homePage.productSelection();
		homePage.createNewProduct();
		homePage.homeMenuDisplay();

	}

	@Test(priority=3)
	public void manufacturingFeatureTest() {

		ManufacturingPage manufacturePage = new ManufacturingPage();

		manufacturePage.manufactureFeature();
		manufacturePage.manufactureOrder();
		manufacturePage.searchProduct();
		manufacturePage.confirmAndDone();
		
	}
	
	@Test(priority=4)
	public void assertValidation() {

		ManufacturingPage manufacturePage = new ManufacturingPage();
		manufacturePage.orderValidation();
		
	}

}
