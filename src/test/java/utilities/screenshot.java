package utilities;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

	WebDriver driver;
	public screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	public String ss(String name) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd hh.mm.ss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\ScreenShots\\"+name+" " +timeStamp+".png";
		File targetLocation = new File(path);
		FileUtils.copyFile(file, targetLocation);
		return path;
	}
}
