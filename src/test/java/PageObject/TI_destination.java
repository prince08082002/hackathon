package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TI_destination extends basePage{
	
	
		public TI_destination(WebDriver driver) {
			super(driver);
			}
	
     public void country() throws InterruptedException{
	 
	List<WebElement> l1 = driver.findElements(By.xpath(" //*[@class='countryButton']"));
	 for(WebElement we : l1 ) {

	 	if(we.getText().equalsIgnoreCase("United Kingdom")) {
	 		we.click();
	 		break;
	 	}
	   }
		Thread.sleep(2000);
	 driver.findElement(By.tagName("button")).click();
	
}
}
