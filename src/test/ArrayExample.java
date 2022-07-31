package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] array1 = {10,20,30,40,50};
		
		System.out.println("Total number are " + array1.length);
		System.out.println("Second number is " + array1[1]);
		System.out.println("Last number is " + array1[4]);
		System.out.println("Last number is " + array1[array1.length -1]);
		
		String[] array2 = {"abc","pqr","xyz"};
		System.out.println("");
		
		// {"Clean","World","Green","World"};		
		String str1 = "Clean World Green World";
		
		String[] array3 = str1.split(" ");
		
		System.out.println("The first word is " + array3[0]);
		System.out.println("Last word is " + array3[array3.length -1]);
		

	}

}
