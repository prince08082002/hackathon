package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends basePage{

	WebElement travel,health,car;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clickCar()
	{
		car=driver.findElement(By.cssSelector("div[class='prd-block car']"));
		car.click();
	}
	
	public void clickTravel()
	{
		travel= driver.findElement(By.xpath("//section/div[7]"));
		travel.click();
	}
	public void hoverHealth()
	{
		Actions act=new Actions(driver);
	health = driver.findElement(By.xpath("//*[contains(text(),'Insurance Products ')]"));
	act.moveToElement(health).build().perform();
	}
}
