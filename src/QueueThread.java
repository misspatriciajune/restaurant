public class QueueThread extends Thread{
	
	public void run(){
		System.out.println("Thread started");
		while(true){
			try{
				Thread.sleep(60000);		//wait for 60 seconds
				panel2.u.SizeOfCustomers +=11; 
			panel2.amount[8].setText(""+panel2.u.SizeOfCustomers); 
			System.out.println("Enqueue! Queue Size: "+panel2.u.SizeOfCustomers);
			}
			catch (InterruptedException e){}
		}
	}
}