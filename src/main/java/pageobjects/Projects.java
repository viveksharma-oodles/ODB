package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import resource.Excelutilities;
import resource.WaitStattementLib;

public class Projects extends Commonelements {

	public static Logger log = LogManager.getLogger(Projects.class.getName());

	public WebDriver driver;

//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//

	@FindBy(xpath = "//button[@id='opener']")
	WebElement AddProject;

	@FindBy(xpath = "//input[@placeholder='Project Name']")
	WebElement Projectname;

	@FindBy(xpath = "//input[@name='originalDate']")
	WebElement Date;

	@FindBy(xpath = "//input[@placeholder='search']")
	WebElement searchfield;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]")
	WebElement firstrow;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/a[3]")
	WebElement firstproject;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement EditProjectname;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[6]/div[3]/div[1]/div[1]/tags-input[1]/div[1]/div[1]/input[1]")
	WebElement technology;

	@FindBy(xpath = "//input[@placeholder='Add Team Leads']")
	WebElement TeamLeads;

	@FindBy(xpath = "//input[@placeholder='Add Team Members']")
	WebElement Teammembers;

	@FindBy(xpath = "//a[contains(text(),'26')]")
	WebElement Clickdate;
	// table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]/a

	@FindBy(xpath = "//div[@class='ng-scope']//div[@class='modal-footer']//div//input[@value='Next']")
	WebElement Next;

	@FindBy(xpath = "//input[@placeholder='Select Client']")
	WebElement client;

	@FindBy(xpath = "//form[@name='clientForm']//div[@class='modal-footer']//div//input[@value='Next']")
	WebElement Next1;

	@FindBy(xpath = "//input[@placeholder='Select Project Manager']")
	WebElement Manager;

	@FindBy(xpath = "//form[@name='teamForm']//div[@class='modal-footer']//div//input[@value='Next']")
	WebElement Next2;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;

	@FindBy(xpath = "//li[@class='suggestion-item ng-scope ng-binding selected']")
	WebElement clientlist;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	WebElement pagedropdown;

	@FindBy(xpath = "//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[9]//div[1]//div[1]//div[1]//button[1]")
	WebElement kabobmenu;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement validateresource;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement Deleteproject;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/form[1]/div[2]/button[2]")
	WebElement Deleteyes;

	@FindBy(xpath = "//tbody//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[6]//a[1]")
	WebElement statuschange;

	@FindBy(xpath = "//input[@id='parentcheck']")
	WebElement parentcheck;

	@FindBy(xpath = "//input[contains(@placeholder,'Parent')]")
	WebElement parentfield;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/a[5]")
	WebElement projectoverview;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/select[1]")
	WebElement Projectstatusdropdwn;

	@FindBy(xpath = "//div[@class='dropdown open']//a[@title='Legal Documents']")
	WebElement Salesdocument;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/table[1]/tbody[2]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/a[2]")
	WebElement codereview;

	@FindBy(xpath = "//tr[1]//td[1]//table[1]//tbody[1]//tr[1]//td[8]//table[1]//tbody[1]//tr[1]//td[2]//a[1]")
	WebElement resourcecount;

	public int count;

	// input[contains(@placeholder,'Supervisor Email')]

	public Projects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonAddproject() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", AddProject);

	}

	public WebElement resourcecount() {
		return resourcecount;
	}

	public void validateresources() {
		kabobmenu.click();
		validateresource.click();
		String expectedMessage = "The Institution is deleted Successfully!";
		String message = driver.findElement(By.xpath("//div[contains(@class,'callout callout-success')]")).getText();
		Assert.assertTrue(message.contains(expectedMessage), "Your error message");
	}

	public void statuschange() {
		WaitStattementLib wait = new WaitStattementLib();
		wait.eWaitForClickable(driver, 15, statuschange);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", statuschange);

		WebElement message = driver.findElement(By.xpath("//div[@class='txtalignCenter positionABS inviteSent']"));

		Assert.assertEquals(message.getText(), "Status Changed Successfully");
	}

	public void search() {
		searchfield.sendKeys("LiveSource");

		WaitStattementLib wait = new WaitStattementLib();
		wait.eWaitForVsibility(driver, 30, firstrow);

		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue(bodyText.contains("LiveSource"), "Text not found!");

	}

	public void salesdocument() throws InterruptedException {

//	WaitStattementLib wait= new WaitStattementLib();
//	wait.eWaitForClickable(driver, 15, kabobmenu);
		// kabobmenu.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", kabobmenu);

		Thread.sleep(2000);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", Salesdocument);

		// Salesdocument.click();
//    Alert alert = driver.switchTo().alert();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}

	public void codereview() throws InterruptedException {
		WaitStattementLib wait = new WaitStattementLib();
//	wait.eWaitForClickable(driver, 30, kabobmenu);

//	kabobmenu.click();

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", codereview);

		// codereview.click();

		WebElement message = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]"));

		wait.eWaitForVsibility(driver, 10, message);

		message.isDisplayed();

		// assertTrue(selenium.isElementPresent("constant_id"))

		// Assert.assertEquals(message.getText(), "Project is now eligible for code
		// review");

//	Actions action = new Actions(driver);
//	 action.moveToElement(codereview).build().perform();
//	 //WebElement toolTipEle = driver.findElement(By.xpath("//*[@id='ui-id-118']/div"));
//	 // Get the Tool Tip Text
//	 String toolTipTxt = codereview.getText();
//	
//	 if(toolTipTxt.contentEquals("Not Required for Code Review"))

	}

	public void projectoverview() {

		String currentPageHandle = driver.getWindowHandle();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", projectoverview);
		// projectoverview.click();

		// Add Logic to Wait till Page Load

		// Get all Open Tabs
		ArrayList<String> tabHandles = new ArrayList<String>(driver.getWindowHandles());

		for (String eachHandle : tabHandles) {
			driver.switchTo().window(eachHandle);
			// Check Your Page Title
			// WaitStattementLib wait= new WaitStattementLib();
			// wait.eWaitForVsibility(driver, 6, heading);

			driver.switchTo().window(currentPageHandle);

		}
	}

	public void deleteproject() {
		kabobmenu.click();
		Deleteproject.click();
		Deleteyes.click();

	}

	public WebElement Projectname() {
		return Projectname;

	}

	public WebElement Selectdate() {
		return Date;

	}

	public WebElement firstproject() {
		return firstproject;
	}

	public WebElement Clickdate() {
		return Clickdate;

	}

	public WebElement Manager() {
		return Manager;

	}

	public WebElement client() {
		return client;

	}

	public WebElement clientlist() {
		return clientlist;

	}

	public void selectpagecount(String page) throws InterruptedException {
		Select sel = new Select(pagedropdown);
		sel.selectByVisibleText(page);
		List<WebElement> clients = driver.findElements(By.xpath("//a[@title='Edit']"));
		int count = clients.size();

	}

	public void selectstatusdrpdwn(String status) {
		Select sel = new Select(Projectstatusdropdwn);
		sel.selectByVisibleText(status);
	}

	public void addproject() throws Exception {

		// AddProject.click();
		String name = Excelutilities.readData("Add project", 0, 0);
		Projectname.sendKeys(name);
		log.info("Project name is entered");

		Date.click();

		Thread.sleep(2000);
		Clickdate.sendKeys(Keys.ENTER);
		log.info("Date is entered");

		// log.info("click on date");

		// ((JavascriptExecutor)driver).executeScript("document.getElementsByName('originalDate').setAttribute('value','19-01-2019')");

		// WebElement
		// DT=driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'19')]"));
//	DT.click();

		Next.click();
		String clientname = Excelutilities.readData("Add project", 0, 1);

		client.sendKeys(clientname);
		// clientlist.click();
		Thread.sleep(2000);
		client.sendKeys(Keys.ARROW_DOWN);
		client.sendKeys(Keys.ENTER);

		log.info("CLient name is entered");

//	WebElement element = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
//	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

		Next.click();
		String manager = Excelutilities.readData("Add project", 0, 2);

		Manager.sendKeys(manager);
//	Thread.sleep(2000);
//	WebElement element1 = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
//	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Manager.sendKeys(Keys.DOWN);
		Manager.sendKeys(Keys.ENTER);

		log.info("manager name is entered");

		Next.click();
		log.info("Next button is clicked");
		Thread.sleep(2000);
		Submit.click();
		log.info("Submit button is clicked");

	}

	public void editproject() {
		parentcheck.click();
		parentfield.clear();
		parentfield.sendKeys("g");
		parentfield.sendKeys(Keys.ARROW_DOWN);
		parentfield.sendKeys(Keys.ENTER);

		EditProjectname.clear();
		EditProjectname.sendKeys("DSLR2");
		Date.click();
//Thread.sleep(2000);
		Clickdate.click();
//log.info("click on date");

		technology.sendKeys("b");
		technology.sendKeys(Keys.DOWN);
		technology.sendKeys(Keys.ENTER);

//((JavascriptExecutor)driver).executeScript("document.getElementsByName('originalDate').setAttribute('value','19-01-2019')");

//WebElement DT=driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'19')]"));
//DT.click();

		Next.click();
//client.sendKeys("time");
//Thread.sleep(2000);
//	
//WebElement element = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
//
//   
//	
		Next.click();

//Manager.sendKeys("A");
//Thread.sleep(2000);
//WebElement element1 = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
//((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		TeamLeads.sendKeys("k");
		TeamLeads.sendKeys(Keys.ARROW_DOWN);
		TeamLeads.sendKeys(Keys.ENTER);

		Teammembers.sendKeys("j");
		Teammembers.sendKeys(Keys.ARROW_DOWN);
		Teammembers.sendKeys(Keys.ENTER);

		Teammembers.sendKeys("l");
		Teammembers.sendKeys(Keys.ARROW_DOWN);
		Teammembers.sendKeys(Keys.ENTER);
		Next.click();
//
		Submit.click();

	}

}
