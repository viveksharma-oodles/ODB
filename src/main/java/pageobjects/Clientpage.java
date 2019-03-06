package pageobjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clientpage extends Commonelements {
	public static Logger log= LogManager.getLogger(Projects.class.getName());

	public WebDriver driver;
	
//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//
	
	
	@FindBy (xpath="//button[@id='opener']")
	WebElement Addclient;

	@FindBy (xpath="//input[@placeholder='Client Name']")
	WebElement Clientname;
	
	@FindBy (xpath="//input[@placeholder='dd-mm-yyyy']")
	WebElement Date;
	
	@FindBy (xpath="//input[@id='blogAuthor']")
	WebElement searchfield;
	
	@FindBy (xpath="//tbody//tr[1]")
	WebElement firstrow;
	
	@FindBy (xpath="//tr[1]//td[9]//a[1]")
	WebElement Editclient;
	
	
	@FindBy (xpath="//a[contains(text(),'26')]")
	WebElement Clickdate;
	//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]/a
	
     
     @FindBy (xpath="//button[@value='submit']")
     WebElement Submit;
     
     
     @FindBy (xpath="//select[contains(@class,'left')]")
     WebElement pagedropdown;
     
     @FindBy (xpath="//tr[1]//td[9]//a[2]")
     WebElement Deleteclient;
     
     @FindBy (xpath="//button[contains(text(),'Yes')]")
     WebElement Deleteyes;
     
     @FindBy (xpath="//tr[1]//td[8]")
     WebElement statuschange;
     
     @FindBy (xpath="//input[@placeholder='Email ID']")
     WebElement email;

     
     //input[contains(@placeholder,'Supervisor Email')]

	public Clientpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Addclient() {
		 Addclient.click();
		 Clientname.sendKeys("Ramon");
		 Date.click();
			Date.sendKeys("30-03-2019");
			email.sendKeys("ramon@gmail.com");
			Submit.click();
			
	}

}
