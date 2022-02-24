//1. Working with Lambda & Lambda Block.

package java.Assignments;
import java.io.*;


interface If1 {

	
	boolean fun(int n);
}

class GFG {

	
	public static void main(String[] args)
	{
		
		If1 isEven = (n) -> (n % 2) == 0;

		if (isEven.fun(21))

			System.out.println("21 is even");
		else

               System.out.println("21 is odd");
	}
}




//2. Create a Runnable interface and apply lamda expression.

package java.Assignments;

public class RunnableLambdaTest {
   public static void main(String[] args) {
      Runnable r1 = new Runnable() {
         @Override
         public void run() { // anonymous class
            System.out.println("Runnable with Anonymous Class");
         }
      };
      Runnable r2 = () -> {   // lambda expression
         System.out.println("Runnable with Lambda Expression");
      };
      new Thread(r1).start();
      new Thread(r2).start();
   }
}



//3. Create a class SqureRoot apply lamdaexpreesions.

package com.tih.lambda;

@FunctionalInterface
interface PrintNumber{
	public void print(int num1);
}

public class PrintSquare {

	public static void main(String[] a) {
		PrintNumber p = n -> System.out.println("squareroot is: "+ Math.sqrt(n));
		p.print(5);
	}
}


//4. Create a class with addition method with parameters. 

public class Main {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }

  public static void main(String[] args) {
    myMethod("Vinay");
    myMethod("Shubham");
    myMethod("Uma");
  }
}


//5. Create a ArrayList class add values apply lamda expression.

package java.Assignments;

import java.util.*;

public class LambdaWithArrayListTest {
   public static void main(String args[]) {
      ArrayList<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student("Raja", 30));
      studentList.add(new Student("Adithya", 25));
      studentList.add(new Student("Jai", 20));
      studentList.removeIf(student -> (student.age <= 20)); // Lambda Expression
      System.out.println("The final list is: ");
      for(Student student : studentList) {
         System.out.println(student.name);
      }
   }
   private static class Student {
      private String name;
      private int age;
      public Student(String name, int age) {
         this.name = name;
         this.age = age;
      }
   }
}