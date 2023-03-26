package Resources4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass4 {
	
	public WebDriver driver;
	public Properties prot;
	
	public void DriverInitilize() throws IOException  {
	
	FileInputStream files=new FileInputStream("C://Users//LENOVO//eclipse-workspace//Project4//data4.properties");
	
	   prot=new Properties();
	  prot.load(files);
	  
	  String key1=prot.getProperty("browser");
	  
	  if(key1.equalsIgnoreCase("chrome"))  {
		  
		  ChromeOptions op=new ChromeOptions();
	      op.addArguments("--remote-allow-origins=*"); 
    	  
    	 driver=new ChromeDriver(op); 
	  }
	  else if(key1.equalsIgnoreCase("firefox"))   {
		  
		  driver=new FirefoxDriver();
	  }
	  else {
		  
		  System.out.println("check the name");
	  }
	 
	}
	  @BeforeMethod
	  public void launchurl() throws IOException   {
		  
		  DriverInitilize();
		  
		  String key2=prot.getProperty("url");
		  
		  driver.get(key2);  
	  }
	  
	  @AfterMethod
	  public void closebrowser()   {
		  
		  driver.manage().window().maximize();
	  }
	
	}


