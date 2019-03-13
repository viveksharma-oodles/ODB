package pageobjects;

import java.util.ArrayList;
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

import resource.WaitStattementLib;

public class Saleslead extends Commonelements {

	public static Logger log = LogManager.getLogger(Saleslead.class.getName());

	public WebDriver driver;

//	By Email = By.xpath("//input[@id='username']");
//	By PW= By.xpath("//input[@id='password']");
//	By login= By.xpath("//button[@class='login-btn']");
//	By logo=By.xpath("//div[@class='loginHeader']");
//

	@FindBy(xpath = "//button[contains(text(),'Create Lead')]")
	WebElement createlead;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]")
	public WebElement leadstab;

	@FindBy(xpath = "//input[@placeholder='Client Name']")
	WebElement ClientName;

	@FindBy(xpath = "//div[contains(@class,'col-md-6 marginB0')]//input[@placeholder='Email']")
	WebElement Email;

	@FindBy(xpath = "//div[@id='chart1']//*[@height='342']")
	public WebElement monthlygraph;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Savebutton;

	@FindBy(xpath = "//select[@id='yearFilter']")
	private WebElement yeardropdown;

	@FindBy(xpath = "//div[@class='fl marB10 marL10 selectbox col-md-2 leadyr']//select[@name='LeadSource']")
	private WebElement sourcedropdown;

	@FindBy(xpath = "//select[@id='dateFilter']")
	private WebElement Selectrangedropdown;

	@FindBy(xpath = "//select[@ng-model='pageSize']")
	private WebElement pagedropdown;

	@FindBy(xpath = "//select[@ng-model='statusFilter']")
	private WebElement statusdrpdwn;

	@FindBy(xpath = "//div[@class='col-md-12 col-xs-12 pull-left new-joineee']")
	public WebElement Leadtable;

	@FindBy(xpath = "//tbody[1]/tr[6]/td[17]/a[2]")
	public WebElement delete;

	@FindBy(xpath = "//a[@title='View Lead']")
	List<WebElement> view;

	@FindBy(xpath = "//a[@title='sales query']")
	List<WebElement> query;
	
	@FindBy(xpath = "//ul[@class='suggestion-list']")
	List<WebElement> Techinvokelist;
	
	@FindBy(xpath = "//div[contains(@class,'row')]//div[1]//div[1]//label[3]")
	WebElement No;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	List<WebElement> Salesoptions;
	// View lead

	@FindBy(xpath = "//input[@placeholder='Project Name']")
	public WebElement Projectname;

	@FindBy(xpath = "//input[@placeholder='BD Invoke']")
	public WebElement BDInvoke;

	@FindBy(xpath = "//input[@placeholder='Client Name']")
	public WebElement ClientEmail;

	
	@FindBy(xpath = "//input[contains(@placeholder,'Description')]")
	public WebElement Description;
	
	@FindBy(xpath = "//input[@id='emailDatePicker']")
	public WebElement Datefield;

	@FindBy(xpath = "//select[@name='StatusCode']")
	public WebElement Statusdropdown;

	
	@FindBy(xpath = "//select[@ng-model='statusCode']")
	public WebElement Statuscode;
	
	@FindBy(xpath = "//input[@id='interactedDatePicker']")
	public WebElement lastconvdate;

	@FindBy(xpath = "//div[@class='form-group']//select[@name='LeadSource']")
	public WebElement leadsourceview;

	@FindBy(xpath = "//input[@id='actionDatepicker']")
	public WebElement ActionDate;

	@FindBy(xpath = "//select[contains(@name,'LeadStatus')]")
	public WebElement Leadstatusview;

	@FindBy(xpath = "//input[@id='conversionDatePicker']")
	public WebElement Convrsiondte;

	@FindBy(xpath = "//input[contains(@placeholder,'First Month Bill')]")
	public WebElement Monthbill;
	//div[contains(@class,'tags')]
	@FindBy(xpath = "//input[@placeholder='Add Team Leads']")
	public WebElement Techinvoke;
	
	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/tags-input[1]/div[1]/auto-complete[1]/div[1]/ul[1]/li[1]")
	public WebElement techselect;

	
	@FindBy(xpath = "//div[contains(@class,'footer')]//button[contains(@class,'primary')][contains(text(),'Save')]")
	private WebElement Save;
	// view lead end

	@FindBy(xpath = "//tbody//tr[5]//td[17]//a[1]")
	public WebElement edit;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement deleteyes;

	@FindBy(xpath = "//input[@placeholder='Organization Name']")
	public WebElement OrganizationName;

	@FindBy(xpath = "//input[@placeholder='Street Address 1']")
	public WebElement StreetAddress1;

	@FindBy(xpath = "//input[@placeholder='Mobile']")
	public WebElement Mobile;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/div[3]/div[1]/ul[1]")
	List<WebElement> Pagination;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/ul[1]")
	List<WebElement> Pagination2;

	// input[@placeholder='Organization Name']

	// comment on sales dashboard page

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/table[1]/tbody[1]/tr[50]/td[5]")
	public WebElement comment;

	@FindBy(xpath = "//tbody//tr[4]//td[10]")
	public WebElement commentonlead;

	@FindBy(xpath = "//textarea[@placeholder='Write comment...']")
	public WebElement writecomment;

	@FindBy(xpath = "//button[@type='button'][contains(text(),'Submit')]")
	public WebElement Submitcomment;

	@FindBy(xpath = "//input[@class='ng-pristine ng-valid']")
	private WebElement search;

	@FindBy(xpath = "//input[@placeholder='Search By Tech Invoke']")
	private WebElement searchtechinvoke;

