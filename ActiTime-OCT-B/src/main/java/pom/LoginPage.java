package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//input[@name='username']") 
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password ;
	
	@FindBy (xpath = "//a[@id='loginButton']") 
	private WebElement login ;
	
	@FindBy (xpath = "//a[@id='loginButton']") 
	private WebElement keepMeLoginCheckbox ;
	
	public LoginPage(WebDriver driver2)  // driver = driver = new ChromeDriver()
	{
		PageFactory.initElements(driver2, this);
	}
	
	public void sendUserName(String userID) {
		
		userName.sendKeys(userID);
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public String getTextofLoginButton() {
		String text = login.getText();
		return text;
	}
	
	public String getStatusofLoginButton() {
		String text = login.getText();
		return text;
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void loginToApplication(String userID, String pass) {
		userName.sendKeys(userID);
		password.sendKeys(pass);
		keepMeLoginCheckbox.click();
		login.click();
	}
}
