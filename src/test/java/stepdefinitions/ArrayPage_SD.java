package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Arraypage;
import pageobjects.Registerpage;
import utilities.baseclass;

public class ArrayPage_SD extends baseclass{

	//public WebDriver driver;
	
		
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.get("https://dsportalapp.herokuapp.com/login");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
		 Ap.enterusername("Dsalgo@146");
		    Ap.enterpwd("Gpss@146");
		    	   
		
	}

	@When("clicks login button")
	public void clicks_login_button() throws InterruptedException {
		//Thread.sleep(1000);
		Ap.clicklbtn();
	}

	@Then("user should redirect to dsalgo home page")
	public void user_should_redirect_to_dsalgo_home_page() {
	  String url= driver.getCurrentUrl();
	   System.out.println(url);
	}

	

	@Given("user is on home Page")
	public void user_is_on_home_page() {
	    //driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks Get started button")
	public void user_clicks_get_started_button() throws InterruptedException {
	   Thread.sleep(1000);
	   Ap.clickarrgetstarted();
	}

	@Then("user redirects to array page")
	public void user_redirects_to_array_page() throws InterruptedException {
		Thread.sleep(1000);
	    System.out.println(driver.getCurrentUrl());
	}

	@When("user clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickarrinpython();
	}

	@Then("user should be redirected to Arrays in python page")
	public void user_should_be_redirected_to_arrays_in_python_page() {
	   driver.getCurrentUrl();
	   System.out.println(driver.getCurrentUrl());

	  }

	@When("user clicks Try here button")
	public void user_clicks_try_here_button() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickTryhere();
	}

	@Then("user should be navigated to next page")
	public void user_should_be_navigated_to_next_page() {
	    
	}

	
	@When("user enters correct python code in the Text editor with {string}")
	public void user_enters_correct_python_code_in_the_text_editor_with(String string) throws InterruptedException {
		Thread.sleep(1000);
		Ap.sendtexteditor(string);

	}


	@When("clicks Run button")
	public void clicks_run_button() throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clickrunbtn();
	}

	@Then("Result should be displayed in console")
	public void result_should_be_displayed_in_console() {
	      Ap.console();    
	       
	       
	}
	@When("user enters incorrect python code in the Text editor with {string}")
	public void user_enters_incorrect_python_code_in_the_text_editor_with(String string) throws InterruptedException {
		Thread.sleep(1000);
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
		Ap.sendtexteditor(string);
	}
	@Then("Error alert should be displayed in console")
	public void error_alert_should_be_displayed_in_console() {
		Ap.captureErrorMsg();
		
	}


	@When("user clicks on Get started button under Array section")
	public void user_clicks_on_get_started_button_under_array_section() throws InterruptedException {
		Thread.sleep(1000);
		   Ap.clickarrgetstarted();
	}

	@When("User Clicks on Array Using List link")
	public void user_clicks_on_array_using_list_link() throws InterruptedException {
	    Thread.sleep(1000);
		Ap.clickarrayusinglist();
	}

	@Then("User Should be redirected to Array Using List page")
	public void user_should_be_redirected_to_array_using_list_page() {
		driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
    
	}

	@When("User Clicks on Basic Operations in List link")
	public void user_clicks_on_basic_operations_in_list_link() {
	   Ap.clickbasicOpinlist();
	}

	@Then("User Should be redirected to Basic Operations in List page")
	public void user_should_be_redirected_to_basic_operations_in_list_page() {
		driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());
	}

	@When("User Clicks on Applications Of Array link")
	public void user_clicks_on_applications_of_array_link() {
	    
		Ap.clickappofarrays();
	}

	@Then("User Should be redirected to Applications Of Array page")
	public void user_should_be_redirected_to_applications_of_array_page() {
		driver.getCurrentUrl();
		   System.out.println(driver.getCurrentUrl());

	}
	
	@Given("User is on {string} Page")
	public void user_is_on_page(String string) {
		
	    driver.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	}

	@When("User clicks Practice Questions Link")
	public void user_clicks_practice_questions_link() {
	    
	Ap.clickpracticeques();
	}

	@Then("User Should be redirected to Questions Page")
	public void user_should_be_redirected_to_question_page() {
	
		
	}

	@When("User clicks {string} Link")
	public void user_clicks_link(String string) throws InterruptedException {
		Thread.sleep(1000);
	    Ap.clicksearcharrques();
		
	}

	@Then("user redirected to the corresponding question page")
	public void user_redirected_to_the_corresponding_link() {
	    
	}

	@When("User enters the below Python code in the Text Editor")
	public void user_enters_the_below_python_code_in_the_text_editor(DataTable dataTable) throws InterruptedException {
	   
		 List<List<String>> listdata = dataTable.asLists(String.class);
		 By texteditor=By.xpath("//div[@class='input']/div/div/textarea");
		 Actions action=new Actions(driver);
		 
		 driver.findElement(texteditor).sendKeys(Keys.CONTROL,"a");
		 driver.findElement(texteditor).sendKeys(Keys.DELETE);
		 Thread.sleep(1000);		 
		 driver.findElement(texteditor).sendKeys(listdata.get(0).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(1).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(2).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(3).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(4).get(0));
		 //driver.findElement(texteditor).sendKeys(Keys.BACK_SPACE);
		 //driver.findElement(texteditor).sendKeys(Keys.BACK_SPACE);
		 action.sendKeys(Keys.BACK_SPACE).build().perform();
		 action.sendKeys(Keys.BACK_SPACE).build().perform();
		 
		 driver.findElement(texteditor).sendKeys(listdata.get(5).get(0));
		 driver.findElement(texteditor).sendKeys(Keys.ARROW_LEFT);
		 driver.findElement(texteditor).sendKeys(Keys.ARROW_LEFT);
		 driver.findElement(texteditor).sendKeys(Keys.ARROW_LEFT);
		 driver.findElement(texteditor).sendKeys(Keys.ARROW_LEFT);
		 /*action.sendKeys(Keys.ARROW_LEFT).build().perform();
		 action.sendKeys(Keys.ARROW_LEFT).build().perform();
		 action.sendKeys(Keys.ARROW_LEFT).build().perform();
		 action.sendKeys(Keys.ARROW_LEFT).build().perform();*/
		 driver.findElement(texteditor).sendKeys(listdata.get(6).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(7).get(0));
		 driver.findElement(texteditor).sendKeys(listdata.get(8).get(0));
		
	}

	@When("User Clicks the run button")
	public void user_clicks_the_run_button() throws InterruptedException {
	   Ap.clickrunbtn();
		
	}

	@Then("Result Should be displayed in the console")
	public void result_should_be_displayed_in_the_console() throws InterruptedException {
	    Thread.sleep(1000);
		Ap.console();
	}

	@When("User is on Practice questions Page")
	public void user_is_on_practice_questions_page() {
	String url= "https://dsportalapp.herokuapp.com/array/practice";
	    driver.get(url);
	}

	@When("User clicks Max Consecutive Ones link")
	public void user_clicks_max_consecutive_ones_link() throws InterruptedException {
	    Ap.clickmaxconsecones();
	    
	}

	@Then("User should be redirected to the corresponding question page")
	public void user_should_be_redirected_to_the_corresponding_question_page() {
	    
	}

	@When("user enters python code in the Text editor")
	public void user_enters_python_code_in_the_text_editor() {
	   Ap.sendpythoncode();
	    
	}

	@When("Clicks run button")
	public void clicks_run_button1() throws InterruptedException {
	    Ap.clickrunbtn();
	}

	@When("User clicks {string} link")
	public void user_clicks_link1(String string) throws InterruptedException {
	    Ap.clickfindnowithevendigits();
	}
	
	@When("User clicks Squares of a Sorted Array link")
	public void user_clicks_squares_of_a_sorted_array_link() throws InterruptedException {
		 Ap.clicksquaresofsortarray();
		 
	 }




}
