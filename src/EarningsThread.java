
public class EarningsThread extends Thread {
	
	boolean t = true;
	
	public void run(){

		while(t){
			try{
			Thread.sleep(60000);		//wait for 60 seconds
			
			panel2.u.totalMins = panel2.u.totalMins + 1;
			
			panel2.u.totalSales = (Double.parseDouble(panel2.dish[0].getText()) + Double.parseDouble(panel2.dish[1].getText()) + Double.parseDouble(panel2.dish[2].getText()) );
			
			panel2.amount[5].setText(""+panel2.u.computeAverageEarningsPerMinute());
			
			}
			
			catch (InterruptedException e){}
		}
	}


}
