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

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/section/form/fieldset/div[10]/div/div[1]/label/input")
	WebElement YesRadio;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/section/form/fieldset/div[10]/div/div[2]/label/input")
	WebElement NoRadio;

	@FindBy(name = "comment")
	WebElement Comment;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/section/form/fieldset/div[13]/div/button")
	WebElement SendButton;

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/a/img")
	WebElement PageImage;

	// Initialize Page Factory using constructor
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
		
	}
}
