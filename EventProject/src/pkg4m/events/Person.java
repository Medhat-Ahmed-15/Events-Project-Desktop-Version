package pkg4m.events;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public abstract class Person {

	String photographerPrice;
	String makeUpArtistPrice;

	public abstract int calcPrice(int x, int y);

	public abstract int calcAvailability(int d, int m, int y);

}
