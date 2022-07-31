package test;

public class StringOccurance {

	public static void main(String[] args) {
		String string = "Clean World Green World";
		String word = "World";
		String temp[] = string.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) 
		{
		if (word.equals(temp[i]))
		count++;
		}
		System.out.println("The string is: " + string);
		System.out.println("The word " + word + " occurs " + count + " times in the above string");
		}
		}