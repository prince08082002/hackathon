package TestCase;


import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import PageObject.CI_details;
import PageObject.HomePage;
import baseClass.BaseClass;

public class Test_CarInsurance extends BaseClass {

	@Test(groups={"Smoke","Regression"})
	public void car() throws IOException {

		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		Properties properties = new Properties();
		properties.load(fileReader);

		HomePage h = new HomePage(driver);
		h.clickCar();

		CI_details ci = new CI_details(driver);

		boolean res =ci.details(properties.getProperty("name"),properties.getProperty("email"),properties.getProperty("mNo"));
		assertTrue(res);
	}

}

