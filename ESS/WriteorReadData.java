package ESS;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.swing.JOptionPane;
public class WriteorReadData {
	String FilePath;
	String reader =null;
	String SportEnent=null;
	String Athlete=null;
	String Sex = null;
	BufferedReader br=null;
	public WriteorReadData(String Input) throws IOException 
	{
		this.FilePath = Input;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath),"UTF-8"));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "找不到檔案指定路徑");
			e.printStackTrace();
		}
	}
	void readTxt() throws IOException {
			try {
				reader=br.readLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "檔案內容格式錯誤");
				e.printStackTrace();
			}
			SportEnent=reader.split("   ")[2];
			Athlete=reader.split("   ")[0];
			Sex=reader.split("   ")[1];
		}
	}

