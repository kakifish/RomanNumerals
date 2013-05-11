import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{
	private RomanNumerals arabicNumeral = new RomanNumerals();

	@Test
	public void if1to3Tests() 
	{
		assertEquals("I", arabicNumeral.toRoman(1));
		assertEquals("II", arabicNumeral.toRoman(2));
		assertEquals("III", arabicNumeral.toRoman(3));
	}
	
	@Test
	public void if4Test()
	{
		assertEquals("IV", arabicNumeral.toRoman(4));
		assertEquals("V", arabicNumeral.toRoman(5));
		assertEquals("VI", arabicNumeral.toRoman(6));
		assertEquals("VII", arabicNumeral.toRoman(7));
		assertEquals("VIII", arabicNumeral.toRoman(8));
	}
}
