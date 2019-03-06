package OodlesDB;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Clientpage;
import pageobjects.Landingpage;
import pageobjects.Projects;
import resource.Baseclass;

public class clienttest extends Baseclass{

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
	@Test
	public void Addclient() {

		Landingpage lp=new Landingpage(driver);
		lp.login();
		log.info("Login successful");
		
		
		Clientpage cp=new Clientpage(driver);
		
		//Thread.sleep(15000);
		cp.clickonproject().click();
		log.info("Clicked on project");
		cp.viewaccount().click();
		log.info("Clicked on view account");
		
		cp.Addclient();
	}
}
