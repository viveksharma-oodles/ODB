package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public Properties prop;
	public static WebDriver driver;    //driver can be accessible outside class
	
	public WebDriver initializedriver() throws IOException
	{

	prop=new Properties();
	FileInputStream fis= new FileInputStream("/home/vivek/eclipse-workspace/OodlesDB/src/main/java/resource/data.properties");
     
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	
	if (browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","/home/vivek/Downloads/chromedriver");	
		
         driver = new ChromeDriver();
		
	}
	else if (browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver","/home/vivek/Downloads/geckodriver");
		driver = new FirefoxDriver();
	}
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
				
	
	
	return driver;
	}
	
	
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    //driver must implement the TakesScreenshot interface  so as to use getscreenshot method 
				                                                                //.thus Convert web driver object to TakeScreenshot
		
			FileUtils.copyDirectory(src, new File("/home/vivek/Shotfolder/"+result+"screenshot.png"));
	
		
		
		
	}
}