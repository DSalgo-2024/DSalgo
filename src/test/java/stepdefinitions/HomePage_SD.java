package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class HomePage_SD {
	
	public WebDriver driver;
	
	public static HomePage HP ;
	
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		driver=new ChromeDriver();
		HP = new HomePage(driver);
		
			    
	}

	@Given("enters Dsalgo portal Url")
	public void enters_dsalgo_portal_url() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
		driver=new ChromeDriver();
		HP = new HomePage(driver);


	}

	@When("User Clicks data structures Drop down")
	public void user_clicks_data_structures_drop_down() {
	    HP.clickdropdown();
	}

	@When("clicks any of the listed six options")
	public void clicks_any_of_the_listed_six_options() {
	    HP.clickdropmenu();	}

	@Then("User gets error message {string}")
	public void user_gets_error_message(String string) {
	   HP.alertmsg();
	}

	@Given("User is on dsportal Home Page")
	public void user_is_on_dsportal_home_page() {
		driver=new ChromeDriver();
		HP = new HomePage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("User clicks Get Started button in data structure Topics")
	public void user_clicks_get_started_button_in_data_structure_topics() {
	    HP.dsgetstarted();
	}

	@Then("User gets alert message")
	public void user_gets_alert_message() {
	   HP.alertmsg();
	}

	@Given("User is on Dsportal home page")
	public void user_is_on_Dsportal_home_page() {
		driver=new ChromeDriver();
		HP = new HomePage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/home");

	}

	@When("User clicks register link")
	public void user_clicks_register_link() {
	HP.register();   
	}

	@Then("User will redirect to the register page")
	public void user_will_redirect_to_the_register_page() {
	    
	}
	@Given("User is on DSportal home page")
	public void user_is_on_d_sportal_home_page() {
		driver=new ChromeDriver();
		HP = new HomePage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks login link")
	public void user_clicks_login_link() {
	    HP.signin();
	}

	@Then("User will redirect to the login page")
	public void user_will_redirect_to_the_login_page() {
	    
	}


	
}
