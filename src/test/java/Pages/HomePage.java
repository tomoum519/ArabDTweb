package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	private By ThinkinginHTML_title = By.partialLinkText("Thinking in HTML");
	private By ThinkinginHTML_title1 = By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/h3");
	private By  ThinkinginHTML_price=By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/span[2]/ins/span");
	private By  ThinkinginHTML_pricecss=By.cssSelector("[data-product_id='163']");
	private By  menu=By.id("wpmenucartli");
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.page_url = "https://practice.automationtesting.in/";
		// TODO Auto-generated constructor stub
	}
	
	public String getThinkinginHTMLprice() {
		return getText(ThinkinginHTML_price);
	}
	
	public String getThinkinginHTMLtitle() {
		return getText(ThinkinginHTML_title1);
	}
	
	public void clickThinkinginHTMLaddbasket() {
		 clickElement(ThinkinginHTML_pricecss);
	}
	public void menu() {
		 clickElement(menu);
	}
	
	public Boolean isdisplayedThinkinginHTMLtitle() {
		return isDisplayed(ThinkinginHTML_title);
	}
	public Boolean isdisplayedThinkinginHTMLPrice() {
		 return isDisplayed(ThinkinginHTML_price);
	}
	
	
	

	

}
