package indium.Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewCustomerButton extends BasePage {
	  
	@FindBy(how = How.LINK_TEXT, using ="New Customer")
	private WebElement new_customer;
	
	//@FindBy(how = How.XPATH, using = "// a[contains(text(), 'New Customer' )]")
	//private WebElement new_customer;
	
	
	
	public NewCustomerButton(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void VerifyNewCustomerButton() throws InterruptedException
	{
	
		
		
		elementcontrol.clickElement(new_customer);
		
		
		
	}	
}
	
