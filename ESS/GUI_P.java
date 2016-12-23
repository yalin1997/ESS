package ESS;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class GUI_P extends JFrame {
	Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	JButton btn1 = new JButton("Buttom1");
	JButton btn2 = new JButton("Buttom2");
	JButton btn3 = new JButton("Buttom3");
	JButton btn4 = new JButton("Buttom4");
	JButton btn5 = new JButton("Buttom5");
	JPanel p1 = new JPanel(); 
	Font font = new Font("新細明體", Font.ITALIC,screenSize.width/1920*35);
	public GUI_P()
	{
		add(p1);
		btn1.setFont(font);
		p1.setLayout(new BorderLayout());
		p1.add(btn1,BorderLayout.NORTH);
		p1.add(btn2,BorderLayout.EAST);
		p1.add(btn3,BorderLayout.WEST);
		p1.add(btn4,BorderLayout.SOUTH);
		p1.add(btn5);
		
	}
	 public static void main(String[] args) {
		 GUI_P GUI = new GUI_P();
		 GUI.setTitle("my first GUI");
		 GUI.setSize(1920, 1080);
		 GUI.setVisible(true);
		 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }
	
}
