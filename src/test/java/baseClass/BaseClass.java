package baseClass;


import java.io.FileReader;
import java.io.IOException;

import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;



	
	
	@BeforeClass(groups={"Smoke"})
	@Parameters({"browser"})
	public void setup(String br) throws IOException 
	{
		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		Properties properties = new Properties();
		properties.load(fileReader);
		
		switch(br.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		default: System.out.println("No matching browser..");
		 return;
		}
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(properties.getProperty("URL"));
		
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups={"Smoke"})
	public void tearDown() throws InterruptedException 
	{
		
		driver.quit();
	}


}

