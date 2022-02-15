package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;
import utils.Utility;

public class VerifyHeadersOFApplication extends Browser {
	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LoginPage loginPage ;
	private SoftAssert softAssert ;
	private int testID ;
	
	@BeforeTest
	@Parameters("browser") 
	public void launchBrowser(String browser) {
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome")){
			driver = launchChromeBrowser();
		}
		if(browser.equalsIgnoreCase("Firefox")){
			driver = launchFirefoxBrowser();
		}
		if(browser.equalsIgnoreCase("Opera")){
			driver = launchOperaBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createPOMObject() {
		loginPage  = new LoginPage(driver);
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() {
		System.out.println("loginToApplication");
		driver.get("http://desktop-b2220qc/login.jsp");
		
		String key = Utility.getDataFromExcel("Sheet1",1,0);
		if( key.equals("PositiveTest"))
		{
			loginPage.sendUserName("Admin");
			loginPage.sendPassword("manager");
		}
		
		if( key.equals("NegativeTest"))
		{
			loginPage.sendUserName("Awrdgfgdmin");
			loginPage.sendPassword("mangggfgager");
		}
		
		String useName = Utility.getDataFromExcel("Sheet1",1,0);
		loginPage.sendUserName(useName);
		
		String password = Utility.getDataFromExcel("Sheet1",1,1);
		loginPage.sendPassword(password);
		
		loginPage.clickOnLogin();	
	}
	
	@Test
	public void toVerifyTaskButton() {
		testID = 101;
		softAssert = new SoftAssert();
		System.out.println("To Verify Task tab/button");
		applicationHeader.openTaskPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		softAssert.assertEquals(url, "http://desktop-b2220qc/tasks/otasklist.do", "url of task is not found");
		softAssert.assertEquals(title, "actiTIME - Open Tasks");
		softAssert.assertAll();
	}
	
	@Test
	public void verifyUserTab() {
		testID = 102;
		softAssert = new SoftAssert();
		System.out.println("To Verify User Tab/Button\r\n" );
		applicationHeader.openUserPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		softAssert.assertEquals(url, "http://desktop-b2220qc/UserList", "url of task is not found");
		softAssert.assertEquals(title, "actiTIME - User List");
		softAssert.assertAll();
		
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) {	
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScrrenshot(driver, testID);
		}
		System.out.println("logout");
		applicationHeader.clickOnLogOut();
	}
	
	@AfterClass
	public void clearPOMObject() {
		loginPage = null;
		applicationHeader = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.quit();
		driver = null ;
		System.gc(); // to delete the object 
	}
	
	https://www.facebook.com/
		https://www.H-facebook.com/
			https://www.L-facebook.com/
		https://www.sit-facebook.com/
			https://www.dit-facebook.com/
				https://www.QA-facebook.com/
					
						https://SG-www.facebook.com/
							https://www.facebook.com/
					

}
