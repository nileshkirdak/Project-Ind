package indium.Project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class LoginTest extends BaseTest {
 
	
	 
		//SoftAssert softAssert = new SoftAssert();
		
		@Parameters({"userId","userPassword"})

		
		@Test
	  public void verifyUserLoginWithCredentials(String username, String password) throws InterruptedException 
		{
			 loginpage.loginToApplication(username, password);
			 
			 Thread.sleep(5000);
			 String expectedTitle="Guru99 Bank Manager HomePage";
	         String actualTitle=cmnDriver.getTitleofWebPage();
			  
			  Assert.assertEquals(actualTitle, expectedTitle);
			 // softAssert.assertEquals(false, false);
		}
		
		
	  
}