//	@FindBy(xpath = "//div[@class='scroll']//div//div//table[@id='dataTable3']//td[contains(text(),'Newlead')]")
//	private WebElement searchresult;

	@FindBy(xpath = "//tbody//tr[2]//td[9]")
	WebElement leadquality;

	@FindBy(xpath = "//input[@class='range-slider__range ng-valid ng-dirty']")
	private WebElement Qualityslider;

	@FindBy(xpath = "//a[contains(text(),'Leads')]")
	public WebElement leadoption;

	@FindBy(xpath = "//textarea[@placeholder='Write comment...']")
	private WebElement Qualitycomment;

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement updatecomment;
	
	@FindBy(xpath = "//button[contains(@class,'dropdown')]")
	public WebElement Showhidedrpdwn;
	
	@FindBy(xpath = "//ul[contains(@class,'carrer')]")
	List<WebElement> Showhide;
	
	@FindBy(xpath = "//label[contains(text(),'Individual')]")
	public WebElement Individual;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/select[1]")
	public WebElement leadstype;
	
	@FindBy(xpath = "//div[@class='text-right']//button[@class='btn btn-primary'][contains(text(),'Save')]")
	public WebElement Salesave;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	public WebElement Next2;

	@FindBy(xpath="//tr[contains(@ng-repeat,'leadsInfoList')]")
	List<WebElement> searchresult;
	
	@FindBy(xpath="//div[@class='col-md-6 text-right']//a[@class='ng-binding'][contains(text(),'Next')]")
	public WebElement Next;
	
	@FindBy(xpath="//td[@ng-if='showTechInvoke']")	
    List<WebElement> searchtech;
			

	// div[@class='scroll']//div//div//table[@id='dataTable3']

	// body[@data-gr-c-s-loaded='true']/div[@class='sticky-wrapper']/div[@class='sticky-wrapperIn']/div[@class='ng-scope']/div[@class='container-fluid
	// main-content leads-Content
	// ng-scope']/div[@class='row']/div[@class='col-lg-12']/div[@class='widget-container
	// fluid-height']/div[@class='widget-content
	// padded']/div[@ng-class="{'inactive-tab':!leadsView}"]/div[@class='scroll']/div[@class='col-md-12']/div[4]/label[1]/input[1]
	// input[contains(@placeholder,'Supervisor Email')]

	public Saleslead(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchlead(String input) {
		search.sendKeys(input);
		
		// Now, let's gather our search results
		

		// Finally, we'll loop over the list to verify each result link contains our term
		for (int i = 0; i < searchresult.size(); i++) {
			
			try {
				Assert.assertTrue(searchresult.get(i).getText().contains(input), "Search result validation failed at instance [ + i + ].");

			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				Assert.assertTrue(searchresult.get(i).getText().contains(input), "Search result validation failed at instance [ + i + ].");

			}
		}

	}


	public void searchtech(String input) throws InterruptedException {
		searchtechinvoke.sendKeys(input);
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;     
		jse.executeScript("document.querySelector('table th:last-child').scrollIntoView();");
		
for (int i = 0; i < searchtech.size(); i++) {
			
			try {
				Assert.assertTrue(searchtech.get(i).getText().contains(input), "Search result validation failed at instance [ + i + ].");

			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				Assert.assertTrue(searchtech.get(i).getText().contains(input), "Search result validation failed at instance [ + i + ].");

			}
}
	}

	public void writecomment(String write) throws InterruptedException {
		// comment.click();
		writecomment.sendKeys(write);

//		Thread.sleep(2000);
//		Submitcomment.click();
//		
	}
	
	
	public void searchaddedlead(WebDriver driver,String lead){
	    WebElement table = driver.findElement(By.xpath("//div[@class='scroll']//div//div//table[contains(@class,'dataTable')]"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));
	    List<WebElement> column = table.findElements(By.tagName("td"));
	    List<String> value = new ArrayList<String>();

	    System.out.println(rows.size());

	        for (int j=0; j<column.size(); j++){
	           // System.out.println(column.get(j).getText());
	            value.add(column.get(j).getText());
	        }
	        if (value.contains(lead)){
	           log.info("lead found in table");
	        }
	        else{
	            log.error("lead not present in table");
	        }
	}
//	public boolean searchUsername(WebDriver driver, String username){
//	    boolean isFound = false;
//	    List<WebElement> rows = driver.findElements(By.cssSelector("tbody > tr"));
//	    for(WebElement row : rows){
//	        if(row.findElement(By.cssSelector("td:nth-of-type(2)").getText.equals(username){
//	            isFound = true;
//	            break;
//	        }
//	    }
//	    return isFound;
//	}

//	public void verifyMonthlygraph()
//    {
//    	Assert.assertTrue(monthlygraph.isDisplayed());
//    	Reporter.log("Monthly graph is displayed",true);	
//    }

	public void selectpagecount(String page) throws InterruptedException {
		Select sel = new Select(pagedropdown);
		sel.selectByVisibleText(page);
	}

	public void selectstatuscode(String code)
	{
		Select sel = new Select(Statuscode);
		sel.selectByValue(code);//ul[@class='suggestion-list']//li[1]
	}
	public void selectyear(String year) throws InterruptedException {
		Select sel = new Select(yeardropdown);
		sel.selectByVisibleText(year);

	}

	public void leadstype(String type) throws InterruptedException {
		Select sel = new Select(leadstype);
		sel.selectByValue(type);

	}
	
	public void selectrange(String range) {
		Select sel = new Select(Selectrangedropdown);
		sel.selectByVisibleText(range);

	}

	public void selectsource(String source) {

		Select sel = new Select(sourcedropdown);
		sel.selectByVisibleText(source);
	}

	public void selectstatus(String status) {

		Select sel = new Select(statusdrpdwn);
		sel.selectByVisibleText(status);
	}
	

//	public void Showhide(String check)
//	{
//	    Select select = new Select(Showhide);
//	    select.selectByVisibleText(check);       
//	}
	
	public void Statusview(String status) {
		Select sel = new Select(Statusdropdown);
		sel.selectByVisibleText(status);
		
	}
	
	public void lastconvdate(String date)
	{
		Select sel = new Select(lastconvdate);
		sel.selectByVisibleText(date);


	}
	public void leadsrceview(String source) {
		Select sel = new Select(leadsourceview);
		sel.selectByValue(source);
	}

	public void Leadstatusview(String Leadstatus)

	{
		Select sel = new Select(Leadstatusview);
		sel.selectByValue(Leadstatus);
	}
	
	public void showhide() throws InterruptedException {
		
		Thread.sleep(2000);
	for ( WebElement el : Showhide ) {
	    if ( !el.isSelected() ) {
	        el.click();
	    }
	}
	}
	
	
	public void viewlead() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].scrollIntoView;", view);

		view.get(0).sendKeys(Keys.ENTER);

		Projectname.clear();
		Projectname.sendKeys("MG1");

		BDInvoke.clear();
		BDInvoke.sendKeys("h");
		Thread.sleep(2000);
		BDInvoke.sendKeys(Keys.ARROW_DOWN);
		BDInvoke.sendKeys(Keys.ENTER);

		//ClientEmail.sendKeys("mg1@gmail.com");

		Datefield.clear();
		Datefield.sendKeys("21-11-2019");
		
		Description.sendKeys("Developer need for creating Android and iPhone app from Laravel web-app");
		
		
		Statusview("Initiated");
		
		lastconvdate.clear();
		lastconvdate.sendKeys("21-10-2019");
		
		leadsrceview("Intercom");
		
		ActionDate.clear();
		ActionDate.sendKeys("20-10-2019");
		
		Leadstatusview("Acquired");
		
		
		Convrsiondte.clear();
		Convrsiondte.sendKeys("20-1-2019");
		
		Monthbill.sendKeys("25");
		
		
		Techinvoke.sendKeys("h");
		Thread.sleep(2000);
		Techinvoke.sendKeys(Keys.ARROW_DOWN);
		Techinvoke.sendKeys(Keys.ENTER);
		

