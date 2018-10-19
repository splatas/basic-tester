package com.globant.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Calcular los numeros romanos del 1 al 3000.
 * @author sergio.platas
 *
 */
public class TDDTester {

	@Test
	public void testRomanCalculatorIsNotNull() {
		RomanCalculator calc = new RomanCalculator(); 
		assertNotNull(calc);
	}
	
	@Test
	public void testRomanCalculator_AcceptAnInteger() {
		Class[] cArg = new Class[1];
        cArg[0] = Integer.class;
		try {
			assertNotNull(RomanCalculator.class.getMethod("calculate", cArg));
		} catch (Exception e) {
			fail("Method 'calculate(Integer)' doesn't exist");
		}
	}
	
	@Test
	public void testRomanCalculator_TestOne() {
		Integer decimal = new Integer(1);
		RomanCalculator calc = new RomanCalculator();
		assertEquals("I", calc.calculate(decimal));
	}
	
	@Test
	public void testRomanCalculator_TestTwo() {
		Integer decimal = new Integer(2);
		RomanCalculator calc = new RomanCalculator();
		assertEquals("II", calc.calculate(decimal));
	}
	
	@Test
	public void testRomanCalculator_TestThree() {
		Integer decimal = new Integer(3);
		RomanCalculator calc = new RomanCalculator();
		assertEquals("III", calc.calculate(decimal));
	}
	
	@Test
	public void testRomanCalculator_TestFour() {
		Integer decimal = new Integer(4);
		RomanCalculator calc = new RomanCalculator();
		//assertEquals("I", calc.calculate(decimal));
	}
}
