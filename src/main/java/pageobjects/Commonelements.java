package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Commonelements {

	public WebDriver driver;
	
//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//
	public Commonelements(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//span[@class='project_icon']")
	public
	WebElement Project;
	
	@FindBy (xpath="//a[contains(text(),'View Projects')]")
	WebElement viewProject;
	
	@FindBy (xpath="//a[contains(text(),'View Accounts')]")
	WebElement viewaccount;
	
	@FindBy (xpath="//a[contains(text(),'Code Review')]")
	WebElement codereview1;
	
	@FindBy (xpath="//a[@class='userHighlighted']")
	WebElement People;
	
	
	@FindBy (xpath="//a[@class='blogHighlighted']")
	WebElement blog;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	public WebElement saleslead;
	
	@FindBy (xpath="//a[contains(text(),'Leads')]")
	WebElement leadoption;
	
	
	@FindBy (xpath="//a[@class='SettingsHighlighted']")
	WebElement settings;
	
	@FindBy (xpath="//a[@href='#resourcing/demand']")
	WebElement resourcing;

	@FindBy (xpath="//li[@class='dropdown accstealth user']//a[@class='dropdown-toggle']")
	WebElement logconsole;
	

	@FindBy (xpath="//input[contains(@placeholder,'Supervisor Email')]")
	WebElement supervisoremail;
	
	//input[contains(@placeholder,'Supervisor Email')]

	@FindBy (id="sidebar")
	WebElement chaticon;
	
	@FindBy (xpath="//a[@class='logo']")
	WebElement logo;

	
	 public void verifyLogo()
	    {
	    	Assert.assertTrue(logo.isDisplayed());
	    	Reporter.log("Logo is displayed",true);	
	    }
	 
public WebElement clickonproject()
{
	
	return Project;
	

}

public WebElement clickonviewproject()
{
	return viewProject;
	

}
public WebElement clickonpeople()
{
	return People;

}

public WebElement viewaccount()
{
	return viewaccount;
}

public WebElement clickonblog()
{
	return blog;

}
public WebElement clickonsaleslead()
{
	
	
	return saleslead;
	
}

public WebElement clickonlead()
{
	
	
	return leadoption;
	
}



public WebElement clickonresourcing()
{
	
	return resourcing;
	
}
public WebElement codereview1()
{
return codereview1;
}
public WebElement clickonlogconsole()
{
	
	return logconsole;
	
}

public WebElement supervisoremail()
{
	
	return supervisoremail;
	
}

public WebElement clickonchaticon()
{
	
	return chaticon;
	
}

}
