package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TI_tripDates extends basePage {

	
		public TI_tripDates(WebDriver driver) {
			super(driver);
			}
	
  public void dates(  String startDt,
  String startMon ,
  String startYr,
  String endDt,
  String endMon,
  String endYr) throws InterruptedException{
	  

	 //For Start Date
	  List<WebElement> l2 = driver.findElements(By.xpath("//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-formControl']"));
	  l2.get(0).click();
	
	 //MONTH YEAR

	  while(true)
	 	{
	 		String monYr1=driver.findElement(By.xpath("//h6")).getText();
	 	
	 		if(monYr1.contains(startMon) && monYr1.contains(startYr))
	 		{
	 			break;
	 		}
	 		else
	 		{
	 			List<WebElement> next1 = driver.findElements(By.xpath("//*[@data-mui-test='next-arrow-button']"));
	 			next1.get(1).click();
	 		}
	 				
	 	}

	 	//Date
	  
	 	List<WebElement> allDates1=driver.findElements(By.xpath("//*[@class='MuiPickersDay-dayLabel']"));

	 	for(WebElement dt:allDates1)
	 	{
	 		if(dt.getText().equals(startDt))
	 		{
	 			dt.click();
	 			break;
	 		}
	 	}
	 	
		Thread.sleep(2000);
	  // For End Date
	 	

	 	//MONTH YEAR

	 	 while(true)
	 		{
	 		 String monYr2=driver.findElement(By.xpath("//h6")).getText();
	 		
	 			
	 			if(monYr2.contains(endMon) && monYr2.contains(endYr))
	 			{
	 				break;
	 			}
	 			else
	 			{
	 				List<WebElement> next2 = driver.findElements(By.xpath("//*[@data-mui-test='next-arrow-button']"));
	 				next2.get(1).click();
	 			}
	 					
	 		}

	 		//Date
	 	 

	 		
	 	 List<WebElement> allDates2=driver.findElements(By.xpath("//*[@class='MuiPickersDay-dayLabel']"));

	 		for(WebElement dt:allDates2)
	 		{
	 			if(dt.getText().equals(endDt))
	 			{
	 				dt.click();
	 				break;
	 			}
	 		}

	 	 
	 	 driver.findElement(By.tagName("button")).click(); 
  }
}
