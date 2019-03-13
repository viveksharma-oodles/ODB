package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	public WebDriver driver;
	
//		By Email = By.xpath("//input[@id='username']");
//		By PW= By.xpath("//input[@id='password']");
//		By login= By.xpath("//button[@class='login-btn']");
//		By logo=By.xpath("//div[@class='loginHeader']");
//	
		public DashboardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//span[@class='project_icon']")
		WebElement Project;
		
		@FindBy (xpath="//a[@class='userHighlighted']")
		WebElement People;
		
		
		@FindBy (xpath="//a[@class='blogHighlighted']")
		WebElement blog;
		
		@FindBy (xpath="//a[@class='SalesLeadHighlighted']")
		WebElement saleslead;
		
		@FindBy (xpath="//a[@class='SettingsHighlighted']")
		WebElement settings;
		
		@FindBy (xpath="//a[@href='#resourcing/demand']")
		WebElement resourcing;

		@FindBy (xpath="//li[@class='dropdown accstealth user']//a[@class='dropdown-toggle']")
		WebElement logconsole;
		

		@FindBy (xpath="//input[contains(@placeholder,'Supervisor Email')]")
		WebElement supervisoremail;
		
		//input[contains(@placeholder,'Supervisor Email')]

		@FindBy (xpath="//button[@id='sidebar']")
		WebElement chaticon;

		
		
	public WebElement project()
	{
		return Project;
		
	
	}
	public WebElement people()
	{
		return People;

	}
	
	public WebElement blog()
	{
		return blog;

	}
	public WebElement saleslead()
	{
		
		return saleslead;
		
	}
	
	public WebElement resourcing()
	{
		
		return resourcing;
		
	}
	
	public WebElement logconsole()
	{
		
		return logconsole;
		
	}
	
	public WebElement supervisoremail()
	{
		
		return supervisoremail;
		
	}
	
	public WebElement chaticon()
	{
		
		return chaticon;
	}
	
}
