package stepDefinitions;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.TakeScreenshot;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public HomePage hp;
	public static Logger logger;
	public Properties configProp;
	TakeScreenshot shot;
	
}
