package collection;

public class Bus1 implements Runnable{
//	package Dem0;

	//class Bus implements Runnable {

		int available=1;
		int passenger;
		Bus1(int passenger)
		{
			this.passenger=passenger;
		}
		public synchronized void run()
		{
			String name= Thread.currentThread().getName();
			if(available>=passenger)
			{
				System.out.println(name+"Revrsersed Thread");
				available=available-passenger;
			}
			else
			{
				System.out.println("Seat is not available");
			}
		}
	}
		class Customer
		{
			public static void main(String[] args)
			{
				Bus r= new Bus(1);
				Thread t1= new Thread(r);
				
				Thread t2= new Thread(r);
				Thread t3= new Thread(r);
				
				t1.setName("Seema");
				t2.setName("Deepak");
				t3.setName("Rohit");
				t1.start();
				t2.start();
				t3.start();
				
				
			}
			
		}


