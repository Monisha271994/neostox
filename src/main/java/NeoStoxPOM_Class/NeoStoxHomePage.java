package NeoStoxPOM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage {
	@FindBy(xpath="//span[@id='lbl_usernamemob']") private WebElement UserName;
	@FindBy(xpath="//span[@id='lbl_curbalancetop']") private WebElement balance;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	public NeoStoxHomePage(WebDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	
	public String getUserId() {
		String actualUserId = UserName.getText();
		Reporter.log("Getting actual user name", true);
		return actualUserId;
	}
	public String checkBalance() {
		String actualBalance = balance.getText();
		Reporter.log(" getting actual balance", true);
		return actualBalance;
	}
	
	public void LogOutFromApplication(WebDriver driver) throws InterruptedException {
		UserName.click();
		Thread.sleep(1000);
		logOutButton.click();
		Reporter.log(" log out from NeoStox", true);
	}
	

}
