package com.rony.util;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestReport {
	public ExtentHtmlReporter htmlReport;
	public ExtentReports extent;
	public ExtentTest testReport;
	
	
	@BeforeTest
	public void setExtent() {
		htmlReport= new ExtentHtmlReporter(System.getProperty("user.dir")+"/TestResult/TestReport.html");
		htmlReport.config().setDocumentTitle("Automation Report");
		htmlReport.config().setReportName("Functional Test Report");
		htmlReport.config().setTheme(Theme.STANDARD);
		
		//Attach the reporter
		extent= new ExtentReports();
		
		extent.attachReporter(htmlReport);
		
		extent.setSystemInfo("Tester", "Rony ");
		extent.setSystemInfo("Env", "QA");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
		
	}
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus()== ITestResult.FAILURE) {
			testReport.log(Status.FAIL, "Test case is failed" +testResult.getName());// to add name in Extent report
			testReport.log(Status.FAIL, "Test case is failed" +testResult.getThrowable()); //to add error exception in the report
		    
			 
		
		
		}
		else if(testResult.getStatus()==ITestResult.SUCCESS) {
			testReport.log(Status.PASS, "Test is passed" + testResult.getName());
		}
		else if(testResult.getStatus()==ITestResult.SKIP) {
			testReport.log(Status.SKIP, "Test is skipped" + testResult.getName());
		}
		
	}
	
}
