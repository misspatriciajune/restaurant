import javax.swing.*;

public class DinnerThread extends Thread{
	
	int tableNumber;
	int markf, markm, markv, marker = 0;
	
	double money;
	
	//ImageIcon tableDining = new ImageIcon("dining.jpg");	//dko maset pano ung food napinili ang lalabaaas, if gsto nyo gawwa nlngtyo ng table na may food na dayain nlng ung food haha para nakafix na, pero dto ko un nilagay
	ImageIcon tableDone = new ImageIcon("done1.gif");	//eto ung sa blinking, nagpagawa ako ng gif, d ako marunong eh ahah pero ayan ok naman ata kinalabasan :)))
	ImageIcon tableDone2 = new ImageIcon("done2.gif");	//eto ung sa blinking, nagpagawa ako ng gif, d ako marunong eh ahah pero ayan ok naman ata kinalabasan :)))
	ImageIcon tableDone3 = new ImageIcon("done3.gif");	//eto ung sa blinking, nagpagawa ako ng gif, d ako marunong eh ahah pero ayan ok naman ata kinalabasan :)))
	ImageIcon tableDone4 = new ImageIcon("done4.gif");	//eto ung sa blinking, nagpagawa ako ng gif, d ako marunong eh ahah pero ayan ok naman ata kinalabasan :)))

	ImageIcon table1fish = new ImageIcon("table1fish.jpg");
	ImageIcon table1meat = new ImageIcon("table1meat.jpg");
	ImageIcon table1veg = new ImageIcon("table1veg.jpg");
	ImageIcon table2fishmeat = new ImageIcon("table2fishmeat.jpg");
	ImageIcon table2vegfish = new ImageIcon("table2vegfish.jpg");
	ImageIcon table2vegmeat = new ImageIcon("table2vegmeat.jpg");
	ImageIcon table2vegveg = new ImageIcon("table2vegveg.jpg");
	ImageIcon table2fishfish = new ImageIcon("table2fishfish.jpg");
	ImageIcon table2meatmeat = new ImageIcon("table2meatmeat.jpg");
	ImageIcon table3fishfishfish = new ImageIcon ("table3fishfishfish.jpg");
	ImageIcon table3meatmeatmeat = new ImageIcon ("table3meatmeatmeat.jpg");
	ImageIcon table3vegvegveg = new ImageIcon ("table3vegvegveg.jpg");
	ImageIcon table3fishfishmeat = new ImageIcon ("table3fishfishmeat.jpg");
	ImageIcon table3fishfishveg = new ImageIcon ("table3fishfishveg.jpg");
	ImageIcon table3vegvegfish = new ImageIcon ("table3vegvegfish.jpg");
	ImageIcon table3vegvegmeat = new ImageIcon ("table3vegvegmeat.jpg");
	ImageIcon table3meatmeatfish = new ImageIcon ("table3meatmeatfish.jpg");
	ImageIcon table3meatmeatveg = new ImageIcon ("table3meatmeatveg.jpg");
	ImageIcon table3fishmeatveg = new ImageIcon ("table3fishmeatveg.jpg");
	ImageIcon table4fishfishfishfish = new ImageIcon ("table4fishfishfishfish.jpg");
	ImageIcon table4meatmeatmeatmeat = new ImageIcon ("table4meatmeatmeatmeat.jpg");
	ImageIcon table4vegvegvegveg = new ImageIcon ("table4vegvegvegveg.jpg");
	ImageIcon table4fishfishfishmeat = new ImageIcon ("table4fishfishfishmeat.jpg");
	ImageIcon table4fishfishfishveg = new ImageIcon ("table4fishfishfishveg.jpg");
	ImageIcon table4vegvegvegfish = new ImageIcon ("table4vegvegvegfish.jpg");
	ImageIcon table4vegvegvegmeat = new ImageIcon ("table4vegvegvegmeat.jpg");
	ImageIcon table4meatmeatmeatfish = new ImageIcon ("table4meatmeatmeatfish.jpg");
	ImageIcon table4meatmeatmeatveg = new ImageIcon ("table4meatmeatmeatveg.jpg");
	ImageIcon table4meatmeatfishfish = new ImageIcon ("table4meatmeatfishfish.jpg");
	ImageIcon table4vegvegfishfish = new ImageIcon ("table4vegvegfishfish.jpg");
	ImageIcon table4vegvegmeatmeat = new ImageIcon ("table4vegvegmeatmeat.jpg");
	ImageIcon table4fishfishmeatveg = new ImageIcon ("table4fishfishmeatveg.jpg");
	ImageIcon table4meatmeatfishveg = new ImageIcon ("table4meatmeatfishveg.jpg");
	ImageIcon table4vegvegfishmeat = new ImageIcon ("table4vegvegfishmeat.jpg");
	
