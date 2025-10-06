package basic_programs;

import java.util.Scanner;

public class Loopingstmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("How many numbers?");
		
//		int count = sc.nextInt();
//		
//		int num = 1;
		// print n natural numbers
//		do
//		{
//			System.out.println(num);
//			num ++ ;
//		}while  (num <= count);
		
//------------------------------------------------------------
		
		
		// sum n natural numbers
//		int total = 0;
//		
//		do
//		{
//			total = total + num;
//			num ++ ;
//		}while  (num <= count);
//		
//		System.out.println("sum:" + total);
//		System.out.println("done");
//===============================================================================
		
		
		//WHILE LOOP
		
//		while  (num <= count)
//		{
//			System.out.println(num);
//			num ++ ;
//		}
		
	    // Sum of squares
//		int sum = 0;
//		
//		while  (num <= count)
//		{
//			sum = sum + (int) Math.pow(num, 2);
//
//			num ++ ;
//		}
//		
//		System.out.println("sum of squares : " + sum);
//		
		
		
		// ARMSTRONG NUMBER 
		
//		int num = 1;
//		int sum = 0;
//		while (num  %= 10 )
//		{
//			sum = sum + (int) Math.pow(num, num);
//			 num ++;
//			 
//		}
//		System.out.println("Armstrong Number : " + sum);
		
		System.out.println("Enter a number");
		
		String number = sc.nextLine();
		int length = number.length();
		int num = Integer.parseInt(number);
		int temp = num;
		int sum = 0;
//		while (num > 0)
//		{
//			int rem = num % 10;
//			sum =sum + (int)  Math.pow(rem, length);
//			num /= 10;
//		}
//		if (sum == temp)
//		{
//			System.out.println("Armstrong");
//		}
//		else
//		{
//			System.out.println("Not Armstrong");
//		}
		
		for (int i=1; i<=length; i++)
		{
			int rem = num % 10;
			sum =sum + (int)  Math.pow(rem, length);
			num /= 10;
		}
		if (sum == temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
