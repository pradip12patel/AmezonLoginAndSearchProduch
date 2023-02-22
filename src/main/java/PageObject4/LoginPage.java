package PageObject4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public By email=By.xpath("//input[@id='ap_email']");
	public By contin=By.xpath("//input[@id='continue']");
	public By password=By.xpath("//input[@id='ap_password']");
	public By sign=By.xpath("//input[@id='signInSubmit']");
	public By search=By.xpath("//input[@placeholder='Search Amazon.in']");
	public By button=By.xpath("//input[@id='nav-search-submit-button']");
	public By actual=By.xpath("//span[normalize-space()='Category']");
	
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}
	

	public WebElement enteremail()  {
		
		return driver.findElement(email);
	}
	
   public WebElement clickconti()  {
		
		return driver.findElement(contin);
	}
	
   public WebElement enterpass()  {
		
		return driver.findElement(password);
	}
	
   public WebElement clicksign()  {
		
		return driver.findElement(sign);
	}
   

   public WebElement clicksearch()  {
		
		return driver.findElement(search);
	}
   
   public WebElement clickbutton()  {
		
		return driver.findElement(button);
	}
   
   public WebElement actualmsg()  {
		
		return driver.findElement(actual);
	}
}
