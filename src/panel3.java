import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class panel3 extends JPanel {

	
	JLabel roofd;
	panel3(){

	roofd = new JLabel();
	roofd.setIcon(new ImageIcon("roof.jpg"));
	this.add(roofd);
	
	}
}
