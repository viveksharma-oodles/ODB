package OodlesDB;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Clientpage;
import pageobjects.Landingpage;
import resource.Baseclass;

public class clienttest extends Baseclass {

	private static Logger log = LogManager.getLogger(Salestest.class.getName());

	WebDriver driver;

	@BeforeMethod
	public void initialize() throws IOException

	{
		driver = initializedriver();
		log.info("driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");

	}

	public void Addclient() {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);

		// Thread.sleep(15000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", cp.clickonproject());
		// cp.clickonproject().click();
		log.info("Clicked on project");

		// cp.viewaccount().click();

		executor.executeScript("arguments[0].click()", cp.viewaccount());
		log.info("Clicked on view account");

		cp.Addclient();
	}

	public void editclient() {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);

		// Thread.sleep(15000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");

		executor.executeScript("arguments[0].click()", cp.viewaccount());
		// cp.viewaccount().click();
		log.info("Clicked on view account");

		cp.editclient();
	}

	public void deleteclient() {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		cp.viewaccount().click();
		log.info("Clicked on view account");

		cp.deleteclient();
	}

	public void statuschange() {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		cp.viewaccount().click();
		log.info("Clicked on view account");

		cp.statuschange();

	}

	public void statuschange1() {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");

		cp.statuschange1();

	}

	
	public void perpage() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");

		cp.perpage("Show 25 per page");

		Thread.sleep(2000);
		cp.perpage("Show 50 per page");

		Thread.sleep(2000);
		cp.perpage("Show 100 per page");

		Thread.sleep(2000);
		cp.perpage("Show 10 per page");

	}
	
	
	public void statusfilter() throws InterruptedException
	{
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");
		
		cp.statusfilter("Active");
		
		Thread.sleep(2000);

		
		cp.statusfilter("In-Active");
	}
	
	
	public void publishfilter() throws InterruptedException
	{
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");
		
		cp.publishfilter("Published");
		Thread.sleep(2000);

		cp.publishfilter("Unpublished");
		Thread.sleep(2000);

		cp.publishfilter("Deleted");
		Thread.sleep(2000);

		cp.publishfilter("All");

	}
	
	@Test
	public void pagination() throws InterruptedException
	{
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");
		Thread.sleep(3000);

		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(2000);
		
		cp.pagination();
	}
	
	
	public void searchfilter()
	{
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Clientpage cp = new Clientpage(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", cp.clickonproject());

		log.info("Clicked on project");
		executor.executeScript("arguments[0].click()", cp.viewaccount());

		log.info("Clicked on view account");
		
		cp.searchfield();
	}
}
