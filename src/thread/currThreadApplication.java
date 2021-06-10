package thread;

public class currThreadApplication {

	public static void main(String[] args) {
		
		// Create objects of thread
		Thread thread1 = new currentThread();
		Thread thread2 = new currentThread();

		// Named the thread
		thread1.setName("Word1");
		thread2.setName("Word2");
		
		// Execute threads
		thread1.start();
		thread2.start();
	}
}
