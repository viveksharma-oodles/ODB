package pageobjects;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Clientpage extends Commonelements {
	public int count = 0;

	public static Logger log = LogManager.getLogger(Projects.class.getName());

	public WebDriver driver;

//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//

	@FindBy(xpath = "//button[@id='opener']")
	WebElement Addclient;

	@FindBy(xpath = "//input[@placeholder='Client Name']")
	WebElement Clientname;

	@FindBy(xpath = "//input[@placeholder='dd-mm-yyyy']")
	WebElement Date;

	@FindBy(xpath = "//input[@id='blogAuthor']")
	WebElement searchfield;

	@FindBy(xpath = "//tbody//tr[1]")
	WebElement firstrow;

	@FindBy(xpath = "//tr[1]//td[9]//a[1]")
	WebElement Editclient;

	@FindBy(xpath = "//a[contains(text(),'26')]")
	WebElement Clickdate;
	// table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]/a

	@FindBy(xpath = "//button[@value='submit']")
	WebElement Submit;

	@FindBy(xpath = "//select[contains(@class,'left')]")
	WebElement pagedropdown;

	@FindBy(xpath = "//tr[1]//td[9]//a[2]")
	WebElement Deleteclient;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement Deleteyes;

	@FindBy(xpath = "//tr[1]//td[8]")
	WebElement statuschange;

	@FindBy(xpath = "//input[@id='radio_Inactive']")
	WebElement radioinactive;

	@FindBy(xpath = "//input[@placeholder='Email ID']")
	WebElement email;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	WebElement update;

	@FindBy(xpath = "//input[@id='radio_published']")
	WebElement publishradio;

	@FindBy(xpath = "//select[@ng-model='statusFilter']")
	WebElement statusfilter;

	@FindBy(xpath = "//select[@ng-model='publishFilter']")
	WebElement publishfilter;
	
	@FindBy(xpath = "//ul[contains(@class,'pagination')]")
	List<WebElement> pagination;
	
	@FindBy(xpath = "//a[contains(text(),'Next')]")
	WebElement Next;

	@FindBy(xpath = "//tr[contains(@ng-repeat,'clientInfo')]")
	List<WebElement> searchresult;
	
	// input[contains(@placeholder,'Supervisor Email')]

	public Clientpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void perpage(String page) {

		Select sel = new Select(pagedropdown);
		sel.selectByVisibleText(page);

	}

	public void statusfilter(String status) {
		Select sel = new Select(statusfilter);
		sel.selectByVisibleText(status);
	}

	public void publishfilter(String publish) {
		Select sel = new Select(publishfilter);
		sel.selectByVisibleText(publish);
	}

	public void pagination() throws InterruptedException {
	
	int size= pagination.size(); 
	System.out.println(pagination.size()); 
//	if(size>0) { 
//	System.out.println("pagination exists");
//	// click on pagination link
	    //for(int i=0; i<size; i++){ 
//	         try{ //ul[contains(@class,'pagination')]//a["+i+"]
//	        		Thread.sleep(4000); 

	
	while (true){
	    
	    try {
	     //button = driver.findElement(By.cssSelector("a[action='cancel']"));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

			executor.executeScript("arguments[0].click()", Next);

			//Next.click();
	    } catch (NoSuchElementException ex){
	      break;   // button is missing, exit the loop
	    }
	    if (Next.isEnabled() == false) {
	      break;   // button is hidden, exit the loop
	    }
		Thread.sleep(2000); 
	}
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//
//		
//		executor.executeScript("arguments[0].click()", Next);
//		Thread.sleep(3000); 
//
//		executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

	//driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click() ;
		
//	Thread.sleep(4000); 
	//System.out.println("Loop "+i);
	}
//	catch(Exception e){ 
//	e.printStackTrace(); 
//	
	//} 
//	    }
//	}
//	}
	public void Addclient() {
		Addclient.click();
		Clientname.sendKeys("Ramon");
		Date.clear();
		Date.sendKeys("30-03-2019");
		email.sendKeys("ramon@gmail.com");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Submit);
		// Submit.click();

	}

	public void editclient() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", Editclient);

		Clientname.sendKeys(Keys.CONTROL + "a");
		Clientname.sendKeys(Keys.DELETE);

		Clientname.sendKeys("Ramon1");
		Date.clear();
		Date.sendKeys("29-03-2019");
		email.clear();
		email.sendKeys("ramon1@gmail.com");

		executor.executeScript("arguments[0].click()", Submit);
		// Submit.click();
		log.info("Client updated");
	}

	public void deleteclient() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", Deleteclient);
		log.info("Click on delete icon");

		Deleteyes.click();
		log.info("Client deleted");
	}

	public void statuschange() {

		statuschange.click();

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", radioinactive);

		update.click();

	}

	public void statuschange1() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", statuschange);
		executor.executeScript("arguments[0].click()", publishradio);
		update.click();
	}

	public void searchfield() {
		
		searchfield.sendKeys("peter");
		// Now, let's gather our search results
		

		// Finally, we'll loop over the list to verify each result link contains our term
		for (int i = 0; i < searchresult.size(); i++) {
			
			try {
				Assert.assertTrue(searchresult.get(i).getText().contains("peter"), "Search result validation failed at instance [ + i + ].");

			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				Assert.assertTrue(searchresult.get(i).getText().contains("peter"), "Search result validation failed at instance [ + i + ].");

			}
		}
		
	}
}
