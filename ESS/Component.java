package ESS;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class Component extends JPanel{
	JButton selectFile = new JButton("選擇檔案");
	JTextPane filePath = new JTextPane();//檔案路徑
	JButton exportProcedure = new JButton("輸出賽程");
	JTextPane message = new JTextPane();
	JScrollPane scroll = new JScrollPane(message);
	
	String fileName = "檔案路徑...";
	Component(){
		setLayout(null);
		selectFile.setBounds(10, 10, 105, 23);
		filePath.setText(fileName);
		filePath.setBounds(125, 10, 299, 21);
		exportProcedure.setBounds(10, 229, 414, 23);
		//message.setBounds(10, 41, 414, 177);
		scroll.setBounds(10, 41, 414, 177);
		add(selectFile);
		add(filePath);
		//add(message);
		add(exportProcedure);
		add(scroll);
	}
	
	public void callFile(){
		JFileChooser fileChooser = new JFileChooser(); //宣告filechooser 
		int returnValue = fileChooser.showOpenDialog(null); //叫出filechooser 
		if (returnValue == JFileChooser.APPROVE_OPTION){  //判斷是否選擇檔案 
			File selectedFile = fileChooser.getSelectedFile(); //指派給File 
			fileName = selectedFile.getAbsolutePath(); //取得檔名 
		}
	}
	
	void setFileName(String fileName){
		if(fileName == "select"){
			filePath.setText(this.fileName);
		}
		else if(fileName == "export"){
			if(this.fileName == "檔案路徑..."){
				JOptionPane.showMessageDialog(null, "請先選擇檔案");
			}
			else{
				ESS_center.getFinal(this.fileName);
				JOptionPane.showMessageDialog(null, "賽程檔案已輸出至專案資料夾，名稱為'schedual.txt'");
				message.setText(ESS_center.Final);
			}			
		}
	}
}
