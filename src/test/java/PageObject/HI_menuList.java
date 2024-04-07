package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HI_menuList extends basePage {
	
	public HI_menuList(WebDriver driver) {
		super(driver);
		}
	public boolean menuList() {
		List<WebElement> l1 = driver.findElements(By.xpath("//ul/li[2]//div[3]//li"));
		System.out.println("!!!!----HEALTH INSURANCE MENU LIST----!!!!");
		for(WebElement we : l1) {
		System.out.println(we.getText());
		
	}
		boolean res = false ;
		if(l1.size()==12) {
			res = true;
		}
		return res;

	}
}