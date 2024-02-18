package myhooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.factory.Browserlaunch;
import com.qa.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageobjects.Arraypage;
import pageobjects.HomePage;
import pageobjects.Registerpage;
import utilities.baseclass;

public class Hooks extends baseclass {
	

public static WebDriver driver;
private Browserlaunch browserlaunch;
private ConfigReader configReader;
private Properties prop;

@Before(order=0)
public void getproperty() {
	configReader=new ConfigReader();
	prop=configReader.init_prop();
}


@Before(order = 1)
public void setup() {
	System.out.println("inside hooks setup");
	 //driver =new ChromeDriver();
	String browsername= prop.getProperty("browser");
	System.out.println(browsername);
	launchBrowser(browsername);
	//browserlaunch = new Browserlaunch();
	//browserlaunch.launchBrowser(browsername);
	System.out.println(driver);
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 System.out.println("inside hooks setup - Driver initialized!!!");
     HP = new HomePage(driver);
     Ap =new Arraypage(driver);
     RP=new Registerpage(driver);
	
}

@After
public void teardown() {
	if(driver!=null) {
		driver.quit();
	}
}

public void launchBrowser(String browser) {
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
         			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
		
}
}

