package Test;

import code.RpnCalculator;
import junit.framework.TestCase;

public class CalcTest extends TestCase 
{
	RpnCalculator instance = new RpnCalculator();
	
	public void testFirstExample()
	{
		String arr="2 3 *";
		
		assertEquals("6.0", instance.calculate(arr));
	} 	
	
	public void testSecondExample()
	{
		String arr= "4 5 9 8 + - /";
		
		assertEquals("-0.33333334", instance.calculate(arr));
	}
	public void testThirdExample()
	{
		String arr= "2 5 ^";
		
		assertEquals("32.0", instance.calculate(arr));
	}
	
	public void testFourthExample()
	{
		String arr= "1000 %";
		
		assertEquals("10.0", instance.calculate(arr));
	}
	
	public void testfifthExample()
	{
		String arr= "5 1000 % +";
		
		assertEquals("15.0", instance.calculate(arr));
	}
	
	public void testsixthExample()
	{
		String arr= "5 1000 %";
		
		assertEquals("error: more operands", instance.calculate(arr));
	}
	
	public void testseventhExample()
	{
		String arr= "5 1000 % + -";
		
		assertEquals("error: more operators", instance.calculate(arr));
	}
	
	public void testeigthExample()
	{
		String arr= " ";
		
		assertEquals("error: no input", instance.calculate(arr));
	}
	public void testninthExample()
	{
		String arr= "1 0 / ";
		
		assertEquals("error:divided by zero", instance.calculate(arr));
	}
	
}
