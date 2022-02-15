package pageEvents;

import pageObjects.LoginPageElements;

public class LoginPage extends LoginPageElements {

	public void enterCredentials() {
		
		LoginPageElements loginPageEle = new LoginPageElements();
		
		
		loginPageEle.email.sendKeys("user@aspireapp.com");
		loginPageEle.password.sendKeys("@sp1r3app");
		loginPageEle.loginButton.click();
		
	}
	
}
