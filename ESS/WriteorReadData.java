package ESS;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
public class WriteorReadData {
	String FilePath;
	String reader =null;
	String SportEnent=null;
	String Athlete=null;
	String Sex = null;
	BufferedReader br=null;
	public WriteorReadData(String Input)
	{
		this.FilePath = Input;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath),"UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void readTxt() {
			try {
				reader=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SportEnent=reader.split("   ")[2];
			Athlete=reader.split("   ")[0];
			Sex=reader.split("   ")[1];
		}
	}

