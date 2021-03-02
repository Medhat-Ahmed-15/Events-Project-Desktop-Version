package pkg4m.events;

public class MarketingAgencies extends Company {
	
	int billBoard = 0;
	int flier = 0;
	int banner = 0;
	int companyName;

	@Override
	public int calcPrice3(String price, String duration) {
		
		int p=Integer.parseInt(price);
		int d=Integer.parseInt(duration);
		
		
		return p*d;
	
	}
	
	
	

}
