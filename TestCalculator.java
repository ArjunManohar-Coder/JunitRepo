package JUni;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator c=new Calculator();
	
	@Before
	public void show() {   //MUST BE VOID WITHOUT PARAMETER
		System.out.println("WELCOME");
		
		
	}
	
//	@Test
//	public void testAdd() {
//		System.out.println(c.add(10, 15));
//}
		
		@Test
		public void testsub() {
			System.out.println(c.sub(12, 7));
		}
		
		@Test
		public void testmul() {
			System.out.println(c.mul(12, 7));
		}
		
		@Test
		public void testdiv() {
			System.out.println(c.sub(12, 15));
		}
		
	
	
	@After
	public void show1() {
		System.out.println("Thankyou");
	}
	
	
	

}
