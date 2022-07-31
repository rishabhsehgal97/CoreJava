package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		
		while (num <=10)
		{
			
			if (num == 6) {
				num = num + 2;
				continue; 
			//	break;
			}
			
			System.out.println(num);
			num = num +2;
		//	num = num + 1;
		//	num ++;
		//	num = num + 2; // odd number will print

		//	num = num + 1; // even number will print
	
			
			
			
			
		//	System.out.println(num);
		}
		
		
// ---- FOR LOOP---------
		for(int index=1; index<=10; index++) {
			
			if (index == 6) {
				continue;
			}
			System.out.println(index);
			
		}
		int[] array1 = {10,20,30,40,50};
		
		for(int num1 : array1) {
			System.out.println(num1);
		}
		for (int index=0; index<array1.length; index++)
		{
			System.out.println(array1[index]);
		}

	}

}
