#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: LogIn Test
  I want to Test the login here

  
  Scenario: Validate the login functionality using valid credentials

			Given Invoke the URL in chrome browser
			When Enter the username
			And Enter the password
			And hit login button
		  Then Verify the Welcome page
		  
	 Scenario: Validate the login functionality using invalid usename

			Given Invoke the URL in chrome browser
			When Enter the invalid username
			And Enter the password
			And hit login button
		  Then Verify the Welcome page
		  
	
    


 
