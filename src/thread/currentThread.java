package thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class currentThread extends Thread{
	
	public void printNum (String text )
	{
		LocalTime time = LocalTime.now();
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String timeFormatted = time.format(timeFormat);
	    
		for(int i=0 ; i<10 ;i++)
		{
			System.out.println("Round " + i + " : " + text + " at " + timeFormatted );
		}
	}
	
	public void run()
	{
		// Get current thread
		Thread currThread = Thread.currentThread();
				
		printNum(currThread.getName());
	}
}
