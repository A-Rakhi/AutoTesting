package root;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PersonalLoan {
	@BeforeSuite
	void b4Suite() {
		System.out.println("b4 Suite");
	}
	@BeforeTest
	void b4Test() {
		System.out.println("b4 Test 1");
	}
	@AfterTest
	void afterTest() {
		System.out.println("Ater Test 1");
	}
	@BeforeClass
	void b4Class() {
		System.out.println("b4 class 1");
	}
	@AfterClass
	void aterClass() {
		System.out.println("After Class 1");
	}
	
	@AfterMethod
	void postCondition() {
		System.out.println("Post-Condition 1");
	}
	@BeforeMethod
	void preCondition() {
		System.out.println("Pre-Condition 1");
	}

	@Test(priority = 1, groups = {"apps", "ui"})
	void personalLoanMobile() {
		System.out.println("	personalLoanMoble");
	}
	@Test
	void personalShortLoanMobile() {
		System.out.println("	personalShortLoanMobile");
	}
	
	@Test(priority=2, groups= {"ui"})
	void personalLoanWeb() {
		System.out.println("	personalLoanWeb");
	}
	@Test(priority = 3, groups= {"window", "ui"})
	void personalLoanDesktop() {
		System.out.println("	personalLoanDesktop");
	}
}