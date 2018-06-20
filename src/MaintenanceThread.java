/*This class is the thread for the maintenance*/

public class MaintenanceThread extends Thread {
	
	double money; //Variable for money
	
	boolean t = true;
	
	public void run(){

		while(t){
			try{
			Thread.sleep(1000);		//wait for 1 second
					
			money = Double.parseDouble(panel2.amount[0].getText());
			panel2.u.currentCash = money;
			panel2.u.setCurrentCash("maintenance", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			panel2.u.setTotalMaintenance();
			panel2.amount[4].setText(""+panel2.u.getTotalMaintainanceCost());
			
			}
			
			catch (InterruptedException e){}
		}
	}

}
