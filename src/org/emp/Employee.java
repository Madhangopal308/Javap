package org.emp;

public class Employee {
	private void empId()
	{
		System.out.println("empId is :54321");
	}
    private void empName()
    {
    	System.out.println("empName is : AAAAA");
    }
    private void empDob()
    {
    	System.out.println("empDob is : 01-11-1991");
    }
    private void empPhone()
    {
    	System.out.println("empPhone no is : 9864433323");
    	
     
}
public static void main(String []args)
{
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	
}

}
