package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Registerpage;

public class Register_SD {

	public WebDriver driver;
	
	public Registerpage RP;
	
	@Given("User entered Valid username and password")
	public void user_entered_valid_username_and_password() {
	    driver=new ChromeDriver();
	    RP =new Registerpage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    RP.enteruname("Testuser");
	    RP.enterpwd("Testuser");
	    RP.entercpwd("Testuser");
	}

	@When("user clicks register button1")
	public void user_clicks_register_button1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    RP.clickregister();
	}

	@Then("user will redirect to dsportal home page")
	public void user_will_redirect_to_dsportal_home_page() {
	    driver.getCurrentUrl();
	}

	@Given("User have entered invald {string} and {string} and {string}")
	public void user_have_entered_invald_and_and(String username, String password, String confirmpwd) {
	    driver=new ChromeDriver();
		RP =new Registerpage(driver);
	    driver.get("https://dsportalapp.herokuapp.com/register");
	    
	    RP.enteruname(username);
	    RP.enterpwd(password);
	    RP.entercpwd(confirmpwd);
	}

	@When("User clicks register button")
	public void user_clicks_register_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    RP.clickregister();
	}

	@Then("user will get the error message")
	public void user_will_get_the_error_message() {
	  
	}



}
