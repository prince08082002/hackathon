package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TI_contactDetails extends basePage {
	
	public TI_contactDetails(WebDriver driver) {
		super(driver);
		}

public void mob(String mNo) throws InterruptedException{

	 
	WebElement we = driver.findElement(By.id("mobileNumber"));
	
			we.sendKeys(mNo); 
	Thread.sleep(3000);
	 driver.findElement(By.tagName("button")).click(); 
}
}
