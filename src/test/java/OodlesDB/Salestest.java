package OodlesDB;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.Landingpage;
import pageobjects.Saleslead;
import resource.Baseclass;
import resource.Excelutilities;
import resource.WaitStattementLib;

public class Salestest extends Baseclass  {

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
	
	@Test(enabled=false)
	public void verifymonthlyleadsbyyear() throws IOException, InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Thread.sleep(2000);
		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.selectyear("2017");

		if (Sl.monthlygraph.isDisplayed()) {
			log.info("monthly graph is displayed for 2017");
		} else {
			log.error("monthly graph not displayed for 2017");
		}

		Sl.selectyear("2018");

		if (Sl.monthlygraph.isDisplayed()) {
			log.info("monthly graph is displayed for 2018");
		} else {
			log.error("monthly graph not displayed for 2018");
		}

		Sl.selectyear("2019");

		if (Sl.monthlygraph.isDisplayed()) {
			log.info("monthly graph is displayed for 2019");
		} else {
			log.error("monthly graph not displayed for 2019");
		}

	}
	
	@Test(enabled=false)
	public void verifymonthlyleadbysource() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.selectsource("PPH");
		Thread.sleep(2000);
		Sl.selectsource("Direct");
		Thread.sleep(2000);
		Sl.selectsource("Upwork");
		Thread.sleep(2000);
		Sl.selectsource("Others");
		Thread.sleep(2000);
		Sl.selectsource("Intercom");
		Thread.sleep(2000);
		Sl.selectsource("Oodles Studio");
		Thread.sleep(2000);
		Sl.selectsource("Oodles Marketing");
		Thread.sleep(2000);
		Sl.selectsource("Oodles-BlockChain");
		Thread.sleep(2000);
		Sl.selectsource("Oodles-ERP Solution");
		Thread.sleep(2000);
		Sl.selectsource("Oodles-AI");
		Thread.sleep(2000);
		Sl.selectsource("Linkedin");
		Thread.sleep(2000);
		Sl.selectsource("Oodles Technologies");
		Thread.sleep(2000);
		Sl.selectsource("IVR");

	}
	
	@Test(enabled=false)
	public void clickpage() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		Sl.clickonsaleslead();
		log.info("Clicked on SL");
        
		Sl.clickonlead().click();
		log.info("Clicked on lead option");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Sl.leadstab);
		Sl.leadstab().click();

		Sl.selectpagecount("Show 25 per page");
		Thread.sleep(2000);
		Sl.selectpagecount("Show 50 per page");
		Thread.sleep(2000);
		Sl.selectpagecount("Show 100 per page");
		Thread.sleep(2000);
		Sl.selectpagecount("Show 10 per page");

	}
	
	@Test(enabled=false)
	public void statusfilter() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Sl.leadstab);
		
		//Sl.leadstab().click();
         Thread.sleep(2000);
		Sl.selectstatus("Open");
		Thread.sleep(2000);
		Sl.selectstatus("Closed");
		Thread.sleep(2000);
		Sl.selectstatus("Acquired");
	}
	
	@Test(enabled=false)
	public void rangefilter() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Sl.leadstab);

		Sl.leadstab().click();

		Sl.selectrange("Today");
		Thread.sleep(2000);

		Sl.selectrange("Yesterday");
		Thread.sleep(2000);

		Sl.selectrange("This Week");
		Thread.sleep(2000);

		Sl.selectrange("This Month");
		Thread.sleep(2000);

		Sl.selectrange("Custom Dates");
		Thread.sleep(2000);

	}

	
	           void leadstypefilter() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);

		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		// Sl.leadstype.click();
		// Sl.leadstype.sendKeys(Keys.DOWN);
//		Sl.leadstype.sendKeys(Keys.ENTER);
//		
//		Sl.leadstype.click();
//		Sl.leadstype.sendKeys(Keys.DOWN);
//		Sl.leadstype.sendKeys(Keys.DOWN);
//		Sl.leadstype.sendKeys(Keys.ENTER);

//		Thread.sleep(2000);
		Sl.leadstype("All Leads");
