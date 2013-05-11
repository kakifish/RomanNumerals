import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{
	private RomanNumerals arabicNumeral = new RomanNumerals();

	@Test
	public void if1To3Tests() 
	{
		assertEquals("I", arabicNumeral.toRoman(1));
		assertEquals("II", arabicNumeral.toRoman(2));
		assertEquals("III", arabicNumeral.toRoman(3));
	}
	
	@Test
	public void if4To8Tests()
	{
		assertEquals("IV", arabicNumeral.toRoman(4));
		assertEquals("V", arabicNumeral.toRoman(5));
		assertEquals("VI", arabicNumeral.toRoman(6));
		assertEquals("VII", arabicNumeral.toRoman(7));
		assertEquals("VIII", arabicNumeral.toRoman(8));
	}
	
	@Test
	public void if9to39Tests()
	{
		assertEquals("IX",arabicNumeral.toRoman(9));
		assertEquals("X",arabicNumeral.toRoman(10));
		assertEquals("XI",arabicNumeral.toRoman(11));
		assertEquals("XII",arabicNumeral.toRoman(12));
		assertEquals("XIII",arabicNumeral.toRoman(13));
		assertEquals("XIV",arabicNumeral.toRoman(14));
		assertEquals("XV",arabicNumeral.toRoman(15));
		assertEquals("XVI",arabicNumeral.toRoman(16));
		assertEquals("XVII",arabicNumeral.toRoman(17));
		assertEquals("XVIII",arabicNumeral.toRoman(18));
		assertEquals("XIX",arabicNumeral.toRoman(19));
		assertEquals("XX",arabicNumeral.toRoman(20));
		assertEquals("XXI",arabicNumeral.toRoman(21));
		assertEquals("XXII",arabicNumeral.toRoman(22));
		assertEquals("XXIII",arabicNumeral.toRoman(23));
		assertEquals("XXIV",arabicNumeral.toRoman(24));
		assertEquals("XXV",arabicNumeral.toRoman(25));
		assertEquals("XXVI",arabicNumeral.toRoman(26));
		assertEquals("XXVII",arabicNumeral.toRoman(27));
		assertEquals("XXVIII",arabicNumeral.toRoman(28));
		assertEquals("XXIX",arabicNumeral.toRoman(29));
		assertEquals("XXX",arabicNumeral.toRoman(30));
		assertEquals("XXXI",arabicNumeral.toRoman(31));
		assertEquals("XXXII",arabicNumeral.toRoman(32));
		assertEquals("XXXIII",arabicNumeral.toRoman(33));
		assertEquals("XXXIV",arabicNumeral.toRoman(34));
		assertEquals("XXXV",arabicNumeral.toRoman(35));
		assertEquals("XXXVI",arabicNumeral.toRoman(36));
		assertEquals("XXXVII",arabicNumeral.toRoman(37));
		assertEquals("XXXVIII",arabicNumeral.toRoman(38));
		assertEquals("XXXIX",arabicNumeral.toRoman(39));
	}

}
