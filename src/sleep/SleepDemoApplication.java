package sleep;

public class SleepDemoApplication {

	public static void main(String[] args) {

		// Create object of Runnable
		Runnable statement1 = new SleepDemo();
		Runnable statement2 = new SleepDemo();
		Runnable statement3 = new SleepDemo();
		
		// Create object of Thread
		Thread word1 = new Thread (statement1, "word1");
		Thread word2 = new Thread (statement2, "word2");		
		Thread text  = new Thread (statement3, "text");
		
		word1.start();
		
		text.start();
		word2.start();
	}
}
