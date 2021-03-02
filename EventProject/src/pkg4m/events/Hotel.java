package pkg4m.events;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Hotel extends Places {
	
	    String hall; 
	    int price;
	    int total=0;
	@Override
	public String calcPrice(String noOfHours,String noOfPeople,String nameOfhotel) throws SQLException {
		   DBConnect2.connect2();
	       int people= Integer.parseInt(noOfPeople);
	       int hrs= Integer.parseInt(noOfHours);
	      
	      
	       try {
	           ResultSet result4= DBConnect2.statement2.executeQuery("SELECT * FROM hotel WHERE name = '" + nameOfhotel + "'");
	           while(result4.next()){
	       if(people<=150){
	           price= Integer.parseInt(result4.getString(4));
	           hall="hall 1 is the best for you";
	           total=price*hrs;
	       }
	       else if(people >150 && people<=300){
	           price= Integer.parseInt(result4.getString(5));
	           total=price*hrs;
	           hall= "hall 2 is the best for you";
	       }
	       else if(people>300 && people<=500){
	           price= Integer.parseInt(result4.getString(6));
	           total=price*hrs;
	           hall= "hall 3 is the best for you";
	       }
	       else {
	    	   String h="NOT VALID";
	    	   return h;
	       }
	                                                                       
	  
	         }
	       }
	       catch(SQLException e){
	           e.printStackTrace();
	       }
	       return String.valueOf(total);
		
	}
	
	  public String showHall(){
	       return hall;}
}
