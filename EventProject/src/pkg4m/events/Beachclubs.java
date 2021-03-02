package pkg4m.events;

public class Beachclubs extends Places {
	
	int BeachClubPrice;
	int month;
	int price;
	int hours;

	@Override
	public int CheckAvailability(int m) {
		
		if(m>12) {return 0;}//ERROR
		
		else if(m>9&&m<12) {//NOT VALID
			return 1;
		}
			
		return 2; //VALID

	}

	@Override
	public int calcPrice(int price, int hours) {
		
		return price*hours;

	}
	
	
	
	

}
