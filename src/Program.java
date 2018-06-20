import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program extends JFrame{
	
	static panel2 right;
	
	static panel1 left;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//PANELS
		left = new panel1();
		panel3 top = new panel3();
		right = new panel2();
		
		//THREADS
		QueueThread q = new QueueThread();
		q.start();
		
		MaintenanceThread m = new MaintenanceThread();
		m.start();
		
		EarningsThread e = new EarningsThread();
		e.start();
	
		//FRAME
		JFrame screen = new JFrame();
		JPanel bottom = new JPanel();
		JPanel all = new JPanel();
		
		//HOUSEKEEPINGS
		top.setPreferredSize(new Dimension(1000,130));
		bottom.setPreferredSize(new Dimension(1000,670));
		all.setPreferredSize(new Dimension(1000, 800));
		
		all.setBackground(Color.red);
		bottom.setBackground(Color.red);
		top.setBackground(Color.red);
		left.setBackground(Color.yellow);
		right.setBackground(Color.yellow);
		
		bottom.add(left);
		bottom.add(right);
		
		all.add(top);
		all.add(bottom);
		
		screen.add(all);
		screen.setSize(900, 600);
		screen.setLocationRelativeTo(null);
		screen.setVisible(true);
		screen.setResizable(false);
		screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//CONDITION TO CHECK IF GAME'S OVER
		if(panel2.u.getCurrentCash() < 0){
			System.out.println("GAME OVER!!!");
			System.exit(0);
		}
		
	}
}
