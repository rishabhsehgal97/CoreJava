
package oops;

public class RunnerClass {

	public static void main(String[] args) {

		
		Employee E1 = new Employee(); /* syntax of creating new Object 
									employee = Class Name ; E1 = Object Name */ 
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display(); // Method/function Call
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display(); // Method/function Call
		
		Bank B = new Bank();
		B.DisplayBalance();
		
		int Bal = B.GetBalance();
		
		System.out.println("The Bance is " + Bal);
		System.out.println("The Bance is " + B.GetBalance());
		
		BOABank B1 = new BOABank();
		
		B1.CCBalance();
		B1.DisplayBalance();
		System.out.println("Calling through Child Class " + B.GetBalance());
		
		//OverLoading Example 

		OverLoadingExample obj = new OverLoadingExample();
		 
		int RecArea = obj.GetArea(3, 4);
		int SqArea = obj.GetArea(4);
		float SqAreaF = obj.GetArea(4);
		
		System.out.println(RecArea);
		
		//Overriding Example 
		
		B1.CloseAccount(123456);
		B1.CloseAccount(123456);
		
		Chrome Ch = new Chrome();
		
		Ch.OpenBrowser();
		Ch.Show();
		
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
	
		//Encapsulation Example
		EncapsulationExample En = new EncapsulationExample();
		
		En.setBalance(3000);
		System.out.println("Balance is " + En.getBalance());
		
		

	}

}
