package pkg4m.events;

public class Decorations extends Services {
	
	String PriceDecorations1;
	String PriceDecorations2;
	String PriceDecorations3;
	String PriceDecorations4;
	String PriceDecorations5;
	String total;
	String string;
	

	@Override
	public String calcPrice(String price, String hours) {
		
		int priceDecorations=Integer.parseInt(price);
		int Hours=Integer.parseInt(hours);
		
		int result=priceDecorations*Hours;
		
		return String.valueOf(result);
		
	
		
	}
	
	
	

}
