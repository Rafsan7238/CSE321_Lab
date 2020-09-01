class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThreadfromRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Hello World");
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class ThreadTest {
	public static void main(String[] args) {
		
		MyThread my = new MyThread("Rafsan");
		Thread myThreadRunnable = new Thread(new MyThreadfromRunnable(), "Mamun");
		
		myThreadRunnable.run();
		my.start();
		
	}

}
