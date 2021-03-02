package pkg4m.events;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HairDresser extends Person {
	
	String Phone;
	String FaceBook;
	String Instagram;
	
	int tempx;
	int tempy;
	int tempz;
	public int people;

	@Override
	public int calcPrice(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int calcAvailability(int d, int m, int y) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy"); 
		LocalDateTime now = LocalDateTime.now(); 
		String currentDate=dtf.format(now);
		
		String [] dateParts = currentDate.split("/");
		String day = dateParts[0];
		String month = dateParts[1];
		String year = dateParts[2];
		
		int day1=Integer.parseInt(day); 
		int month1=Integer.parseInt(month); 
		int year1=Integer.parseInt(year);
		
		if(y==year1) {
			if(month1>=m) {
				return 0;}
			else if(day1-d>0) {return 0;}
			
			else {return 1;}
		}
		return 2;

		
		
		
		
		
		
		
	}

	

	
	

}
