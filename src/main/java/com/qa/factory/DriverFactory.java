package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> threadlocal= new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is" + browser);
		
		if(browser.equals("chrome")) {
			
			System.out.println("inside chrome");		
				//WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
				threadlocal.set(new ChromeDriver());
				System.out.println("driver is set");
				
	    }
		else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		threadlocal.set(new FirefoxDriver());

	    }
		else if(browser.equals("safari")){
		WebDriverManager.safaridriver().setup();
		threadlocal.set(new SafariDriver());
	   }
		else {
	      System.out.println("provide proper browser");
		}
		getdriver().manage().deleteAllCookies();
		getdriver().manage().window().maximize();
		return getdriver();
		
 }
	public static WebDriver getdriver() {
		return threadlocal.get();
	}
}
