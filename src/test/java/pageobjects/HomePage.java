package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static WebDriver driver;
	//public WebDriverWait wait;
	
	
	private By getstarted =By.xpath("//button[text()='Get Started']") ;
	//private By dropdown1 =By.xpath("//a[@class='nav-link dropdown-toggle']]");
	private By dropdown=By.xpath("//div[@id='navbarCollapse']/div/div");
	private By dropmenuarray=By.linkText("Arrays");
	private By dropmenuli=By.linkText("Linked List");
	private By dropmenustack=By.linkText("Stack");
	private By dropmenuqueue=By.linkText("Queue");
	private By dropmenutree=By.linkText("Tree");
	private By dropmenugraph=By.linkText("Graph");
	
	private By alertmsg=By.xpath("//div[@class='alert alert-primary']");
	private By dsgetstarted=By.xpath("//a[@class='align-self-end btn btn-lg btn-block btn-primary']");
	private By Register = By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[2]");
	private By signin = By.xpath("//div[@id='navbarCollapse']/div[2]/ul/a[3]");
	
    public HomePage(WebDriver dr) {
		System.out.println("**** Homepage Initialize ****" + dr+"*****");
		
		HomePage.driver = dr;
	}
    
	
	/*public HomePage(WebDriver driver2, WebDriverWait wait2) {
		
		this.driver=driver2;
		this.wait=wait2;
	}*/

	public void clickgetstarted() {
		driver.findElement(getstarted).click();
	}
	
	public void clickdropdown() throws InterruptedException {
		//wait.until(ExpectedConditions.presenceOfElementLocated(dropdown));
		//Thread.sleep(Duration.ofSeconds(3));
		//driver.findElement(dropdown).click();
	}
	public void clickdropmenu() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(1));	
		driver.findElement(dropdown).click();
		Thread.sleep(1000);
		driver.findElement(dropmenuarray).click();
		String arrerr= driver.findElement(alertmsg).getText();
		System.out.println(arrerr);
		Thread.sleep(1000);
		driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(dropmenuli).click();
		String lierr= driver.findElement(alertmsg).getText();
		System.out.println(lierr);
		Thread.sleep(1000);
		driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(dropmenustack).click();
		String stackerr= driver.findElement(alertmsg).getText();
		System.out.println(stackerr);

		driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(dropmenuqueue).click();
		String queueerr= driver.findElement(alertmsg).getText();
		System.out.println(queueerr);
		
		driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(dropmenutree).click();
		String treeerr= driver.findElement(alertmsg).getText();
		System.out.println(treeerr);
		
		driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(dropmenugraph).click();
		String grapherr= driver.findElement(alertmsg).getText();
		System.out.println(grapherr);


		

	}
	public void alertmsg() {
		String Msg= driver.findElement(alertmsg).getText();
		
		System.out.println(Msg);	
		
    }
	public void dsgetstarted() {
		driver.findElement(dsgetstarted).click();
		
	}
    public void register() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(Register).click();
    }
    public void signin() {
    	driver.findElement(signin).click();
    }
}