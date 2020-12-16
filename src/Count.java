import java.util.ArrayList;

public class Count 
{
	private static ArrayList<String> theCharacters = new ArrayList<String>;
	
	public static int countOccurrences(ArrayList<String> thecharacters)
	{
		String str;
		int len = str.length(); 
        int[] count;
		for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1;  
        char result = ' '; 
       
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
       
        return result; 
    } 
      
    public static void main(String[] args) 
    { 
        String str = "Sample string"; 
        System.out.println("Max occurring character is " + 
                            countOccurrences(str)); 
    } 
	}
}
