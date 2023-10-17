package listenTestNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ListenerTest {
	
	@Test
	void testSuccess() {
		System.out.println("Test success!! ");
		String actualResult = "A";
//		String expectedResult = "B";
		String expectedResult = "A";
		Assert.assertEquals(actualResult, expectedResult);
//		System.out.println(" After Test success.. ");
}
	@Test
	void testFailure() {
		System.out.println("Test Failure!!! ");
		String actualResult = "A";
		String expectedResult = "B";
		Assert.assertEquals(actualResult, expectedResult);
}	
	@Test
	void testSkipped() {
	System.out.println("Test Skipped.. ");
	throw new SkipException("testSkipped exception...");
	}
	
	

}
