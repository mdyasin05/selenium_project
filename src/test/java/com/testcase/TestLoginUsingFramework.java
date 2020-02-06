package com.testcase;

import org.testng.annotations.Test;

import com.rony.baseClass.TestBase;

public class TestLoginUsingFramework extends TestBase {
	
	@Test
	public void validateLoginUsingCorrectCredential() throws InterruptedException {
		testReport=extent.createTest("Validate login for correct credentials ");
		
		
		
		invokeURL();
		Thread.sleep(2000);
		login.enterUserName(); 
		login.enterPassword(); 		
		login.hitLogInButton();
		 

		
	}
	@Test
	public void validateLoginUsingincorrectCorrectCredential() {
		testReport=extent.createTest("Validate login for incorrect credentials ");
		invokeURL1();
	}
	
	

}
