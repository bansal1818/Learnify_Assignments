//1. Take predicate functional interface test given value even number or not.


package java.Assignments;

import java.util.function.Predicate;

public class NumberChecker
{
   public static void main(String[] args)
   {
      Predicate checker = number -> number % 2 == 0;

      System.out.println("Is even? " + checker.test(2));
      System.out.println("Is even ? " + checker.test(8));
   }
}



//2. Take predicate functional interface test length of the given name is greater than 6 or not?


package java.Assignments;

import java.util.function.Predicate;

public class StringChecker
{
   public static void main(String[] args)
   {

       String[] s= {"Vinay","Bansal","Shubham","Indian"};
	
	Predicate<String> p1=a->a.length()>5;
	
	for(String s1:s) 
	{
		
	if(p1.test(s1));
	System.out.println(p1.test(s1));
	}
  }

}


//3. Create a employee class with ArrayList class add key value pair name,salary, findout salary>7000?

package java.Assignments;

import java.util.ArrayList;

class Employee
{
	int eno;
      String ename;
	
	public Employee(int eno,String ename) {
		this.eno=eno;
            this.ename=ename;
	}



      public String toString() 
      {
          return eno+""+ename;
       }
}

 public class Test 
   {
        public static void main(String[] args) { 



         ArrayList<Employee> ar = new ArrayList<Employee> ();


         ar.add(new Employee (123,"raghu")); 
         ar.add(new Employee(124, "sweety"));

         ar.add(new Employee (125,"uma"));

         ar.add(new Employee(126, "anmol"));



         System.out.println(ar);
 

         Collections.sort(ar, (e1,e2) -> (el.eno>e2.eno)?-1:(el.eno>e2.eno)?1:0); 
         System.out.println(ar);
  }
}