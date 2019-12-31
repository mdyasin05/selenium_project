package com.rony.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.rony.baseClass.PageBase;

public class LoginPage extends PageBase{
	
	//Elements
	@FindBy(id="txtUsername") public WebElement username;
	@FindBy(id="txtPassword") public WebElement password;
	@FindBy(id="btnLogin") public WebElement logInButton;
	
	//Actions
	
	public void enterUserName() {
		username.sendKeys("opensourcecms");
	}
	public void enterPassword() {
		password.sendKeys("opensourcecms");
	}
	
	public void hitLogInButton() {
		logInButton.click();
	}
	
	
	

}
