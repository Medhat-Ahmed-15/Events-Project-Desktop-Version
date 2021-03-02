package pkg4m.events;

public class Catering  extends Services{
	
	String cateringName;
	String cateringPackage;
	String cateringPackage2;
	String cateringPackage3;
	
	
	public String total(int t,String n) {
		int x=Integer.parseInt(n);
		
		
		
		return String.valueOf(((x*t)+100))+"LE" + "  " +"TO"+"  " +  String.valueOf(((x*t)-100)+"LE") ;
	}
	
	

}
