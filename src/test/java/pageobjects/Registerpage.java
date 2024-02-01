package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Registerpage {
	
      public WebDriver driver;

       private By Username =By.id("id_username");
       private By passwd =By.id("id_password1");
       private By cfmpwd=By.id("id_password2");
       private By register=By.xpath("//input[@value='Register']");

       public Registerpage(WebDriver d) {
	   this.driver=d;
	
         }
	
	  //methods
       
       public void enteruname(String Uname)
       {
    	  WebElement luname=driver.findElement(Username);
    	  luname.clear();
    	  luname.sendKeys(Uname);
       }
       
       public void enterpwd(String pwd)
       {
    	   WebElement lpwd=driver.findElement(passwd);
    	   lpwd.clear();
    	   lpwd.sendKeys(pwd);
       }
       public void entercpwd(String cpwd)
       {
    	  WebElement lcpwd =driver.findElement(cfmpwd);
    	  lcpwd.clear();
    	  lcpwd.sendKeys(cpwd);
       }
 
       public void clickregister()
       {
    	   driver.findElement(register).click();
       }
}
