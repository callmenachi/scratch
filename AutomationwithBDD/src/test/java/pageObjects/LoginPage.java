package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage 
{

	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	
		@FindBy(id = "identifier")
		@CacheLookup
		WebElement txtname;
		
		@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
		@CacheLookup
		WebElement btnNext;

		@FindBy(id = "password")
		@CacheLookup
		WebElement txtPassword;		

		@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
		@CacheLookup
		WebElement btnSignin;
		
		
		
		public void setUserName(String uname) 
		{
			txtname.sendKeys(uname);

		}

		public void clickNext() 
		{
			btnNext.click();
		}
		
		public void setPassword(String pwd) 
		{
			txtPassword.sendKeys(pwd);
		}

		

		public void clickSignin() 
		{
			btnSignin.click();
		}
	
}
