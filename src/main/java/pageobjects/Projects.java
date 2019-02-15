package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class Projects extends Commonelements {
	
	public static Logger log= LogManager.getLogger(Projects.class.getName());

	public WebDriver driver;
	
//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//
	
	
	@FindBy (xpath="//button[@id='opener']")
	WebElement AddProject;

	@FindBy (xpath="//input[@placeholder='Project Name']")
	WebElement Projectname;
	
	@FindBy (xpath="//input[@name='originalDate']")
	WebElement Date;
	
	@FindBy (xpath="//a[contains(text(),'26')]")
	WebElement Clickdate;
	//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]/a
	
     @FindBy (xpath="//div[@class='ng-scope']//div[@class='modal-footer']//div//input[@value='Next']")
     WebElement Next;
     
     @FindBy (xpath="//input[@placeholder='Select Client']")
     WebElement client;
     
     @FindBy (xpath="//form[@name='clientForm']//div[@class='modal-footer']//div//input[@value='Next']")
     WebElement Next1;
     
     @FindBy (xpath="//input[@placeholder='Select Project Manager']")
     WebElement Manager;
     
     @FindBy (xpath="//form[@name='teamForm']//div[@class='modal-footer']//div//input[@value='Next']")
     WebElement Next2;
     
     @FindBy (xpath="//button[@type='submit']")
     WebElement Submit;
     
     @FindBy (xpath="//li[@class='suggestion-item ng-scope ng-binding selected']")
     WebElement clientlist;
     
	//input[contains(@placeholder,'Supervisor Email')]

	public Projects(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	 
	 
public WebElement clickonAddproject()
{
	return AddProject;
	
}

public WebElement Projectname()
{
	return Projectname;
	
}
public WebElement Selectdate()
{
	return Date;
	
}

public WebElement Clickdate()
{
	return Clickdate;
	
}

public WebElement Manager()
{
	return Manager;
	
}

public WebElement client()
{
	return client;
	
}

public WebElement clientlist()
{
	return clientlist;
	
}
public void addproject() throws Exception
{
	System.out.println("Go to add project");
	//AddProject.click();
	Projectname.sendKeys("DSLR");
	Date.click();
	Thread.sleep(2000);
	Clickdate.click();
	//log.info("click on date");
	
	
	
	//((JavascriptExecutor)driver).executeScript("document.getElementsByName('originalDate').setAttribute('value','19-01-2019')");

	

	
//	WebElement DT=driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'19')]"));
//	DT.click();
	

	
	Next.click();
	client.sendKeys("time");
	//clientlist.click();
	Thread.sleep(2000);
	
	WebElement element = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

   //client.sendKeys(Keys.ENTER);
	
	Next.click();
	
	Manager.sendKeys("A");
	Thread.sleep(2000);
	WebElement element1 = driver.findElement(By.xpath("//li[@class='suggestion-item ng-scope ng-binding selected']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	//Manager.sendKeys(Keys.ENTER);
	
	Next.click();

	Submit.click();

	
	
	
}




}
