package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ChatPage extends Commonelements {

	public WebDriver driver;
	
	
	@FindBy(xpath="//select[@id='select_options']")
	WebElement Issuetype;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submit;
	
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement Comment;
	
	@FindBy(xpath="//p[contains(text(),'Thank You for submitting the form')]")
	WebElement msg;
	
	public ChatPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement Issue()
	{
		return Issuetype;
	}
	
	public WebElement submit()
	{
		return Submit;
	}
	
	public WebElement comment()

	//public WebElement dropdown()
	{
	
	 return Comment;
	}
	public void sendvalidchat()
	{
	
		Select dropdown = new Select(Issuetype);
		dropdown.selectByVisibleText("bug");
		Comment.sendKeys("Having issue in project");
		Submit.click();
		
		String actualres = "Thank You for submitting the form";
		String Expectedres = msg.getText();
		
		Assert.assertEquals(msg, Expectedres);
		Reporter.log("Message is printed", true);
		
	}
	
	
}
