import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel2 extends JPanel implements ActionListener{
	
	JPanel white = new JPanel();
	JLabel [] text = new JLabel[9];
	String [] info = {"Current cash:", "Number of tables owned:", 
			"Number of current diners:", "Total number of servings completed:",
			"Total cost paid for maintenance:", "Average earnings per minute:",		
			"Sales for each dish type:", "Total kilograms sold for each dish type:",
			"Number of customers queued:"};
	static JTextField[] amount = new JTextField[9];
	static JTextField[] dish = new JTextField[6];
	JPanel [] line = new JPanel[18];
	JButton quit;
	Font texts;
	
	static Updates u = new Updates();
	
	public panel2(){
		
		texts = new Font("Serif", Font.BOLD, 25);
		//QUIT BUTTON
		quit = new JButton("QUIT");
		quit.setPreferredSize(new Dimension(100, 35));
		quit.setForeground(Color.white);
		quit.setBackground(Color.red);
		quit.setFont(texts);
		quit.addActionListener(this);
		
		for(int i=0; i<6;i++){
			dish[i] = new JTextField(8);
			dish[i].setEditable(false);
			dish[i].setPreferredSize(new Dimension(54,18));
		}
		
		
		
		//initializes texts
		for(int i = 0; i<9; i++){
			text[i] = new JLabel(info[i]);
			amount[i] = new JTextField();
			text[i].setForeground(Color.black);
			text[i].setFont(new Font("Arial", Font.BOLD, 10));
			//text[i].setHorizontalAlignment(JLabel.LEFT);
			
			//Current Cash
				if(i == 0){
			amount[i].setText(""+u.getCurrentCash());
			
				}
			//Number of tables owned
				if(i==1){
					amount[i].setText(""+u.getTablesOwnedCount());
				}
			//Number of Current Dinners
				if(i == 2){
					amount[i].setText(""+u.getActiveSessionCount());
				}
			//Total number of servings completed
				if(i == 3){
					amount[i].setText(""+u.getTotalServingsCompleted());
				}
			//Total Cost paid for maintenance
				if(i == 4){
					amount[i].setText(""+u.getTotalMaintainanceCost());
				}
			//Average earnings per minute
				if(i == 5){
					amount[i].setText("0");
				}
			//Sales for each dish type
				if(i == 6){
					dish[0].setText(""+u.totalSalesMeat);
					dish[1].setText(""+u.totalSalesFish);
					dish[2].setText(""+u.totalSalesVeggies);
				}
			//Total kilograms sold for each dish type
				if(i == 7){
					dish[3].setText(""+u.totalKilogramSoldMeat);
					dish[4].setText(""+u.totalKilogramSoldFish);
					dish[5].setText(""+u.totalKilogramSoldVeggies);
				}
			//Number of customers queued
				if(i == 8){
					amount[i].setText(""+u.getCustomersQueuedCount());
				}

			
			amount[i].setEditable(false);
			amount[i].setPreferredSize(new Dimension(120,18));

		}
		
		//line
		for(int i = 0; i<18; i++){
			line[i] = new JPanel();
			line[i].setBackground(Color.white);
			line[i].setVisible(true);
		}
		
			line[0].add(text[0]);
			line[1].add(amount[0]);
				amount[0].setPreferredSize(new Dimension(192,18));
			line[2].add(text[1]);	
			line[3].add(amount[1]);
				amount[1].setPreferredSize(new Dimension(137,18));
			line[4].add(text[2]);
			line[5].add(amount[2]);
				amount[2].setPreferredSize(new Dimension(128,18));
			line[6].add(text[3]);
			line[7].add(amount[3]);
				amount[3].setPreferredSize(new Dimension(80,18));
			line[8].add(text[4]);
			line[9].add(amount[4]);
				amount[4].setPreferredSize(new Dimension(104,18));
			line[10].add(text[5]);	
			line[11].add(amount[5]);
				amount[5].setPreferredSize(new Dimension(114,18));
			line[12].add(text[6]);	
			line[13].add(dish[0]);
			line[13].add(dish[1]);
			line[13].add(dish[2]);
				//amount[6].setPreferredSize(new Dimension(138,18));
			line[14].add(text[7]);
			line[15].add(dish[3]);
			line[15].add(dish[4]);
			line[15].add(dish[5]);
				//amount[7].setPreferredSize(new Dimension(70,18));
			line[16].add(text[8]);
			line[17].add(amount[8]);
				amount[8].setPreferredSize(new Dimension(115,18));
		for(int i = 0; i<18; i++){
			white.add(line[i]);
		}
		white.add(quit);
		white.setBackground(Color.white);
		white.setPreferredSize(new Dimension(300, 390));
		white.setVisible(true);
		this.add(white);
		
		
	}

	//ACTIONLISTENER OF QUIT BUTTON
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == quit){
			Receipt r = new Receipt();
			System.exit(0); //Exits program
		}
		
	}


	
}
