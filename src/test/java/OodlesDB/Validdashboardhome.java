package OodlesDB;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.DashboardPage;
import pageobjects.Landingpage;
import pageobjects.Projects;
import resource.Baseclass;

public class Validdashboardhome extends Baseclass{
	
	public static Logger log= LogManager.getLogger(ProjectTest.class.getName());


	@BeforeTest
	public void initialize() throws IOException  
	
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	
	@Test
	public void dashboardnavigate() throws InterruptedException
	{
		Landingpage lp= new Landingpage(driver);
		
		lp.login();
//		lp.getEmail().sendKeys("rijul.jain@oodlestechnologies.com");
//        lp.getpassword().sendKeys("manish@159");
//        Thread.sleep(3000);
//        lp.getlogin().click();
        
//		Commonelements dp= new Commonelements(driver);
//        Thread.sleep(1000);
//     
 DashboardPage dp=new DashboardPage(driver);
      dp.blog().click();
      log.info("clicked on blog");
        dp.people().click();
        log.info("clicked on people");
        dp.resourcing().click();
        log.info("clicked on resourcing");
        
        
	}
	//@Test
	public void addproject()
	{
		Landingpage lp= new Landingpage(driver);
        lp.login();
		
		Projects pr=new Projects(driver);
        
        pr.clickonAddproject();
        pr.Projectname().sendKeys("SOTY");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
}
