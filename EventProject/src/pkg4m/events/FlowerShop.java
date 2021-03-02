package pkg4m.events;

public class FlowerShop extends Services {
	
	
	int lily = 0;
	int rose = 0;
	int tulip = 0;
	int sunFlower = 0;
	
	String numberOfRoses;
	String numberOfLilies;
	String numberOfSunFlowers;
	String numberOfTulips;

	@Override
	public int calcPrice2(String price, String quantity) {
		
		int p=Integer.parseInt(price);
		int q=Integer.parseInt(quantity);
		
		return p*q;
		
	}


	

}