//		
//		Thread.sleep(2000);
		Sl.leadstype("Lancer Leads");
	}
	  
	@Test(enabled=false)
	public void codefilter() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");
		// Thread.sleep(3000);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Sl.leadstab);

		Sl.leadstab().click();

		Sl.selectstatuscode("A+");
		Thread.sleep(2000);

		Sl.selectstatuscode("A");
		Thread.sleep(2000);

		Sl.selectstatuscode("B");
		Thread.sleep(2000);

		Sl.selectstatuscode("C");
		Thread.sleep(2000);

	}
	
	@Test(enabled=false)
	public void verifytableispresent() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Thread.sleep(2000);

		if (Sl.Leadtable().isDisplayed()) {

			log.info("Table is Visible");
		} else {

			log.error("Table is InVisible");
		}

	}

	//@Test(enabled=true)
	public void verifyPagination() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
//		WaitStattementLib wait=new WaitStattementLib();
//		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		executor.executeScript("arguments[0].click()", Sl.clickonlead());
		
		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Thread.sleep(2000);
		Sl.pagination();
		log.info("Pagination working");
		// Thread.sleep(2000);

	}
	
	@Test(enabled=false)
	public void verifyPaginationonleadpage() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click()", Sl.leadstab);
		
		Sl.leadstab.click();
		log.info("Clicked on leads tab");

		Thread.sleep(3000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");

//		Thread.sleep(4000);
		
		Sl.pagination2();
		log.info("Pagination working");
	}
	
	//@Test(priority=1)
	public void verifyaddlead() throws InterruptedException

	{
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Thread.sleep(2000);
		
		Saleslead Sl = new Saleslead(driver);
//		WaitStattementLib wait=new WaitStattementLib();
//		wait.eWaitForClickable(driver, 5, Sl.saleslead);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		log.info("Clicked on leads tab");
		Sl.newlead();


		log.info("lead added");
		
		//Sl.searchaddedlead(driver,"Newlead3");

	}
	
	@Test
	public void clickcomment() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");


		executor.executeScript("arguments[0].click()", Sl.clickonlead());
		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Thread.sleep(2000);
		Sl.comment();
		String Test = Excelutilities.readData("sales", 1, 0);

		Sl.writecomment(Test);
		Sl.submitcomment().sendKeys(Keys.ENTER);
	}
	public void showcolumns() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		
		WaitStattementLib wait1= new WaitStattementLib();
		wait1.eWaitForClickable(driver, 5, Sl.Showhidedrpdwn);
		Sl.Showhidedrpdwn.click();
		
		Sl.showhide();
	}
	
	
	public void clickcommentonleadspage() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");
		

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		//Thread.sleep(3000);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		Sl.commentonlead();
		String Test = Excelutilities.readData("sales", 1, 0);

		Sl.writecomment(Test);
		Sl.submitcomment().sendKeys(Keys.ENTER);
	}
	
	@Test
	public void searchfilter() throws InterruptedException {
		
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		
		executor.executeScript("arguments[0].click()", Sl.clickonlead());
		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();

		String input = Excelutilities.readData("sales", 0, 0);
		Sl.searchlead(input);
		log.info("input is entered");
	}
    
	@Test
	public void searchtech() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		executor.executeScript("arguments[0].click()", Sl.clickonlead());

		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();

		String input = Excelutilities.readData("Techinvoke", 0, 0);
		Sl.searchtech(input);
	}
	
	//@Test(priority=2)
	public void edit()
			throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);

		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		//wait.eWaitForClickable(driver, 5, Sl.leadoption);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonlead());
		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();

		Thread.sleep(2000);
		Sl.editclient();
	}
	
	@Test(priority=3)
	public void deletelead() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		//JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonlead());
		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		
		Sl.deletelead();

	}
	
	@Test
	public void viewlead() throws InterruptedException {

		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Sl.clickonsaleslead());
		//Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		executor.executeScript("arguments[0].click()", Sl.clickonlead());

		//Sl.clickonlead().click();
		log.info("Clicked on lead option");

		Sl.leadstab().click();
		Sl.viewlead();

	}
	public void leadquality() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);

		Thread.sleep(2000);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		Sl.clickonlead().click();
		log.info("Clicked on lead option");
		Sl.leadstab().click();
		Sl.leadquality();

	}
	
	public void salesquery() throws InterruptedException {
		Landingpage lp = new Landingpage(driver);
		lp.login();
		log.info("Login successful");

		Saleslead Sl = new Saleslead(driver);
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, Sl.saleslead);
		
		//Thread.sleep(2000);

		Sl.clickonsaleslead().click();
		log.info("Clicked on SL");

		// Thread.sleep(4000);

		log.info("Clicked on lead option");

		Thread.sleep(2000);

		Sl.clickonlead().click();

		Thread.sleep(4000);
		Sl.leadstab().click();
		log.info("Clicked on leadtab");


		Sl.salesquery();
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
