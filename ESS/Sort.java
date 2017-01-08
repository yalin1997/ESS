package ESS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Sort {
	private String SportEvent;
	public List<Athletes> AthletesList =new ArrayList<Athletes>();
	public Sort()
	{

	}
	public void setSport(String Sport)
	{
		this.SportEvent=Sport;
	}
	public String getSport()
	{
		return this.SportEvent;
	}
	public void addAthletes(Athletes Input)
	{
		AthletesList.add(Input);
	}
	public void RamdomSort()
	{
		Collections.shuffle(AthletesList);

	}
}
