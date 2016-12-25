package ESS;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;



public class GuiInterface extends ESS_center{
	
	static String filename;
	
	public static void callFile(){
		JFileChooser fileChooser = new JFileChooser();//宣告filechooser 
		int returnValue = fileChooser.showOpenDialog(null);//叫出filechooser 
		if (returnValue == JFileChooser.APPROVE_OPTION){ //判斷是否選擇檔案 
			File selectedFile = fileChooser.getSelectedFile();//指派給File 
			filename = selectedFile.getAbsolutePath(); //取得檔名 
		}
	}

	
	public static void main(String[] args) {
		JFrame jframe = new JFrame("世大運視窗介面");
		jframe.setSize(800,600); //設定視窗大小(寬,高)
		jframe.setLocation(100,100); //設定視窗座標
		jframe.setVisible(true); //設定視窗顯示，若無設定只會在背景中運行
		jframe.setResizable(false); //設定視窗不可變更大小
		jframe.setBackground(Color.ORANGE);//設定顏色
		jframe.setLayout(new GridLayout());//設定排版
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 關閉選項(右上角的叉叉圖示)按下後的動作
        // EXIT_ON_CLOSE：點選關閉時，關閉程式
        // DISPOSE_ON_CLOSE：點選關閉時，關閉顯示的視窗以及使用的資源，程式仍在背景執行
        // HIDE_ON_CLOSE：點選關閉時，僅隱藏顯示的視窗，程式仍在背景執行
		
		
		jframe.setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jframe.setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton button_1 = new JButton("選擇檔案");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				callFile();	
				JTextPane textPane = new JTextPane();
				textPane.setText(filename);
				textPane.setBounds(125, 10, 299, 21);
				contentPane.add(textPane);
			}
		});
		button_1.setBounds(10, 10, 105, 23);
		button_1.setFont(new Font("細明體", Font.PLAIN, 16));
		contentPane.add(button_1);
		
		
		JButton btnNewButton = new JButton("輸出賽程");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFinal(filename);
				JTextPane textPane_1 = new JTextPane();
				textPane_1.setBounds(10, 41, 414, 177);
				textPane_1.setText("賽程已建檔\n檔案位置:"+"C:/Users/eMing/workspace/ESS/src/schedule.txt");
				contentPane.add(textPane_1);
			}
		});
		btnNewButton.setBounds(10, 229, 414, 23);
		btnNewButton.setFont(new Font("細明體", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
	}

}
