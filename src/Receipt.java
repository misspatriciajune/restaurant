import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Receipt {
	
	public Receipt() {
		
		try {
			PrintWriter out = new PrintWriter("Receipt.txt");
			out.println("*****************************************");
			out.println("                 RECEIPT!                ");
			out.println("*****************************************");
			out.println("Current Cash: " + panel2.u.getCurrentCash());
			out.println("Number of tables owned: " + panel2.u.getTablesOwnedCount());
			out.println("Number of current diners: " + panel2.u.getActiveSessionCount());
			out.println("Number of serving completed: " + panel2.u.getTotalServingsCompleted());
			out.println("Total maintenance cost: " + panel2.u.getTotalMaintainanceCost());
			out.println("Average earning per minute: " + panel2.u.computeAverageEarningsPerMinute());
			out.println("Sales per dish type");
			out.print(" Meat: " + Double.parseDouble(panel2.dish[0].getText()));
			out.print(" Fish: " + Double.parseDouble(panel2.dish[1].getText()));
			out.println(" Vegetables: " + Double.parseDouble(panel2.dish[2].getText()));
			out.println("Total kilograms sold per dish type");
			out.print(" Meat: " + Double.parseDouble(panel2.dish[3].getText()));
			out.print(" Fish: " + Double.parseDouble(panel2.dish[4].getText()));
			out.println(" Vegetables: " + Double.parseDouble(panel2.dish[5].getText()));
			out.println("Number of customers queued: " + panel2.u.getCustomersQueuedCount());
			out.println("*****************************************");
			out.close();
		} catch (FileNotFoundException e1) {
			System.out.println("Error: File does not exist.");
		}
	} 

}
