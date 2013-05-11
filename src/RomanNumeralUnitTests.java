import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{
	private RomanNumerals arabicNumeral = new RomanNumerals();

	@Test
	public void if1to3Test() 
	{
		assertEquals("I", arabicNumeral.toRoman(1));
		assertEquals("II", arabicNumeral.toRoman(2));
		assertEquals("III", arabicNumeral.toRoman(3));
	}	
}
