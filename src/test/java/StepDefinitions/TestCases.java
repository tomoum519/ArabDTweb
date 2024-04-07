package StepDefinitions;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import Pages.BasketPage;
import Pages.CheckOutPage;
import Pages.HomePage;
import Test.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCases extends TestBase {
	
	public String bookname;
	public String price;
	
	HomePage homepage = new HomePage(driver);
	BasketPage basketpage = new BasketPage(driver);
	CheckOutPage checkout = new CheckOutPage(driver);
	@Given("open home page")
	public void login() {
		
		homepage.loadPage();
		
	}
	
	@Then("Asserting Thinking in HTML book exist along with its price")
	public void Checkbooktitle() {
		
		Assert.assertTrue(homepage.isdisplayedThinkinginHTMLtitle());
		bookname=homepage.getThinkinginHTMLtitle();
		Assert.assertTrue(homepage.isdisplayedThinkinginHTMLPrice());
		price=homepage.getThinkinginHTMLprice();
		Assert.assertEquals(price, "₹400.00");
	   
	}
	
	@Then("Clicking on Add to Basket for Thinking in HTML book")
	public void Checkbookprice() throws InterruptedException {
		
		
		//homepageobject.scrolldown();
		homepage.clickThinkinginHTMLaddbasket();
		Thread.sleep(1000);
	
	   
	}
	
	@When("Clicking on Shopping Cart")
	public void clickCart() throws InterruptedException {
		
		homepage.menu();
	
	}
	
	@Then("Asserting Item added to cart with its details")
	public void CheckItemAddedDetails() throws InterruptedException {
		
		Assert.assertEquals(basketpage.getproductname(), bookname);
		Assert.assertEquals(basketpage.getproductprice(),price);
	
	}
	
	@When("Clicking on Proceed to Checkout")
	public void clickCheckOut() throws InterruptedException {
		
		basketpage.clickproccedtocheckout();
	
	}
	
	@Then("Assert Billing Details form displayed")
	public void checkBillingDetails() throws InterruptedException {
		Assert.assertTrue(checkout.isdisplayedLastNameField());
		Assert.assertTrue(checkout.isdisplayedCompanyField());
		Assert.assertTrue(checkout.isdisplayedEmailField());
		Assert.assertTrue(checkout.isdisplayedPhoneField());
		Assert.assertTrue(checkout.isdisplayedCountrynameField());
		Assert.assertTrue(checkout.isdisplayedAdresseField());
		Assert.assertTrue(checkout.isdisplayedCityField());
		Assert.assertTrue(checkout.isdisplayedStateField());
		Assert.assertTrue(checkout.isdisplayedPostCodeField());
		
		
	
	}
	
	


}
