package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
	    prop = new Properties();
	
		FileInputStream ip	 = new FileInputStream(
					"/Users/Jyothiaddala/Documents/JavaTraining/Festicket/src/main/java/com/qa/util/Festicketlogin.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("browser"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void openurl() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
