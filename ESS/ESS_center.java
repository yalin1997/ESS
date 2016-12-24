package ESS;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class ESS_center {
	private static Sort [] A = new Sort [8];
	public static void newSort()
	{
		for(int i=0;i<A.length;i++)
		{
			A[i]=new Sort();
		}

	}
	public static void main(String [] args)
	{
		String Final="";
		Scanner sc = new Scanner(System.in);
		String FilePath = sc.nextLine();
		try
		{
			newSort();
			Fill_In(FilePath);
			
			for(int i =0;i<A.length;i++)
			{
				A[i].RamdomSort();
				Iterator <Athletes> it = A[i].AthletesList.iterator();
				while(it.hasNext())
				{
					Final=Final + it.next().StrName;
					if(it.hasNext())
					{
						Final=Final+" VS "+it.next().StrName+"  "+A[i].getSport()+"\n";
					}
				}
				
			}
			System.out.println(Final);
			sc.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}
	
	public static void Fill_In(String Path) throws IOException {
		// TODO Auto-generated method stub
		WriteorReadData R = new WriteorReadData(Path);
		while(R.br.ready())
		{	
	    R.readTxt();
		if(R.SportEnent.equals("田徑100公尺")&&R.Sex.equals("男"))
		{
			A[0].setSport("田徑100公尺");
			A[0].addAthletes(new Athletes(R.Athlete,R.SportEnent));
		}
		else if(R.SportEnent.equals("田徑100公尺")&&R.Sex.equals("女"))
		{
			A[1].setSport("田徑100公尺");
			A[1].addAthletes(new Athletes(R.Athlete,R.SportEnent));
		}
		else if(R.SportEnent.equals("跳遠")&&R.Sex.equals("男"))
		{
			A[2].setSport("跳遠");
			A[2].addAthletes(new Athletes(R.Athlete,R.SportEnent));
		}
		else if(R.SportEnent.equals("跳遠")&&R.Sex.equals("女"))
		{
			A[3].setSport("跳遠");
			A[3].addAthletes(new Athletes(R.Athlete,R.SportEnent));	
		}
		else
		{
			switch(R.SportEnent)
			{
			case "擊劍":
				if(R.Sex.equals("男"))
				{
					A[4].setSport("擊劍");
					A[4].addAthletes(new Athletes(R.Athlete,R.SportEnent));
				}
				else
				{
					A[5].setSport("擊劍");
					A[5].addAthletes(new Athletes(R.Athlete,R.SportEnent));
				}
				break;
			case "跳水":
				if(R.Sex.equals("男"))
				{
					A[6].setSport("跳水");
					A[6].addAthletes(new Athletes(R.Athlete,R.SportEnent));
				}
				else
				{
					A[7].setSport("跳水");
					A[7].addAthletes(new Athletes(R.Athlete,R.SportEnent));
				}
				break;
			}
		}
	}
	}

}
