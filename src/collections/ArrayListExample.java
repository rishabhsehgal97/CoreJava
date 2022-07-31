package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {


	//	String[] array1 = {"abc","pqr","xyz","iygiu","uukhs"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Leena");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurence");
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		list1.remove(1);
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		System.out.println("The Data at 4th positon is " + list1.get(3));
		
		list1.set(0, "James");
		
		System.out.println("List is this after Replacing John : " + list1);
		
		list1.add(1, "Leeana");
		System.out.println("List is this after adding Leeana again : " + list1);
		System.out.println("Size of Array List is " + list1.size());
		
		Collections.sort(list1);

		System.out.println("List is this after Sort " + list1);
		
	//	Collections.reverse(list1);

	//	System.out.println("List is this in Decending Sort " + list1);
		
		for (int index=0; index<list1.size(); index++) 
		{
			System.out.println(list1.get(index));
		}
		
		for(String name:list1) {
			System.out.println(name);
}
		
		for(int index=0;index<list1.size();index++) 
		{
			
			if(list1.get(index).equals("Priyanka"))
			{
				
	            System.out.println("Index for Priyanka is " + index);
	            break;
	        
			}

		
	}

}
}
