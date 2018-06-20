import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class panel1 extends JPanel implements ActionListener{
	JPanel floor = new JPanel();
	JButton [] seats = new JButton[64];
	static JButton [] tables = new JButton[16];
	JButton [] upgrade = new JButton[16];
	ImageIcon tablep = new ImageIcon("table1.jpg");
	ImageIcon table2 = new ImageIcon("table2.jpg");
	ImageIcon table3 = new ImageIcon("table3.jpg");
	ImageIcon table4 = new ImageIcon("table4.jpg");
	ImageIcon dtable = new ImageIcon("dtable.jpg");
	int b;
	
	Updates u = new Updates();

	static boolean[] dining = new boolean[16]; 
	menuPanel m;
	
	boolean [] enable = new boolean[16];
	
	static int [] counter = new int [16]; 
	
	public panel1(){
		
		
	for(int i = 0; i<3; i++){
		tables[i] = new JButton(tablep);
		tables[i].setPreferredSize(new Dimension(5,4));
		tables[i].addActionListener(this);
		enable[i] = true;
		floor.add(tables[i]);
	}
	for(int i= 3; i<16; i++){
		tables[i] = new JButton(dtable);
		tables[i].setPreferredSize(new Dimension(5,4));
		tables[i].addActionListener(this);
		floor.add(tables[i]);
	}
	for(int i = 0; i<16; i++){
		upgrade[i] = new JButton();
		upgrade[i].setPreferredSize(new Dimension(5,5));
		upgrade[i].setBackground(Color.yellow);
		upgrade[i].addActionListener(this);
		tables[i].add(upgrade[i]);
	}
	
	for(int i=0; i<16; i++){
		counter[i] = 1;
	}
	
	floor.setBackground(Color.black);
	floor.setPreferredSize(new Dimension(500, 390));
	floor.setLayout(new GridLayout(4,4));
	floor.setVisible(true);
	this.add(floor);

	}

	public void actionPerformed(ActionEvent e) {
		
		//TABLE ONE SEATS
		if(e.getSource() == upgrade[0]){
			counter[0] = counter[0] +1;
			if(counter[0] == 2){
			tables[0].setIcon(table2);
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[0] == 3){
			tables[0].setIcon(table3);
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[0] == 4){
			tables[0].setIcon(table4);
			upgrade[0].setBackground(Color.gray);
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
		}
		//TABLE TWO SEATS
		if(e.getSource() == upgrade[1]){
			counter[1] = counter[1] +1;
			if(counter[1] == 2){
			tables[1].setIcon(table2);
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[1] == 3){
			tables[1].setIcon(table3);	
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[1] == 4){
			tables[1].setIcon(table4);	
			upgrade[1].setBackground(Color.gray);
			panel2.u.setCurrentCash("seats", 0);
			panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
		}
		
		
		//TABLE THREE SEATS
		if(e.getSource() == upgrade[2]){
			counter[2] = counter[2] +1;
			if(counter[2] == 2){
				tables[2].setIcon(table2);
				panel2.u.setCurrentCash("seats", 0);
				panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[2] == 3){
				tables[2].setIcon(table3);
				panel2.u.setCurrentCash("seats", 0);
				panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
			if(counter[2] == 4){
				tables[2].setIcon(table4);
				upgrade[2].setBackground(Color.gray);
				panel2.u.setCurrentCash("seats", 0);
				panel2.amount[0].setText(""+panel2.u.getCurrentCash());
			}
		}
		
		//TABLE FOUR SEATS
		if(e.getSource() == upgrade[3]){
			if(enable[3] == true){
				counter[3] = counter[3] +1;
				
				if(counter[3] == 2){
					tables[3].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[3] == 3){
					tables[3].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[3] == 4){
					tables[3].setIcon(table4);
					upgrade[3].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE FIVE SEATS
		if(e.getSource() == upgrade[4]){
			if(enable[4] == true){
				counter[4] = counter[4] +1;
					
				if(counter[4] == 2){
					tables[4].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[4] == 3){
					tables[4].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[4] == 4){
					tables[4].setIcon(table4);
					upgrade[4].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE SIX SEATS
		if(e.getSource() == upgrade[5]){
			if(enable[5] == true){
				counter[5] = counter[5] +1;
				
				if(counter[5] == 2){
					tables[5].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[5] == 3){
					tables[5].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[5] == 4){
					tables[5].setIcon(table4);
					upgrade[5].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE SEVEN SEATS
		if(e.getSource() == upgrade[6]){
			if(enable[6] == true){
				counter[6] = counter[6] +1;
				
				if(counter[6] == 2){
					tables[6].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[6] == 3){
					tables[6].setIcon(table3);	
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[6] == 4){
					tables[6].setIcon(table4);
					upgrade[6].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE EIGHT SEATS
		if(e.getSource() == upgrade[7]){
			if(enable[7] == true){
				counter[7] = counter[7] +1;
				
				if(counter[7] == 2){
					tables[7].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[7] == 3){
					tables[7].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[7] == 4){
					tables[7].setIcon(table4);
					upgrade[7].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
				
		//TABLE NINE SEATS
		if(e.getSource() == upgrade[8]){
			if(enable[8] == true){
			counter[8] = counter[8] +1;
					if(counter[8] == 2){
					tables[8].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
					}
					if(counter[8] == 3){
					tables[8].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
					}
					if(counter[8] == 4){
					tables[8].setIcon(table4);
					upgrade[8].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
					}
			}
				}
				
		//TABLE TEN SEATS
		if(e.getSource() == upgrade[9]){
			if(enable[9] == true){
				counter[9] = counter[9] +1;
				if(counter[9] == 2){
					tables[9].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[9] == 3){
					tables[9].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[9] == 4){
					tables[9].setIcon(table4);
					upgrade[9].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
				
				//TABLE ELEVEN SEATS
		if(e.getSource() == upgrade[10]){
			if(enable[10] == true){
				counter[10] = counter[10] +1;
				if(counter[10] == 2){
					tables[10].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[10] == 3){
					tables[10].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[10] == 4){
					tables[10].setIcon(table4);	
					upgrade[10].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE TWELVE SEATS
		if(e.getSource() == upgrade[11]){
			if(enable[11] == true){
				counter[11] = counter[11] +1;
				if(counter[11] == 2){
					tables[11].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[11] == 3){
					tables[11].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[11] == 4){
					tables[11].setIcon(table4);
					upgrade[11].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
				
		//TABLE THIRTEEN SEATS
		if(e.getSource() == upgrade[12]){
			if(enable[12] == true){
				counter[12] = counter[12] +1;
				if(counter[12] == 2){
					tables[12].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[12] == 3){
					tables[12].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[12] == 4){
					tables[12].setIcon(table4);
					upgrade[12].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
				
		//TABLE FOURTEEN SEATS
		if(e.getSource() == upgrade[13]){
			if(enable[13] == true){
				counter[13] = counter[13] +1;
				if(counter[13] == 2){
					tables[13].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[13] == 3){
					tables[13].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[13] == 4){
					tables[13].setIcon(table4);
					upgrade[13].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE FIFTEEN SEATS
		if(e.getSource() == upgrade[14]){
			if(enable[14] == true){
				counter[14] = counter[14] +1;
				if(counter[14] == 2){
					tables[14].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[14] == 3){
					tables[14].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[14] == 4){
					tables[14].setIcon(table4);
					upgrade[14].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
		//TABLE SIXTEEN SEATS
		if(e.getSource() == upgrade[15]){
			if(enable[15] == true){
				counter[15] = counter[15] +1;
				if(counter[15] == 2){
					tables[15].setIcon(table2);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[15] == 3){
					tables[15].setIcon(table3);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
				if(counter[15] == 4){
					tables[15].setIcon(table4);
					upgrade[15].setBackground(Color.gray);
					panel2.u.setCurrentCash("seats", 0);
					panel2.amount[0].setText(""+panel2.u.getCurrentCash());
				}
			}
		}
				
			//for tables 4 to 16, disabled sa start when clicked maeenable.	
				if(e.getSource() == tables[3]){
					if(enable[3] == false){
						tables[3].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[3] = true;
						
					}
					else{
						if(dining[3]==false){
							m = new menuPanel(3);	//calls the menuPanel, creates one 
							m.setBounds(0,0,400,400);

						}
						else{
							dining[3] = false;
							if(counter[3] ==1){
								tables[3].setIcon(tablep);
								}
								if(counter[3] ==2){
									tables[3].setIcon(table2);
								}
								if(counter[3] ==3){
									tables[3].setIcon(table3);
								}
								if(counter[3] ==4){
									tables[3].setIcon(table4);
								}

						}
					}
					
				}
				
				if(e.getSource() == tables[4]){
					if(enable[4] == false){
						tables[4].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[4]=true;
						
					}
					else{
						if(dining[4]==false){
							m = new menuPanel(4);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[4] = false;
							if(counter[4] ==1){
								tables[4].setIcon(tablep);
								}
								if(counter[4] ==2){
									tables[4].setIcon(table2);
								}
								if(counter[4] ==3){
									tables[4].setIcon(table3);
								}
								if(counter[4] ==4){
									tables[4].setIcon(table4);
								}
						}
					}
					
				}
				
				if(e.getSource() == tables[5]){
					if(enable[5] == false){
						tables[5].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[5]=true;
					}
					else{
						if(dining[5]==false){
							m = new menuPanel(5);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[5] = false;
							if(counter[5] ==1){
								tables[5].setIcon(tablep);
								}
								if(counter[5] ==2){
									tables[5].setIcon(table2);
								}
								if(counter[5] ==3){
									tables[5].setIcon(table3);
								}
								if(counter[5] ==4){
									tables[5].setIcon(table4);
								}
						
						
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[6]){
					if(enable[6] == false){
						tables[6].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[6]=true;
					}
					else{
						if(dining[6]==false){
							m = new menuPanel(6);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[6] = false;
							if(counter[6] ==1){
								tables[6].setIcon(tablep);
								}
								if(counter[6] ==2){
									tables[6].setIcon(table2);
								}
								if(counter[6] ==3){
									tables[6].setIcon(table3);
								}
								if(counter[6] ==4){
									tables[6].setIcon(table4);
								}
						
						}
					}
					
				}
				
				if(e.getSource() == tables[7]){
					if(enable[7] == false){
						tables[7].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[7]=true;
					}
					else{
						if(dining[7]==false){
							m = new menuPanel(7);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[7] = false;
							if(counter[7] ==1){
								tables[7].setIcon(tablep);
								}
								if(counter[7] ==2){
									tables[7].setIcon(table2);
								}
								if(counter[7] ==3){
									tables[7].setIcon(table3);
								}
								if(counter[7] ==4){
									tables[7].setIcon(table4);
								}
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[8]){
					if(enable[8] == false){
						tables[8].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[8]=true;
					}
					else{
						if(dining[8]==false){
							m = new menuPanel(8);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[8] = false;
							if(counter[8] ==1){
								tables[8].setIcon(tablep);
								}
								if(counter[8] ==2){
									tables[8].setIcon(table2);
								}
								if(counter[8] ==3){
									tables[8].setIcon(table3);
								}
								if(counter[8] ==4){
									tables[8].setIcon(table4);
								}
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[9]){
					if(enable[9] == false){
						tables[9].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[9]=true;
					}
					else{
						if(dining[9]==false){
							m = new menuPanel(9);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[9] = false;
							if(counter[9] ==1){
								tables[9].setIcon(tablep);
								}
								if(counter[9] ==2){
									tables[9].setIcon(table2);
								}
								if(counter[9] ==3){
									tables[9].setIcon(table3);
								}
								if(counter[9] ==4){
									tables[9].setIcon(table4);
								}
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[10]){
					if(enable[10] == false){
						tables[10].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[10]=true;
					}
					else{
						if(dining[10]==false){
							m = new menuPanel(10);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[10] = false;
							if(counter[10] ==1){
								tables[10].setIcon(tablep);
								}
								if(counter[10] ==2){
									tables[10].setIcon(table2);
								}
								if(counter[10] ==3){
									tables[10].setIcon(table3);
								}
								if(counter[10] ==4){
									tables[10].setIcon(table4);
								}
						
						
						}
					}
					
				}
				
				
				if(e.getSource() == tables[11]){
					if(enable[11] == false){
						tables[11].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[11]=true;
					}
					else{
						if(dining[11]==false){
							m = new menuPanel(11);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[11] = false;
							if(counter[11] ==1){
								tables[11].setIcon(tablep);
								}
								if(counter[11] ==2){
									tables[11].setIcon(table2);
								}
								if(counter[11] ==3){
									tables[11].setIcon(table3);
								}
								if(counter[11] ==4){
									tables[11].setIcon(table4);
								}
				
						}
					}
					
				}
				
				if(e.getSource() == tables[12]){
					if(enable[12] == false){
						tables[12].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[12]=true;
					}
					else{
						if(dining[12]==false){
							m = new menuPanel(12);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[12] = false;
							if(counter[12] ==1){
								tables[12].setIcon(tablep);
								}
								if(counter[12] ==2){
									tables[12].setIcon(table2);
								}
								if(counter[12] ==3){
									tables[12].setIcon(table3);
								}
								if(counter[12] ==4){
									tables[12].setIcon(table4);
								}
						
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[13]){
					if(enable[13] == false){
						tables[13].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[13]=true;
					}
					else{
						if(dining[13]==false){
							m = new menuPanel(13);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[13] = false;
							
							if(counter[13] ==1){
								tables[13].setIcon(tablep);
								}
								if(counter[13] ==2){
									tables[13].setIcon(table2);
								}
								if(counter[13] ==3){
									tables[13].setIcon(table3);
								}
								if(counter[13] ==4){
									tables[13].setIcon(table4);
								}
							
							
						}
					}
					
				}
				
				if(e.getSource() == tables[14]){
					if(enable[14] == false){
						tables[14].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[14]=true;
					}
					else{
						if(dining[14]==false){
							m = new menuPanel(14);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[14] = false;
						
							if(counter[14] ==1){
								tables[14].setIcon(tablep);
								}
								if(counter[14] ==2){
									tables[14].setIcon(table2);
								}
								if(counter[14] ==3){
									tables[14].setIcon(table3);
								}
								if(counter[14] ==4){
									tables[14].setIcon(table4);
								}
						
						
						
						
						
						}
					}
					
				}
				
				if(e.getSource() == tables[15]){
					if(enable[15] == false){
						tables[15].setIcon(tablep);
						panel2.u.setCurrentCash("tables", 0);
						panel2.u.setTablesOwnedCount(1);
						panel2.amount[0].setText(""+panel2.u.getCurrentCash());
						panel2.amount[1].setText(""+panel2.u.getTablesOwnedCount());
						enable[15]=true;
					}
					else{
						if(dining[15]==false){
							m = new menuPanel(15);
							m.setBounds(0,0,400,400);
						}
						else{
							dining[15] = false;
							tables[15].setIcon(tablep); //depends on how many tables
						}
					}
					
				}
				
				//for tables 1 2 and 3 para maset ung kakainin
				if(e.getSource() == tables[0]){
					
						if(dining[0]==false){
							m = new menuPanel(0);
							m.setBounds(0,0,400,400);
							
							
						}
						else{
							dining[0] = false;
							//depends on how many tables
							if(counter[0] ==1){
							tables[0].setIcon(tablep);
							}
							if(counter[0] ==2){
								tables[0].setIcon(table2);
							}
							if(counter[0] ==3){
								tables[0].setIcon(table3);
							}
							if(counter[0] ==4){
								tables[0].setIcon(table4);
							}
						}
					
					
				}
				
				if(e.getSource() == tables[1]){
					
					if(dining[1]==false){
						
						m = new menuPanel(1);
						m.setBounds(0,0,400,400);
					}
					else{
						dining[1] = false;
						if(counter[1] ==1){
							tables[1].setIcon(tablep);
							}
							if(counter[1] ==2){
								tables[1].setIcon(table2);
							}
							if(counter[1] ==3){
								tables[1].setIcon(table3);
							}
							if(counter[1] ==4){
								tables[1].setIcon(table4);
							}

					}
				}
				
				if(e.getSource() == tables[2]){
					
					if(dining[2]==false){
						m = new menuPanel(2);
						m.setBounds(0,0,400,400);
					}
					else{
						dining[2] = false;
						if(counter[2] ==1){
							tables[2].setIcon(tablep);
							}
							if(counter[2] ==2){
								tables[2].setIcon(table2);
							}
							if(counter[2] ==3){
								tables[2].setIcon(table3);
							}
							if(counter[2] ==4){
								tables[2].setIcon(table4);
							}
				
					}
				
				
				}
			
	
	
	
			}
	
}//end of actionListener
	

