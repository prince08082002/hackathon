package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TI_medicalHistory extends basePage{
	
	public TI_medicalHistory(WebDriver driver) {
		super(driver);
		}

public void med() throws InterruptedException{
	 driver.findElement(By.id("ped_no")).click();
		Thread.sleep(5000);
	// driver.findElement(By.tagName("button")).click(); 
}
} 
