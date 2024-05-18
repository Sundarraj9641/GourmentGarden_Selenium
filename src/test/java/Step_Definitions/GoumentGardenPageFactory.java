package Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoumentGardenPageFactory {
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using="FirstName")
	WebElement firstName;
	
	@FindBy(how=How.ID, using="LastName")
	WebElement lastName;
	
	@FindBy(how=How.ID, using="Email")
	WebElement email;
	
	@FindBy(how=How.ID, using="CreatePassword")
	WebElement password;
	
	public GoumentGardenPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, GoumentGardenPageFactory.class);
	}
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enteremail(String e_mail) {
		email.sendKeys(e_mail);
	}
	public void enterpassword(String pward) {
		password.sendKeys(pward);
	}
	
	

}