	public DinnerThread(int tableNumber, int markf, int markm, int markv){
		
		this.tableNumber = tableNumber;
		this.markf = markf;
		this.markm = markm;
		this.markv = markv;
		
	}
	
	public void run(){		//dto na ung pagalaw galaw nyaa
		panel1.tables[this.tableNumber].setEnabled(false);
		
		money = Double.parseDouble(panel2.amount[0].getText());
		panel2.u.currentCash = money;
		panel2.u.setCurrentCash("maintenance", 0);
		panel2.amount[0].setText(""+panel2.u.getCurrentCash());
		panel2.u.setTotalMaintenance();
		panel2.amount[4].setText(""+panel2.u.getTotalMaintainanceCost());
		
		//set the icons
		//ONE SEAT MEALS
		if(markf == 1 && markm == 0 && markv ==0){ 
		panel1.tables[this.tableNumber].setDisabledIcon(table1fish);
		panel1.dining[this.tableNumber] = true;

		}
		if(markf == 0 && markm == 1 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table1meat);
			panel1.dining[this.tableNumber] = true;
		}
		if(markf == 0 && markm == 0 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table1veg);
			panel1.dining[this.tableNumber] = true;
		}
		
		//TWO SEAT MEALS
		if(markf == 1 && markm == 1 && markv ==0){ 
			panel1.tables[this.tableNumber].setDisabledIcon(table2fishmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 2;
			}
		if(markf == 1 && markm == 0 && markv == 1){
				panel1.tables[this.tableNumber].setDisabledIcon(table2vegfish);
				panel1.dining[this.tableNumber] = true;
				marker = 2;	
		}
		if(markf == 0 && markm == 1 && markv == 1){
				panel1.tables[this.tableNumber].setDisabledIcon(table2vegmeat);
				panel1.dining[this.tableNumber] = true;
				marker = 2;	
		}
		if(markf == 0 && markm == 0 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table2vegveg);
			panel1.dining[this.tableNumber] = true;
			marker = 2;
		}
		if(markf == 2 && markm == 0 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table2fishfish);
			panel1.dining[this.tableNumber] = true;
			marker = 2;
		}
		if(markf == 0 && markm == 2 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table2meatmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 2;
		}
		
		//THREE SEATS MEALS
		if(markf == 3 && markm == 0 && markv ==0){ 
			panel1.tables[this.tableNumber].setDisabledIcon(table3fishfishfish);
			panel1.dining[this.tableNumber] = true;
			marker = 3;	
		}
		if(markf == 0 && markm == 3 && markv == 0){
				panel1.tables[this.tableNumber].setDisabledIcon(table3meatmeatmeat);
				panel1.dining[this.tableNumber] = true;
				marker = 3;
		}
		if(markf == 0 && markm == 0 && markv == 3){
				panel1.tables[this.tableNumber].setDisabledIcon(table3vegvegveg);
				panel1.dining[this.tableNumber] = true;
				marker = 3;
		}
		
		if(markf == 2 && markm == 1 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table3fishfishmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		if(markf == 2 && markm == 0 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table3fishfishveg);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		if(markf == 1 && markm == 0 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table3vegvegfish);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		
		if(markf == 0 && markm == 1 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table3vegvegmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		
		if(markf == 1 && markm == 2 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table3meatmeatfish);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		if(markf == 0 && markm == 2 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table3meatmeatveg);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		if(markf == 1 && markm == 1 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table3fishmeatveg);
			panel1.dining[this.tableNumber] = true;
			marker = 3;
		}
		
		//FOUR SEATS
		if(markf == 4 && markm == 0 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table4fishfishfishfish);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 0 && markm == 4 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table4meatmeatmeatmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 0 && markm == 0 && markv == 4){
			panel1.tables[this.tableNumber].setDisabledIcon(table4vegvegvegveg);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		
		if(markf == 3 && markm == 1 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table4fishfishfishmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 3 && markm == 0 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table4fishfishfishveg);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 1 && markm == 0 && markv == 3){
			panel1.tables[this.tableNumber].setDisabledIcon(table4vegvegvegfish);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 1 && markm == 3 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table4meatmeatmeatfish);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 0 && markm == 3 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table4meatmeatmeatveg);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		
		if(markf == 2 && markm == 2 && markv == 0){
			panel1.tables[this.tableNumber].setDisabledIcon(table4meatmeatfishfish);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 2 && markm == 0 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table4vegvegfishfish);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		
		if(markf == 0 && markm == 2 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table4vegvegmeatmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 2 && markm == 1 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table4fishfishmeatveg);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 1 && markm == 1 && markv == 2){
			panel1.tables[this.tableNumber].setDisabledIcon(table4vegvegfishmeat);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
		}
		if(markf == 1 && markm == 2 && markv == 1){
			panel1.tables[this.tableNumber].setDisabledIcon(table4meatmeatfishveg);
			panel1.dining[this.tableNumber] = true;
			marker = 4;
			
		}
		
		System.out.println(this.tableNumber+" is Dining. They chose");	//para makita sa terminal ng eclipse version ano na nangyayari
		
		try{
			Thread.sleep(10000);		//wait for 10 seconds
			
		}
		 catch (InterruptedException e){}

		if(marker ==0){
			
		panel1.tables[this.tableNumber].setIcon(tableDone);
		panel1.tables[this.tableNumber].setEnabled(true);
		
		//IF DONE THEN REMOVE ALL DINERS
		if(panel1.dining[0] == false){
		
		panel2.u.setActiveSessionCount2(1);
		panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
		
		panel2.u.setTotalServingsCompleted(1);
		panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
		
		}
		
		else if(panel1.dining[1] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[2] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[3] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[4] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[5] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[6] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[7] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[8] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[9] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[10] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[11] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[12] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[13] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[14] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		else if(panel1.dining[15] == false){
			
			panel2.u.setActiveSessionCount2(1);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(1);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
		
		}
		if(marker ==2){
			
			panel1.tables[this.tableNumber].setIcon(tableDone2);
			panel1.tables[this.tableNumber].setEnabled(true);
			
			//IF DONE THEN REMOVE ALL DINERS
			if(panel1.dining[0] == false){
			
			panel2.u.setActiveSessionCount2(2);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(2);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
			
			else if(panel1.dining[1] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[2] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[3] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[4] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[5] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[6] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[7] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[8] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[9] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[10] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[11] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[12] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[13] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[14] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[15] == false){
				
				panel2.u.setActiveSessionCount2(2);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(2);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			}
		if(marker ==3){
			
			panel1.tables[this.tableNumber].setIcon(tableDone3);
			panel1.tables[this.tableNumber].setEnabled(true);
			
			//IF DONE THEN REMOVE ALL DINERS
			if(panel1.dining[0] == false){
			
			panel2.u.setActiveSessionCount2(3);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(3);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
			
			else if(panel1.dining[1] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[2] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[3] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[4] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[5] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[6] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[7] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[8] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[9] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[10] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[11] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[12] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[13] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[14] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[15] == false){
				
				panel2.u.setActiveSessionCount2(3);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(3);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			}
		if(marker ==4){
			panel1.tables[this.tableNumber].setIcon(tableDone4);
			panel1.tables[this.tableNumber].setEnabled(true);
			
			//IF DONE THEN REMOVE ALL DINERS
			if(panel1.dining[0] == false){
			
			panel2.u.setActiveSessionCount2(4);
			panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
			
			panel2.u.setTotalServingsCompleted(4);
			panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
			
			}
			
			else if(panel1.dining[1] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[2] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[3] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[4] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[5] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[6] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[7] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[8] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[9] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[10] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[11] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[12] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[13] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[14] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			
			else if(panel1.dining[15] == false){
				
				panel2.u.setActiveSessionCount2(4);
				panel2.amount[2].setText(""+panel2.u.getActiveSessionCount());
				
				panel2.u.setTotalServingsCompleted(4);
				panel2.amount[3].setText(""+panel2.u.getTotalServingsCompleted());
				
				}
			}
			
	}
}