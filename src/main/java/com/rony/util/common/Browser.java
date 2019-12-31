package com.rony.util.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		driver = setDriver("Firefox");
		return driver;
	}

	public static WebDriver setDriver(String browserName) {

		if ("Firefox".equals(browserName)) {
			return new FirefoxDriver();
		}

		else if ("IE".equals(browserName)) {
			return new InternetExplorerDriver();

		} else {
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
