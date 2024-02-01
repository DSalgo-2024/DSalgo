package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	private By getstarted =By.xpath("//button[text()='Get Started']") ;
	private By dropdown =By.xpath("//div[@class='nav-item dropdown']");
	private By dropmenu=By.linkText("Linked List");
	private By alertmsg=By.xpath("//div[@class='alert alert-primary']");
	private By dsgetstarted=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	private By Register = By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[2]");
	private By signin = By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[3]");
	
    public HomePage(WebDriver dr) {
		
		this.driver = dr;
	}
	
	public void clickgetstarted() {
		driver.findElement(getstarted).click();
	}
	
	public void clickdropdown() {
		driver.findElement(dropdown).click();
	}
	public void clickdropmenu() {
	
		driver.findElement(dropmenu).click();

	}
	public void alertmsg() {
		String Msg= driver.findElement(alertmsg).getText();
		
		System.out.println(Msg);	
		
    }
	public void dsgetstarted() {
		driver.findElement(dsgetstarted).click();
	}
    public void register() {
    	driver.findElement(Register).click();
    }
    public void signin() {
    	driver.findElement(signin).click();
    }
}