package com.rony.baseClass;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.rony.pages.LoginPage;
import com.rony.pages.WelcomePage;
import com.rony.util.Browser;
import com.rony.util.PropertiesLoader;
import com.rony.util.TestReport;

public class TestBase extends TestReport{

	public static WebDriver driver;
	public static LoginPage login;
	public static WelcomePage welcome;

	@BeforeClass
	public static void initialization() throws FileNotFoundException, IOException {

		PropertiesLoader.loadProperties();
		driver = Browser.getDriver();
		login= new LoginPage();
		welcome=new WelcomePage();
		

	}

	public void invokeURL() {
		driver.get(System.getProperty("base.url"));
	}
	public void invokeURL1() {
		driver.get(System.getProperty("base.ur"));
	}

	@AfterClass
	public void closeBrowser() {

		driver.close();

	}

}
