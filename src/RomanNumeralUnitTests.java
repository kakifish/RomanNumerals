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
	public void if9To39Tests()
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

	@Test
	public void if40To49Tests()
	{
		assertEquals("XL",arabicNumeral.toRoman(40));
		assertEquals("XLI",arabicNumeral.toRoman(41));
		assertEquals("XLII",arabicNumeral.toRoman(42));
		assertEquals("XLIII",arabicNumeral.toRoman(43));
		assertEquals("XLIV",arabicNumeral.toRoman(44));
		assertEquals("XLV",arabicNumeral.toRoman(45));
		assertEquals("XLVI",arabicNumeral.toRoman(46));
		assertEquals("XLVII",arabicNumeral.toRoman(47));
		assertEquals("XLVIII",arabicNumeral.toRoman(48));
		assertEquals("XLIX",arabicNumeral.toRoman(49));
	}
	
	@Test
	public void if50To89Tests()
	{
		assertEquals("L",arabicNumeral.toRoman(50));
		assertEquals("LI",arabicNumeral.toRoman(51));
		assertEquals("LII",arabicNumeral.toRoman(52));
		assertEquals("LIII",arabicNumeral.toRoman(53));
		assertEquals("LIV",arabicNumeral.toRoman(54));
		assertEquals("LV",arabicNumeral.toRoman(55));
		assertEquals("LVI",arabicNumeral.toRoman(56));
		assertEquals("LVII",arabicNumeral.toRoman(57));
		assertEquals("LVIII",arabicNumeral.toRoman(58));
		assertEquals("LIX",arabicNumeral.toRoman(59));

		assertEquals("LX",arabicNumeral.toRoman(60));
		assertEquals("LXI",arabicNumeral.toRoman(61));
		assertEquals("LXII",arabicNumeral.toRoman(62));
		assertEquals("LXIII",arabicNumeral.toRoman(63));
		assertEquals("LXIV",arabicNumeral.toRoman(64));
		assertEquals("LXV",arabicNumeral.toRoman(65));
		assertEquals("LXVI",arabicNumeral.toRoman(66));
		assertEquals("LXVII",arabicNumeral.toRoman(67));
		assertEquals("LXVIII",arabicNumeral.toRoman(68));
		assertEquals("LXIX",arabicNumeral.toRoman(69));

		assertEquals("LXX",arabicNumeral.toRoman(70));
		assertEquals("LXXI",arabicNumeral.toRoman(71));
		assertEquals("LXXII",arabicNumeral.toRoman(72));
		assertEquals("LXXIII",arabicNumeral.toRoman(73));
		assertEquals("LXXIV",arabicNumeral.toRoman(74));
		assertEquals("LXXV",arabicNumeral.toRoman(75));
		assertEquals("LXXVI",arabicNumeral.toRoman(76));
		assertEquals("LXXVII",arabicNumeral.toRoman(77));
		assertEquals("LXXVIII",arabicNumeral.toRoman(78));
		assertEquals("LXXIX",arabicNumeral.toRoman(79));

		assertEquals("LXXX",arabicNumeral.toRoman(80));
		assertEquals("LXXXI",arabicNumeral.toRoman(81));
		assertEquals("LXXXII",arabicNumeral.toRoman(82));
		assertEquals("LXXXIII",arabicNumeral.toRoman(83));
		assertEquals("LXXXIV",arabicNumeral.toRoman(84));
		assertEquals("LXXXV",arabicNumeral.toRoman(85));
		assertEquals("LXXXVI",arabicNumeral.toRoman(86));
		assertEquals("LXXXVII",arabicNumeral.toRoman(87));
		assertEquals("LXXXVIII",arabicNumeral.toRoman(88));
		assertEquals("LXXXIX",arabicNumeral.toRoman(89));
	}

	@Test
	public void if90To190Tests()
	{

		assertEquals("XC",arabicNumeral.toRoman(90));
		assertEquals("XCI",arabicNumeral.toRoman(91));
		assertEquals("XCII",arabicNumeral.toRoman(92));
		assertEquals("XCIII",arabicNumeral.toRoman(93));
		assertEquals("XCIV",arabicNumeral.toRoman(94));
		assertEquals("XCV",arabicNumeral.toRoman(95));
		assertEquals("XCVI",arabicNumeral.toRoman(96));
		assertEquals("XCVII",arabicNumeral.toRoman(97));
		assertEquals("XCVIII",arabicNumeral.toRoman(98));
		assertEquals("XCIX",arabicNumeral.toRoman(99));
		assertEquals("C",arabicNumeral.toRoman(100));

		assertEquals("CXC",arabicNumeral.toRoman(190));
	}
	
	@Test
	public void if400to499Tests()
	{
		assertEquals("CD",arabicNumeral.toRoman(400));
		assertEquals("CDXLII",arabicNumeral.toRoman(442));
		assertEquals("CDXXXVII",arabicNumeral.toRoman(437));
		assertEquals("CDLXXXVIII",arabicNumeral.toRoman(488));
		assertEquals("CDLXXXIX",arabicNumeral.toRoman(489));
		assertEquals("CDXCI",arabicNumeral.toRoman(491));
		assertEquals("CDXCIX",arabicNumeral.toRoman(499));
		assertEquals("CDXCIV",arabicNumeral.toRoman(494));
	}
	
	@Test
	public void if500to890Test()
	{
		assertEquals("D",arabicNumeral.toRoman(500));
		assertEquals("DI",arabicNumeral.toRoman(501));
		assertEquals("DL",arabicNumeral.toRoman(550));
		assertEquals("DXXX",arabicNumeral.toRoman(530));
		assertEquals("DCCVII",arabicNumeral.toRoman(707));
		assertEquals("DCCCXC",arabicNumeral.toRoman(890));
	}


}
