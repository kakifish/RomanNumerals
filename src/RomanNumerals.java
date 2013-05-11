
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[4];
		arabicNumerals[0] = 50;
		arabicNumerals[1] = 10;
		arabicNumerals[2] = 5;
		arabicNumerals[3] = 1;
		
		
		specialArabicNumerals = new int[2];
		specialArabicNumerals[0] = 9;
		specialArabicNumerals[1] = 4;
		
		romanNumerals = new String[4];
		romanNumerals[0] = "L";
		romanNumerals[1] = "X";
		romanNumerals[2] = "V";
		romanNumerals[3] = "I";

		specialRomanNumerals = new String[2];
		specialRomanNumerals[0] = "IX";
		specialRomanNumerals[1] = "IV";

		
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
			if(i != 2 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}	
		return numberToRoman;
	}
}
