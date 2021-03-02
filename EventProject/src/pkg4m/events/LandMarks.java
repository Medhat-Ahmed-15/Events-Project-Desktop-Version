package pkg4m.events;

public class LandMarks extends Places{
	
	int landMarkPrice;
	int hours;

	@Override
	public int calcPrice(int price, int hours) {
		
		return price*hours;
	}
	
	
	
	

}
