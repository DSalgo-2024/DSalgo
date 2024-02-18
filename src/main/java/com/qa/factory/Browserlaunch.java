package com.qa.factory;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunch {

	
	public static WebDriver driver=null;
	
	public WebDriver launchBrowser(String browser) {
		System.out.println("inside method");
		try {
			switch(browser) {
			case "chrome":
				System.out.println("driver chrome");
				driver=new ChromeDriver();
				break;
			case "fireFox":
				driver=new FirefoxDriver();
				break;
			case "Edge":
				driver=new EdgeDriver();
				break;
             			
			}return driver;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return driver;
		
			
	}
	
}
