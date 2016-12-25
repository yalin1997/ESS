package ESS;

import java.io.IOException;
import java.util.Iterator;

public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteorReadData s = new WriteorReadData("D:/athlete.txt");
		String Ans="";
		Sort a=null;
		while(s.br.ready())
		{
			s.readTxt();
			a = new Sort();
			a.addAthletes(new Athletes(s.Athlete,s.SportEvent));
		}
		
		for(Athletes temp:a.AthletesList)
		{
			System.out.println(temp.StrName);
		}
	}

}


