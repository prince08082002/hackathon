package PageObject;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.screenshot;


public class CI_details extends basePage {

	public CI_details(WebDriver driver)
	{
		super(driver);
	}
	public boolean details(String name, String email, String mNo) throws IOException{
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("//*[contains(text(),'Click here')]")).click();
		driver.findElement(By.xpath("//*[starts-with(text(),'Mumbai')]")).click();
		driver.findElement(By.xpath("//*[text()='MH43']")).click();        
		driver.findElement(By.xpath("//*[text()='VOLKSWAGEN']/parent::span|//*[text()='VOLKSWAGEN']")).click();
		driver.findElement(By.xpath("//*[text()='POLO GT']/parent::span|//li[text()='POLO GT']")).click();
		driver.findElement(By.xpath("//*[text()='Diesel']")).click();
		driver.findElement(By.xpath("//*[text()='1.6 TDI HIGHLINE DIESEL (1598 cc)']")).click();
		driver.findElement(By.xpath("//input[@id='name']|//input[@placeholder='Full name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='email']|//input[@placeholder='Your email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='mobileNo']|//input[@placeholder='Mobile number']")).sendKeys(mNo);
		WebElement error = driver.findElement(By.xpath("//div[contains(@class,'msg-error show')]|//div[contains(@class,'errorMsg')]"));

		System.out.println("!!!!----CAR INSURANCE ERROR MESSAGE----!!!!");
		System.out.println(error.getText());


		screenshot sc = new screenshot(driver);
		sc.ss("Error message");
		return error.isDisplayed();
	}

}