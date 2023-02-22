package TestCaseAmezon;

import org.testng.annotations.Test;

import PageObject4.LoginPage;
import Resources4.BaseClass4;
import Resources4.CommonMethod4;
import Resources4.Constants;

public class Verify4 extends BaseClass4{
	
	@Test
	public void verify()  {
		
		LoginPage obj=new LoginPage(driver);
		
		obj.enteremail().sendKeys(Constants.eamil);
		obj.clickconti().click();
		obj.enterpass().sendKeys(Constants.password);
		obj.clicksign().click();
		obj.clicksearch().sendKeys(Constants.value);
		obj.clickbutton().click();
		
		CommonMethod4.assertion(obj.actualmsg().getText(),"Category", "search product scenario is faild");
	}

}
