class MyThread1 extends Thread{
	
	public MyThread1(String name) { //change thread name
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			yield(); //pause the thread if there is some other thread with more priority/shorter execution time 
			System.out.println("This output is from " + getName() + ": " + i);
			try {
				sleep(1000); //pause execution
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest2 {
	public static void main(String[] args) {
		
		MyThread1 my1 = new MyThread1("Rafsan1");
		MyThread1 my2 = new MyThread1("Rafsan2");
		MyThread1 my3 = new MyThread1("Rafsan3");
		MyThread1 my4 = new MyThread1("Rafsan4");
		
		my4.setPriority(Thread.MAX_PRIORITY); //works if limited resources, i.e. if single core CPU
		my2.setPriority(Thread.MIN_PRIORITY);

		System.out.println(my1.getState()); //thread state
		
		my1.start();
		my2.start();
		my3.start();
		my4.start();
		
		
		try {
			my1.join(); //finish the job before proceeding to the following code
			my2.join();
			my3.join();
			my4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(!my2.isAlive()) { //check if thread is alive or dead
			System.out.println(my2.getName() + " is Dead!!!");
		}
		
		System.out.println("All threads are done!!!");
		
	}

}
