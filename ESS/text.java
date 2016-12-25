package ESS;

import java.io.IOException;


public class text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteorReadData s = new WriteorReadData("D:/athlete.txt");
		Sort a=null;
		while(s.br.ready())
		{
			s.readTxt();
			a = new Sort();
			a.addAthletes(new Athletes(s.Athlete,s.SportEnent));
		}
		
		for(Athletes temp:a.AthletesList)
		{
			System.out.println(temp.StrName);
		}
	}

}


