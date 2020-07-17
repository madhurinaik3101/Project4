package firsttestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class FirstTestNGFile {
	public String baseUrl = "http://automationpractice.com/index.php";
    String driverPath = "C:\\Users\\Nagaraj\\Downloads\\firefoxDriver\\geckodriver.exe";
    public WebDriver driver ; 
     
  @BeforeTest
  public void launchBroswer() {
       
      System.out.println("Launching Firefox Browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      driver.manage().window().maximize();
  }
  

  
  @Test(priority=0) 
  public void registeration() 
  { 
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
  driver.findElement(By.name("email_create")).sendKeys("madh@gmail.com");
  driver.findElement(By.name("SubmitCreate")).click();
  
  }
  
  @Test(priority=1)
  public void registeration2() 
  {
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
  driver.findElement(By.name("customer_firstname")).sendKeys("Madhuri");
  driver.findElement(By.name("customer_lastname")).sendKeys("Naik");
  driver.findElement(By.name("passwd")).sendKeys("madhuri123"); Select day =
  new Select(driver.findElement(By.id("days"))); day.selectByIndex(20); Select
  month = new Select(driver.findElement(By.id("months")));
  month.selectByIndex(6); Select year = new
  Select(driver.findElement(By.id("years"))); year.selectByIndex(23);
  driver.findElement(By.id("newsletter")).click();
  driver.findElement(By.id("optin")).click(); //Address
  driver.findElement(By.name("company")).sendKeys("BNP Paribas");
  driver.findElement(By.name("address1")).
  sendKeys("787 Seventh Avenue,P.O Box 7233");
  driver.findElement(By.name("address2")).
  sendKeys(" The Equitable Tower,New York");
  driver.findElement(By.name("city")).sendKeys("New York"); Select state = new
  Select(driver.findElement(By.id("id_state")));
  state.selectByVisibleText("New York");
  driver.findElement(By.name("postcode")).sendKeys("10019"); Select country=
  new Select(driver.findElement(By.id("id_country")));
  country.selectByVisibleText("United States");
  driver.findElement(By.name("other")).sendKeys("Nothing");
  driver.findElement(By.name("phone")).sendKeys("+1 212-841-3000");
  driver.findElement(By.name("phone_mobile")).sendKeys("+1 212-841-3000");
  driver.findElement(By.name("alias")).clear();
  driver.findElement(By.name("alias")).sendKeys("NY");
  driver.findElement(By.name("submitAccount")).click();
  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
  
  }
 
	@Test(priority=2)
	  public void searchBarAutomation() { 
	//search SummerDresses
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Summer Dresses");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //search EveningDresses
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Evening Dresses");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //search CasualDresses 
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Casual Dresses");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //search Tshirts 
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("T-shirts");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //search Dresses 
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Dresses");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //search Printed
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Printed");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //searchFaded Short Sleeve T-shirt
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Faded Short Sleeve T-shirts"); 
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //searchBlouse 
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Blouse");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //searchPrintedDress
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Printed Dress");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click(); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //searchPrintedSummerDress
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Printed Summer Dress");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //searchPrintedChiffonDress()
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("Printed Chiffon Dress");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //NoResultsFound
	  driver.findElement(By.name("search_query")).clear();
	  driver.findElement(By.name("search_query")).sendKeys("abc");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	 
  
  
	
	  @Test(priority=3) public void addToCartAutomationPrintedDress() {
	  
	  //add Printed Dress to the cart
	  driver.findElement(By.linkText("DRESSES")).click();
	  driver.findElement(By.linkText("CASUAL DRESSES")).click();
	  driver.findElement(By.linkText("Printed Dress")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver, 20); 
	  WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));
	  element1.click();
	  
	  }
	  
	  @Test(priority=4) public void addToCartAutomationPrintedDress2() {
	  
	  //add Printed Dress 2to the cart
	  driver.findElement(By.linkText("DRESSES")).click();
	  driver.findElement(By.linkText("EVENING DRESSES")).click();
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click(); 
	  WebDriverWait wait1 = new WebDriverWait(driver, 20); 
	  WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));
	  element1.click();
	  
	  }
	  
	  @Test(priority=5) public void addToCartAutomationPrintedChiffonDress() {
	  
	  //add Printed Chiffon Dress to the cart
	  driver.findElement(By.linkText("DRESSES")).click();
	  driver.findElement(By.linkText("SUMMER DRESSES")).click();
	  driver.findElement(By.linkText("Printed Chiffon Dress")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click(); 
	  WebDriverWait wait1 = new WebDriverWait(driver, 20); WebElement
	  element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));
	  element1.click();
	  
	  }
	  
	  @Test(priority=6) public void addToCartAutomationPrintedSummerDress() {
	  
	  //add PrintedSummerDress to the cart
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("DRESSES")).click();
	  driver.findElement(By.linkText("SUMMER DRESSES")).click();
	  driver.findElement(By.linkText("Printed Summer Dress")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver, 10); 
	  WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"))); 
	  element1.click();
	  
	  }
	  
	  @Test(priority=7) public void addToCartTshirt() {
	//add Faded Short Sleeve Tshirt to the cart
	  driver.navigate().to(baseUrl);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("T-SHIRTS")).click(); JavascriptExecutor js =
	  (JavascriptExecutor)driver; js.executeScript("scrollBy(0,700)");
	  driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click(); 
	  WebDriverWait wait1 = new WebDriverWait(driver, 20);
	  WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));
	  element1.click();
	  
	  }
	  
	  @Test(priority=8) public void addToCartAutomationBlouse() {
	  
	  //add Blouse to the cart
	  driver.navigate().to("http://automationpractice.com/index.php");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("scrollBy(0,700)");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Blouse")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click(); 
	  WebDriverWait wait1 = new WebDriverWait(driver, 20); WebElement
	  element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")));
	  element1.click();
	  
	  }
	 
	 
	
		@Test(priority=9)
		public void login_Pass() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("hmnnaik98@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("madhuri123");
		driver.findElement(By.name("SubmitLogin")).click();
		String actualUrl="http://automationpractice.com/index.php?controller=my-account";
		String expectedUrl= driver.getCurrentUrl();
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Logged In");
		  } 
		else { 
			System.out.println("Login Failed");
		  } 
		}
	
		 @Test(priority=10)
		 public void loginOUT(){
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")).click(); 
		 }
		 
	 
		 
	  	@Test(priority=11)
	      public void login_Fail(){
	    	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	  driver.findElement(By.name("email")).sendKeys("hmnnaik98@gmail.com");
	    	  driver.findElement(By.name("passwd")).sendKeys("madhuri13");
	    	  driver.findElement(By.name("SubmitLogin")).click();
	          String actualUrl="http://automationpractice.com/index.php?controller=my-account";
	          String expectedUrl= driver.getCurrentUrl();
	          if(actualUrl.equalsIgnoreCase(expectedUrl))
	          {
	              System.out.println("Logged In");
	          }
	          else
	          {
	              System.out.println("Login Failed");
	          }
	  	}
	  	}



 

