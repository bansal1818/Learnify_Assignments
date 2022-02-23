// Session2

1. Create a Deadlock class to demonstrate deadlock in multithreading environment.

package java.Assignments;

class A {

	public synchronized void V1(B b) {
		System.out.println("thread 1 satrts execution of d1() method");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("Thread 1 trying to call B's last()method");
		b.last();

	}

	public synchronized void last() {
		System.out.println("inside A's this is last() method");
	}

}

class B {

	public synchronized void V2(A a) {
		System.out.println("thread 2 satrts execution of d2() method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("Thread 2 trying to call A's last()method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B's this is last() method");
	}
}

public class SynchLock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.V1(b); 

	}

	public void run() {
		b.V2(a); 
	}

	public static void main(String[] args) {

		SynchLock sc = new SynchLock();
		sc.m1();
	}
}




//2. Implement wait, notify and notifyAll methods.

package java.Assignments;

class Demo2 {
	int n = 50;

	synchronized void withdraw(int n) {
		System.out.println("going to withdraw money");

		if (this.a < a) {
			System.out.println("LESS BALANCE ...WAITING FOR DEPOSITE");

			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			this.a -= a;
			System.out.println("withdrwa is completed");
		}
	}

	synchronized void deposite(int at) {
		System.out.println("going to deposite");
		this.a += a;
		System.out.println("deposite is completed");
		notify();
	}

}

public class BansalEx {

	public static void main(String[] args) {

		Demo2 d = new Demo2();

		new Thread() {

			public void run() {
				d.withdraw(600);
			}
		}.start();

		new Thread() {

			public void run() {
				d.deposite(200);
			}
		}.start();

	}
}



