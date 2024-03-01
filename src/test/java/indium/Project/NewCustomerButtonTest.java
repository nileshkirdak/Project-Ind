package indium.Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewCustomerButtonTest extends BaseTest {
	
	@Parameters ({"userId","userPassword"})
  @Test
  public void VerifyUserIsAbleToClickNewCustomerButton(String username, String password) throws InterruptedException  {
	  

		
		
	  loginpage.loginToApplication(username, password);
	 
	  
	  new_customers.VerifyNewCustomerButton();
	 
	  Thread.sleep(5000);
	  
	  String expectedTitle="Guru99 Bank New Customer Entry Page";
      String actualTitle=cmnDriver.getTitleofWebPage();
      
      String newCustomerPageTitle=cmnDriver.getTitleofWebPage();
       System.out.println(newCustomerPageTitle);
       
      Assert.assertEquals(actualTitle, expectedTitle);
  }
}
