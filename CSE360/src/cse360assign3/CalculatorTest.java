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

	/**
	 * Testing for calculator object creation. 
	 * Looking to see it not return Null. 
	 */
	@Test
	public void testCalculator() {
		Calculator myCalculator = new Calculator();
		assert (myCalculator) != null; 
	}
	
	/**
	 * Testing getTotal method: Using instances of add, subtract, multiply and divide. 
	 */
	@Test
	public void testGetTotal(){
		Calculator myCalculator = new Calculator();
		int result = myCalculator.getTotal();
		assertEquals(0,result);
		
		myCalculator.add(5);
		myCalculator.subtract(1); 
		myCalculator.multiply(2);
		myCalculator.divide(2);
		result = myCalculator.getTotal();
		
		assertEquals(4, result);
		
	}
	
	/**
	 * Testing add method: Adding numbers to total.
	 */
	@Test
	public void testAdd(){
		Calculator myCalculator = new Calculator();
		myCalculator.add(5);
		int result = myCalculator.getTotal();
		assertEquals(5,result);
	}
	
	/**
	 * Testing subtract method: Adding numbers to total and then subtracting them.
	 */
	@Test
	public void testSubtract(){
		Calculator myCalculator = new Calculator();
		myCalculator.add(10);
		myCalculator.subtract(2);
		int result = myCalculator.getTotal();
		
		assertEquals(8,result);
	}
	
	/**
	 * Testing multiply method: Adding numbers to total and multiplying it.
	 */
	@Test
	public void testMultiply(){
		Calculator myCalculator = new Calculator();
		myCalculator.add(10);
		myCalculator.multiply(2);
		int result = myCalculator.getTotal();
		
		assertEquals(20,result);
	}
	
	/**
	 * Testing divide method: Adding numbers to total and dividing it.
	 * Also testing divison by 0. 
	 */
	@Test
	public void testDivide(){
		Calculator myCalculator = new Calculator();
		myCalculator.add(10);
		myCalculator.divide(2);
		int result = myCalculator.getTotal();
		
		assertEquals(5,result);
		
		//Testing for dividing by zero to return zero.
		myCalculator.divide(0);
		result = myCalculator.getTotal();
		assertEquals(0,result);
	}

	/**
	 * Testing getHistory method: testing instances of adding, subtracting, multiplying and dividing.
	 * Looking to see return string matches getHistory method. 
	 */
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
