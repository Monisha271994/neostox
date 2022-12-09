package NeoStoxPOM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStaxPasswordPage {
	
	@FindBy(xpath="//input[@id='txt_accesspin']")private WebElement passwordInputField;
	@FindBy(xpath="//a[@id='lnk_submitaccesspin']") private WebElement ClickOnSubmitButton;
	
	public NeoStaxPasswordPage(WebDriver driver) {
		PageFactory.initElements( driver , this);
		}
	
	public void enterPassword(WebDriver  driver , String password) {
		passwordInputField.sendKeys(password);
		Reporter.log("enter the password", true);
	}
	
	public void ClickOnSubmit(WebDriver driver ) {
		ClickOnSubmitButton.click();
		Reporter.log("click on submit button", true);
		
	}

}
