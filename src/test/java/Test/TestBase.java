package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	
	

	@Parameters("browser")
	@BeforeMethod
	 public void setup(@Optional("chrome") String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	           // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
	            driver = new FirefoxDriver();
	            driver.manage().window().maximize();
	        }
	    }

//	@BeforeMethod
//	public void setup() {
//		//String chrome = System.getProperty("user.dir")+"\\Chrome_Driver\\ChromeDriver-104.exe";
//		//String chrome = System.getProperty("user.dir")+"\\Chrome_Driver\\chromedriver.exe";
//		//System.setProperty("webdriver.chrome.driver", chrome);
////		ChromeOptions options = new ChromeOptions();
////		options.addArguments("--remote-allow-origins=*");
//		//options.addArguments("--headless");
//		driver =  new ChromeDriver();
//		driver.manage().window().maximize();
//	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
}