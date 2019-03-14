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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import resource.WaitStattementLib;

public class codereview extends Commonelements {
	public int count = 0;

	public static Logger log = LogManager.getLogger(Projects.class.getName());

	public WebDriver driver;

//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//

	@FindBy(xpath = "//button[contains(text(),'Add Schedule')]")
	WebElement AddSchedule;

	@FindBy(xpath = "//input[@placeholder='Select Project']")
	WebElement SelectProject;

	@FindBy(xpath = "//input[@ng-model='codeReviewSchedule.title']")
	WebElement title;
	
	@FindBy(xpath = "//input[@ng-model='codeReviewSchedule.startDate']")
	WebElement startdate;
	
	@FindBy(xpath = "//a[contains(text(),'29')]")
	WebElement date1;
	
	
	
	
	@FindBy(xpath = "//input[@ng-model='codeReviewSchedule.endDate']")
	WebElement enddate;

	@FindBy(xpath = "//a[contains(@class,'highlight')]")
	WebElement selectdate;

	
	@FindBy(xpath = "//div[contains(@class,'trash')]")
	WebElement delete;
	
	

	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	WebElement delete2;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement Add;

	@FindBy(xpath = "//select[contains(@class,'left')]")
	WebElement pagedropdown;

	@FindBy(xpath = "//textarea[@ng-model='meeting.comments']")
	WebElement comment;


	@FindBy(xpath = "//li[contains(text(),'Scheduled')]")
	WebElement Scheduled;

	
	@FindBy(xpath = "//li[contains(text(),' Non-Scheduled')]")
	WebElement nonScheduled;

	@FindBy(xpath = "//div[5]//div[2]//table[1]//tbody[1]//tr[1]//td[7]")
	WebElement meeting2;
	
	@FindBy(xpath = "//div[5]//div[2]//table[1]//tbody[1]//tr[1]//td[6]//a[1]//div[1]")
	WebElement meeting1;


	@FindBy(xpath = "//li[contains(text(),'Scheduled')]")
	WebElement scheduled;
	
	@FindBy(xpath="//tr[16]//td[9]//a[2]")
	WebElement emailnotif;
	
	@FindBy(xpath="//textarea[@placeholder='Write Message...']")
	WebElement msg;
	
	@FindBy(xpath="//button[contains(text(),'Send mail')]")
	WebElement sendbutton;
	
	
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

	public codereview(WebDriver driver) {
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

	
	

	public void pagination() throws InterruptedException {
	
	int size= pagination.size(); 
	System.out.println(pagination.size()); 

	
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

	}
//	catch(Exception e){ 
//	e.printStackTrace(); 
//	
	//} 
//	    }
//	}
//	}
	public void Addschedule() throws InterruptedException {
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", AddSchedule);
		
		WaitStattementLib wait=new WaitStattementLib();
		wait.eWaitForClickable(driver, 15, SelectProject);
		//AddSchedule.click();
		SelectProject.sendKeys("dash");
		SelectProject.sendKeys(Keys.ARROW_DOWN);
		SelectProject.sendKeys(Keys.ENTER);
		title.sendKeys("Frontend");
		startdate.click();
		
		executor.executeScript("arguments[0].click()", date1);
		
		Thread.sleep(2000);
		
		//executor.executeScript("arguments[0].click()", enddate);
		
		enddate.click();
		
		
		executor.executeScript("arguments[0].click()", date1);		
		
		Add.sendKeys(Keys.ENTER);

//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click()", Submit);
		// Submit.click();

	}
	
	
	public void postpone()
	{
		 Actions act=new Actions(driver);
		 act.dragAndDrop(meeting1, meeting2).build().perform();	
		
	}
	
	public void scheduled()
	{
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click()", scheduled);
		//scheduled.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailnotif);
		
		
		executor.executeScript("arguments[0].click()", emailnotif);
		//emailnotif.click();
		
		msg.sendKeys("Test");
		
		sendbutton.click();
		
	}
	
	public void delete()
	{
		
		Actions act=new Actions(driver);
		 act.dragAndDrop(meeting1, delete).build().perform();
		 comment.sendKeys("Delete");
		 
		 delete2.click();
		 
	}
	
		
		
	}

