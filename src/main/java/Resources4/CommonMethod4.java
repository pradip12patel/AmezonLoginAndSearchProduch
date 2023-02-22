package Resources4;

import org.testng.asserts.SoftAssert;

public class CommonMethod4 {

	public static void assertion(String actual,String expected,String message)  {
		
		SoftAssert sa=new SoftAssert();
		
		String ac=actual;
		String ep=expected;
		
		
		sa.assertEquals(ac, ep, message);
		
		sa.assertAll();
		
	}

}
