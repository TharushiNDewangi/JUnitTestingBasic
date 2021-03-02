import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CalculationTest {
	Calculation calculation = new Calculation();
	//Calculation calculation1 = new Calculation();
	

	//@SuppressWarnings("deprecation")
	@Test
	public void testAddition() {
		int result = calculation.addition(2,5);
		int expectedtotal=7;
		//System.out.println("@test addition" + result +"="+expectedtotal);
		assertEquals(result,expectedtotal);
	}

	@Test
	public void testSubtraction() {
		//fail("Not yet implemented");
		int result = calculation.subtraction(5,2);
		int expectedtotal=3;
		//System.out.println("@test addition" + result +"="+expectedtotal);
		assertEquals(result,expectedtotal);
	}

}
