package OodlesDB;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import resource.Baseclass;

public class validatetitle extends Baseclass{

	public static Logger log= LogManager.getLogger(ProjectTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException  
	
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	
	@Test
	public void navigation1() throws IOException, InterruptedException
	{
		
		
		Landingpage lp= new Landingpage(driver);
		
		    if (lp.getlogo1().isDisplayed())
		    {
		    	log.info("logo validated on login page");
		    }
		    else
		    {
		    
		    	log.error("logo is not present");
		    }
		    
		    
		    
		}
	
	@Test
	public void navigation2()
	{
	Landingpage lp= new Landingpage(driver);
	lp.login();
	log.info("login to homepage sucessfull");
	
    if (lp.getlogo2().isDisplayed())
    {
    	log.info("home page logo validated on home page");
    }
    else
    {
    
    	log.error("home page logo is not present");
    } 
    
	}	
		//AssertJUnit.assertEquals(lp.getlogo1().getText(),"Oodles technologies");
		

		
//         lp.login();
//		AssertJUnit.assertEquals(lp.getlogo2().getText(),"Oodles technologies");
//		log.info("logo validated on homepage");
//		log.error("logo not present");

	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
	
}
