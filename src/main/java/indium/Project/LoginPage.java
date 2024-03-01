package indium.Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BasePage{


	@FindBy(name="uid")
	private WebElement userId;
	
	@FindBy(name="password")
	private WebElement userPassword;
	
	
	  @FindBy(name="btnLogin")
	  private WebElement loginButton;
	  
		
	 
	  
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String username, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		elementcontrol.sendText(userId, username);
		elementcontrol.sendText(userPassword, password);
		elementcontrol.clickElement(loginButton);
		Thread.sleep(5000);
		
		
	}
}
