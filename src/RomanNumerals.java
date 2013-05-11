
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[2];
		arabicNumerals[0] = 1;
		arabicNumerals[1] = 5;
		
		
		specialArabicNumerals = new int[1];
		specialArabicNumerals[0] = 4;
		
		romanNumerals = new String[2];
		romanNumerals[0] = "I";
		romanNumerals[1] = "V";

		specialRomanNumerals = new String[1];
		specialRomanNumerals[0] = "IV";
		
	}
	
	public String toRoman(int num)
	{	
		String numberToRoman = "";
		for(int i = 0; i < arabicNumerals.length; i++)
		{
			while(num >= arabicNumerals[i])
			{
				numberToRoman += romanNumerals[i];
				num -= arabicNumerals[i];
			}
			if(num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}
		
		return numberToRoman;
	}
}
