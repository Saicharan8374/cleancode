package com.epam.interest;


public class TestInterest {

	
	public void testSimpleInterest() {
		Calculate c = new Calculate();
		c.simpleInterest(10000, 3, 2);
		c.simpleInterest(15000, 1.5, 2.5);
		c.simpleInterest(100000, 1.5, 1.25);
	}
	
	
	public void testCompoundInterest() {
		Calculate c = new Calculate();
		c.compoundInterest(10090, 3, 2);
		c.compoundInterest(55000, 1.25, 1.5);
		c.compoundInterest(100000, 1.5, 1.25);
	}
}

		