import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddition {

	@Test
	public void testAddition() {
		int a=10,b=2;
		//int c=a+b;
		int c=ArithmeticUtil.add(a, b);
		assertEquals(12, c);
	}
	

//	@Test
	public void testSubtraction() {
		int a=10,b=2;
		int c=a-b;
		
		assertEquals(8, c);
	}

}
