package JavaPrg1;

public class ReverseNum1 {

	public static void main(String[] args) {
		int num1=121;
		
		int revnum=0;
		
		int temp=num1;
		
		while(num1>0)
		{
			int r=num1%10;
			revnum=revnum*10+r;
			num1=num1/10;
			
		}
		
		System.out.println(revnum);
		
		if(revnum==temp)
		{
			System.out.println("Palindrom Number");
		}
		else
		{
			System.out.println("Not a Palindrom Number");
		}

	}

}
