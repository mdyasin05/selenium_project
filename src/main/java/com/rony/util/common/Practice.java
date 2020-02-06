package com.rony.util.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Practice {
	
	public static void loadproperties() throws FileNotFoundException, IOException {
		
		loadproperty("test.properties");
		loadproperty("webdriver.properties");
		
	}
	public static void loadproperty(String propertyfileName) throws IOException,FileNotFoundException {
		
		File F= new File("./properties"+ propertyfileName);
		FileInputStream fileinput= new FileInputStream(F);
		
		Properties p= new Properties();
		
		p.load(fileinput);
		
		for(String k:p.stringPropertyNames()) {
			System.setProperty(k, p.getProperty(k));
		}
		
	}
	
	
	
	
}
