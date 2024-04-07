package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
	
	private By  productname=By.cssSelector("[data-title='Product']");
	private By  productprice=By.cssSelector("[data-title='Price']");
	private By proccedtocheckout = By.className("checkout-button");

	public BasketPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getproductname() {
		return getText(productname);
	}
	
	public String getproductprice() {
		return getText(productprice);
	}
	
	public void clickproccedtocheckout() {
		 clickElement(proccedtocheckout);
	}

}
