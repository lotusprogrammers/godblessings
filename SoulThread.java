//SoulThread.java
class LearningThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Learning...");
		}
	}
}
class SearchingThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Searching...");
		}
	}
}	
class StrugglingThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Struggling...");
		}
	}
}
class EarningThread extends Thread{
	public void run(){
		while(true){
			System.out.println("Earning...");
		}
	}
}
class SoulThread{
	public static void main(String[] args){
		System.out.println("With the blessings of Sri Kuppa Narasimha Sharma Garu");
		System.out.println("Soul Thread always Chants...");
		LearningThread lt=new LearningThread();
		SearchingThread set=new SearchingThread();
		StrugglingThread stt=new StrugglingThread();
		EarningThread et=new EarningThread();
		lt.start();
		set.start();
		stt.start();
		et.start();
		System.out.println("Soul Thread always Chants...");
		while(true){
			System.out.println("KESHAVA...");
			System.out.println("MADHAVA...");
			System.out.println("GOVINDA...");
		}
		try{
			lt.join();set.join();stt.join();et.join();
		}catch(InterruptedException e){e.printStackTrace();}
	}
}	
		
		
	

