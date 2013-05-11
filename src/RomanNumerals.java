
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[2];
		arabicNumerals[0] = 5;
		arabicNumerals[1] = 1;
		
		
		specialArabicNumerals = new int[1];
		specialArabicNumerals[0] = 4;
		
		romanNumerals = new String[2];
		romanNumerals[0] = "V";
		romanNumerals[1] = "I";

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
			if(i != 1 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}
		
		return numberToRoman;
	}
}
