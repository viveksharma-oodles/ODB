package OodlesDB;

import org.testng.annotations.Test;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Projects;
import resource.Baseclass;
import resource.WaitStattementLib;


public class ProjectTest extends Baseclass {

private static Logger log = LogManager.getLogger(ProjectTest.class.getName());


WebDriver driver;
	
		@BeforeMethod
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
			pr.clickonAddproject();
			
			//Thread.sleep(60000);
			log.info("Clicked on Add project button");

//			Set handles= driver.getWindowHandles();
//			System.out.println(handles);
//			String firstwinhandles = driver.getWindowHandle();
//			driver.switchTo().window(firstwinhandles);
			
			log.info("Clicked on Add project button");
			pr.addproject();
			log.info("Project added");
			log.error("Project cannot be added");
			
		}
		
		
		public void projectoverview() throws InterruptedException
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			WaitStattementLib wait= new WaitStattementLib();
			wait.eWaitForClickable(driver, 5, pr.clickonproject());
			
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			 
			Thread.sleep(2000);
			pr.projectoverview();
			
			
		}
		
		
		public void search()
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			WaitStattementLib wait= new WaitStattementLib();
			wait.eWaitForClickable(driver, 5, pr.clickonproject());
			
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			pr.search();
			
			
		}
		
		
		public void salesdocument() throws InterruptedException
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			WaitStattementLib wait= new WaitStattementLib();
			wait.eWaitForClickable(driver, 5, pr.clickonproject());
			
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			pr.salesdocument();
		}
		
		
		public void resourcecount() throws InterruptedException
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			WaitStattementLib wait= new WaitStattementLib();
			wait.eWaitForClickable(driver, 5, pr.clickonproject());
			
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", pr.resourcecount());

			
			// Store the current window handle
			String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window

			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			    
			    
			}

			// Perform the actions on new window

			// Close the new window, if that window no more required
			driver.close();

			// Switch back to original browser (first window)
			driver.switchTo().window(winHandleBefore);


			
			
			
		}
		
		public void editproject() throws InterruptedException
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", pr.firstproject());
			log.info("Clicked on edit icon");

			pr.editproject();
			
			//pr.firstproject().sendKeys(Keys.ENTER);
			
		}
		
		
		public void statuschange()
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			WaitStattementLib wait=new WaitStattementLib();
			wait.eWaitForClickable(driver, 15, pr.clickonproject());
			
			pr.clickonproject().click();;
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			pr.statuschange();
			
		}
		@Test
		public void Pagination() throws InterruptedException
		{
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
		pr.selectpagecount("Show 25 per page");
		
		
		if( pr.count==25)
		{
			log.info("pagination working fine!!");
		}
		else
		{
			log.error("pagination not correct");
		}
		Thread.sleep(2000);
		pr.selectpagecount("Show 50 per page");
		if( pr.count==50)
		{
			log.info("pagination working fine!!");
		}
		else
		{
			log.error("pagination not correct");
		}
		Thread.sleep(2000);
		pr.selectpagecount("Show 100 per page");
		if( pr.count==100)
		{
			log.info("pagination working fine!!");
		}
		else
		{
			log.error("pagination not correct");
		}
		Thread.sleep(2000);
		pr.selectpagecount("Show 10 per page");
		if( pr.count==10)
		{
			log.info("pagination working fine!!");
		}
		else
		{
			log.error("pagination not correct");
		}
		
		}
		
		public void statusdrpdown()
		{
			
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			pr.selectstatusdrpdwn("Published");
			log.info("Clicked on published option");
			
			pr.selectstatusdrpdwn("Not Published");
			log.info("Clicked on Not published option");
			
			pr.selectstatusdrpdwn("Open");
			log.info("Clicked on open option");
			
			pr.selectstatusdrpdwn("Closed");
			log.info("Clicked on closed option");
			
			pr.selectstatusdrpdwn("All");
			log.info("Clicked on All option");

			
		}
		
		
		public void codereview() throws InterruptedException {
			
			Landingpage lp=new Landingpage(driver);
			lp.login();
			log.info("Login successful");
			
			
			Projects pr=new Projects(driver);
			
			//Thread.sleep(15000);
			pr.clickonproject().click();
			log.info("Clicked on project");
			pr.clickonviewproject().click();
			log.info("Clicked on view project");
			
			pr.codereview();
			
			
		}
		@AfterMethod
		public void screenShot(ITestResult result) {
			// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
			// condition
			if (ITestResult.FAILURE == result.getStatus()) {
				try {
					// To create reference of TakesScreenshot
					TakesScreenshot screenshot = (TakesScreenshot) driver;
					// Call method to capture screenshot
					File src = screenshot.getScreenshotAs(OutputType.FILE);
					// Copy files to specific location
					// result.getName() will return name of test case so that screenshot name will
					// be same as test case name
					FileUtils.copyFile(src, new File("/home/vivek/Shotfolder/" + result.getName() + ".png"));
					System.out.println("Successfully captured a screenshot");
				} catch (Exception e) {
					System.out.println("Exception while taking screenshot " + e.getMessage());
				}
			}
			driver.close();

		}

	}