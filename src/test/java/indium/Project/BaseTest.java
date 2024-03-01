package indium.Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import commonLibs.CommonDriver;
import commonLibs.ConfigUtils;

public class BaseTest {
	 private static final String String = null;
	  CommonDriver cmnDriver;
	  String url;
	  WebDriver driver;
	  LoginPage loginpage;
	  NewCustomerButton new_customers;
	  EditCustomerButton edit_customer;
	
	  String currentWorkingDirectory;
	  String configFilePath;
	  Properties configProperty;
	  String browserType;
	  
	  
	  @BeforeSuite
	  public void preSetup() throws IOException
	  {
		currentWorkingDirectory=System.getProperty("user.dir");
		configFilePath=currentWorkingDirectory+"\\config\\config.properties";
		configProperty=ConfigUtils.readProperties(configFilePath);

	  }
	  
	  @BeforeClass
	  public void setup() throws Exception {
		  url=configProperty.getProperty("baseUrl");
		  browserType=configProperty.getProperty("browserType");
		  cmnDriver=new CommonDriver(browserType);
		  driver=cmnDriver.getDriver();
		  loginpage=new LoginPage(driver);
		  new_customers=new NewCustomerButton(driver) ;
		  cmnDriver.navigateToUrl(url);
	  }
		

		 
	  
		
		  @AfterClass public void closeDown() throws InterruptedException
		  { cmnDriver.closeAllBrowser();
		  Thread.sleep(5000);
		  }
		 
		  @AfterMethod 
		  public void takeScreenShot(ITestResult result)
		  {
			  
		  }
		 

}
