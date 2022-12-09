package NeoStoxPOM_Class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxLoginPage  {
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobilenumField;
	@FindBy(xpath="//a[@id='lnk_signup1']") private WebElement SignUpButton;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
	 PageFactory.initElements( driver , this);	
	}
	
	public void EnterMobileNo(WebDriver driver , String mobNum) throws InterruptedException {
		Thread.sleep(1000);
		mobilenumField.sendKeys(mobNum);
		Reporter.log("enter the mobile no.", true);
	}
	
	public void ClickOnSignUp(WebDriver driver) {
		SignUpButton.click();
		Reporter.log("click on sign Up button", true);
	}
}
