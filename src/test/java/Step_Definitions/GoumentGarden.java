package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoumentGarden {
	WebDriver driver;
	ChromeOptions options;
	
	//GoumentGardenPageFactory pf;
	
	@Before
	public void open_browser() {
		
		System.out.println("Welcome to Gourment Garden");
		
		String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\gourment_garden\\Driver\\chromedriver.exe");

		options = new ChromeOptions();
        options.addArguments("--user-data-dir="+userProfile);
        options.addArguments("--profile-directory=Default");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://gourmetgarden.in/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.linkText("Chennai")).click();
		
	}
	
	@Given("user is on the Registration Page")
	public void user_is_on_the_Registration_Page() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/header/div[2]/div[1]/div[2]/button[3]/img")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/div/div[2]/div/a[1]")).click();
	}

	@When("user enter the vaild details")
	public void user_enter_the_vaild_details() {
		
	    WebElement firstName = driver.findElement(By.id("FirstName"));
	    firstName.sendKeys("Sundar");
	    
//	    pf = new GoumentGardenPageFactory(driver);
//	    
//	    pf.enterFirstName("Sundar");
//	    pf.enterLastName("Raj");
//	    pf.enteremail("sundarraj3456@gmail.com");
//	    pf.enterpassword("Sundar@3456");
	    
	    WebElement lastName = driver.findElement(By.id("LastName"));
	    lastName.sendKeys("Raj");
	    
	    WebElement email = driver.findElement(By.id("Email"));
	    email.sendKeys("sundarraj123445@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("CreatePassword"));
	    password.sendKeys("Sundar@1234");
	    
	}

	@And("click on create")
	public void click_on_create() {
	    
		WebElement create_button = driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div/div[1]/input"));
		create_button.click();
	}

	@Then("navigate to the products page")
	public void navigate_to_the_products_page() {
	    
		String Title =driver.getTitle();
		System.out.println("The title is: " + Title);
		driver.close();
	}



}
