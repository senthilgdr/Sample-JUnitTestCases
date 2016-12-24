import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSub {

	ArithmeticUtil arg=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("SetUp Method is Call");
		arg=new ArithmeticUtil();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down Method is Call");
		arg=null;
	}

	@Test
	public void testAddition() {
		System.out.println("TestAddition Method Call");
		int a=10,b=2;
		//int c=a+b;
		int c=ArithmeticUtil.add(a, b);
		assertEquals(12, c);
	}
	

	@Test
	public void testSubtraction() {
		System.out.println("TestSubtraction Method is Call");
		int a=10,b=2;
		int c=a-b;
		
		assertEquals(8, c);
	}

}
