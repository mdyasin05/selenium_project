package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature/login.feature"},
		tags= {"@Regression"},		
		glue="com.cucumber.stepdefinition"  // need to delare the package name rather than class name
		
		)


public class Runner {

}
