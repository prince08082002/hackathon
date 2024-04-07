package TestCase;


import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.TI_contactDetails;
import PageObject.TI_destination;
import PageObject.TI_finalPlan;
import PageObject.TI_medicalHistory;
import PageObject.TI_travellersAge;
import PageObject.TI_tripDates;
import baseClass.BaseClass;

public class Test_TravelInsurance extends BaseClass{

	@Test(groups={"Smoke","Regression"})
	public void travel() throws InterruptedException, IOException {

		FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties" );
		Properties properties = new Properties();
		properties.load(fileReader);


		HomePage h = new HomePage(driver);
		h.clickTravel();

		Thread.sleep(5000);

		TI_destination ti = new TI_destination(driver);
		ti.country();

		Thread.sleep(5000);

		TI_tripDates td = new TI_tripDates(driver);
		td.dates(properties.getProperty("startDt"),
				properties.getProperty("startMon"),
				properties.getProperty("startYr"),
				properties.getProperty("endDt"),
				properties.getProperty("endMon"),
				properties.getProperty("endYr"));
		Thread.sleep(5000);

		TI_travellersAge ta = new TI_travellersAge(driver);
		ta.ages( properties.getProperty("age1"), properties.getProperty("age2"));

		Thread.sleep(5000);

		TI_medicalHistory mh = new TI_medicalHistory(driver);
		mh.med();

		Thread.sleep(5000);

		TI_contactDetails cd =  new TI_contactDetails(driver);
		cd.mob(properties.getProperty("mNo"));

		Thread.sleep(5000);

		TI_finalPlan fp = new TI_finalPlan(driver);
		boolean res = fp.plan();
		
		assertTrue(res);

	}
}