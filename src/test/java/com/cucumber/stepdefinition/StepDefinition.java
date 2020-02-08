package com.cucumber.stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^Invoke the URL in chrome browser$")
	public void invoke_the_URL_in_chrome_browser() throws Throwable {
		System.out.println("invoked the url");
	    
	}

	@When("^Enter the username$")
	public void enter_the_username() throws Throwable {
		System.out.println("Enter the username");

	}
	@When("^Enter the invalid username$")
	public void enter_the_invalid_username() throws Throwable {
		System.out.println("Enter the invalid username");

	}

	@When("^Enter the password$")
	public void enter_the_password() throws Throwable {
		System.out.println("Enter the password");

	}

	@When("^hit login button$")
	public void hit_login_button() throws Throwable {
		System.out.println("Hit the login button");

	}

	@Then("^Verify the Welcome page$")
	public void verify_the_Welcome_page() throws Throwable {
		System.out.println("verify the Welcomepage");

	}


}
