package ESS;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JFrame;

public class MainFrame {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setTitle("世大運介面");
		frame.setSize(450,300);
	    //frame.getContentPane().setBackground(SystemColor.BLUE);
	    //frame.setMinimumSize(new Dimension(600, 800)); //設定視窗的最小大小
	    frame.setLocation(50,50); //設定視窗座標
	    frame.setResizable(false); //設定視窗不可變更大小
	    //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //可以用來讓視窗結束按鍵
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // 關閉選項(右上角的叉叉圖示)按下後的動作
        // EXIT_ON_CLOSE：點選關閉時，關閉程式
        // DISPOSE_ON_CLOSE：點選關閉時，關閉顯示的視窗以及使用的資源，程式仍在背景執行
        // HIDE_ON_CLOSE：點選關閉時，僅隱藏顯示的視窗，程式仍在背景執行
	}

}
