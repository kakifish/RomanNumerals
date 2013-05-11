
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[5];
		arabicNumerals[0] = 100;
		arabicNumerals[1] = 50;
		arabicNumerals[2] = 10;
		arabicNumerals[3] = 5;
		arabicNumerals[4] = 1;
		
		
		specialArabicNumerals = new int[4];
		specialArabicNumerals[0] = 90;		
		specialArabicNumerals[1] = 40;		
		specialArabicNumerals[2] = 9;
		specialArabicNumerals[3] = 4;
		
		romanNumerals = new String[5];
		romanNumerals[0] = "C";
		romanNumerals[1] = "L";
		romanNumerals[2] = "X";
		romanNumerals[3] = "V";
		romanNumerals[4] = "I";

		specialRomanNumerals = new String[4];
		specialRomanNumerals[0] = "XC";
		specialRomanNumerals[1] = "XL";
		specialRomanNumerals[2] = "IX";
		specialRomanNumerals[3] = "IV";

		
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
			if(i != 4 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}	
		return numberToRoman;
	}
}
