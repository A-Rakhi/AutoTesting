package root;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {

	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite");
	}
	@BeforeTest
	void b4Test() {
		System.out.println("b4 Test 2");
	}
	@AfterTest
	void afterTest() {
		System.out.println("Ater Test 2");
	}
	@BeforeClass
	void b4Class() {
		System.out.println("b4 class 2");
	}
	@AfterClass
	void aterClass() {
		System.out.println("After Class 2");
	}
	@BeforeMethod
	void preCondition() {
		System.out.println("Pre-Condition 2");
	}
	
	@AfterMethod
	void postCondition() {
		System.out.println("Post-Condition 2");
	}
	@Test(priority = 1)
	void homeLoanMobile() {
		System.out.println("	homeLoanMobile");
	}
	
	@Test(priority=2, groups = {"apps", "ui"})
	void homeLoanWeb() {
		System.out.println("	homeLoanWeb");
	}
	@Test(priority = 3, groups = {"window", "ui"})
	void homeLoanDesktop() {
		System.out.println("	homeLoanDesktop");

	}

}
