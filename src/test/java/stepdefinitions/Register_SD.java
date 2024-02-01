package stepdefinitions;

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
	}

	@When("user clicks register button1")
	public void user_clicks_register_button1() {
	    
	}

	@Then("user will redirect to dsportal home page")
	public void user_will_redirect_to_dsportal_home_page() {
	    
	}

	@Given("User have entered invald {string} and {string} and {string}")
	public void user_have_entered_invald_and_and(String string, String string2, String string3) {
	    
	}

	@When("User clicks register button")
	public void user_clicks_register_button() {
	    
	}

	@Then("user will get the error message")
	public void user_will_get_the_error_message() {
	    
	}



}
