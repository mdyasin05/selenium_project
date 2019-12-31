package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {

	@Test
	public void validateLoginWithCorrectCredential() {
		                                           // configure the propeties for webdriver application.
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		                                           // instantiate the webdriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
      
		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		driver.findElement(By.id("btnLogin")).click();
		String expected = "Welcome Admin";
		String actual = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		Assert.assertEquals(actual, expected);
		driver.close();
	}

}



   // System.setProperty("webdriver.chrome.driver", System.setProperty("user.dir", "\\drivers\\chromedriver.exe"));