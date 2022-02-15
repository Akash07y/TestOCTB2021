package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {
	
	@FindBy (xpath = "sdfgh") 
	private  WebElement timeTrack;

//	@FindBy (xpath = "//a[@class='content tasks']")
	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy (xpath = "//a[@class='content reports']") 
	private WebElement report;
	
	@FindBy (xpath = "//a[@class='content users']") 
	private WebElement user;
	
	@FindBy (xpath = "//a[text()='Logout']") 
	private WebElement logout;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;
	
	public ApplicationHeader(WebDriver driver) // driver1 = driver
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions(driver);
		//wait = new WebDriverWait(driver, 20);
	}
	
	public void openTimeTrackPage() {
		
		actions.moveToElement(timeTrack).click().build().perform();
		
	}
	
	public void openReportPage() {
		
		actions.moveToElement(report).click().build().perform();
	}
	
	public void openTaskPage() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(task));
		task.click();
	}
	
	public void openUserPage() {
		user.click();
	}
	
	public void clickOnLogOut() {
		logout.click();
	}
	
}
