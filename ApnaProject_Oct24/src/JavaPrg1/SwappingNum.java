package JavaPrg1;

public class SwappingNum {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		
		System.out.println("Before swapping a="+a +" and b="+b);
		
//		a=a+b;//5  (Logic-1)
//		b=a-b;//2
//		a=a-b;//3
		
//		a=a*b;//6  (Logic-2)
//		b=a/b;//2
//		a=a/b;//3
		
		
//		b=a+b-(a=b);  (Logic-3)
		
		int temp=a;   //(Logic-4, Logic-5 XOR Operator>>CharAT^)
		 a=b;
		 b=temp;
		
		System.out.println("After swapping a="+a +" and b="+b);
		
		
		
		
		

	}

}
