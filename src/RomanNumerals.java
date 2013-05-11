
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
		
		
		specialArabicNumerals = new int[3];
		specialArabicNumerals[0] = 40;		
		specialArabicNumerals[1] = 9;
		specialArabicNumerals[2] = 4;
		
		romanNumerals = new String[4];
		romanNumerals[0] = "L";
		romanNumerals[1] = "X";
		romanNumerals[2] = "V";
		romanNumerals[3] = "I";

		specialRomanNumerals = new String[3];
		specialRomanNumerals[0] = "XL";
		specialRomanNumerals[1] = "IX";
		specialRomanNumerals[2] = "IV";

		
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
			if(i != 3 && num >= specialArabicNumerals[i])
			{
				numberToRoman += specialRomanNumerals[i];
				num -= specialArabicNumerals[i];
			}
		}	
		return numberToRoman;
	}
}
