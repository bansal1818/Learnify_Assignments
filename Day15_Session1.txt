//1. Create a Thread by extending the Thread class.

package multithreading;

class MyThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("This is  child thread");
		}
	}	
}
public class A1 {
public static void main(String[] args) 
{ 
	
	MyThread m= new MyThread();
	
	
	m.start();
	
	for (int i = 0; i <10; i++) {
		
		System.out.println("This is main thread");
		
	}
	
}
}


//2. Create a Thread by Implements the Runnable Interface.
package multithreading;



class MyRunnnable implements Runnable
{
	
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("rama thread");
		}
	}
}

public class A2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread();
		A2 m1=new A2();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("seeth thread");
		}
	}
	

}



// 3.Create a Thread by extending Thread class set and get the name of thread.

package multithreading;

class Demo extends Thread{
	public void run() {
		
		System.out.println("child before"+Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class A3 {
	public static void main(String[] args) 
	{ 
		
		Demo d= new Demo();
		Demo d1= new Demo();
		
		d.start();
		d1.start();
		
		d.setName("Vinay");
			
		System.out.println("main thread before"+Thread.currentThread().getName()); //main
		
		Thread.currentThread().setName("Vinay");
		System.out.println(Thread.currentThread().getName());
	}

}



// 4. Create a Thread by extending Thread class set and get the priority of thread.

package multithreading;

class V1 extends Thread{
	
	public void run() {
		System.out.println("I'm child");
		System.out.println("child thread :"+Thread.currentThread().getPriority());
	}
}
public class A4 {
public static void main(String[] args) {
	V1 v= new V1();
	v.setPriority(5);
	v.start();
	
	System.out.println("I'm main");
	System.out.println("main thread :"+Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(3);
	System.out.println(Thread.currentThread().getPriority());
	
}
}



// 5. Create a Thread by extending Thread class apply Yield Method.

package multithreading;


class V2 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			
			Thread.yield();
		}
	}
}
public class A5 {
public static void main(String[] args) {
	
	V2 v= new V2();
	v.start();
	
	for (int i = 0; i < 10; i++) {
		System.out.println("I'm main thread"); 
	}
}
}



// 6. Create a Thread by extending Thread class apply join Method.

package multithreading;

class V3 extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I'm Child thread"); 
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
public class A6 {
public static void main(String[] args) throws InterruptedException {
	
	V3 v= new V3();
	
	v.start();
	v.join(10000);
	
	for (int i = 0; i < 10; i++) {
		System.out.println("I'm main thread"); 
		
		Thread.yield();
	}
}
}



// 7.Create a Thread by extending Thread class apply sleep Method.
package multithreading;

public class A7 {
public static void main(String[] args) {
	
	
	for (int i = 0; i < 10; i++) {
		System.out.println("slide show :"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
}



