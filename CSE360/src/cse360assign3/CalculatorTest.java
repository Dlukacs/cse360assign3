/**
 * David Lukacs
 * Pin# 518
 * CSE 360
 * Assignment 3
 * J-Unit testing
 * 
 * 
 * @author David Lukacs
 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assert (cal) != null; 
	}
	
	@Test
	public void testGetTotal(){
		Calculator cal = new Calculator();
		int result = cal.getTotal();
		assertEquals(0,result);
	}
	
	@Test
	public void testAdd(){
		Calculator cal = new Calculator();
		cal.add(5);
		int result = cal.getTotal();
		assertEquals(5,result);
	}
	
	@Test
	public void testSubtract(){
		Calculator cal = new Calculator();
		cal.add(10);
		cal.subtract(2);
		int result = cal.getTotal();
		
		assertEquals(8,result);
	}

	@Test
	public void testMultiply(){
		Calculator cal = new Calculator();
		cal.add(10);
		cal.multiply(2);
		int result = cal.getTotal();
		
		assertEquals(20,result);
	}
	
	@Test
	public void testDivide(){
		Calculator cal = new Calculator();
		cal.add(10);
		cal.divide(2);
		int result = cal.getTotal();
		
		assertEquals(5,result);
		
		//Testing for dividing by zero to return zero.
		cal.divide(0);
		result = cal.getTotal();
		assertEquals(0,result);
	}

	@Test
	public void testGetHistory(){
		Calculator myCalculator = new Calculator();  
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		
		assertEquals("0 + 4 - 2 * 2 + 5", myCalculator.getHistory());
	}
}
