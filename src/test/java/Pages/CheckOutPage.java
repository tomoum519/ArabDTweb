package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {
	private By firstnamefield = By.id("billing_first_name_field");
	private By lastnamefield = By.id("billing_last_name_field");
	private By companyfield = By.id("billing_company_field");
	private By emailfield = By.id("billing_email_field");
	private By phonefield = By.id("billing_phone_field");
	private By countryfield = By.id("billing_country_field");
	private By address1field = By.id("billing_address_1_field");
	private By cityfield = By.id("billing_city_field");
	private By statefield = By.id("billing_state_field");
	private By postcodefield = By.id("billing_postcode_field");
	
	

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean isdisplayedFirstNameField() {
		return isDisplayed(firstnamefield);
	}
	
	public Boolean isdisplayedLastNameField() {
		return isDisplayed(lastnamefield);
	}
	
	public Boolean isdisplayedCompanyField() {
		return isDisplayed(companyfield);
	}
	
	public Boolean isdisplayedEmailField() {
		return isDisplayed(emailfield);
	}
	
	public Boolean isdisplayedPhoneField() {
		return isDisplayed(phonefield);
	}
	
	public Boolean isdisplayedCountrynameField() {
		return isDisplayed(countryfield);
	}
	
	public Boolean isdisplayedAdresseField() {
		return isDisplayed(address1field);
	}
	
	public Boolean isdisplayedCityField() {
		return isDisplayed(cityfield);
	}
	
	public Boolean isdisplayedStateField() {
		return isDisplayed(statefield);
	}
	
	public Boolean isdisplayedPostCodeField() {
		 return isDisplayed(postcodefield);
	}

}
