package com.rony.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LogSetUp {
	
	public static Logger logger;
	public static Logger myLog() {
		
		logger= Logger.getLogger("TestLoginUsingFramework");
		PropertyConfigurator.configure("log4j.properties");		
		return logger;
		
	}

}
