package JUni;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClassProgram {
	
	@Test
	public void tAssertEquals() {
	assertEquals(10,10);
		
	}
	
	@Test
	public void tAssertNotEquals() {
	assertNotEquals(10,156);
	}
	
	@Test
	public void tAssertNull() {
		assertNull(null,null);
	}
	
	@Test
	public void tAssertSame() {
		assertSame("yesh","yesh");
		
	}
	
	@Test
	public void tAssertTrue() {
		boolean a=10>2;
		assertTrue(a);
	}
	
	@Test
	public void tArray() {
		int[] a= {10,15,8};
		int b[]= {10,15,8};
		assertArrayEquals(a,b);
	}
	

}
