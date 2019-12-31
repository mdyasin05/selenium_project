package com.rony.util.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

	public static void loadProperties() throws FileNotFoundException, IOException {

		loadProperty("test.properties");
		loadProperty("webdriver.properties");
	}

	public static void loadProperty(String propertyFileName) throws FileNotFoundException, IOException {

		File F = new File("./properties/" + propertyFileName);
		FileInputStream fileinput = new FileInputStream(F);

		// FileInputStream fileinput = ;

		Properties p = new Properties();
		// p.load(new FileInputStream(new File("./properties/" + propertyFileName)));

		p.load(fileinput);

		for (String k : p.stringPropertyNames()) {
			System.setProperty(k, p.getProperty(k));
		}

	}

}
