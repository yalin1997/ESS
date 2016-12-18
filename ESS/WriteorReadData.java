package ESS;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class WriteorReadData {
	String FilePath;
	public WriteorReadData(String Input)
	{
		this.FilePath = Input;
	}
	private void readTxt() {
		BufferedReader br=null;
		try
		{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath),"UTF-8"));
			String reader =null;
			String SportEnent=null;
			String Athlete=null;
			while((reader=br.readLine())!=null)
			{
				SportEnent=reader.split("   ")[2];
				Athlete=reader.split("   ")[0];
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
