package com.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rony.baseClass.TestBase;

public class TestLoginUsingFramework extends TestBase {
	
	@Test
	public static void validateLoginUsingCorrectCredential() throws InterruptedException {
		
		invokeURL();
		Thread.sleep(2000);
		
		login.enterUserName(); 
		login.enterPassword(); 
		login.hitLogInButton();
		 
		
		
		
		
		/*
		 * driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		 * driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		 * driver.findElement(By.id("btnLogin")).click(); String expected =
		 * "Welcome Admin"; String actual =
		 * driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		 * Assert.assertEquals(actual, expected);
		 */
		
	}
	

}
