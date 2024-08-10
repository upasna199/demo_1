package collection;

class Bus implements Runnable{
	int avalable=1,pasenger;
	Bus (int passenger){
		this.pasenger=pasenger;
	}
	public synchronized void run() {
		String name=Thread.currentThread().getName();
		if(avalable>=pasenger) {
			System.out.println(name+"reversed seat");
		}
		else {
		System.out.println("sorry seat is not avalable");	
		}
	}

	class customer<thread>{
		public static void main(String[] args) {

		Bus a1=new Bus(1);
		
		
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a1);
		Thread t3=new Thread(a1);
		
		t1.setName("mahi");
		t2.setName("sona");
		t3.setName("ruhi");
		
		t1.start();
		t2.start();
		t3.start();

		
	}

//	public static void main(String[] args) {

	}

}
