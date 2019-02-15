package OodlesDB;

import org.testng.annotations.Test;
import java.awt.Robot;
import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Projects;
import resource.Baseclass;

@Test
public class ProjectTest extends Baseclass 
{
	
public static Logger log= LogManager.getLogger(ProjectTest.class.getName());

WebDriver driver;
	
		@BeforeTest
		public void initialize() throws IOException  
		
		{
		driver = initializedriver();
		log.info("driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");
		
		}
		public void verifyaddproject() throws Exception
		
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			
			
			Projects pr=new Projects(driver);
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			pr.clickonAddproject().click();
			
//			Set handles= driver.getWindowHandles();
//			System.out.println(handles);
//			String firstwinhandles = driver.getWindowHandle();
//			driver.switchTo().window(firstwinhandles);
			
			log.info("Clicked on Add project button");
			pr.addproject();
			log.info("Project added");
			log.error("Project cannot be added");
			
		}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		
		}
	
}
