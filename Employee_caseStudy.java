client.java



package casestudy;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		int empId=101;
		
		while(true)
		{
			System.out.println("Employee Management Application");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee Data");
			System.out.println("3. Get Employee Data");
			System.out.println("4. Get all Employee Data");
			System.out.println("5. Delete Employee");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("\nEnter Employee Details:");
				System.out.println("Enter Employee Name:");
				String empName=sc.next();
				
				System.out.println("Enter Employee Department:");
				String empDept=sc.next();
				System.out.println("Enter Employee Salary:");
				int empSal=sc.nextInt();
				
				Employee e1=new Employee(empName,empDept,empSal);
				emp.put(++empId, e1);
				
				System.out.println("Employee Added Successfully:"+empId);
				
				break;
				
			case 2:
				System.out.println("\nEnter to update the Employee Details:");
				int empId1=sc.nextInt();
				
				System.out.println("Enter Employee Name:");
				String empName1=sc.next();
				
				System.out.println("Enter Employee Department:");
				String empDept1=sc.next();
				System.out.println("Enter Employee Salary:");
				int empSal1=sc.nextInt();
				
				Employee e2=new Employee(empName1,empDept1,empSal1);
				
				emp.put(empId1, e2);
				
				System.out.println("Employee Updated Successfully:"+empId1);
				break;
				
				
			case 3:
		    	   System.out.println("Enter id to get the Employee details");
		    	      int empId2=sc.nextInt();
		 
		    	      Employee e3=emp.get(empId2);
		    	      System.out.println(e3);
		    	      
					break;
		       case 4:
		    	   Set<Entry<Integer,Employee>> result=emp.entrySet();
		    	   Iterator<Entry<Integer,Employee>> itr=result.iterator();
		    	   
		    	   while(itr.hasNext()) {
		    		   Entry<Integer,Employee> finalResult=itr.next();
		    		   
		    		   System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
		    		   
		    	   }
					break;
					
		       case 5:
		    	   
		    	   System.out.println("Enter id to delete product");
		    	   int empId3= sc.nextInt();
		    	   
		    	   Employee ob1=emp.remove(empId3);
		    	   System.out.println("product deleted :"+empId3);
					
					break;
				
				
				default:
					System.out.println("wrong selection.....");
				
			}
		
	}

}
}


Employee.java




package casestudy;

public class Employee {

	private String empName;
	private String empDept;
	private int empSal;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	
	public Employee()
	{
		
	}
	
	public Employee(String empName,String empDept,int empSal)
	{
		this.empName=empName;
		
		this.empDept=empDept;
		this.empSal=empSal;
		
		}
	
	public String toString()
	{
		return "Employee [empName=" + empName+",empDept="+empDept+",empSal="+empSal+ "]";
		
	}
}


