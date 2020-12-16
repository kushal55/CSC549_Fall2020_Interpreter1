
public class Rotate13 
{
	public static String encryption(String message, String shift)
	{
		String Cipher = "";
		char letter = 0;
		if(letter != ' ')
		{
			String[] dict1;
			String num = ( dict1[letter] + shift );
			String[] dict2;
			Cipher += dict2[num]; 
		}
		else
		{
			Cipher += ' ';
		}
		return Cipher;
	}
	
	public static char decryption(String message, String shift)
	{
		char decipher = ' ';
		char letter = 0;
		if(letter != ' ')
		{
			int num = ( dict1[letter] - shift + 26);
			char[] dict2;
			decipher += dict2[num];
		}
		else
		{
			decipher += ' ';
		}
		return decipher;
		 
	}
}
