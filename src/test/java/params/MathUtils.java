package params;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MathUtils {

	@Test
	@Parameters({"num1", "num2"})
	public void addition(int a, int b) {
		int result = a + b;
		System.out.println("Addition:" + result);

	}

	@Test (dataProvider = "dataSet")
//	@Parameters({"a", "b"})
	
	public void subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Subtraction:" + result);

	}
	
	@DataProvider(name ="dataSet")
	Object[][] getDataSet()
	{
		Object [][] data = { { 10, 7}, { 8, 4} 
	 };
		return data;
	}

}
