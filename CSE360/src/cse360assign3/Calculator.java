/**
 * David Lukacs
 * Pin #518
 * CSE 360
 * Assignment 3
 * 
 * @author David Lukacs
 * 
 */

package cse360assign3;

public class Calculator {
	
	private int total;
	
	/**
	 * Calculator constructor: 
	 */
	public Calculator () {
	//	total = 0;  // not needed - included for clarity
	}
	

	/**
	 * getTotal method: Returning correct total sum.
	 * @return Returns total value. 
	 */
	public int getTotal () {
		Calculator cal = new Calculator();
		return total;
	}
	
	/**
	 * add method: adds value.
	 * @param value
	 */
	public void add (int value) {
		Calculator cal = new Calculator();
		total = total + value; 
	}
	
	/**
	 * subtract method: subtracts parameter from total value. 
	 * @param value
	 */
	public void subtract (int value) {
		Calculator cal = new Calculator();
		int sub = value;
		total =  total - sub;
	}
	
	/**
	 * multiply method: multiplies total value by parameter value. 
	 * @param value
	 */
	public void multiply (int value) {
		Calculator cal = new Calculator();
		int multiply = value;
		total =  total * multiply;
	}
	
	
	/**
	 * divide method: divides total value by parameter value. 
	 * Use integer division.  If the parameter is zero, set the total to zero.  
	 * Do not print an error message.
	 * 
	 * @param value
	 */
	public void divide (int value) {
		Calculator cal = new Calculator();
		int divide = value;
		
		//Conditional if dividing by zero. 
		//Setting total value to zero.
		if(value == 0)
			total = 0;
		
		else
			total =  total / divide;

	}
	
	/**
	 * getHistory method: returns an empty string.
	 */
	public String getHistory () {
		return "";
	}
}
