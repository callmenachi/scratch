package stepDefinitions;

import cucumber.api.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TakeScreenshot;
import java.io.IOException;
import cucumber.api.java.Before;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;


public class steps_loginpage extends BaseClass
{

	@Before
	public void setup() throws IOException
	{
		//Logging
		logger=Logger.getLogger("concerto");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);
		
		//Load properties file
		configProp= new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		
		//getting the browser name from config.properties file
		String br=configProp.getProperty("browser"); 
		
		//Launching browser
		if (br.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
			
		}

		else if (br.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
			
		}
		
		else if (br.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
			
		}
	
	}
	
	
	
	@Given("User Launch the browser")
	public void user_Launch_the_browser() 
	{
		logger.info("Launching Browser");
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
		shot = new TakeScreenshot(driver);
	}

	@When("User open the URL {string}")
	public void user_open_the_URL(String url)
	{
		logger.info("Opening URL");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("User enter the name as {string}")
	public void user_enter_the_name_as(String uname)
	{
		logger.info("Enter the Username");
	    lp.setUserName(uname);
	    shot.takeScreenShot("Username");
	}

	@Then("User click the Next button")
	public void user_click_the_Next_button() 
	{
		logger.info("Click the Next Button");
	    lp.clickNext();
	}

	@Then("User enter the password  as {string}")
	public void user_enter_the_password_as(String upwd) 
	{
	   logger.info("Enter the Password");
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   lp.setPassword(upwd);
	   shot.takeScreenShot("Password");
	}

	@Then("User click the signin button")
	public void user_click_the_signin_button() 
	{
		logger.info("Click the Sign-in Button");
	    lp.clickSignin();
	    WebElement logo =driver.findElement(By.xpath("//div[contains(text(),'Collaboration')]"));
	    if(logo.isDisplayed())
	    {
	    	shot.takeScreenShot("HomePage");
	    }
	    else
	    {
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	shot.takeScreenShot("HomePage");
	    }
	    
	}

	@Then("User close the browser")
	public void user_close_the_browser() 
	{
		logger.info("closing the browser");
		driver.quit();
	}
	
	
}
