package JavaPrg1;

public class ReverseString {

	public static void main(String[] args) {
		String str1="Madam";
		
		String RevString="";
		
		int len=str1.length();
		
		String temp=str1;
		
		
		System.out.println(len);
		
		for(int i=len-1;i>=0;i--)
		{
			RevString=RevString+str1.charAt(i);
			
		}
		
		System.out.println(RevString);
			
		if(RevString.equalsIgnoreCase(temp))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom....!");
		}
	}

}