//		actions.build().perform();
//		
//		Thread.sleep(2000);
		
		//Techinvoke.sendKeys("h");
		
		
//		WebElement element1 = driver.findElement(By.xpath("//ul[@class='suggestion-list'] //li[@class='suggestion-item ng-scope ng-binding selected']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		
		//Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView;", Save);
		
		//Thread.sleep(2000);

		

		//WebElement element1 = driver.findElement(By.xpath("//ul[@class='suggestion-list'] //li[@class='suggestion-item ng-scope ng-binding selected']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Save);
		
		Save.submit();
		
		

	}

//		Select sel=new Select(sourcedropdown);
//		sel.selectByVisibleText(source);	

	public WebElement monthlygraph() {
		return monthlygraph;

	}

	public WebElement leadstab() {
		
		return leadstab;

	}

//	public void verifylist() {
//		WebElement searchin = driver.findElement(
//				By.xpath("//div[@class='scroll']//div//div//table[@id='dataTable3']//td[contains(text(),'Newlead')]"));
//		if (resultlist().getText().contains("Newlead")) {
//			log.info("Found result");
//		} else {
//			log.error("result not displaying");
//		}
//
//	}

//	private WebElement resultlist() {
//		// TODO Auto-generated method stub
//		return searchresult;
//	}

	public WebElement submitcomment() {
		return Submitcomment;

	}

	public WebElement searchfield() {
		return search;

	}

