/**
 * 
 */
package medinfi_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * @author avanthika
 *
 */
public class Testit {
	 @Test
	  public void count_display() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/avanthika/Downloads/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  String baseUrl = "http://www.medinfi.com/";

	      driver.get(baseUrl);

	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	      //select city New Delhi
	      driver.findElement(By.id("city-locality1")).sendKeys("New Delhi");
	      Thread.sleep(3000);
          driver.findElement(By.id("city-locality1")).clear();
	      driver.findElement(By.id("city-locality1")).sendKeys("Mumbai");
	      Thread.sleep(3000);
          driver.findElement(By.id("city-locality1")).clear();
	      driver.findElement(By.id("city-locality1")).sendKeys("Hyderabad");
	      Thread.sleep(3000);
	      driver.findElement(By.id("city-locality1")).clear();
	      driver.findElement(By.id("city-locality1")).sendKeys("Bang");
	      driver.findElement(By.linkText("Bengaluru")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("ip1_text")).sendKeys("shai");
	      Thread.sleep(3000);
	      driver.findElement(By.partialLinkText("General Medicine")).click();
	      driver.navigate().back();
	      driver.navigate().refresh();
	      Thread.sleep(3000);
	      driver.findElement(By.id("ip1_text")).sendKeys("shai");
	      Thread.sleep(3000);
	      driver.findElement(By.partialLinkText("General Physician")).click();
	      driver.navigate().back();
	      driver.navigate().refresh();
	      Thread.sleep(3000);
	      driver.findElement(By.id("ip1_text")).sendKeys("shai");
	      Thread.sleep(3000);
	      driver.findElement(By.partialLinkText("Shailaja, Pediatrician")).click();
	      driver.navigate().back();
	      Thread.sleep(3000);
	      driver.close();
	      //now click on Doctor tab
//	      driver.findElement(By.id("doctorTab")).click();
//	      Thread.sleep(3000);
//	      driver.findElement(By.id("ip1_text")).click();
//	      
//	      




	 }
	 
}
	      
	      
	      
	      
	      
//	      WebElement mySelectElement = driver.findElement(By.id("ip1_text"));
//	      Select dropdown= new Select(mySelectElement);
//	      dropdown.selectByVisibleText("");
//	      WebElement option = dropdown.getFirstSelectedOption();


	      
//		  Select oSelect = new Select(driver.findElement(By.id("ip1_text")));
//		  oSelect.selectByIndex(0); 


//	      WebElement element = driver.findElement((By.id("ip1_text")));
//	      Select oSelect = new Select(element);
	     
//	      Select dropdown = new Select(driver.findElement(By.id("ip1_text")));
//	      select.selectByPartOfVisibleText("General Medicine") 
	     
//	      driver.findElement(By.id("resRow2")).getAttribute(2


	      

	      
//	      driver.findElement(By.partialLinkText("Bengaluru")).click();
//	      driver.findElements(By.id(“city-locality1”)).get(2).click();
//	      driver.findElement(By.xpath("//a[contains(text(), 'Sample Questionnaire')]"))

//	     
