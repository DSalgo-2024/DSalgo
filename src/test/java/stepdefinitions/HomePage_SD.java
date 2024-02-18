package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utilities.baseclass;

public class HomePage_SD extends baseclass{
	
	//public static WebDriver driver;
	
	//public static HomePage HP;
	//public WebDriverWait wait;
	
		
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		System.out.println("*** INITIALIZE SD ***");
     // driver =new ChromeDriver();
     //HP = new HomePage(driver);
	
			    
	}

	@Given("enters Dsalgo portal Url")
	public void enters_dsalgo_portal_url() {
		
	driver.get("https://dsportalapp.herokuapp.com");

	}

	@When("User clicks get started button")
	public void user_clicks_get_started_button() {
       		HP.clickgetstarted();
		
	}

	@Then("user navigate to Dsalgo home page")
	public void user_navigate_to_dsalgo_home_page() {
		//driver.get("https://dsportalapp.herokuapp.com/home");
	}

	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		
	/*	driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		HP = new HomePage(driver,wait);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));*/
		driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("User Clicks data structures Drop down")
	public void user_clicks_data_structures_drop_down() throws InterruptedException {
		
	   // HP.clickdropdown();
	}

	@When("clicks any of the listed six options")
	public void clicks_any_of_the_listed_six_options() throws InterruptedException {
	    HP.clickdropmenu();	
	    }

	

	@Then("User gets error message {string}")
	public void user_gets_error_message(String string) {
	   HP.alertmsg();
	}

	@Given("User is on dsportal Home Page")
	public void user_is_on_dsportal_home_page() {
		/*driver=new ChromeDriver();
		HP = new HomePage(driver);*/
	    driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("User clicks Get Started button in data structure Topics")
	public void user_clicks_get_started_button_in_data_structure_topics() throws InterruptedException {
		Thread.sleep(1000);
	    HP.dsgetstarted();
	}

	@Then("User gets alert message")
	public void user_gets_alert_message() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	   HP.alertmsg();
	   
	}

	@Given("User is on Dsportal home page")
	public void user_is_on_Dsportal_home_page() throws InterruptedException {
		/*driver=new ChromeDriver();
		HP = new HomePage(driver);*/
		Thread.sleep(1000);
	    driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("User clicks register link")
	public void user_clicks_register_link() throws InterruptedException {
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
	   HP.register();   
	}

	@Then("User will redirect to the register page")
	public void user_will_redirect_to_the_register_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.getCurrentUrl();
		System.out.println("user redirected to register page");
	}
	@Given("User is on DSportal home page")
	public void user_is_on_d_sportal_home_page() {
		/*driver=new ChromeDriver();
		HP = new HomePage(driver);*/
	    driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks login link")
	public void user_clicks_login_link() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    HP.signin();
	}

	@Then("User will redirect to the login page")
	public void user_will_redirect_to_the_login_page() {
		driver.getCurrentUrl();
		System.out.println("user redirected to login page");

	}


	
}
