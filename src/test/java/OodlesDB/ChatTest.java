package OodlesDB;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.ChatPage;
import pageobjects.Landingpage;
import resource.Baseclass;

public class ChatTest extends Baseclass

{
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException  
	
	{
	driver = initializedriver();
	driver.get(prop.getProperty("url"));
	
	}
	@Test
	public void verifyValidChat() throws InterruptedException
	{
		Landingpage lp=new Landingpage(driver);
		lp.login();
		
		Thread.sleep(3000);
		ChatPage cp= new ChatPage(driver);
		cp.clickonchaticon().click();
		cp.sendvalidchat();
		
	}
}
