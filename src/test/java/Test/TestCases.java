package Test;

import org.testng.annotations.Test;

import Pages.HomePage;

public class TestCases extends TestBase {
	
	@Test
	public void help() throws InterruptedException {
		
		
		
		HomePage homepageobject = new HomePage(driver);
		homepageobject.loadPage();

		
		
		
		
		//driver.findElement(By.partialLinkText("Owner Registration")).click();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.switchTo().frame("frame1");
//		driver.findElement(By.id("j_idt44")).click();
//		driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
//		driver.findElement(By.id("nameEn")).sendKeys("jerrjhgjy");
//
//		driver.findElement(By.id("blackListSearchFocusIdAr")).click();
//		
////		driver.findElement(By.id("j_idt44")).click();
////		driver.findElement(By.id("j_idt44")).sendKeys("EGYPT");
//		Thread.sleep(5000);
//	//	WebElement ele =  driver.findElement(By.id("j_idt60"));
//	//	act.doubleClick(ele).perform();
//		driver.findElement(By.id("j_idt60")).click();
////		
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click()", ele);
//		
//		Thread.sleep(5000);
//		String errormsg = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/span")).getText();
//		System.out.println(errormsg);
//		Assert.assertEquals("Owner Already Exist", errormsg);
	}
	


}
