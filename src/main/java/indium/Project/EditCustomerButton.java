package indium.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditCustomerButton extends BasePage {

	@FindBy(how = How.LINK_TEXT, using = "Edit Customer")
	private WebElement Edit_customer ;
	
	public EditCustomerButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void VerifyEditButton()
	{
		elementcontrol.clickElement(Edit_customer);
	}
	
}
