package com.rony.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		driver = setDriver(System.getProperty("browser.name"));
		return driver;
	}

	public static WebDriver setDriver(String browserName) {

		if ("Firefox".equals(browserName)) {
			//WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}

		else if ("IE".equals(browserName)) {
			//WebDriverManager.iedriver().setup();
			return new InternetExplorerDriver();

		} else {
			//WebDriverManager.chromedriver().setup();
			return new ChromeDriver();

		}

	}

	public static void manageBrowser() throws Exception {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.wait(2000);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}

}
