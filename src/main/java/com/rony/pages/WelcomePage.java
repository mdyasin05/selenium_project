package com.rony.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.rony.baseClass.PageBase;

public class WelcomePage extends PageBase{
	
	@FindBy(xpath="//*[@id=\"option-menu\"]/li[1]") public WebElement welcomeText;
	
	
	
	
	

}
