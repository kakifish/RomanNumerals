
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[6];
		arabicNumerals[0] = 500;		
		arabicNumerals[1] = 100;
		arabicNumerals[2] = 50;
		arabicNumerals[3] = 10;
		arabicNumerals[4] = 5;
		arabicNumerals[5] = 1;
		
		
		specialArabicNumerals = new int[5];
		specialArabicNumerals[0] = 400;		
		specialArabicNumerals[1] = 90;		
		specialArabicNumerals[2] = 40;		
		specialArabicNumerals[3] = 9;
		specialArabicNumerals[4] = 4;
		
		romanNumerals = new String[6];
		romanNumerals[0] = "D";
		romanNumerals[1] = "C";
		romanNumerals[2] = "L";
		romanNumerals[3] = "X";
		romanNumerals[4] = "V";
		romanNumerals[5] = "I";

		specialRomanNumerals = new String[5];
		specialRomanNumerals[0] = "CD";
		specialRomanNumerals[1] = "XC";
		specialRomanNumerals[2] = "XL";
		specialRomanNumerals[3] = "IX";
		specialRomanNumerals[4] = "IV";

		
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
			if(i != 5 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}	
		return numberToRoman;
	}
}