//public WebElement Createlead()
//{
//	return Createlead;
//	
//}

	public WebElement ClientName() {
		return ClientName;

	}

	public WebElement Save() {
		return Savebutton;

	}

	public WebElement Email() {
		return Email;

	}

	public WebElement Leadtable() {
		return Leadtable;

	}

	public void pagination() throws InterruptedException {

		
		int size= Pagination.size(); 
		System.out.println(Pagination.size()); 
		
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
		// wait until 'loader' loading
//		List<WebElement> pagination = driver
//				.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[6]/div[3]/div[1]/ul[1]"));
		// Thread.sleep(5000);
//		if (Pagination.size() > 0) {
//			System.out.println("pagination exists and size=" + Pagination.size());
//
//			for (int i = 0; i < Pagination.size(); i++) {
//				
//				Thread.sleep(2000);
//				Pagination.get(i).click();
//				break;
//
//			}
//		} else {
//			System.out.println("pagination not exists");
//		}
	}

	public void pagination2() throws InterruptedException {
		
		
		
//		List<WebElement> pagination2 = driver
//				.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/ul[1]"));
		 
		Thread.sleep(5000);
		if (Pagination2.size() > 0) {
			System.out.println("pagination exists and size=" + Pagination2.size());
            
			for (int i = 0; i < Pagination2.size(); i++) {
				if (Pagination2.size() > 0)
				{
				Pagination2.get(i).click();
				break;
				} 
			}
		} else {
			System.out.println("pagination not exists");
		}

	}

	public void comment() {

		//comment.sendKeys(Keys.ENTER);
		WaitStattementLib wait= new WaitStattementLib();
		wait.eWaitForClickable(driver, 5, comment);
				
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", comment);

		
	}

	public void commentonlead() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", commentonlead);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", commentonlead);

		//commentonlead.click();

	}

	public void NewLead() throws InterruptedException {
		saleslead.click();
		Thread.sleep(2000);
		leadoption.click();

		Thread.sleep(4000);

		leadstab.click();
		Thread.sleep(5000);

		createlead.click();
		ClientName.sendKeys("Newlead2");
		Email.sendKeys("lead2@mail.com");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Savebutton);
		Save().click();

	}

	public void newlead() throws InterruptedException {

//	WebDriverWait wait = new WebDriverWait(driver,20);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create Lead")));

		createlead.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ClientName.sendKeys("Newlead3");
		Email.sendKeys("lead3@mail.com");

//	WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
//
//	Actions actions = new Actions(driver);
//
//	actions.moveToElement(element).click().perform();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", Savebutton);

		Thread.sleep(2000);
		Save().sendKeys(Keys.ENTER);

		// log.info("click on date");

		// ((JavascriptExecutor)driver).executeScript("document.getElementsByName('originalDate').setAttribute('value','19-01-2019')");

//	WebElement DT=driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'19')]"));
//	DT.click();

		log.info("lead is created");

	}

    
	public void deletelead() throws InterruptedException {
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		js1.executeScript("arguments[0].scrollIntoView();", delete);
		Thread.sleep(3000);

		// String delete1="a[title='Delete']";

		List<WebElement> a1 = driver.findElements(By.cssSelector("a[title='Delete']"));

		a1.get(0).sendKeys(Keys.ENTER);

		deleteyes.click();
		Thread.sleep(5000);

	}

	public void leadquality() throws InterruptedException {

//		WebDriverWait wait = new WebDriverWait(driver, 3);
//		wait.until(ExpectedConditions.elementToBeClickable(leadquality));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", leadquality);

		Thread.sleep(3000);

//	 Actions move = new Actions(driver);
//	    Action action = (Action) move.dragAndDropBy(Qualityslider, 5, 0).build();
//	    action.perform();

//	String jsCode="window.scrollTo(0,document.body.ScrollHeight)";
//	RemoteWebDriver r=(RemoteWebDriver) driver;
//	r.executeScript(jsCode);
//	
//	Thread.sleep(3000);

//	    Qualitycomment.sendKeys("Good");
//	    updatecomment.click();

		// Actions move = new Actions(driver);
//     Action action = (Action) move.dragAndDropBy(Qualityslider, 10, 0).build();
//     action.perform();

//	Actions builder = new Actions(driver);
//
//	builder.keyDown(Keys.CONTROL)
//	   .click(Qualityslider)
//	   .click(Qualityslider)
//	   .keyUp(Keys.CONTROL);

		// Then get the action:
//	Action selectMultiple = builder.build();
//
//	// And execute it:
//	selectMultiple.perform(); 
	}

	
	public void editclient() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		js.executeScript("arguments[0].scrollIntoView();", edit);
		
		Thread.sleep(3000);

		// String delete1="a[title='Delete']";

		List<WebElement> a = driver.findElements(By.cssSelector("a[title='Edit Client']"));

		a.get(0).sendKeys(Keys.ENTER);

		OrganizationName.sendKeys("OOdo");
		Mobile.sendKeys("434343233");
		StreetAddress1.sendKeys("Gurgaon");

//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView();", Savebutton);

		Save().sendKeys(Keys.ENTER);

	}

	public void salesquery() throws InterruptedException
	{
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		
		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");	
		js3.executeScript("arguments[0].scrollIntoView;", query);
		
		
		
		Thread.sleep(2000);

		
		WebElement ele =query.get(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		
			
		Thread.sleep(3000);
//		Random rnd = new Random();
//		
//		int index = rnd.nextInt(Salesoptions.size());
	
//		Salesoptions.get(index).click(); 
		
//		Salesoptions.get(rnd.nextInt(Salesoptions.size())).clear();
//		Salesoptions.get(rnd.nextInt(Salesoptions.size())).click();

		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//		jse.executeScript("arguments[0].scrollIntoView()", option); 

		Thread.sleep(3000);

		Salesave.click();
		
//		No.click();
//		Individual.click();
	}
}
