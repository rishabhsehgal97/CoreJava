package oops;

public class BOABank extends Bank{ //Inheritance where BOA is child and Bank is Parent
								   //extend keyword is for Single Inheritance	
	public int CreditCardNum;
	
	public void CCBalance() {
		System.out.println("Inside CC Balance");
		this.CreditCardNum = 1000; //This Refer to Current Class
		super.AccountNum = 123456; //Super Refer to Parent Class 
	}
	
public void CloseAccount(int CCNumber) {
		
		System.out.println("Inside Bank Close Account");
	}
	
	
}
