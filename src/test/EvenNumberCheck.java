package test;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num = 33;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		
		int num = scanner.nextInt();
		
		if (num % 2 == 0)
		{
		System.out.println("The number is Even");
		}
		
		else 
		{
		System.out.println("The number is Odd");	
		}
		
		
		
		

	}

}
