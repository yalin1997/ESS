package ESS;

public class ESS_center {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteorReadData R = new WriteorReadData("D:/athlete.txt");
	    R.readTxt();
	    
		if(R.SportEnent.equals("田徑100公尺")&&R.Sex.equals("男"))
		{
			Sort sort1 = new Sort();
			Athletes Run_player_Male = new Athletes(R.Athlete,R.SportEnent);
			sort1.addAthletes(Run_player_Male);
		}
		else if(R.SportEnent.equals("田徑100公尺")&&R.Sex.equals("女"))
		{
			Sort sort2 = new Sort();
			Athletes Run_player_Female = new Athletes(R.Athlete,R.SportEnent);
			sort2.addAthletes(Run_player_Female);
		}
		else if(R.SportEnent.equals("跳遠")&&R.Sex.equals("男"))
		{
			Sort sort3 = new Sort();
			Athletes Jump_player_Male = new Athletes(R.Athlete,R.SportEnent);
			sort3.addAthletes(Jump_player_Male);
		}
	}

}
