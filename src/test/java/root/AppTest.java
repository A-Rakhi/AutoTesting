package root;

import org.testng.annotations.Test;

public class AppTest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        System.out.println("Hello TestNG");
//	}
	
	@Test (priority = 1)
	void test1() {
      System.out.println("Hello Test1");
      
	}	
	
	@Test (priority = 2)
	void test2() {
      System.out.println("Hello Test2");
      
	}
	
	@Test (priority = 3)
	void test3() {
      System.out.println("Hello Test3");
      
	}

}
