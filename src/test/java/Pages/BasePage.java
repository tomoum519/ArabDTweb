package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver;
	
	public String page_url;
	
	public JavascriptExecutor js;

	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		//PageFactory.initElements(driver, this);
	}

	public void loadPage() {
		
		driver.get(page_url);
	}
	
	public String getPageUrl() {
		
		return page_url;
		
	}
	
	protected void clickElement(By element) {
		driver.findElement(element).click();
	}
	
	protected boolean isDisplayed(By element) {
		return driver.findElement(element).isDisplayed();
	}
	
	protected String getText(By element) {
		return driver.findElement(element).getText();
	}
	public void scrolldown() {
		js.executeScript("window.scrollBy(0,3550)", "");
	}

}
