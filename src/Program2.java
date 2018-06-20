import javax.swing.JFrame;


public class Program2 extends JFrame {
	
	public static void main(String [] args){
		JFrame frame = new JFrame();
		menuPanel menu = new menuPanel(1);
		frame.setSize(400,400);
		frame.add(menu);
		frame.setVisible(true);
		new Program2();
	}
}
