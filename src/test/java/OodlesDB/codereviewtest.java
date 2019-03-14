package OodlesDB;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.ChatPage;
import pageobjects.Clientpage;
import pageobjects.Landingpage;
import pageobjects.codereview;
import resource.Baseclass;

public class codereviewtest extends Baseclass

{
	private static Logger log = LogManager.getLogger(Salestest.class.getName());

	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException  
	
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	
	public void Addschedule() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
		log.info("Login successful");

		codereview cr = new codereview(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cr.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cr.codereview1());

		log.info("Clicked on code review");
		cr.Addschedule();
		
	}
	
	
	public void postpone()
	
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
		log.info("Login successful");

		codereview cr = new codereview(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cr.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cr.codereview1());

		log.info("Clicked on code review");
		
		cr.postpone();
	}
	
	
	public void scheduled()
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
		log.info("Login successful");

		codereview cr = new codereview(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cr.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cr.codereview1());

		log.info("Clicked on code review");
		cr.scheduled();
	}
	
	@Test
	public void delete()
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
		log.info("Login successful");

		codereview cr = new codereview(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cr.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cr.codereview1());

		log.info("Clicked on code review");
		
		cr.delete();
	}
}
