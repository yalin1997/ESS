package ESS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTxt {
	static void output(String a){
		FileWriter fw =null; 
		BufferedWriter bw =null; 
		try{ 
			fw = new FileWriter("src/schedule.txt ", true);   //預設是false~如資料夾中有資料會刪除原資料印新的 
			bw = new BufferedWriter(fw); 
			bw.write(a + "\r\n");       //加上"\n"讓文字換行
				// bw.newLine();        //若要設定成整行新的資料將上方"\n"刪除使用這行 
		} 
		catch(IOException e){} 
		finally{ 
			try{ 
				bw.close(); 
			} 
			catch(IOException e){} 
		}
	}
}