package ESS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class OutputTxt {
	static void output(String a){
		FileWriter fw =null; 
		BufferedWriter bw =null; 
		try{ 
			fw = new FileWriter("src/schedule.txt",false);   //預設是false~如資料夾中有資料會刪除原資料印新的 
			bw = new BufferedWriter(fw); 
			//bw.newLine();        //若要設定成整行新的資料將上方"\n"刪除使用這行
			bw.write(a);       //加上"\n"讓文字換行
			bw.close();
			 
		} 
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "讀檔錯誤");
		} 
		
	}
}