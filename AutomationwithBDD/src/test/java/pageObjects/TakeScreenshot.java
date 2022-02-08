package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenshot 
{
	private static  WebDriver driver;
	public TakeScreenshot(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	public void takeScreenShot(String scrname) 
	{
		  // Set folder name to store screenshots.
		  String destDir = "screenshots";
		  // Capture screenshot.
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + ".png";
		  try {
		   // Copy paste file at destination folder location
			  FileUtils.copyFile(scrFile, new File(destDir + "/" + scrname + "_" + destFile));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 }


}
