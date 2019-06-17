package com.bean;

public class Bean extends Thread {
	
	 public void run()
	{
		 synchronized(this) {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(600);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		 }
	}

}
