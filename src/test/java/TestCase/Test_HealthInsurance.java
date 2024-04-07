package TestCase;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import PageObject.HI_menuList;
import PageObject.HomePage;
import baseClass.BaseClass;

public class Test_HealthInsurance extends BaseClass{

	@Test(groups={"Smoke","Regression"})
	public void health() {

		HomePage h = new HomePage(driver);
		h.hoverHealth();

		HI_menuList hi = new HI_menuList(driver);
		boolean res = hi.menuList();
		assertTrue(res);


	}
}

