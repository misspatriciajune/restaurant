import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class menuPanel extends JFrame implements ActionListener {
	
	JPanel menuu;
	JPanel [] line = new JPanel[3];
	
	JButton meat;
	JButton fish;
	JButton veg;
	JButton okay;
	JButton add;
	
	JLabel bg;
	JLabel bottom;
	
	ImageIcon pork;
	ImageIcon fishy;
	ImageIcon veggie;
	ImageIcon porky;
	ImageIcon fishyy;
	ImageIcon veggiey;
	ImageIcon menuPic;
	ImageIcon bot;
	
	Font texts;
	
	int markf = 0, markm = 0, markv = 0;
	
	int tableNumber;

	public menuPanel(int tableNumber){
		
		this.tableNumber = tableNumber;
		
		pork = new ImageIcon("meat.jpg");
		fishy = new ImageIcon("fish.jpg");
		veggie = new ImageIcon("veggie.jpg");
		porky = new ImageIcon("meat1.jpg");
		fishyy = new ImageIcon("fish1.jpg");
		veggiey = new ImageIcon("veggie1.jpg");
		
		menuPic = new ImageIcon("menu.jpg");
		bot = new ImageIcon("bot.jpg");
		
		bottom = new JLabel(bot);
		bg = new JLabel(menuPic);
		meat = new JButton(pork);
		fish = new JButton(fishy);
		veg = new JButton(veggie);
		menuu = new JPanel();
		
		meat.addActionListener(this);
		fish.addActionListener(this);
		veg.addActionListener(this);
		

		//OKAY BUTTON
		
		texts = new Font("Serif", Font.BOLD, 20);
		okay = new JButton("OK");
		okay.setPreferredSize(new Dimension(70, 30));
		okay.setForeground(Color.white);
		okay.setBackground(Color.red);
		okay.setFont(texts);
		okay.addActionListener(this);
		
		texts = new Font("Serif", Font.BOLD, 10);
		add = new JButton("ADD");
		add.setPreferredSize(new Dimension(60, 30));
		add.setForeground(Color.black);
		add.setBackground(Color.yellow);
		add.setFont(texts);
		add.addActionListener(this);
		
		
		for(int i=0; i<3; i++){
			line[i] = new JPanel();
			line[i].setPreferredSize(new Dimension(400,120));
			line[i].setBackground(Color.white);
			line[i].setVisible(true);
			menuu.add(line[i]);
		}
		
		line[1].setBackground(Color.white);
		line[1].setPreferredSize(new Dimension(330,110));
		line[0].add(bg);
	
		menuu.setLayout(new FlowLayout());
		meat.setPreferredSize(new Dimension(100,100));
		fish.setPreferredSize(new Dimension(100,100));
		veg.setPreferredSize(new Dimension(100,100));
		menuu.setBackground(Color.white);

		line[1].add(meat);
		line[1].add(fish);
		line[1].add(veg);
		
		line[2].add(okay);
		line[2].add(add);
		line[2].add(bottom);
		
		
		getContentPane().add(menuu);		//some more settings
		setTitle("Menu");
		setResizable(false);
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == meat){		
			meat.setIcon(pork);
			fish.setIcon(fishyy);
			veg.setIcon(veggiey);
			markm = markm + 1;
			
			panel2.dish[0].setText(""+panel2.u.getTotalSalesByDishType("meat"));
			panel2.dish[3].setText(""+panel2.u.getTotalKilogramsSoldByDishType("meat"));
			
			panel2.u.setCurrentCash("sales", (panel2.u.RateOfMeat * markm));
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			
		}
	
		if(e.getSource() == fish){
			fish.setIcon(fishy);
			meat.setIcon(porky);
			veg.setIcon(veggiey);
			markf = markf + 1;
			
			panel2.dish[1].setText(""+panel2.u.getTotalSalesByDishType("fish"));
			panel2.dish[4].setText(""+panel2.u.getTotalKilogramsSoldByDishType("fish"));
			
			panel2.u.setCurrentCash("sales", (panel2.u.RateOfFish * markf));
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			
		}
		
		if(e.getSource() == veg){
			veg.setIcon(veggie);
			meat.setIcon(porky);
			fish.setIcon(fishyy);
			markv = markv + 1;
			
			panel2.dish[2].setText(""+panel2.u.getTotalSalesByDishType("veggies"));
			panel2.dish[5].setText(""+panel2.u.getTotalKilogramsSoldByDishType("veggies"));
			
			panel2.u.setCurrentCash("sales", (panel2.u.RateOfVegetable * markv));
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
		}
		
		if(e.getSource() == okay){	//if okay is clicked
			meat.setIcon(pork);
			fish.setIcon(fishy);
			veg.setIcon(veggie);
			
			if(panel1.dining[0] == false){
			
			panel2.u.setActiveSessionCount(panel1.counter[0]);
			panel2.u.setCustomersQueuedCount(panel1.counter[0]);
	
			panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
			//panel2.queueSize = panel2.u.getCustomersQueuedCount();
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			}
			
			else if(panel1.dining[1] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[1]);
				panel2.u.setCustomersQueuedCount(panel1.counter[1]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				
				}
			
			else if(panel1.dining[2] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[2]);
				panel2.u.setCustomersQueuedCount(panel1.counter[2]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[3] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[3]);
				panel2.u.setCustomersQueuedCount(panel1.counter[3]);
				panel2.u.setTotalServingsCompleted(panel1.counter[3]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[4] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[4]);
				panel2.u.setCustomersQueuedCount(panel1.counter[4]);
				panel2.u.setTotalServingsCompleted(panel1.counter[4]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[5] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[5]);
				panel2.u.setCustomersQueuedCount(panel1.counter[5]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[6] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[6]);
				panel2.u.setCustomersQueuedCount(panel1.counter[6]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[7] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[7]);
				panel2.u.setCustomersQueuedCount(panel1.counter[7]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[8] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[8]);
				panel2.u.setCustomersQueuedCount(panel1.counter[8]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[9] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[9]);
				panel2.u.setCustomersQueuedCount(panel1.counter[9]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[10] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[10]);
				panel2.u.setCustomersQueuedCount(panel1.counter[10]);

				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[12] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[12]);
				panel2.u.setCustomersQueuedCount(panel1.counter[12]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[13] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[13]);
				panel2.u.setCustomersQueuedCount(panel1.counter[13]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[14] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[14]);
				panel2.u.setCustomersQueuedCount(panel1.counter[14]);
				
				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			else if(panel1.dining[15] == false){
				
				panel2.u.setActiveSessionCount(panel1.counter[15]);
				panel2.u.setCustomersQueuedCount(panel1.counter[15]);

				panel2.amount[8].setText(""+panel2.u.getCustomersQueuedCount());
				//panel2.queueSize = panel2.u.getCustomersQueuedCount();
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				}
			
			dispose();		//close the window
			
			DinnerThread d = new DinnerThread(this.tableNumber, this.markf, this.markm, this.markv);	//start a thread and pass the table number and choice
			d.start();
			
		}

		if(e.getSource() == add){	//if okay is clicked
			meat.setIcon(pork);
			fish.setIcon(fishy);
			veg.setIcon(veggie);
			
		}
	
	}
	
	
}
