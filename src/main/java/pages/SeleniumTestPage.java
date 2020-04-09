package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class SeleniumTestPage extends Base {

	@FindBy(name = "first_name")
	WebElement FirstName;

	@FindBy(name = "last_name")
	WebElement LastName;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "address")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "zip")
	WebElement ZIP;

	@FindBy(name = "website")
	WebElement WebSite;

	@FindBy(xpath = "//input[@type='radio' and @value='yes']")
	WebElement YesRadio;

	@FindBy(xpath = "//input[@type='radio' and @value='no']")
	WebElement NoRadio;

	@FindBy(name = "comment")
	WebElement Comment;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SendButton;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/a/img")
	WebElement PageImage;

	
	
	// Initialize Page Factory using Constructor
	public SeleniumTestPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	// Actions

	public String ValidatePageTitle() {
		return driver.getTitle();

	}

	public void clickSend() {
		SendButton.click();
	}

	public boolean validatePageImage() {
		return PageImage.isDisplayed();
	}
	
	public void  EnterData(String firstName, String lastName, String email, String phoneNum, String address, String city,
			String State, String zipcode, String website, String hosting, String Project) {
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		System.out.println("Entering :::  "+firstName+lastName);
		
	}
}
