
public class RomanNumerals 
{
	private int arabicNumerals[];
	private int specialArabicNumerals[];
	private String romanNumerals[];
	private String specialRomanNumerals[];

	public RomanNumerals()
	{
		arabicNumerals = new int[7];
		arabicNumerals[0] = 1000;		
		arabicNumerals[1] = 500;		
		arabicNumerals[2] = 100;
		arabicNumerals[3] = 50;
		arabicNumerals[4] = 10;
		arabicNumerals[5] = 5;
		arabicNumerals[6] = 1;
		
		specialArabicNumerals = new int[6];
		specialArabicNumerals[0] = 900;		
		specialArabicNumerals[1] = 400;		
		specialArabicNumerals[2] = 90;		
		specialArabicNumerals[3] = 40;		
		specialArabicNumerals[4] = 9;
		specialArabicNumerals[5] = 4;
		
		romanNumerals = new String[7];
		romanNumerals[0] = "M";
		romanNumerals[1] = "D";
		romanNumerals[2] = "C";
		romanNumerals[3] = "L";
		romanNumerals[4] = "X";
		romanNumerals[5] = "V";
		romanNumerals[6] = "I";

		specialRomanNumerals = new String[6];
		specialRomanNumerals[0] = "CM";
		specialRomanNumerals[1] = "CD";
		specialRomanNumerals[2] = "XC";
		specialRomanNumerals[3] = "XL";
		specialRomanNumerals[4] = "IX";
		specialRomanNumerals[5] = "IV";

		
		
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
			if(i != 6 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}	
		return numberToRoman;
	}
}
