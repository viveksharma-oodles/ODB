package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Landingpage {

	public WebDriver driver;
	
//		By Email = By.xpath("//input[@id='username']");
//		By PW= By.xpath("//input[@id='password']");
//		By login= By.xpath("//button[@class='login-btn']");
//		By logo=By.xpath("//div[@class='loginHeader']");
//	
		public Landingpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy (xpath="//input[@id='username']")
		WebElement Email;
		
		@FindBy (xpath="//input[@id='password']")
		WebElement PW;
		
		
		@FindBy (xpath="//button[@class='login-btn']")
		WebElement login;
		
		@FindBy (xpath="//div[@class='loginHeader']")
		WebElement logo1;
		
		@FindBy (xpath="//div[@class='loginHeader']")
		WebElement logo2;
		
		
	public WebElement getEmail()
	{
		return Email;
		
	
	}
	public WebElement getpassword()
	{
		return PW;

	}
	
	public WebElement getlogin()
	{
		return login;

	}
	public WebElement getlogo1()
	{
		
		return logo1;
		
	}
	public WebElement getlogo2()
	{
		
		return logo2;
		
	}
	
	public void login()
	{	
		getEmail().sendKeys("rijul.jain@oodlestechnologies.com");
		getpassword().sendKeys("manish@159");
        
        getlogin().click();

	}
	
}
