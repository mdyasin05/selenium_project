package com.rony.baseClass;

import org.openqa.selenium.support.PageFactory;

public class PageBase extends TestBase{
	
	public PageBase() {
		PageFactory.initElements(driver, this);
	}

}