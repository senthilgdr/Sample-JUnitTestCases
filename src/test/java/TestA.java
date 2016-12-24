import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestA {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("SetUpBeforeClass Method is Call");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass Method is Call");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetUp Method is Call");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down Method is Call");
	}

	@Test
	public void testAddition() {
		System.out.println("TestAddition Method is Call");
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
