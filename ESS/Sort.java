package ESS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Sort {
	public List<Athletes> AthletesList =new ArrayList<Athletes>();
	public Sort()
	{

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
