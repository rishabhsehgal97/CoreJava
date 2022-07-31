package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 20;

		int sum = num1 + num2;
		int mul = num1 * num2;
		float div =(float) num1 / num2; // Explicit Conversion

	//	System.out.println(sum);
		
		System.out.println("Sum of two number is " + sum);
		System.out.println("Mul of two number is " + mul);
		System.out.println("Div of two number is " + div);
		
		String str1 = "Clean World Green World";
		System.out.println(str1);
		
		char ch1 = str1.charAt(0);
		System.out.println(ch1);
		System.out.println("The lenght of this string is " + str1.length());
		
		char chn = str1.charAt(str1.length() -1);
		System.out.println("The last character is " + chn);
		
		System.out.println("The String in uppercase is " + str1.toUpperCase());

		System.out.println("The String in lowercase is " + str1.toLowerCase());
		
	}

}
