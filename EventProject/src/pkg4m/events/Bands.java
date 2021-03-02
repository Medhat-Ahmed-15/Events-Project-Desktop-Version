package pkg4m.events;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Bands extends Entertainment {
	ListView<String> bandsListView;
	int companyName;
	String nameOfMediaPlayer;
	int indexOfBands;
	
	public MediaView videos(String nameOfMediaPlayer) throws SQLException  {
		MediaView mediaView1 = null;
		  DBConnect2.connect2();
		  ArrayList<String> videoPathData = new ArrayList<String>();
		    
		  
		
		try {

			ResultSet result4= DBConnect2.statement2.executeQuery("SELECT * FROM hotel WHERE name = '" + nameOfMediaPlayer + "'");
			while (result4.next()) {

				String videoPath = result4.getString(2);

				Media media1 = new Media(new File(videoPath).toURI().toString());
				MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
				 mediaView1 = new MediaView(mediaPlayer1);
				mediaView1.setFitWidth(500);
				mediaPlayer1.setAutoPlay(true);

				
	

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		


		return mediaView1;
	}
	
	
	
	public ObservableList<String> companyName() throws SQLException{
		DBConnect2.connect2();
		ObservableList<String> companyBandsNamelist = FXCollections.observableArrayList();
		bandsListView = new ListView<>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM bands");
			while (result2.next()) {

				String companyBandsName = result2.getString(1);

				companyBandsNamelist.add(companyBandsName);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return companyBandsNamelist;
	}
	
	

}
