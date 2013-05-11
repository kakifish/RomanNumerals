
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[1];
		arabicNumerals[0] = 1;
		
		specialArabicNumerals = new int[1];
		specialArabicNumerals[0] = 4;
		
		romanNumerals = new String[1];
		romanNumerals[0] = "I";

		specialRomanNumerals = new String[1];
		specialRomanNumerals[0] = "IV";
	}
	
	public String toRoman(int num)
	{	
		String numberToRoman = "";
		while(num >= arabicNumerals[0])
		{
			numberToRoman += romanNumerals[0];
			num --;
			if(num >= specialArabicNumerals[0])
			{
				numberToRoman += specialRomanNumerals[0];
				num--;
			}
		}
		
		return numberToRoman;
	}
}
