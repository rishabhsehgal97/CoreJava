
package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	public String Department;
	
	public Employee() {
		
		System.out.println("Default Cons");
		
	}
	
	public Employee(String P1, int P2, String P3) { //Parameterized Constructor Created 
		
	//	Name = P1; //P1 is Parameter1
	//	EmpId=P2; //P2 is Parameter2
	//	Department = P3; //P3 is Parameter3

		this.Name = P1; //This.Name is Current Class
		this.EmpId=P2; 
		this.Department = P3; 
		
	}
	
	
	public void Display() { // method/function created
		
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Department);
	}

}
