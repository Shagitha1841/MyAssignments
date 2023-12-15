package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int  num = 34243;
		int  temp = 0 ;
		
		for (int i = num; i != 0; i /=10)
		{
			int m = i % 10;
			temp = temp * 10 + m;
		}
		
		if(num==temp)
		{
			System.out.println( num +" The Given Number is Palindrome!");
		}
		else {
			
			System.out.println(num + " The Given Number is not  Palindrome!");
			
		}
	}
	}