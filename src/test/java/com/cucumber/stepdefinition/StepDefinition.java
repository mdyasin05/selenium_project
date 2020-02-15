package com.cucumber.stepdefinition;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.rony.pages.LoginPage;
import com.rony.pages.WelcomePage;
import com.rony.util.Browser;
import com.rony.util.LogSetUp;
import com.rony.util.PropertiesLoader;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@Before
	public static void initialization() throws FileNotFoundException, IOException {

		PropertiesLoader.loadProperties();
		driver = Browser.getDriver();
		logger=LogSetUp.myLog();

		
	}
	
	@Given("^Invoke the URL in chrome browser$")
	public void invoke_the_URL_in_chrome_browser() throws Throwable {
		driver.get(System.getProperty("base.url"));
		Thread.sleep(3000);
	    
	}

	@When("^Enter the username$")
	public void enter_the_username() throws Throwable {

		driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		

	}
	@When("^Enter the invalid username$")
	public void enter_the_invalid_username() throws Throwable {
		System.out.println("Enter the invalid username");

	}

	@When("^Enter the password$")
	public void enter_the_password() throws Throwable {
		driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");

	}

	@When("^hit login button$")
	public void hit_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^Verify the Welcome page$")
	public void verify_the_Welcome_page() throws Throwable {
		System.out.println("verify the Welcomepage");

	}
	
	@When("^Enter the username \"([^\"]*)\"$")
	public void enter_the_username(String username) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	 
	}

	@When("^Enter the password \"([^\"]*)\"$")
	public void enter_the_password(String password) throws Throwable {
		
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}
	



}
