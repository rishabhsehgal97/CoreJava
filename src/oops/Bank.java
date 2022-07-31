package oops;

public class Bank {
	
	public int AccountNum;
	
	public void DisplayBalance() {
		
		System.out.println("Inside Account Balance");
	}
	
	public int GetBalance() {
		return 1000;  //Because we used int while creating method That is why we used return
	}
	
	public void CloseAccount(int AccountNum) {
		
		System.out.println("Inside Bank Close Account");
	}
	

}
