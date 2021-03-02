package pkg4m.events;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect2 {
	
	
	static Connection con2;
    static Statement statement2 ; 
    
     
    public static Connection connect2() throws SQLException
     {
         
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment","Medhat15","fmaamito15");
        }
        catch(ClassNotFoundException cnfe){System.err.println("Error: "+cnfe.getMessage());}
        statement2 = con2.createStatement() ; 
        
        return con2;
     }
	
	

}
