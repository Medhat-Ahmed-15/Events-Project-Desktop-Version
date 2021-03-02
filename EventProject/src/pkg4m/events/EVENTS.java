
package pkg4m.events;

import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import javafx.animation.FillTransition;
import javafx.animation.StrokeTransition;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.RED;
import static javafx.scene.paint.Color.WHEAT;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import pkg4m.events.EVENTS.Music;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import com.sun.javafx.tk.Toolkit.Task;

public class EVENTS extends Application {

	Label lbWelcome;
	Label lbSignUp;
	Label lbLogin;
	Label lbUserName;
	Label lbPassWord;
	Label lbFirstName;
	Label lbLastName;
	Label lbEmail;
	Label lbEnterUserName;
	Label lbEnterPassWord;
	Label lbConfirmPassWord;
	Label lbTitleAdd;
	Label lbTitleCheck;
	Label lbErrorPass;
	Label lbstarError1;
	Label lbstarError2;
	Label lbstarError3;
	Label lbstarError4;
	Label lbstarError5;
	Label lbstarError6;
	Label lbError;
	Label lbEventType;
	Label lbLocation;
	Label lbNumberOfGuests;
	Label lbDressCode;
	Label lbDate;
	Label lbTime;
	Label lbQuestion;
	Label lbAddEmail;
	Label lbMusicTitle;
	Label lbMusicTitlea;
	Label lbArtsTitle;
	Label lbFitnessTitle;
	Label lbFoodTitle;
	Label lbCharityTitle;
	Label lbPrivate;
	Label lbDay;
	Label lbMonth;
	Label lbYear;
	Label lbDay2;
	Label lbMonth2;
	Label lbYear2;
	Label lbDay3;
	Label lbMonth3;
	Label lbYear3;
	Label lbEnterNumberOfPeople;
	Label lbAnswerPrice;
	Label lbAnswerAvailable;
	Label lbEnterNumberOfPeople2;
	Label lbAnswerPrice2;
	Label lbAnswerAvailable2;
	Label lbEnterNumberOfPeople3;
	Label lbAnswerPrice3;
	Label lbAnswerAvailable3;
	Label lbInfoPhoneNumber;
	Label lbInfoFaceBookAccount;
	Label lbInfoInstagramAccount;
	Label lbEnterNumberOfHours;
	Label lbEnterNumberOfPeople4;
	Label lbShowPrice;
	Label lbShowHall;
	Label lbArtsTitlea;
	Label lbFitnessTitlea;
	Label lbFoodTitlea;
	Label lbCharityTitlea;
	Label lbshowHotelPhoneNumber;
	Label lbshowHotelLocation;
	Label lbEnterNumberOfHours2;
	Label lbAnswerPrice4;
	Label lbShowLandMarksPhoneNumber;
	Label lbShowLandMarksRate;
	Label lbDayBeachClub;
	Label lbMonthBeachClub;
	Label lbYearBeachclub;
	Label lbNumberOfHoursBeachClub;
	Label lbAnswerPriceBeachClub;
	Label lbAnswerAvailableBeachClub;
	Label lbShowAnswerDecorations;
	Label lbEnterNumberOfHoursDecorations;
	Label lbEnterTypeDecorations;
	Label lbflowershopShowOffers;
	Label lbflowershopShowPrice;
	Label lbCustomizeFlowerShop;
	Label lbCompanyFillForm;
	Label lbCompanyNameEvent;
	Label lbCompanyTypeOfEvent;
	Label lbCompanyTypeOfMarketing;
	Label lbCompanyDuration;
	Label lbCompanyChooseExtra;
	Label lbChooseCompanyToCalcPrice;
	Label lbCompanyShowPriceAnswer;
	Label lbCateringChoose;
	Label lbCateringChooseEvent;
	Label lbCateringDessert;
	Label lbCateringAppetizers;
	Label lbCateringMainDishes;
	Label lbCateringPriceAnswer;
	Label lbCateringEnterNumberOfPeople;
	Label lbSponsorsFillForm;
	Label lbSponsorsNameEvent;
	Label lbSponsorsTypeOfEvent;
	Label lbSponsorDuration;

	TextField tfUserName;
	TextField tfEnterUserName;
	TextField tfFirstName;
	TextField tfLastName;
	TextField tfEmail;
	TextField tfLocation;
	TextField tfNumberOfGuests;
	TextField tfDressCode;
	TextField tfDate;
	TextField tfTime;
	TextField tfQuestion;
	TextField tfAddEmail;
	TextField tfDay;
	TextField tfMonth;
	TextField tfYear;
	TextField tfDay2;
	TextField tfMonth2;
	TextField tfYear2;
	TextField tfDay3;
	TextField tfMonth3;
	TextField tfYear3;
	TextField tfEnterNumberOfPeople;
	TextField tfEnterNumberOfPeople2;
	TextField tfEnterNumberOfPeople3;
	TextField tfEnterNumberOfPeople4;
	TextField tfEnterNumberOfHours;
	TextField tfEnterNumberOfHours2;
	TextField tfDayBeachClub;
	TextField tfMonthBeachClub;
	TextField tfYearBeachClub;
	TextField tfEnterNumberOfHoursBeachClub;
	TextField tfEnterNumberOfHoursDecorations;
	TextField tfFlowerRose;
	TextField tfFlowerLily;
	TextField tfFlowerSunFlower;
	TextField tfFlowerTulip;
	TextField tfCompanyNameEvent;
	TextField tfCompanyTypeOfEvent;
	TextField tfCateringEnterNumberOfPeople;
	TextField tfCompanyDuration;
	TextField tfSponsorNameEvent;
	TextField tfSponsorDuration;

	PasswordField tfPassWord;
	PasswordField tfNewPassWord;
	PasswordField tfConfirmPassWord;

	Button btnLogIn;
	Button btnJumpIn;
	Button btnSignUp;
	Button btnManageEvent;
	Button btnAddEvent;
	Button btnCheckevent;
	Button btnBack1;
	Button btnBack2;
	Button btnBack3;
	Button btnBack4;
	Button btnBack5;
	Button btnBack6;
	Button btnBack7;
	Button btnBack8;
	Button btnBack8a;
	Button btnBack9;
	Button btnBack9a;
	Button btnBack10;
	Button btnBack10a;
	Button btnBack11;
	Button btnBack12;
	Button btnBack12a;
	Button btnBack13;
	Button btnBack13a;
	Button btnBack14;
	Button btnBack15;
	Button btnBack16;
	Button btnBack17;
	Button btnBack18;
	Button btnBack19;
	Button btnBack20;
	Button btnBack21;
	Button btnBack22;
	Button btnBack23;
	Button btnBack24;
	Button btnBack25;
	Button btnBack26;
	Button btnBack27;
	Button btnBack28;
	Button btnBack29;
	Button btnBack30;
	Button btnBack31;
	Button btnBack32;
	Button btnBack34;
	Button btnBack35;
	Button btnBack36;
	Button btnBack37;
	Button btnBack38;
	Button btnBack39;
	Button btnView1;
	Button btnView2;
	Button btnView3;
	Button btnView4;
	Button btnNewSignUp;
	Button btnMusic;
	Button btnFitness;
	Button btnArts;
	Button btnSave;
	Button btnShow;
	Button btnPublic;
	Button btnPrivate;
	Button bTest;
	Button btnPlaces;
	Button btnPerson;
	Button btnEntertainments;
	Button btnCompany;
	Button btnServices;
	Button btnCalculatePrice1;
	Button btnCheckAvailable1;
	Button btnCalculatePrice2;
	Button btnCheckAvailable2;
	Button btnCalculatePrice3;
	Button btnCheckAvailable3;
	Button btnShowInfo;
	Button btnPriceAndHall;
	Button btnShowdetails;
	Button btnShowHotelSite;
	Button btnCalculatePrice4;
	Button btnShowDetails2;
	Button btnShowLandMarksLocation;
	Button btnCalculatePriceBeachclub;
	Button btnCheckAvailableBeachClub;
	Button btnShowLocationBeachClub;
	Button btnShowPriceDecorations;
	Button btnCalculatePriceFlowerShop;
	Button btnShowCompanies;
	Button btnCalculateCompanyPrice;
	Button btnShowPerformance;
	Button btnShowReview;
	Button btnShowPriceRange;
	Button btnCateringGo;
	Button btnCateringCalculateItemPrice;
	Button btnShowSponsors;
	Button sponsorsRestartCalculations;

	TableView<Music> table1;
	TableColumn<Music, String> name1;
	TableColumn<Music, String> showDetails1;

	TableView<Music> table1a;
	TableColumn<Music, String> time1a;
	TableColumn<Music, String> description1a;
	TableColumn<Music, String> phoneNumber1a;
	TableColumn<Music, String> location1a;

	TableView<Arts> table2;
	TableColumn<Arts, String> name2;
	TableColumn<Arts, String> showDetails2;

	TableView<Arts> table2a;
	TableColumn<Arts, String> time2a;
	TableColumn<Arts, String> description2a;
	TableColumn<Arts, String> phoneNumber2a;
	TableColumn<Arts, String> location2a;

	TableView<Fitness> table3;
	TableColumn<Fitness, String> name3;
	TableColumn<Fitness, String> showDetails3;

	TableView<Fitness> table3a;
	TableColumn<Fitness, String> time3a;
	TableColumn<Fitness, String> description3a;
	TableColumn<Fitness, String> phoneNumber3a;
	TableColumn<Fitness, String> location3a;

	TableView<Food> table4;
	TableColumn<Food, String> name4;
	TableColumn<Food, String> showDetail4;

	TableView<Food> table4a;
	TableColumn<Food, String> time4a;
	TableColumn<Food, String> description4a;
	TableColumn<Food, String> phoneNumber4a;
	TableColumn<Food, String> location4a;

	TableView<Charity> table5;
	TableColumn<Charity, String> name5;
	TableColumn<Charity, String> showDetail5;

	TableView<Charity> table5a;
	TableColumn<Charity, String> time5a;
	TableColumn<Charity, String> description5a;
	TableColumn<Charity, String> phoneNumber5a;
	TableColumn<Charity, String> location5a;

	TableView<Private1> table6;
	TableColumn<Private1, String> eventType;
	TableColumn<Private1, String> location;
	TableColumn<Private1, String> numberOfGuests;
	TableColumn<Private1, String> dressCode;
	TableColumn<Private1, String> date;
	TableColumn<Private1, String> time;
	TableColumn<Private1, String> email;

	RadioButton rbMusic;
	RadioButton rbArt;
	RadioButton rbFitness;
	RadioButton rbFood;
	RadioButton rbCharity;
	RadioButton rbNewMusic;
	RadioButton rbNewArt;
	RadioButton rbNewFitness;
	RadioButton rbNewFood;
	RadioButton rbNewCharity;
	RadioButton rbHairDresser;
	RadioButton rbPhotographer;
	RadioButton rbMakeUpArtist;
	RadioButton rbHotels;
	RadioButton rbLandMarks;
	RadioButton rbDecorations;
	RadioButton rbFlowerShop;
	RadioButton rbCatering;
	RadioButton rbBeachClubs;
	RadioButton rbWedding;
	RadioButton rbBirthDay;
	RadioButton rbGraduation;
	RadioButton rbEngagement;
	RadioButton rbOpeningCeremony;
	RadioButton rbMarketingAgencies;
	RadioButton rbSponsors;
	RadioButton rbOnline;
	RadioButton rbOffline;
	RadioButton rbBoth;

	RadioButton rbCateringWedding;
	RadioButton rbCateringBirthDay;
	RadioButton rbCateringGraduation;
	RadioButton rbCateringEngagement;
	RadioButton rbCateringOpeningCeremony;
	RadioButton rbPackage;
	RadioButton rbItem;
	RadioButton rbSponsorFood;
	RadioButton rbSponsorFitness;
	RadioButton rbSponsorMusic;
	RadioButton rbSponsorCharity;

	ToggleGroup togglegroup1;
	ToggleGroup togglegroup2;
	ToggleGroup togglegroup3;
	ToggleGroup togglegroup4;
	ToggleGroup togglegroup5;
	ToggleGroup togglegroup6;
	ToggleGroup togglegroup7;
	ToggleGroup togglegroup8;
	ToggleGroup togglegroup9;
	ToggleGroup togglegroup10;
	ToggleGroup togglegroup11;

	BorderPane borderPane1;
	BorderPane borderPane2;
	BorderPane borderPane3;
	BorderPane borderPane4;
	BorderPane borderPane5;
	BorderPane borderPane6;
	BorderPane borderPane7;
	BorderPane borderPane8;
	BorderPane borderPane8a;
	BorderPane borderPane9;
	BorderPane borderPane9a;
	BorderPane borderPane10;
	BorderPane borderPane10a;
	BorderPane borderPane11;
	BorderPane borderPane11a;
	BorderPane borderPane12;
	BorderPane borderPane12a;
	BorderPane borderPane13;
	BorderPane borderPane14;
	BorderPane borderPane15;
	BorderPane borderPane16;
	BorderPane borderPane17;
	BorderPane borderPane18;
	BorderPane borderPane19;
	BorderPane borderPane20;
	BorderPane borderPane21;
	BorderPane borderPane22;
	BorderPane borderPane23;
	BorderPane borderPane24;
	BorderPane borderPane25;
	BorderPane borderPane26;
	BorderPane borderPane27;
	BorderPane borderPane28;
	BorderPane borderPane29;
	BorderPane borderPane30;
	BorderPane borderPane31;
	BorderPane borderPane32;
	BorderPane borderPane33;
	BorderPane borderPane34;
	BorderPane borderPane35;
	BorderPane borderPane36;
	BorderPane borderPane37;
	BorderPane borderPane38;

	StackPane stackPane;

	HBox hbox1;
	HBox hbox2;
	HBox hbox3;
	HBox hbox4;
	HBox hbox5;
	HBox hbox6;
	HBox hbox7;
	HBox hbox8;
	HBox hbox9;
	HBox hbox10;
	HBox hbox11;
	HBox hbox12;
	HBox hbox13;
	HBox hbox14;
	HBox hbox15;
	HBox hbox16;
	HBox hbox17;
	HBox hbox18;
	HBox hbox19;
	HBox hbox20;
	HBox hbox21;
	HBox hbox22;
	HBox hbox23;
	HBox hbox24;
	HBox hbox25;
	HBox hbox26;
	HBox hbox27;
	HBox hbox28;
	HBox hbox29;
	HBox hbox30;
	HBox hbox31;
	HBox hbox32;
	HBox hbox33;
	HBox hbox34;
	HBox hbox35;
	HBox hbox36;
	HBox hbox37;
	HBox hbox38;
	HBox hbox39;
	HBox hbox40;
	HBox hbox41;
	HBox hbox42;
	HBox hbox43;
	HBox hbox44;
	HBox hbox45;
	HBox hbox46;
	HBox hbox47;
	HBox hbox48;
	HBox hbox49;
	HBox hbox50;
	HBox hbox51;
	HBox hbox52;
	HBox hbox53;
	HBox hbox54;
	HBox hbox55;
	HBox hbox56;
	HBox hbox57;
	HBox hbox58;
	HBox hbox59;
	HBox hbox60;
	HBox hbox61;
	HBox hbox62;
	HBox hbox63;
	HBox hbox64;
	HBox hbox65;
	HBox hbox66;
	HBox hbox67;
	HBox hbox68;
	HBox hbox69;
	HBox hbox70;
	HBox hbox71;
	HBox hbox72;
	HBox hbox73;
	HBox hbox74;
	HBox hbox75;
	HBox hbox76;
	HBox hbox77;
	HBox hbox78;
	HBox hbox79;
	HBox hbox80;
	HBox hbox81;

	VBox vbox1;
	VBox vbox2;
	VBox vbox3;
	VBox vbox4;
	VBox vbox5;
	VBox vbox5a;
	VBox vbox6;
	VBox vbox6a;
	VBox vbox7;
	VBox vbox7a;
	VBox vbox8;
	VBox vbox8a;
	VBox vbox9;
	VBox vbox9a;
	VBox vbox10;
	VBox vbox11;
	VBox vbox12;
	VBox vbox12a;
	VBox vbox13;
	VBox vbox14;
	VBox vbox15;
	VBox vbox16;
	VBox vbox17;
	VBox vbox18;
	VBox vbox19;
	VBox vbox20;
	VBox vbox21;
	VBox vbox22;
	VBox vbox23;
	VBox vbox24;
	VBox vbox25;
	VBox vbox26;
	VBox vbox27;
	VBox vbox28;
	VBox vbox29;
	VBox vbox30;
	VBox vbox31;
	VBox vbox32;
	VBox vbox33;
	VBox vbox34;
	VBox vbox35;
	VBox vbox36;
	VBox vbox37;
	VBox vbox38;
	VBox vbox39;
	VBox vbox40;
	VBox vbox41;
	VBox vbox42;
	VBox vbox43;
	VBox vbox44;
	VBox vbox45;
	VBox vbox46;
	VBox vbox47;
	VBox vbox48;
	VBox vbox49;
	VBox vbox50;

	ListView<String> hairDresserlistView;
	ListView<String> makeUpArtistlistView;
	ListView<String> photographerlistView;
	ListView<String> hotelListView;
	ListView<String> LandMarkListView;
	ListView<String> beachClubListView;
	ListView<String> decorationsListView;
	ListView<String> flowerShopListView;
	ListView<String> marketingListView;
	ListView<String> bandsListView;
	ListView<String> CateringListView;
	ListView<String> SponsorsListView;

	GridPane gridPane;

	Rectangle rectangle1;
	Rectangle rectangle2;
	Rectangle rectangle3;
	Rectangle rectangle4;
	Rectangle rectangle5;
	Rectangle rectangle6;
	Polygon polygon1;

	StrokeTransition stroke1;
	StrokeTransition stroke2;
	StrokeTransition stroke3;
	StrokeTransition stroke4;
	StrokeTransition stroke5;
	StrokeTransition stroke6;
	FillTransition fill;

	WebView web;
	WebView web2;
	WebEngine engine;
	WebEngine engine2;

	Scene welcomeScene;
	Scene loginScene;
	Scene homeScene;
	Scene signUpScene;
	Scene webScene;
	Scene addScene;
	Scene checkEvents;
	Scene MusicTable;
	Scene ArtsTable;
	Scene FitnessTable;
	Scene FoodTable;
	Scene CharityTable;
	Scene privateOrPublicScene;
	Scene musicDetails;
	Scene artsDetails;
	Scene fitnessDetails;
	Scene foodDetails;
	Scene charityDetails22;
	Scene manageEvents;
	Scene privateTable;
	Scene personScene;
	Scene PlacesScene;
	Scene hairDresserScene;
	Scene makeUpArtistScene;
	Scene photographerScene;
	Scene scene;
	Scene showDetailsHairDresser;
	Scene HotelScene;
	Scene LandMarksScene;
	Scene hotelDetailsScene;
	Scene LandMarksDetailsScene;
	Scene beachClubScene;
	Scene webScene2;
	Scene servicesScene;
	Scene decorationsScene;
	Scene cateringScene;
	Scene waitersScene;
	Scene flowerShopScene;
	Scene companyScene;
	Scene MarketingAgenciesScene;
	Scene SponsorsScene;
	Scene entertainmentScene;
	Scene bandsScene;
	Scene dancersScene;
	Scene cateringReviewsScene;
	Scene PackageScene;
	Scene ItemScene;

	Stage stage;

	String password = "fmaamito15";
	String myAccountEmail = "mido1998152014@gmail.com";
    
	String photographerPrice;
	String makeUpArtistPrice;
	String c;
	String d;
	String e;
	String sAnswer1;
	String sAnswer2;
	String sAnswer3;
	String Phone;
	String FaceBook;
	String Instagram;
	String Price;
	String hotel;
	String PriceDecorations1;
	String PriceDecorations2;
	String PriceDecorations3;
	String PriceDecorations4;
	String PriceDecorations5;
	String total;
	String string;

	String numberOfRoses;
	String numberOfLilies;
	String numberOfSunFlowers;
	String numberOfTulips;
	String cateringName;
	String cateringPackage;
	String cateringPackage2;
	String cateringPackage3;

	int index;
	int price1;
	int numberOfPeople1;
	int answer1;
	int price2;
	int numberOfPeople2;
	int answer2;
	int price3;
	int numberOfPeople3;
	int answer3;
	int return1;
	int tempx;
	int tempy;
	int tempz;
	int indexDecoration;
	int landMarkPrice;
	int BeachClubPrice;
	int decorationsPrice;
	int flowerShopAnswer;
	int lily = 0;
	int rose = 0;
	int tulip = 0;
	int sunFlower = 0;
	int p;
	int billBoard = 0;
	int flier = 0;
	int banner = 0;
	int companyName;
	int catering;
	int indexSponsor;
	int sum = 0;

	ArrayList<String> dataHotelWebsite;
	ArrayList<String> beachClubsLocationData;

	ComboBox flowerShopComboBox;

	CheckBox flowerShopCheckBoxRose;
	CheckBox flowerShopCheckBoxLily;
	CheckBox flowerShopCheckBoxSunFlower;
	CheckBox flowerShopCheckBoxTulip;
	CheckBox companyCheckBoxBanner;
	CheckBox companyCheckBoxBillBoard;
	CheckBox companyCheckBoxFliers;
	CheckBox cateringCheckBoxDessert1;
	CheckBox cateringCheckBoxDessert2;
	CheckBox cateringCheckBoxDessert3;
	CheckBox cateringCheckBoxDessert4;
	CheckBox cateringCheckBoxDessert5;
	CheckBox cateringCheckBoxAppetizers1;
	CheckBox cateringCheckBoxAppetizers2;
	CheckBox cateringCheckBoxAppetizers3;
	CheckBox cateringCheckBoxAppetizers4;
	CheckBox cateringCheckBoxAppetizers5;
	CheckBox cateringCheckBoxMainDishes1;
	CheckBox cateringCheckBoxMainDishes2;
	CheckBox cateringCheckBoxMainDishes3;
	CheckBox cateringCheckBoxMainDishes4;
	CheckBox cateringCheckBoxMainDishes5;

	DBConnect objConnection;
	Connection connection;
	HairDresser objHairDresser;
	makeUpArtist objMakeUpArtist;
	Photographer objPhotographer;
	Hotel objHotel;
	LandMarks objLandMark;
	Beachclubs objBeachClub;
	Decorations objDecorations;
	FlowerShop objFlowerShop;
	MarketingAgencies objMarketing;
	Bands objBands;
	Catering objCatering;
	MediaView mediaView1;

	public void start(Stage primaryStage) throws Exception {
		objHairDresser = new HairDresser();
		objMakeUpArtist = new makeUpArtist();
		objPhotographer = new Photographer();
		objHotel = new Hotel();
		objLandMark = new LandMarks();
		objBeachClub = new Beachclubs();
		objDecorations = new Decorations();
		objFlowerShop = new FlowerShop();
		objMarketing = new MarketingAgencies();
		objBands = new Bands();
		objCatering = new Catering();

		DBConnect.connect();
		DBConnect2.connect2();
		stage = primaryStage;
		// WELCOME PAGE👇👇👇..........................................................

	

		lbWelcome = new Label("FOUR M'S EVENTS");
		lbWelcome.setFont(Font.font(null, FontWeight.BOLD, 80));
		lbWelcome.setFont(new Font("Algerian", 80));
		lbWelcome.setTranslateX(80);
		lbWelcome.setTranslateY(200);
		lbWelcome.setTextFill(Color.web("#21CFD1"));

		btnLogIn = new Button("LOGIN");
		btnLogIn.setScaleX(2);
		btnLogIn.setScaleY(2);
		btnLogIn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(loginScene);
			}
		});

		btnSignUp = new Button("SIGNUP");
		btnSignUp.setScaleX(2);
		btnSignUp.setScaleY(2);
		btnSignUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(signUpScene);
			}
		});

		hbox1 = new HBox(100);
		hbox1.getChildren().addAll(btnLogIn, btnSignUp);
		hbox1.setTranslateX(270);
		hbox1.setTranslateY(300);

		vbox49 = new VBox(5);
		vbox49.getChildren().addAll(lbWelcome, hbox1);
		borderPane1 = new BorderPane();
		borderPane1.setCenter(hbox1);
		borderPane1.setTop(lbWelcome);

		Media media1 = new Media(
				new File("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS VIDEOS/video.mp4").toURI().toString());
		MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
		mediaView1 = new MediaView(mediaPlayer1);
		
	
		//mediaPlayer1.setAutoPlay(true);

		stackPane = new StackPane();
		stackPane.getChildren().addAll(mediaView1, borderPane1);

		String path = "C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS MUSIC/j'san - alone by your side.mp3";
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		//mediaPlayer.setAutoPlay(true);

		welcomeScene = new Scene(stackPane, 800, 700);

		// LOGIN PAGE👇👇👇..........................................................
		lbLogin = new Label("LOGIN PAGE");
		lbLogin.setFont(Font.font(null, FontWeight.BOLD, 32));
		lbLogin.setTextFill(WHEAT);
		lbLogin.setTranslateX(150);
		lbLogin.setTranslateY(100);
		lbLogin.setFont(new Font("Arial", 50));

		borderPane2 = new BorderPane();
		borderPane2.setTop(lbLogin);
		borderPane2.setCenter(getVBox1());
		borderPane2.setBottom(getHBox4());

		FileInputStream input4 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(19) WhatsApp - Google Chrome 5_25_2020 8_49_18 PM.png");
		Image image4 = new Image(input4);
		BackgroundImage backgroundimage4 = new BackgroundImage(image4, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));

		Background background4 = new Background(backgroundimage4);
		borderPane2.setBackground(background4);

		loginScene = new Scene(borderPane2, 800, 700);

		// HOME PAGE👇👇👇..........................................................

		btnBack2 = new Button("BACK"); // BACK HOME PAGE BUTTON
		btnBack2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(loginScene);
			}
		});
		btnBack2.setTranslateX(700);
		btnBack2.setTranslateY(-50);
		btnBack2.setScaleX(1.5);
		btnBack2.setScaleY(1.5);

		btnManageEvent = new Button("MANAGE EVENT");// MANAGE BUTTON,LEFT
		//btnManageEvent.setStyle("fx-background-color:#800000");
		btnManageEvent.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});
		btnManageEvent.setTranslateX(80);
		btnManageEvent.setTranslateY(250);
		btnManageEvent.setScaleX(1.5);
		btnManageEvent.setScaleY(1.5);

		btnAddEvent = new Button("ADD EVENT");// ADD BUTTON,RIGHT
		btnAddEvent.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(addScene);

			}
		});
		btnAddEvent.setTranslateX(-80);
		btnAddEvent.setTranslateY(250);
		btnAddEvent.setScaleX(1.5);
		btnAddEvent.setScaleY(1.5);

		btnCheckevent = new Button("CHECK EVENTS");// CHECK BUTTON,TOP
		btnCheckevent.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(privateOrPublicScene);

			}
		});
		btnCheckevent.setTranslateX(340);
		btnCheckevent.setTranslateY(50);
		btnCheckevent.setScaleX(1.5);
		btnCheckevent.setScaleY(1.5);

		borderPane3 = new BorderPane();
		// borderPane3.setCenter(polygon1);
		borderPane3.setLeft(btnManageEvent);
		borderPane3.setRight(btnAddEvent);
		borderPane3.setTop(btnCheckevent);
		borderPane3.setBottom(btnBack2);
		FileInputStream input3 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(18) WhatsApp - Google Chrome 5_25_2020 8_27_05 PM.png");
		Image image3 = new Image(input3);
		BackgroundImage backgroundimage3 = new BackgroundImage(image3, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background3 = new Background(backgroundimage3);
		borderPane3.setBackground(background3);

		// stackPane3 = new StackPane(rectangle3, borderPane3);

		homeScene = new Scene(borderPane3, 800, 700);

		// SIGNUP PAGE👇👇👇.........................................................

		lbSignUp = new Label("SIGNUP PAGE");
		lbSignUp.setFont(Font.font(null, FontWeight.BOLD, 32));
		lbSignUp.setTranslateX(195);
		lbSignUp.setTranslateY(20);

		borderPane4 = new BorderPane();
		borderPane4.setTop(lbSignUp);
		borderPane4.setCenter(getVBox2());

		FileInputStream input20 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (2).png");
		Image image20 = new Image(input20);

		BackgroundImage backgroundimage20 = new BackgroundImage(image20, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background20 = new Background(backgroundimage20);

		borderPane4.setBackground(background20);

		signUpScene = new Scene(borderPane4, 800, 700);

		// ADD EVENT
		// PAGE..................................................................
		lbTitleAdd = new Label("ADD YOUR EVENT");
		lbTitleAdd.setTranslateX(600);
		lbTitleAdd.setTranslateY(30);
		lbTitleAdd.setFont(new Font("Arial", 40));
		btnBack5 = new Button("BACK");
		btnBack5.setTranslateX(1200);
		btnBack5.setTranslateY(-230);

		

		btnBack5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				stage.setScene(homeScene);
				tfLocation.clear();
				tfNumberOfGuests.clear();
				tfDressCode.clear();
				tfDate.clear();
				tfTime.clear();
				tfAddEmail.clear();
			}
		});
		btnBack5.setScaleX(1.5);
		btnBack5.setScaleY(1.5);

		gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);

		gridPane.setHgap(5.5);
		gridPane.setVgap(5.5);

		lbEventType = new Label("EVENT TYPE:");

		lbEventType.setFont(new Font("Forte", 25));

		lbLocation = new Label("LOCATION:");

		lbLocation.setFont(new Font("Forte", 25));

		lbNumberOfGuests = new Label("NUMBER OF GUESTS:");

		lbNumberOfGuests.setFont(new Font("Forte", 25));

		lbDressCode = new Label("DRESS CODE");

		lbDressCode.setFont(new Font("Forte", 25));

		lbDate = new Label("DATE");

		lbDate.setFont(new Font("Forte", 25));

		lbTime = new Label("TIME");

		lbTime.setFont(new Font("Forte", 25));

		lbAddEmail = new Label("EMAIL:");

		lbAddEmail.setFont(new Font("Forte", 25));

		tfLocation = new TextField();
		tfNumberOfGuests = new TextField();
		tfDressCode = new TextField();
		tfDate = new TextField();
		tfTime = new TextField();
		tfAddEmail = new TextField();

		rbNewMusic = new RadioButton("music");

		rbNewMusic.setFont(new Font("Forte", 25));

		rbNewArt = new RadioButton("ART");

		rbNewArt.setFont(new Font("Forte", 25));

		rbNewFitness = new RadioButton("FITNESS");

		rbNewFitness.setFont(new Font("Forte", 25));

		rbNewFood = new RadioButton("FOOD");

		rbNewFood.setFont(new Font("Forte", 25));

		rbNewCharity = new RadioButton("CHARITY");

		rbNewCharity.setFont(new Font("Forte", 25));

		togglegroup2 = new ToggleGroup();
		rbNewMusic.setToggleGroup(togglegroup2);
		rbNewFood.setToggleGroup(togglegroup2);
		rbNewCharity.setToggleGroup(togglegroup2);
		rbNewArt.setToggleGroup(togglegroup2);
		rbNewFitness.setToggleGroup(togglegroup2);

		hbox15 = new HBox(5);
		hbox15.getChildren().addAll(rbNewMusic, rbNewArt, rbNewFitness, rbNewFood, rbNewCharity);

		gridPane.add(lbEventType, 0, 0);
		gridPane.add(hbox15, 1, 0);
		gridPane.add(lbLocation, 0, 2);
		gridPane.add(tfLocation, 1, 2);
		gridPane.add(lbNumberOfGuests, 0, 3);
		gridPane.add(tfNumberOfGuests, 1, 3);
		gridPane.add(lbDressCode, 0, 4);
		gridPane.add(tfDressCode, 1, 4);
		gridPane.add(lbDate, 0, 5);
		gridPane.add(tfDate, 1, 5);
		gridPane.add(lbTime, 0, 6);
		gridPane.add(tfTime, 1, 6);
		gridPane.add(lbAddEmail, 0, 7);
		gridPane.add(tfAddEmail, 1, 7);

		btnSave = new Button("SAVE");
		btnSave.setScaleX(1.5);
		btnSave.setScaleY(1.5);

		btnSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbNewMusic.isSelected()) {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email ) VALUES ( '"
										+ "MUSIC" + "' , '" + tfLocation.getText() + "' , '"
										+ tfNumberOfGuests.getText() + "' , '" + tfDressCode.getText() + "' , '"
										+ tfDate.getText() + "','" + tfTime.getText() + "','" + tfAddEmail.getText()
										+ "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

				else if (rbNewArt.isSelected()) {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email  ) VALUES ( '"
										+ "ART" + "' , '" + tfLocation.getText() + "' , '" + tfNumberOfGuests.getText()
										+ "' , '" + tfDressCode.getText() + "' , '" + tfDate.getText() + "','"
										+ tfTime.getText() + "','" + tfAddEmail.getText() + "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

				else if (rbNewFitness.isSelected()) {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email  ) VALUES ( '"
										+ "FITNESS" + "' , '" + tfLocation.getText() + "' , '"
										+ tfNumberOfGuests.getText() + "' , '" + tfDressCode.getText() + "' , '"
										+ tfDate.getText() + "','" + tfTime.getText() + "','" + tfAddEmail.getText()
										+ "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

				else if (rbNewFood.isSelected()) {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email  ) VALUES ( '"
										+ "FOOD" + "' , '" + tfLocation.getText() + "' , '" + tfNumberOfGuests.getText()
										+ "' , '" + tfDressCode.getText() + "' , '" + tfDate.getText() + "','"
										+ tfTime.getText() + "','" + tfAddEmail.getText() + "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

				else if (rbNewCharity.isSelected()) {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email  ) VALUES ( '"
										+ "CHARITY" + "' , '" + tfLocation.getText() + "' , '"
										+ tfNumberOfGuests.getText() + "' , '" + tfDressCode.getText() + "' , '"
										+ tfDate.getText() + "','" + tfTime.getText() + "','" + tfAddEmail.getText()
										+ "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

				else {

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO private (eventType , location ,numberOfGuests, dressCode ,date,time,email ) VALUES ( '"
										+ "ART" + "' , '" + tfLocation.getText() + "' , '" + tfNumberOfGuests.getText()
										+ "' , '" + tfDressCode.getText() + "' , '" + tfDate.getText() + "','"
										+ tfTime.getText() + "','" + tfAddEmail.getText() + "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

				}
				Properties properties2 = new Properties();
				properties2.put("mail.smtp.host", "smtp.gmail.com");
				properties2.put("mail.smtp.post", "465");
				properties2.put("mail.smtp.auth", "true");
				properties2.put("mail.smtp.socketFactory.port", "465");
				properties2.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

				Session session2 = Session.getInstance(properties2, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(myAccountEmail, password);
					}
				});

				try {
					Message message2 = new MimeMessage(session2);
					message2.setFrom(new InternetAddress(myAccountEmail));
					message2.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tfAddEmail.getText()));
					message2.setSubject("4M EVENTS");
					message2.setText("📢📢📢GREAT😉" + "\n YOUR EVENT HAS BEEN ADDED SUCCESSFULLY👌");
					Transport.send(message2);
				}

				catch (MessagingException e) {

					e.printStackTrace();
				}

			}
		});
		gridPane.add(btnSave, 1, 9);
		GridPane.setHalignment(btnSave, HPos.RIGHT);
		gridPane.setTranslateX(-200);

		borderPane5 = new BorderPane();
		borderPane5.setCenter(gridPane);
		borderPane5.setBottom(btnBack5);
		borderPane5.setTop(lbTitleAdd);

		BackgroundFill background_fill = new BackgroundFill(Color.ANTIQUEWHITE, null, null);
		Background background2 = new Background(background_fill);
		borderPane5.setBackground(background2);

		Image image2 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 5_25_2020 7_19_51 PM.png"));
		ImageView imageView = new ImageView(image2);
		imageView.setX(50);
		imageView.setY(25);

		borderPane5.setLeft(imageView);
		addScene = new Scene(borderPane5, 1900, 700);

		// CHECK EVENTS............................................................


		lbTitleCheck = new Label("CATEGORIES");
		lbTitleCheck.setTextFill(WHEAT);
		lbTitleCheck.setTranslateX(190);
		lbTitleCheck.setTranslateY(150);
		lbTitleCheck.setFont(new Font("Arial", 60));

		borderPane7 = new BorderPane();
		borderPane7.setTop(lbTitleCheck);
		borderPane7.setCenter(getHBox12());
		borderPane7.setBottom(getHBox13());
		// stackPane4 = new StackPane(rectangle6, borderPane7);

		FileInputStream input = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 5_25_2020 6_42_17 PM.png");
		Image image = new Image(input);
		BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background = new Background(backgroundimage);
		borderPane7.setBackground(background);

		checkEvents = new Scene(borderPane7, 800, 700);

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
		// PUBLIC OR PRIVATE PAGE

		btnPublic = new Button("PUBLIC EVENTS");
		btnPublic.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(checkEvents);
			}
		});
		btnPublic.setScaleX(1.5);
		btnPublic.setScaleY(1.5);

		btnPrivate = new Button("PRIVATE EVENTS");
		btnPrivate.setScaleX(1.5);
		btnPrivate.setScaleY(1.5);

		btnPrivate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				table6 = new TableView();
				table6.prefWidthProperty();
				table6.setMaxWidth(Region.USE_PREF_SIZE);
				table6.setEditable(true);

				ObservableList<Private1> data6 = FXCollections.observableArrayList();
				lbPrivate = new Label("🔒PRIVATE🔒");
				lbPrivate.setFont(Font.font(null, FontWeight.BOLD, 32));
				lbPrivate.setTranslateX(500);

				btnBack14 = new Button("BACK");
				btnBack14.setTranslateX(1400);
				btnBack14.setTranslateY(-100);
				btnBack14.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						stage.setScene(privateOrPublicScene);
					}
				});
				btnBack14.setScaleX(1.5);
				btnBack14.setScaleY(1.5);

				eventType = new TableColumn<Private1, String>("EVENT_TYPE");
				eventType.setCellValueFactory(new PropertyValueFactory<>("eventType"));
				eventType.setMinWidth(10);

				location = new TableColumn<Private1, String>("LOCATION");
				location.setMinWidth(200);
				location.setCellValueFactory(new PropertyValueFactory<>("location"));

				numberOfGuests = new TableColumn<Private1, String>("NUMBER_OF_GUESTS");
				numberOfGuests.setMinWidth(200);
				numberOfGuests.setCellValueFactory(new PropertyValueFactory<>("numberOfGuests"));

				dressCode = new TableColumn<Private1, String>("DRESS_CODE");
				dressCode.setMinWidth(200);
				dressCode.setCellValueFactory(new PropertyValueFactory<>("dressCode"));

				date = new TableColumn<Private1, String>("DATE");
				date.setMinWidth(200);
				date.setCellValueFactory(new PropertyValueFactory<>("date"));

				time = new TableColumn<Private1, String>("TIME");
				time.setMinWidth(200);
				time.setCellValueFactory(new PropertyValueFactory<>("time"));

				email = new TableColumn<Private1, String>("EMAIL");
				email.setMinWidth(200);
				email.setCellValueFactory(new PropertyValueFactory<>("email"));

				try {

					ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM private");
					while (result.next()) {
						String eventType = result.getString(1);
						String location = result.getString(2);
						String numberOfGuests = result.getString(3);
						String dressCode = result.getString(4);
						String date = result.getString(5);
						String time = result.getString(6);
						String email = result.getString(7);
						data6.addAll(new Private1(eventType, location, numberOfGuests, dressCode, date, time, email));

					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

				table6.setItems(data6);
				table6.getColumns().addAll(eventType, location, numberOfGuests, dressCode, date, time, email);

				vbox11 = new VBox();
				vbox11.setSpacing(5);
				vbox11.getChildren().addAll(lbPrivate, table6);
				vbox11.setTranslateX(30);

				borderPane14 = new BorderPane();
				borderPane14.setCenter(vbox11);
				borderPane14.setBottom(btnBack14);

				FileInputStream input24 = null;
				try {
					input24 = new FileInputStream(
							"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (19).png");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Image image24 = new Image(input24);
				BackgroundImage backgroundimage24 = new BackgroundImage(image24, BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
						new BackgroundSize(1.0, 1.0, true, true, false, false));
				Background background24 = new Background(backgroundimage24);
				borderPane14.setBackground(background24);

				privateTable = new Scene(borderPane14, 1500, 700);
				stage.setScene(privateTable);

			}
		});
		btnBack11 = new Button("BACK");
		btnBack11.setScaleX(1.5);
		btnBack11.setScaleY(1.5);
		btnBack11.setTranslateX(225);
		btnBack11.setTranslateY(-200);
		btnBack11.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(homeScene);

			}
		});

		hbox14 = new HBox(80);
		hbox14.getChildren().addAll(btnPublic, btnPrivate);
		hbox14.setTranslateX(115);
		hbox14.setTranslateY(200);
		borderPane11 = new BorderPane();
		borderPane11.setCenter(hbox14);
		borderPane11.setBottom(btnBack11);

		FileInputStream input24 = null;
		try {
			input24 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (21).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image24 = new Image(input24);
		BackgroundImage backgroundimage24 = new BackgroundImage(image24, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background24 = new Background(backgroundimage24);
		borderPane11.setBackground(background24);

		privateOrPublicScene = new Scene(borderPane11, 800, 700);
		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// MANAGE EVENTS
		// SCENE............................................................

		btnBack15 = new Button("BACK");
		btnBack15.setTranslateX(1500);
		btnBack15.setTranslateY(-100);
		btnBack15.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(homeScene);
			}
		});
		btnBack15.setScaleX(1.5);
		btnBack15.setScaleY(1.5);
		
		btnPerson = new Button("PERSON");
		btnPerson.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(personScene);
			}
		});
		btnPerson.setScaleX(1.5);
		btnPerson.setScaleY(1.5);
		

		btnEntertainments = new Button("ENTERTAINMENTS");
		btnEntertainments.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(bandsScene);
			}
		});
		btnEntertainments.setScaleX(1.5);
		btnEntertainments.setScaleY(1.5);

		btnCompany = new Button("COMPANY");
		btnCompany.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(companyScene);
			}
		});
		btnCompany.setScaleX(1.5);
		btnCompany.setScaleY(1.5);

		btnServices = new Button("SERVICES");
		btnServices.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(servicesScene);
			}
		});
		btnServices.setScaleX(1.5);
		btnServices.setScaleY(1.5);

	

		btnPlaces = new Button("PLACES");
		btnPlaces.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(PlacesScene);
			}
		});
		btnPlaces.setScaleX(1.5);
		btnPlaces.setScaleY(1.5);
		
		Image image50 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 6_2_2020 9_21_50 PM.png"));
		ImageView imageView50 = new ImageView(image50);
		imageView50.setFitHeight(250);
		imageView50.setFitWidth(250);
		//imageView50.setX(1000);
		//imageView50.setY(100);
		
		
		Image image51 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 6_2_2020 9_20_28 PM.png"));
		ImageView imageView51 = new ImageView(image51);
		imageView51.setFitHeight(250);
		imageView51.setFitWidth(250);
		//imageView51.setX(1000);
		//imageView51.setY(100);
		
		
		Image image52 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 6_2_2020 9_25_13 PM.png"));
		ImageView imageView52 = new ImageView(image52);
		imageView52.setFitHeight(250);
		imageView52.setFitWidth(250);
		//imageView52.setX(1000);
		//imageView52.setY(100);
		
		
		Image image53 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 6_2_2020 9_22_48 PM.png"));
		ImageView imageView53 = new ImageView(image53);
		imageView53.setFitHeight(250);
		imageView53.setFitWidth(250);
		//imageView53.setX(1000);
		//imageView53.setY(100);
		
		
		Image image54 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 6_2_2020 9_24_05 PM.png"));
		ImageView imageView54 = new ImageView(image54);
		imageView54.setFitHeight(250);
		imageView54.setFitWidth(250);
		//imageView54.setX(1000);
		//imageView54.setY(100);
		
		
		
		

		hbox16 = new HBox(50);
		hbox16.getChildren().addAll(btnPerson,imageView50,btnCompany,imageView51);
		hbox16.setTranslateX(250);
		
		
		
		hbox81 = new HBox(50);
		hbox81.getChildren().addAll( btnPlaces,imageView54);
		hbox81.setTranslateX(500);
		hbox81.setTranslateY(100);
		
		

		
		hbox79 = new HBox(50);
		hbox79.getChildren().addAll( btnEntertainments,imageView52,btnServices, imageView53 );
		hbox79.setTranslateX(250);
		hbox79.setTranslateY(150);
		
		
	
		
		
		
		vbox50 = new VBox(50);
		vbox50.getChildren().addAll( hbox16,hbox81,hbox79);
		

		borderPane15 = new BorderPane();
		borderPane15.setCenter(vbox50);
		borderPane15.setBottom(btnBack15);

		BackgroundFill background_fill60 = new BackgroundFill(Color.BLANCHEDALMOND, null, null);
		Background background60 = new Background(background_fill);
		borderPane15.setBackground(background60);

		manageEvents = new Scene(borderPane15, 2000, 2000);

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// PERSON
		// SCENE................................................................................................

		btnView1 = new Button("VIEW");
		btnView1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbHairDresser.isSelected()) {
					stage.setScene(hairDresserScene);

				}

				else if (rbMakeUpArtist.isSelected()) {
					stage.setScene(makeUpArtistScene);

				}

				else {
					stage.setScene(photographerScene);

				}

			}

		});
		btnView1.setScaleX(1.5);
		btnView1.setScaleY(1.5);

		btnBack16 = new Button("BACK");
		btnBack16.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});
		btnBack16.setScaleX(1.5);
		btnBack16.setScaleY(1.5);

		togglegroup3 = new ToggleGroup();

		rbMakeUpArtist = new RadioButton("MAKEUP ARTIST");
		rbMakeUpArtist.setScaleX(1.5);
		rbMakeUpArtist.setTextFill(WHEAT);
		rbMakeUpArtist.setFont(new Font("Forte", 25));

		rbHairDresser = new RadioButton("HAIRDRESSER");
		rbHairDresser.setScaleX(1.5);
		rbHairDresser.setTextFill(WHEAT);
		rbHairDresser.setFont(new Font("Forte", 25));

		rbPhotographer = new RadioButton("PHOTOGRAPHER");
		rbPhotographer.setScaleX(1.5);
		rbPhotographer.setTextFill(WHEAT);
		rbPhotographer.setFont(new Font("Forte", 25));

		rbMakeUpArtist.setToggleGroup(togglegroup3);
		rbHairDresser.setToggleGroup(togglegroup3);
		rbPhotographer.setToggleGroup(togglegroup3);

		vbox12 = new VBox(80);
		vbox12.setSpacing(10);
		vbox12.setTranslateX(100);
		vbox12.setTranslateY(200);
		vbox12.getChildren().addAll(rbMakeUpArtist, rbHairDresser, rbPhotographer);

		hbox17 = new HBox(80);
		hbox17.setTranslateX(100);
		hbox17.setTranslateY(-200);
		hbox17.getChildren().addAll(btnView1, btnBack16);

		borderPane16 = new BorderPane();
		borderPane16.setCenter(vbox12);
		borderPane16.setBottom(hbox17);

		FileInputStream input26 = null;
		try {
			input26 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (7).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image26 = new Image(input26);
		BackgroundImage backgroundimage26 = new BackgroundImage(image26, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background26 = new Background(backgroundimage26);
		borderPane16.setBackground(background26);

		// stackPane4 = new StackPane(rectangle6, borderPane16);
		personScene = new Scene(borderPane16, 800, 700);
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////

		// HAIRDRESSER
		// SCENE............................................................................

		hairDresserlistView = new ListView<>();
		hairDresserlistView.setTranslateY(15);
		hairDresserlistView.setTranslateX(100);
		ArrayList<String> dataPrice = new ArrayList<String>();
		ArrayList<String> dataPhoneNumber = new ArrayList<String>();
		ArrayList<String> dataFaceBook = new ArrayList<String>();
		ArrayList<String> dataInstagram = new ArrayList<String>();

		ObservableList<String> list = FXCollections.observableArrayList();

		try {

			ResultSet result1 = DBConnect2.statement2.executeQuery("SELECT * FROM hairdresser");
			while (result1.next()) {
				String name = result1.getString(1);
				Phone = result1.getString(2);
				Price = result1.getString(3);
				FaceBook = result1.getString(4);
				Instagram = result1.getString(5);

				list.addAll(name);

				dataFaceBook.add(FaceBook);

				dataPrice.add(Price);

				dataInstagram.add(Instagram);

				dataPhoneNumber.add(Phone);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * 
		 */

		hairDresserlistView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov, String old_val, String new_val) -> {
					index = hairDresserlistView.getSelectionModel().getSelectedIndex();

					price1 = Integer.parseInt(dataPrice.get(index));

				});

		hairDresserlistView.setItems(list);

		lbDay = new Label("DAY:");
		lbDay.setTextFill(WHEAT);
		lbDay.setFont(new Font("Forte", 25));

		lbMonth = new Label("MONTH:");
		lbMonth.setTextFill(WHEAT);
		lbMonth.setFont(new Font("Forte", 25));

		lbYear = new Label("YEAR:");
		lbYear.setTextFill(WHEAT);
		lbYear.setFont(new Font("Forte", 25));

		tfDay = new TextField();
		tfDay.autosize();

		tfMonth = new TextField();
		tfMonth.autosize();

		tfYear = new TextField();
		tfYear.autosize();

		tfEnterNumberOfPeople = new TextField();
		lbEnterNumberOfPeople = new Label("ENTER NUMBER OF PEOPLE");
		lbEnterNumberOfPeople.setTextFill(WHEAT);
		lbEnterNumberOfPeople.setFont(new Font("Forte", 25));

		lbAnswerPrice = new Label("__________");
		lbAnswerPrice.setTextFill(WHEAT);
		lbAnswerPrice.setFont(new Font("Forte", 25));

		lbAnswerAvailable = new Label("__________");
		lbAnswerAvailable.setTextFill(WHEAT);
		lbAnswerAvailable.setFont(new Font("Forte", 25));
		lbAnswerAvailable.setTranslateX(40);

		btnCalculatePrice1 = new Button("CALCULATE PRICE");
		btnCalculatePrice1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				numberOfPeople1 = Integer.parseInt(tfEnterNumberOfPeople.getText());
				answer1 = objHairDresser.calcPrice(price1, numberOfPeople1);
				sAnswer1 = String.valueOf(answer1);
				lbAnswerPrice.setText(sAnswer1);

			}
		});
		btnCalculatePrice1.setScaleX(1.5);
		btnCalculatePrice1.setScaleY(1.5);

		btnCheckAvailable1 = new Button("CHECK AVAILABILITY");
		btnCheckAvailable1.setScaleX(1.5);
		btnCheckAvailable1.setScaleY(1.5);
		btnCheckAvailable1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int temp1 = Integer.parseInt(tfDay.getText());
				int temp2 = Integer.parseInt(tfMonth.getText());
				int temp3 = Integer.parseInt(tfYear.getText());
				return1 = objHairDresser.calcAvailability(temp1, temp2, temp3);
				if (return1 == 0) {
					lbAnswerAvailable.setText("NOT AVAILABLE");

				} else if (return1 == 1) {
					lbAnswerAvailable.setText("AVAILABLE");
				} else {
					lbAnswerAvailable.setText("ERROR");
				}
			}
		});
		btnBack17 = new Button("BACK");
		btnBack17.setScaleX(1.5);
		btnBack17.setScaleY(1.5);
		btnBack17.setTranslateX(1200);
		btnBack17.setTranslateY(-30);
		btnBack17.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(personScene);
			}
		});
		
		btnShowInfo = new Button("SHOW MORE INFO");
		btnShowInfo.setTranslateY(100);
		btnShowInfo.setTranslateX(500);
		btnShowInfo.setScaleX(1.5);
		btnShowInfo.setScaleY(1.5);
		btnShowInfo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				int index = hairDresserlistView.getSelectionModel().getSelectedIndex();
				lbInfoFaceBookAccount.setText("FaceBook Account:" + " " + dataFaceBook.get(index));
				lbInfoInstagramAccount.setText("Instagram Account:" + " " + dataInstagram.get(index));
				lbInfoPhoneNumber.setText("PhoneNumber:" + " " + dataPhoneNumber.get(index));

				stage.setScene(showDetailsHairDresser);
			}
		});
		

		hbox18 = new HBox(5);
		hbox18.getChildren().addAll(lbEnterNumberOfPeople, tfEnterNumberOfPeople);
		hbox24 = new HBox(10);
		hbox24.getChildren().addAll(btnCalculatePrice1, lbAnswerPrice);
		VBox vbox16 = new VBox(50);
		vbox16.getChildren().addAll(hbox18, hbox24);
		vbox16.setTranslateY(50);

		hbox19 = new HBox(5);
		hbox19.getChildren().addAll(lbDay, tfDay, lbMonth, tfMonth, lbYear, tfYear);
		hbox25 = new HBox(10);
		hbox25.getChildren().addAll(btnCheckAvailable1, lbAnswerAvailable);
		VBox vbox17 = new VBox(50);
		vbox17.getChildren().addAll(hbox19, hbox25);
		vbox17.setTranslateY(300);

		vbox13 = new VBox(-50);
		vbox13.getChildren().addAll(vbox17, vbox16);
		vbox13.setTranslateY(50);

		borderPane17 = new BorderPane();
		borderPane17.setLeft(hairDresserlistView);
		borderPane17.setRight(vbox13);
		borderPane17.setBottom(btnBack17);
		borderPane17.setTop(btnShowInfo);

		FileInputStream input8 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-26 (6).png");
		Image image8 = new Image(input8);

		BackgroundImage backgroundimage8 = new BackgroundImage(image8, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background8 = new Background(backgroundimage8);

		borderPane17.setBackground(background8);

		hairDresserScene = new Scene(borderPane17, 1300, 700);

		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// MAKEUP ARTIST
		// SCENE............................................................................

		makeUpArtistlistView = new ListView<>();
		makeUpArtistlistView.setTranslateY(15);
		makeUpArtistlistView.setTranslateX(100);
		ArrayList<String> data2 = new ArrayList<String>();

		ObservableList<String> list2 = FXCollections.observableArrayList();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM makeupartist");
			while (result2.next()) {
				String makeUpArtistName = result2.getString(1);
				makeUpArtistPrice = result2.getString(3);

				list2.add(makeUpArtistName);
				data2.add(makeUpArtistPrice);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		makeUpArtistlistView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {
					int index2 = makeUpArtistlistView.getSelectionModel().getSelectedIndex();

					price2 = Integer.parseInt(data2.get(index2));

				});

		makeUpArtistlistView.setItems(list2);

		tfEnterNumberOfPeople2 = new TextField();

		lbEnterNumberOfPeople2 = new Label("ENTER NUMBER OF PEOPLE");
		lbEnterNumberOfPeople2.setTextFill(WHEAT);
		lbEnterNumberOfPeople2.setFont(new Font("Forte", 25));

		lbAnswerPrice2 = new Label("__________");
		lbAnswerPrice2.setTextFill(WHEAT);
		lbAnswerPrice2.setFont(new Font("Forte", 25));
		


		btnCalculatePrice2 = new Button("CALCULATE PRICE");
		btnCalculatePrice2.setScaleX(1.5);
		btnCalculatePrice2.setScaleY(1.5);
		btnCalculatePrice2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				numberOfPeople2 = Integer.parseInt(tfEnterNumberOfPeople2.getText());
				answer2 = objMakeUpArtist.calcPrice(price2, numberOfPeople2);
				sAnswer2 = String.valueOf(answer2);
				lbAnswerPrice2.setText(sAnswer2);

			}
		});
		
		

		lbDay2 = new Label("DAY:");
		lbDay2.setTextFill(WHEAT);
		lbDay2.setFont(new Font("Forte", 25));

		lbMonth2 = new Label("MONTH:");
		lbMonth2.setTextFill(WHEAT);
		lbMonth2.setFont(new Font("Forte", 25));

		lbYear2 = new Label("YEAR:");
		lbYear2.setTextFill(WHEAT);
		lbYear2.setFont(new Font("Forte", 25));

		tfDay2 = new TextField();
		tfDay2.autosize();

		tfMonth2 = new TextField();
		tfMonth2.autosize();

		tfYear2 = new TextField();
		tfYear2.autosize(); 
		lbAnswerAvailable2 = new Label("__________");
		lbAnswerAvailable2.setFont(new Font("Forte", 25));
		lbAnswerAvailable2.setTextFill(WHEAT);
		lbAnswerAvailable2.setTranslateX(40);

		btnCheckAvailable2 = new Button("CHECK AVAILABILITY");
		btnCheckAvailable2.setScaleX(1.5);
		btnCheckAvailable2.setScaleY(1.5);
		btnCheckAvailable2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int temp4 = Integer.parseInt(tfDay2.getText());
				int temp5 = Integer.parseInt(tfMonth2.getText());
				int temp6 = Integer.parseInt(tfYear2.getText());
				return1 = objMakeUpArtist.calcAvailability(temp4, temp5, temp6);
				if (return1 == 0) {
					lbAnswerAvailable2.setText("NOT AVAILABLE");

				} else if (return1 == 1) {
					lbAnswerAvailable2.setText("AVAILABLE");
				} else {
					lbAnswerAvailable2.setText("ERROR");
				}
			}
		});

	    btnBack18 = new Button("BACK");
		btnBack18.setScaleX(1.5);
		btnBack18.setScaleY(1.5);
		btnBack18.setTranslateX(1100);
		btnBack18.setTranslateY(-30);
		btnBack18.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(personScene);
			}
		});

		hbox20 = new HBox(10);
		hbox20.getChildren().addAll(lbEnterNumberOfPeople2, tfEnterNumberOfPeople2);
		hbox26 = new HBox(10);
		hbox26.getChildren().addAll(btnCalculatePrice2, lbAnswerPrice2);
		vbox18 = new VBox(50);
		vbox18.getChildren().addAll(hbox20, hbox26);
		vbox18.setTranslateY(100);

		hbox21 = new HBox(10);
		hbox21.getChildren().addAll(lbDay2, tfDay2, lbMonth2, tfMonth2, lbYear2, tfYear2);
		hbox27 = new HBox(10);
		hbox27.getChildren().addAll(btnCheckAvailable2, lbAnswerAvailable2);
		vbox19 = new VBox(50);
		vbox19.getChildren().addAll(hbox21, hbox27);
		vbox19.setTranslateY(200);

		vbox14 = new VBox(-50);
		vbox14.getChildren().addAll(vbox18, vbox19);
		vbox14.setTranslateY(50);

		borderPane18 = new BorderPane();
		borderPane18.setLeft(makeUpArtistlistView);
		borderPane18.setRight(vbox14);
		borderPane18.setBottom(btnBack18);

		FileInputStream input7 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-26 (3).png");
		Image image7 = new Image(input7);

		BackgroundImage backgroundimage7 = new BackgroundImage(image7, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background7 = new Background(backgroundimage7);

		borderPane18.setBackground(background7);

		makeUpArtistScene = new Scene(borderPane18, 1300, 700);

		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// PHOTOGRAPHER
		// SCENE............................................................................

		photographerlistView = new ListView<>();
		photographerlistView.setTranslateY(15);
		photographerlistView.setTranslateX(100);
		ArrayList<String> data3 = new ArrayList<String>();

		ObservableList<String> list3 = FXCollections.observableArrayList();

		try {

			ResultSet result3 = DBConnect2.statement2.executeQuery("SELECT * FROM photographer");
			while (result3.next()) {
				String name3 = result3.getString(1);
				list3.addAll(name3);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * 
		 */

		try {

			ResultSet result3 = DBConnect2.statement2.executeQuery("SELECT * FROM photographer");
			while (result3.next()) {

				photographerPrice = result3.getString(3);
				data3.add(photographerPrice);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * 
		 */

		photographerlistView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov, String old_val, String new_val) -> {
					int index3 = photographerlistView.getSelectionModel().getSelectedIndex();

					price3 = Integer.parseInt(data3.get(index3));

				});

		photographerlistView.setItems(list3);

		lbDay3 = new Label("DAY:");
		lbDay3.setTextFill(WHEAT);
		lbDay3.setFont(new Font("Forte", 25));

		lbMonth3 = new Label("MONTH:");
		lbMonth3.setTextFill(WHEAT);
		lbMonth3.setFont(new Font("Forte", 25));

		lbYear3 = new Label("YEAR:");
		lbYear3.setTextFill(WHEAT);
		lbYear3.setFont(new Font("Forte", 25));

		tfDay3 = new TextField();
		tfDay3.autosize();

		tfMonth3 = new TextField();
		tfMonth3.autosize();

		tfYear3 = new TextField();
		tfYear3.autosize();

		tfEnterNumberOfPeople3 = new TextField();

		lbEnterNumberOfPeople3 = new Label("ENTER NUMBER OF PEOPLE");
		lbEnterNumberOfPeople3.setTextFill(WHEAT);
		lbEnterNumberOfPeople3.setFont(new Font("Forte", 25));

		lbAnswerPrice3 = new Label("__________");
		lbAnswerPrice3.setTextFill(WHEAT);
		lbAnswerPrice3.setFont(new Font("Forte", 25));

		lbAnswerAvailable3 = new Label("__________");
		lbAnswerAvailable3.setTextFill(WHEAT);
		lbAnswerAvailable3.setFont(new Font("Forte", 25));
		lbAnswerAvailable3.setTranslateX(40);

		btnCalculatePrice3 = new Button("CALCULATE PRICE");
		btnCalculatePrice3.setScaleX(1.5);
		btnCalculatePrice3.setScaleY(1.5);
		btnCalculatePrice3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				numberOfPeople3 = Integer.parseInt(tfEnterNumberOfPeople3.getText());
				answer3 = objPhotographer.calcPrice(price3, numberOfPeople3);
				sAnswer3 = String.valueOf(answer3);
				lbAnswerPrice3.setText(sAnswer3);

			}
		});
		btnCheckAvailable3 = new Button("CHECK AVAILABILITY");
		btnCheckAvailable3.setScaleX(1.5);
		btnCheckAvailable3.setScaleY(1.5);
		btnCheckAvailable3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int temp7 = Integer.parseInt(tfDay3.getText());
				int temp8 = Integer.parseInt(tfMonth3.getText());
				int temp9 = Integer.parseInt(tfYear3.getText());
				return1 = objPhotographer.calcAvailability(temp7, temp8, temp9);
				if (return1 == 0) {
					lbAnswerAvailable3.setText("NOT AVAILABLE");

				} else if (return1 == 1) {
					lbAnswerAvailable3.setText("AVAILABLE");
				} else {
					lbAnswerAvailable3.setText("ERROR");
				}
			}
		});
		Button btnBack19 = new Button("BACK");
		btnBack19.setScaleX(1.5);
		btnBack19.setScaleY(1.5);
		btnBack19.setTranslateX(980);
		btnBack19.setTranslateY(-30);
		btnBack19.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(personScene);
			}
		});

		hbox22 = new HBox(10);
		hbox22.getChildren().addAll(lbEnterNumberOfPeople3, tfEnterNumberOfPeople3);

		hbox28 = new HBox(10);
		hbox28.getChildren().addAll(btnCalculatePrice3, lbAnswerPrice3);

		vbox20 = new VBox(50);
		vbox20.getChildren().addAll(hbox22, hbox28);
		vbox20.setTranslateY(50);

		hbox23 = new HBox(10);
		hbox23.getChildren().addAll(lbDay3, tfDay3, lbMonth3, tfMonth3, lbYear3, tfYear3);

		hbox29 = new HBox(10);
		hbox29.getChildren().addAll(btnCheckAvailable3, lbAnswerAvailable3);

		vbox21 = new VBox(50);
		vbox21.getChildren().addAll(hbox23, hbox29);
		vbox21.setTranslateY(300);

		vbox15 = new VBox(-50);
		vbox15.getChildren().addAll(vbox20, vbox21);
		vbox15.setTranslateY(50);

		borderPane18 = new BorderPane();
		borderPane18.setLeft(photographerlistView);
		borderPane18.setRight(vbox15);
		borderPane18.setBottom(btnBack19);

		FileInputStream input9 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-26 (8).png");
		Image image9 = new Image(input9);

		BackgroundImage backgroundimage9 = new BackgroundImage(image9, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background9 = new Background(backgroundimage9);

		borderPane18.setBackground(background9);

		photographerScene = new Scene(borderPane18, 1300, 700);

		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////

		// HAIRDRESSER DETAILS......................................................
		btnBack20 = new Button("BACK");
		btnBack20.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(hairDresserScene);
			}
		});
		btnBack20.setTranslateX(200);
		btnBack20.setTranslateY(-250);

		lbInfoPhoneNumber = new Label("PHONE NUMBER");
		lbInfoPhoneNumber.setTextFill(WHEAT);
		lbInfoPhoneNumber.setFont(Font.font(null, FontWeight.BOLD, 20));

		lbInfoFaceBookAccount = new Label("FACEBOOK ACCOUNT");
		lbInfoFaceBookAccount.setTextFill(WHEAT);
		lbInfoFaceBookAccount.setFont(Font.font(null, FontWeight.BOLD, 20));

		lbInfoInstagramAccount = new Label("INSTAGRAM ACCOUNT");
		lbInfoInstagramAccount.setTextFill(WHEAT);
		lbInfoInstagramAccount.setFont(Font.font(null, FontWeight.BOLD, 20));

		vbox22 = new VBox(10);
		vbox22.getChildren().addAll(lbInfoPhoneNumber, lbInfoFaceBookAccount, lbInfoInstagramAccount);

		borderPane20 = new BorderPane();
		borderPane20.setCenter(vbox22);
		borderPane20.setBottom(btnBack20);

		BackgroundFill background_fill2 = new BackgroundFill(Color.DARKSLATEGREY, null, null);
		Background background30 = new Background(background_fill2);
		borderPane20.setBackground(background30);

		showDetailsHairDresser = new Scene(borderPane20, 500, 500);
		////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////

		// PLACES
		// SCENE.......................................................................

		btnView2 = new Button("VIEW");
		btnView2.setScaleX(1.5);
		btnView2.setScaleY(1.5);
		btnView2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbHotels.isSelected()) {
					stage.setScene(HotelScene);

				}

				else if (rbLandMarks.isSelected()) {
					stage.setScene(LandMarksScene);

				}

				else {
					stage.setScene(beachClubScene);

				}

			}

		});

		btnBack21 = new Button("BACK");
		btnBack21.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});
		btnBack21.setScaleX(1.5);
		btnBack21.setScaleY(1.5);

		togglegroup4 = new ToggleGroup();

		rbHotels = new RadioButton("HOTELS");
		rbHotels.setScaleX(1.5);
		rbHotels.setTextFill(WHEAT);
		rbHotels.setFont(new Font("Forte", 25));

		rbLandMarks = new RadioButton("LANDMARKS");
		rbLandMarks.setScaleX(1.5);
		rbLandMarks.setTextFill(WHEAT);
		rbLandMarks.setFont(new Font("Forte", 25));

		rbBeachClubs = new RadioButton("BEACH CLUBS");
		rbBeachClubs.setScaleX(1.5);
		rbBeachClubs.setTextFill(WHEAT);
		rbBeachClubs.setFont(new Font("Forte", 25));

		rbHotels.setToggleGroup(togglegroup4);
		rbLandMarks.setToggleGroup(togglegroup4);
		rbBeachClubs.setToggleGroup(togglegroup4);

		vbox23 = new VBox(80);
		vbox23.setSpacing(10);
		vbox23.setTranslateX(100);
		vbox23.setTranslateY(200);
		vbox23.getChildren().addAll(rbHotels, rbLandMarks, rbBeachClubs);

		hbox30 = new HBox(80);
		hbox30.setTranslateX(100);
		hbox30.setTranslateY(-200);
		hbox30.getChildren().addAll(btnView2, btnBack21);

		borderPane21 = new BorderPane();
		borderPane21.setCenter(vbox23);
		borderPane21.setBottom(hbox30);

		FileInputStream input14 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (7).png");
		Image image14 = new Image(input14);

		BackgroundImage backgroundimage14 = new BackgroundImage(image14, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background14 = new Background(backgroundimage14);

		borderPane21.setBackground(background14);

		PlacesScene = new Scene(borderPane21, 800, 700);

////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////

		// HOTEL
		// SCENE..................................................................................

		hotelListView = new ListView<>();
		hotelListView.setTranslateY(15);
		hotelListView.setTranslateX(100);
		ArrayList<String> dataHotelName = new ArrayList<String>();
		ArrayList<String> dataHotelPhoneNumber = new ArrayList<String>();
		ArrayList<String> dataHotelLocation = new ArrayList<String>();
		dataHotelWebsite = new ArrayList<String>();

		ObservableList<String> hotelList = FXCollections.observableArrayList();

		try {

			ResultSet result4 = DBConnect2.statement2.executeQuery("SELECT * FROM hotel");
			while (result4.next()) {
				String hotelName = result4.getString(1);
				String hotelPhoneNumber = result4.getString(2);
				String hotelLocation = result4.getString(7);
				String hotelWebSite = result4.getString(3);
				hotelList.addAll(hotelName);
				dataHotelName.add(hotelName);
				dataHotelPhoneNumber.add(hotelPhoneNumber);
				dataHotelLocation.add(hotelLocation);
				dataHotelWebsite.add(hotelWebSite);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		hotelListView.setItems(hotelList);

		lbShowPrice = new Label("____");
		lbShowPrice.setTextFill(WHEAT);
		lbShowPrice.setFont(new Font("Forte", 25));

		lbShowHall = new Label("____");
		lbShowHall.setTextFill(WHEAT);
		lbShowHall.setFont(new Font("Forte", 25));

		lbEnterNumberOfPeople4 = new Label("ENTER NUMBER OF PEOPLE");
		lbEnterNumberOfPeople4.setTextFill(WHEAT);
		lbEnterNumberOfPeople4.setFont(new Font("Forte", 25));
		tfEnterNumberOfPeople4 = new TextField();

		lbEnterNumberOfHours = new Label("ENETR NUMBER OF HOURS");
		lbEnterNumberOfHours.setTextFill(WHEAT);
		lbEnterNumberOfHours.setFont(new Font("Forte", 25));
		tfEnterNumberOfHours = new TextField();

		btnBack22 = new Button("BACK");
		btnBack22.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(PlacesScene);
			}
		});
		btnBack22.setScaleX(1.5);
		btnBack22.setScaleY(1.5);

		btnPriceAndHall = new Button("SHOW PRICE  AND HALL");
		btnPriceAndHall.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				try {
					total = objHotel.calcPrice(tfEnterNumberOfHours.getText(), tfEnterNumberOfPeople4.getText(),
							dataHotelName.get(hotelListView.getSelectionModel().getSelectedIndex()));
					lbShowPrice.setText(total + "LE");
					lbShowHall.setText(objHotel.showHall());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnPriceAndHall.setScaleX(1.5);
		btnPriceAndHall.setScaleY(1.5);

		btnShowdetails = new Button("SHOW DETAILS");
		btnShowdetails.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				lbshowHotelPhoneNumber.setText("PHONE NUMBER:" + " "
						+ dataHotelPhoneNumber.get(hotelListView.getSelectionModel().getSelectedIndex()));
				lbshowHotelLocation.setText("LOCATION:" + " "
						+ dataHotelLocation.get(hotelListView.getSelectionModel().getSelectedIndex()));

				stage.setScene(hotelDetailsScene);

			}
		});
		btnShowdetails.setTranslateX(500);
		btnShowdetails.setTranslateY(50);
		btnShowdetails.setScaleX(1.5);
		btnShowdetails.setScaleY(1.5);

		hbox31 = new HBox(10);
		hbox31.getChildren().addAll(lbEnterNumberOfPeople4, tfEnterNumberOfPeople4);

		hbox32 = new HBox(10);
		hbox32.getChildren().addAll(lbEnterNumberOfHours, tfEnterNumberOfHours);

		hbox33 = new HBox(80);
		hbox33.getChildren().addAll(btnPriceAndHall, btnBack22);

		hbox34 = new HBox(10);
		hbox34.getChildren().addAll(lbShowPrice, lbShowHall);
		hbox34.setTranslateY(-50);
		hbox34.setTranslateX(100);

		vbox24 = new VBox(100);
		vbox24.getChildren().addAll(hbox31, hbox32, hbox33, hbox34);
		vbox24.setTranslateY(150);
		vbox24.setTranslateX(-50);

		borderPane22 = new BorderPane();
		borderPane22.setRight(vbox24);
		borderPane22.setLeft(hotelListView);
		borderPane22.setTop(btnShowdetails);

		FileInputStream input10 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(17) WhatsApp - Google Chrome 5_27_2020 3_51_17 PM.png");
		Image image10 = new Image(input10);

		BackgroundImage backgroundimage10 = new BackgroundImage(image10, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background10 = new Background(backgroundimage10);

		borderPane22.setBackground(background10);

		HotelScene = new Scene(borderPane22, 1000, 700);

		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////

		// HOTEL DETAILS
		// SCENE....................................................................................

		lbshowHotelPhoneNumber = new Label("-----");
		lbshowHotelPhoneNumber.setTextFill(WHEAT);
		lbshowHotelPhoneNumber.setFont(Font.font(null, FontWeight.BOLD, 20));

		lbshowHotelLocation = new Label("-----");
		lbshowHotelLocation.setTextFill(WHEAT);
		lbshowHotelLocation.setFont(Font.font(null, FontWeight.BOLD, 20));

		btnShowHotelSite = new Button("SHOW WEBSITE");
		btnShowHotelSite.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				web = new WebView();
				engine = web.getEngine();
				engine.load(dataHotelWebsite.get(hotelListView.getSelectionModel().getSelectedIndex()));
				btnBack4 = new Button("BACK");
				btnBack4.setTranslateX(500);
				btnBack4.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						stage.setScene(homeScene);
					}
				});

				vbox3 = new VBox();
				vbox3.getChildren().addAll(web, btnBack4);
				webScene = new Scene(vbox3, 1000, 1000);

				stage.setScene(webScene);
			}
		});
		btnBack23 = new Button("BACK");
		btnBack23.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				stage.setScene(HotelScene);

			}
		});
		// btnBack23.setTranslateX(200);
		// btnBack23.setTranslateY(-250);

		vbox26 = new VBox(10);
		vbox26.getChildren().addAll(lbshowHotelPhoneNumber, lbshowHotelLocation);

		hbox36 = new HBox(10);
		hbox36.getChildren().addAll(btnShowHotelSite, btnBack23);

		vbox25 = new VBox(10);
		vbox25.getChildren().addAll(vbox26, hbox36);

		borderPane23 = new BorderPane();
		borderPane23.setCenter(vbox25);

		BackgroundFill background_fill3 = new BackgroundFill(Color.DARKSLATEGREY, null, null);
		Background background31 = new Background(background_fill3);
		borderPane23.setBackground(background31);

		hotelDetailsScene = new Scene(borderPane23, 500, 500);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// LAND MARK
		// SCENE......................................................................................................

		LandMarkListView = new ListView<>();
		LandMarkListView.setTranslateY(15);
		LandMarkListView.setTranslateX(100);
		ArrayList<String> LandMarkPhoneNumberData = new ArrayList<String>();
		ArrayList<String> LandMarkPriceData = new ArrayList<String>();
		ArrayList<String> LandMarkRateData = new ArrayList<String>();
		ObservableList<String> LandMarkList = FXCollections.observableArrayList();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM landmarks");
			while (result2.next()) {
				String LandMarkName = result2.getString(1);
				String LandMarkPhoneNumber = result2.getString(2);
				String LandMarkPrice = result2.getString(3);
				String LandMarkRate = result2.getString(4);
				LandMarkList.add(LandMarkName);
				LandMarkPhoneNumberData.add(LandMarkPhoneNumber);
				LandMarkPriceData.add(LandMarkPrice);
				LandMarkRateData.add(LandMarkRate);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		LandMarkListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					landMarkPrice = Integer
							.parseInt(LandMarkPriceData.get(LandMarkListView.getSelectionModel().getSelectedIndex()));

				});

		LandMarkListView.setItems(LandMarkList);
		lbEnterNumberOfHours2 = new Label("NUMBER OF HOURS");

		lbEnterNumberOfHours2.setFont(new Font("Forte", 25));
		tfEnterNumberOfHours2 = new TextField();
		lbAnswerPrice4 = new Label("__________");
		lbAnswerPrice4.setFont(new Font("Forte", 25));
		btnCalculatePrice4 = new Button("CALCULATE PRICE");
		btnCalculatePrice4.setScaleX(1.5);
		btnCalculatePrice4.setScaleY(1.5);
		btnCalculatePrice4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				int answer = objLandMark.calcPrice(Integer.parseInt(tfEnterNumberOfHours2.getText()), Integer
						.parseInt(LandMarkPriceData.get(LandMarkListView.getSelectionModel().getSelectedIndex())));

				lbAnswerPrice4.setText(String.valueOf(answer));
			}
		});

		btnShowDetails2 = new Button("SHOW DETAILS");
		btnShowDetails2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				lbShowLandMarksPhoneNumber.setText("PHONE NUMBER:" + " "
						+ LandMarkPhoneNumberData.get(LandMarkListView.getSelectionModel().getSelectedIndex()));
				lbShowLandMarksRate.setText(
						"RATE:" + " " + LandMarkRateData.get(LandMarkListView.getSelectionModel().getSelectedIndex()));

				stage.setScene(LandMarksDetailsScene);

			}
		});
		btnShowDetails2.setTranslateX(500);
		btnShowDetails2.setTranslateY(50);
		btnShowDetails2.setScaleX(1.5);
		btnShowDetails2.setScaleY(1.5);

		btnBack24 = new Button("BACK");
		btnBack24.setTranslateX(400);
		btnBack24.setTranslateY(300);
		btnBack24.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(PlacesScene);
			}
		});
		btnBack24.setScaleX(1.5);
		btnBack24.setScaleY(1.5);

		hbox37 = new HBox(10);
		hbox37.getChildren().addAll(lbEnterNumberOfHours2, tfEnterNumberOfHours2, lbAnswerPrice4);

		hbox38 = new HBox(80);
		hbox38.getChildren().addAll(btnCalculatePrice4, btnBack24);

		vbox27 = new VBox(10);
		vbox27.getChildren().addAll(hbox37, hbox38);
		vbox27.setTranslateY(200);
		vbox27.setTranslateX(-250);

		borderPane24 = new BorderPane();
		borderPane24.setLeft(LandMarkListView);
		borderPane24.setRight(vbox27);
		borderPane24.setTop(btnShowDetails2);

		FileInputStream input13 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (3).png");
		Image image13 = new Image(input13);

		BackgroundImage backgroundimage13 = new BackgroundImage(image13, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background13 = new Background(backgroundimage13);

		borderPane24.setBackground(background13);

		LandMarksScene = new Scene(borderPane24, 1200, 700);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// LANDMARK DETAILS
		// SCENE..............................................................................

		lbShowLandMarksPhoneNumber = new Label("-----");
		lbShowLandMarksPhoneNumber.setTextFill(WHEAT);
		lbShowLandMarksPhoneNumber.setFont(Font.font(null, FontWeight.BOLD, 20));

		lbShowLandMarksRate = new Label("-----");
		lbShowLandMarksRate.setTextFill(WHEAT);
		lbShowLandMarksRate.setFont(Font.font(null, FontWeight.BOLD, 20));

		btnBack25 = new Button("BACK");
		btnBack25.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				stage.setScene(LandMarksScene);
			}
		});

		vbox28 = new VBox(10);
		vbox28.getChildren().addAll(lbShowLandMarksPhoneNumber, lbShowLandMarksRate);

		borderPane25 = new BorderPane();
		borderPane25.setCenter(vbox28);
		borderPane25.setBottom(btnBack25);

		BackgroundFill background_fill4 = new BackgroundFill(Color.DARKSLATEGREY, null, null);
		Background background32 = new Background(background_fill4);
		borderPane25.setBackground(background32);

		LandMarksDetailsScene = new Scene(borderPane25, 300, 300);

		/////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////

		// BEACHCLUB
		// SCENE..........................................................................

		beachClubListView = new ListView<>();
		beachClubListView.setTranslateY(15);
		beachClubListView.setTranslateX(100);

		ArrayList<String> beachClubsNameData = new ArrayList<String>();
		ArrayList<String> beachClubsPhoneNumberData = new ArrayList<String>();
		ArrayList<String> beachClubsPriceData = new ArrayList<String>();
		beachClubsLocationData = new ArrayList<String>();

		ObservableList<String> beachClubsList = FXCollections.observableArrayList();

		try {

			ResultSet result10 = DBConnect2.statement2.executeQuery("SELECT * FROM beachclubs");
			while (result10.next()) {

				String beachClubsName = result10.getString(1);
				String beachClubsPhoneNumber = result10.getString(2);
				String beachClubsPrice = result10.getString(3);
				String beachClubsLocation = result10.getString(4);

				beachClubsList.add(beachClubsName);
				beachClubsPhoneNumberData.add(beachClubsPhoneNumber);
				beachClubsPriceData.add(beachClubsPrice);
				beachClubsLocationData.add(beachClubsLocation);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		 * 
		 */

		beachClubListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					BeachClubPrice = Integer.parseInt(
							beachClubsPriceData.get(beachClubListView.getSelectionModel().getSelectedIndex()));

				});

		beachClubListView.setItems(beachClubsList);

		lbDayBeachClub = new Label("DAY:");
		lbDayBeachClub.setTextFill(WHEAT);
		lbDayBeachClub.setFont(new Font("Forte", 25));

		lbMonthBeachClub = new Label("MONTH:");
		lbMonthBeachClub.setTextFill(WHEAT);
		lbMonthBeachClub.setFont(new Font("Forte", 25));

		lbYearBeachclub = new Label("YEAR:");
		lbYearBeachclub.setTextFill(WHEAT);
		lbYearBeachclub.setFont(new Font("Forte", 25));

		tfDayBeachClub = new TextField();
		tfDayBeachClub.autosize();

		tfMonthBeachClub = new TextField();
		tfMonthBeachClub.autosize();

		tfYearBeachClub = new TextField();
		tfYearBeachClub.autosize();

		lbNumberOfHoursBeachClub = new Label("ENTER NUMBER OF HOURS");
		lbNumberOfHoursBeachClub.setTextFill(WHEAT);
		lbNumberOfHoursBeachClub.setFont(new Font("Forte", 25));

		tfEnterNumberOfHoursBeachClub = new TextField();
		tfEnterNumberOfHoursBeachClub.autosize();

		lbAnswerPriceBeachClub = new Label("__________");
		lbAnswerPriceBeachClub.setTextFill(WHEAT);
		lbAnswerPriceBeachClub.setFont(new Font("Forte", 25));

		lbAnswerAvailableBeachClub = new Label("__________");
		lbAnswerAvailableBeachClub.setTextFill(WHEAT);
		lbAnswerAvailableBeachClub.setFont(new Font("Forte", 25));

		btnCalculatePriceBeachclub = new Button("CALCULATE PRICE");
		btnCalculatePriceBeachclub.setScaleX(1.5);
		btnCalculatePriceBeachclub.setScaleY(1.5);
		btnCalculatePriceBeachclub.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int resultBeachClubPrice = objBeachClub
						.calcPrice(Integer.parseInt(tfEnterNumberOfHoursBeachClub.getText()), BeachClubPrice);

				lbAnswerPriceBeachClub.setText(String.valueOf(resultBeachClubPrice));

			}
		});
		btnCheckAvailableBeachClub = new Button("CHECK AVAILABILITY");
		btnCheckAvailableBeachClub.setScaleX(1.5);
		btnCheckAvailableBeachClub.setScaleY(1.5);
		btnCheckAvailableBeachClub.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				int resultBeachClubAvailability = objBeachClub
						.CheckAvailability(Integer.parseInt(tfMonthBeachClub.getText()));

				if (resultBeachClubAvailability == 0) {
					lbAnswerAvailableBeachClub.setText("ERROR");

				} else if (resultBeachClubAvailability == 1) {
					lbAnswerAvailableBeachClub.setText("DATE IS NOT VALIID");
				} else {
					lbAnswerAvailableBeachClub.setText("DATE IS VALID");
				}
			}
		});
		btnBack26 = new Button("BACK");
		btnBack26.setScaleX(1.5);
		btnBack26.setScaleY(1.5);
		btnBack26.setTranslateX(1100);
		btnBack26.setTranslateY(-30);
		btnBack26.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(PlacesScene);
			}
		});

		btnShowLocationBeachClub = new Button("SHOW LOCATION");
		btnShowLocationBeachClub.setScaleX(1.5);
		btnShowLocationBeachClub.setScaleY(1.5);
		btnShowLocationBeachClub.setTranslateX(500);
		btnShowLocationBeachClub.setTranslateY(50);
		btnShowLocationBeachClub.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				web2 = new WebView();
				engine2 = web2.getEngine();
				engine2.load(beachClubsLocationData.get(beachClubListView.getSelectionModel().getSelectedIndex()));
				btnBack27 = new Button("BACK");
				btnBack27.setTranslateX(500);
				btnBack27.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						stage.setScene(beachClubScene);
					}
				});

				vbox32 = new VBox();
				vbox32.getChildren().addAll(web2, btnBack27);
				webScene2 = new Scene(vbox32, 1000, 1000);

				stage.setScene(webScene2);
			}
		});

		hbox35 = new HBox(10);
		hbox35.getChildren().addAll(lbNumberOfHoursBeachClub, tfEnterNumberOfHoursBeachClub);

		hbox40 = new HBox(10);
		hbox40.getChildren().addAll(btnCalculatePriceBeachclub, lbAnswerPriceBeachClub);

		vbox29 = new VBox(10);
		vbox29.getChildren().addAll(hbox35, hbox40);
		vbox29.setTranslateY(50);

		hbox41 = new HBox(10);
		hbox41.getChildren().addAll(lbDayBeachClub, tfDayBeachClub, lbMonthBeachClub, tfMonthBeachClub, lbYearBeachclub,
				tfYearBeachClub);

		hbox42 = new HBox(10);
		hbox42.getChildren().addAll(btnCheckAvailableBeachClub, lbAnswerAvailableBeachClub);

		vbox30 = new VBox(10);
		vbox30.getChildren().addAll(hbox41, hbox42);
		vbox30.setTranslateY(300);

		vbox31 = new VBox(10);
		vbox31.getChildren().addAll(vbox29, vbox30);
		vbox31.setTranslateY(50);

		borderPane26 = new BorderPane();
		borderPane26.setLeft(beachClubListView);
		borderPane26.setRight(vbox31);
		borderPane26.setBottom(btnBack26);
		borderPane26.setTop(btnShowLocationBeachClub);

		FileInputStream input12 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (2).png");
		Image image12 = new Image(input12);

		BackgroundImage backgroundimage12 = new BackgroundImage(image12, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background12 = new Background(backgroundimage12);

		borderPane26.setBackground(background12);

		beachClubScene = new Scene(borderPane26, 1280, 700);
		//////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////

		// SERVICES
		// SCENE...............................................................................

		btnView3 = new Button("VIEW");
		btnView3.setScaleX(1.5);
		btnView3.setScaleY(1.5);
		btnView3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbDecorations.isSelected()) {
					stage.setScene(decorationsScene);

				}

				else if (rbFlowerShop.isSelected()) {
					stage.setScene(flowerShopScene);

				}

				else if (rbCatering.isSelected()) {
					stage.setScene(cateringScene);

				}

				else {
					stage.setScene(waitersScene);

				}

			}

		});

		btnBack28 = new Button("BACK");
		btnBack28.setScaleX(1.5);
		btnBack28.setScaleY(1.5);
		btnBack28.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});

		togglegroup5 = new ToggleGroup();

		rbFlowerShop = new RadioButton("FLOWER SHOP");
		rbFlowerShop.setScaleX(1.5);
		rbFlowerShop.setTextFill(WHEAT);
		rbFlowerShop.setFont(new Font("Forte", 25));

		rbDecorations = new RadioButton("DECORATIONS");
		rbDecorations.setScaleX(1.5);
		rbDecorations.setTextFill(WHEAT);
		rbDecorations.setFont(new Font("Forte", 25));

		rbCatering = new RadioButton("CATERING");
		rbCatering.setScaleX(1.5);
		rbCatering.setTextFill(WHEAT);
		rbCatering.setFont(new Font("Forte", 25));

		rbFlowerShop.setToggleGroup(togglegroup5);
		rbDecorations.setToggleGroup(togglegroup5);
		rbCatering.setToggleGroup(togglegroup5);

		vbox33 = new VBox(80);
		vbox33.setSpacing(10);
		vbox33.setTranslateX(100);
		vbox33.setTranslateY(200);
		vbox33.getChildren().addAll(rbFlowerShop, rbDecorations, rbCatering);

		hbox43 = new HBox(80);
		hbox43.setTranslateX(100);
		hbox43.setTranslateY(-200);
		hbox43.getChildren().addAll(btnView3, btnBack28);

		borderPane27 = new BorderPane();
		borderPane27.setCenter(vbox33);
		borderPane27.setBottom(hbox43);

		FileInputStream input27 = null;
		try {
			input27 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (7).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image27 = new Image(input27);
		BackgroundImage backgroundimage27 = new BackgroundImage(image27, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background27 = new Background(backgroundimage27);
		borderPane27.setBackground(background27);

		servicesScene = new Scene(borderPane27, 800, 700);
		////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////

		// DECORATIONS
		// SCENE........................................................................

		decorationsListView = new ListView<>();
		decorationsListView.setTranslateY(15);
		decorationsListView.setTranslateX(100);

		ArrayList<String> decorationsPriceWeddingData = new ArrayList<String>();
		ArrayList<String> decorationsPriceEngagementData = new ArrayList<String>();
		ArrayList<String> decorationsPriceGraduationData = new ArrayList<String>();
		ArrayList<String> decorationsPriceOpeningCeremonyData = new ArrayList<String>();
		ArrayList<String> decorationsPriceBirthDayData = new ArrayList<String>();

		ObservableList<String> decorationsNameList = FXCollections.observableArrayList();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM decorations");
			while (result2.next()) {
				String decorationsName = result2.getString(1);
				String decorationsPriceWedding = result2.getString(2);
				String decorationsPriceBirthDay = result2.getString(3);
				String decorationsPriceGraduation = result2.getString(4);
				String decorationsPriceEngagement = result2.getString(5);
				String decorationsPriceOpeningCeremony = result2.getString(6);

				decorationsNameList.add(decorationsName);
				decorationsPriceWeddingData.add(decorationsPriceWedding);
				decorationsPriceEngagementData.add(decorationsPriceEngagement);
				decorationsPriceGraduationData.add(decorationsPriceGraduation);
				decorationsPriceOpeningCeremonyData.add(decorationsPriceOpeningCeremony);
				decorationsPriceBirthDayData.add(decorationsPriceBirthDay);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		decorationsListView.setItems(decorationsNameList);

		lbEnterNumberOfHoursDecorations = new Label("ENTER AREA");
		lbEnterNumberOfHoursDecorations.setTextFill(WHEAT);
		lbEnterNumberOfHoursDecorations.setFont(new Font("Forte", 25));

		lbEnterTypeDecorations = new Label("CHOOSE TYPE:");
		lbEnterTypeDecorations.setTextFill(WHEAT);
		lbEnterTypeDecorations.setFont(new Font("Forte", 25));

		lbShowAnswerDecorations = new Label("-----");
		lbShowAnswerDecorations.setTextFill(WHEAT);
		lbShowAnswerDecorations.setFont(new Font("Forte", 25));

		tfEnterNumberOfHoursDecorations = new TextField();

		btnBack29 = new Button("BACK");
		btnBack29.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(servicesScene);
			}
		});
		btnBack29.setScaleX(1.5);
		btnBack29.setScaleY(1.5);
		
		togglegroup6 = new ToggleGroup();
		rbWedding = new RadioButton("WEDDING");
		rbBirthDay = new RadioButton("BIRTHDAY");
		rbGraduation = new RadioButton("GRADUATION");
		rbEngagement = new RadioButton("ENGAGEMENT");
		rbOpeningCeremony = new RadioButton("OPENING CEREMONY");

		rbWedding.setToggleGroup(togglegroup6);
		rbWedding.setTextFill(WHEAT);
		rbWedding.setFont(new Font("Forte", 25));

		rbBirthDay.setToggleGroup(togglegroup6);
		rbBirthDay.setTextFill(WHEAT);
		rbBirthDay.setFont(new Font("Forte", 25));

		rbGraduation.setToggleGroup(togglegroup6);
		rbGraduation.setTextFill(WHEAT);
		rbGraduation.setFont(new Font("Forte", 25));

		rbEngagement.setToggleGroup(togglegroup6);
		rbEngagement.setTextFill(WHEAT);
		rbEngagement.setFont(new Font("Forte", 25));

		rbOpeningCeremony.setToggleGroup(togglegroup6);
		rbOpeningCeremony.setTextFill(WHEAT);
		rbOpeningCeremony.setFont(new Font("Forte", 25));

		btnShowPriceDecorations = new Button("SHOW PRICE");

		decorationsListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					indexDecoration = decorationsListView.getSelectionModel().getSelectedIndex();
				});

		btnShowPriceDecorations = new Button("SHOW PRICE");
		btnShowPriceDecorations.setScaleX(1.5);
		btnShowPriceDecorations.setScaleY(1.5);
		btnShowPriceDecorations.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				if (rbWedding.isSelected()) {
					String resultPriceDecorations = objDecorations.calcPrice(tfEnterNumberOfHoursDecorations.getText(),
							decorationsPriceWeddingData.get(indexDecoration));
					lbShowAnswerDecorations.setText(resultPriceDecorations);

				}

				else if (rbBirthDay.isSelected()) {
					String resultPriceDecorations = objDecorations.calcPrice(tfEnterNumberOfHoursDecorations.getText(),
							decorationsPriceBirthDayData.get(indexDecoration));
					lbShowAnswerDecorations.setText(resultPriceDecorations);

				}

				else if (rbGraduation.isSelected()) {
					String resultPriceDecorations = objDecorations.calcPrice(tfEnterNumberOfHoursDecorations.getText(),
							decorationsPriceGraduationData.get(indexDecoration));
					lbShowAnswerDecorations.setText(resultPriceDecorations);

				}

				else if (rbEngagement.isSelected()) {
					String resultPriceDecorations = objDecorations.calcPrice(tfEnterNumberOfHoursDecorations.getText(),
							decorationsPriceEngagementData.get(indexDecoration));
					lbShowAnswerDecorations.setText(resultPriceDecorations);

				}

				else {
					String resultPriceDecorations = objDecorations.calcPrice(tfEnterNumberOfHoursDecorations.getText(),
							decorationsPriceOpeningCeremonyData.get(indexDecoration));
					lbShowAnswerDecorations.setText(resultPriceDecorations);

				}

			}
		});

		hbox44 = new HBox(10);
		hbox44.getChildren().addAll(lbEnterNumberOfHoursDecorations, tfEnterNumberOfHoursDecorations,
				lbShowAnswerDecorations);

		hbox45 = new HBox(10);
		hbox45.getChildren().addAll(lbEnterTypeDecorations, rbWedding, rbBirthDay, rbGraduation, rbEngagement,
				rbOpeningCeremony);

		hbox46 = new HBox(80);
		hbox46.getChildren().addAll(btnShowPriceDecorations, btnBack29);

		vbox34 = new VBox(80);
		vbox34.getChildren().addAll(hbox44, hbox45, hbox46);
		vbox34.setTranslateY(200);

		borderPane28 = new BorderPane();
		borderPane28.setLeft(decorationsListView);
		borderPane28.setRight(vbox34);

		FileInputStream input41 = null;
		try {
			input41 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-06-01 (8).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image41 = new Image(input41);
		BackgroundImage backgroundimage41 = new BackgroundImage(image41, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background41 = new Background(backgroundimage41);
		borderPane28.setBackground(background41);

		  decorationsScene = new Scene(borderPane28, 1750, 700);

		//////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////

		// FLOWER
		// SHOP...............................................................................

		flowerShopListView = new ListView<>();
		flowerShopListView.setTranslateY(-100);
		flowerShopListView.setTranslateX(100);

		ObservableList<String> flowerShopNamelist = FXCollections.observableArrayList();

		ArrayList<String> flowerShopAvailableFlowersData = new ArrayList<String>();

		ArrayList<String> flowerShopPriceTulipData = new ArrayList<String>();

		ArrayList<String> flowerShopPriceRoseData = new ArrayList<String>();

		ArrayList<String> flowerShopPriceLilyData = new ArrayList<String>();

		ArrayList<String> flowerShopPriceSunFlowerData = new ArrayList<String>();

		ArrayList<String> flowerShopOfferWeddingData = new ArrayList<String>();

		ArrayList<String> flowerShopOfferEngagementData = new ArrayList<String>();

		ArrayList<String> flowerShopOfferOpeningCermonyData = new ArrayList<String>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM flowershop");
			while (result2.next()) {

				String flowerShopName = result2.getString(1);

				String flowerShopAvailableFlowers = result2.getString(2);

				String flowerShopPriceTulip = result2.getString(3);

				String flowerShopPriceRose = result2.getString(4);

				String flowerShopPriceLily = result2.getString(5);

				String flowerShopPriceSunFlower = result2.getString(6);

				String flowerShopOfferWedding = result2.getString(7);

				String flowerShopOfferEngagement = result2.getString(8);

				String flowerShopOfferOpeningCermony = result2.getString(9);

				flowerShopNamelist.add(flowerShopName);
				flowerShopAvailableFlowersData.add(flowerShopAvailableFlowers);
				flowerShopPriceTulipData.add(flowerShopPriceTulip);
				flowerShopPriceRoseData.add(flowerShopPriceRose);
				flowerShopPriceLilyData.add(flowerShopPriceLily);
				flowerShopPriceSunFlowerData.add(flowerShopPriceSunFlower);
				flowerShopOfferWeddingData.add(flowerShopOfferWedding);
				flowerShopOfferEngagementData.add(flowerShopOfferEngagement);
				flowerShopOfferOpeningCermonyData.add(flowerShopOfferOpeningCermony);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		flowerShopListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					flowerShopAnswer = flowerShopListView.getSelectionModel().getSelectedIndex();
				});

		flowerShopListView.setItems(flowerShopNamelist);

		lbflowershopShowOffers = new Label("SHOW FLOWERS");

		lbflowershopShowOffers.setFont(new Font("Forte", 25));

		lbflowershopShowPrice = new Label("----");

		lbflowershopShowPrice.setFont(new Font("Forte", 25));

		String offers[] = { "LILY ", "ROSE", "SUN FLOWER", "TULIP" };

		flowerShopComboBox = new ComboBox(FXCollections.observableArrayList(offers));

		hbox47 = new HBox();
		hbox47.getChildren().addAll(lbflowershopShowOffers, flowerShopComboBox);
		hbox47.setTranslateX(-600);
		hbox47.setTranslateY(-50);

		Image image5 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(18) WhatsApp - Google Chrome 5_28_2020 8_32_46 PM.png"));
		ImageView imageView5 = new ImageView(image5);
		imageView5.setX(1000);
		imageView5.setY(100);

		Image image6 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(18) WhatsApp - Google Chrome 5_28_2020 8_35_22 PM.png"));
		ImageView imageView6 = new ImageView(image6);
		imageView6.setX(1000);
		imageView6.setY(100);

		Image image11 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(18) WhatsApp - Google Chrome 5_28_2020 8_37_21 PM.png"));
		ImageView imageView11 = new ImageView(image11);
		imageView11.setX(1000);
		imageView11.setY(100);

		Image image15 = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(18) WhatsApp - Google Chrome 5_28_2020 8_39_55 PM.png"));
		ImageView imageView15 = new ImageView(image15);
		imageView15.setX(1000);
		imageView15.setY(100);

		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {

				string = flowerShopComboBox.getValue().toString();

				if (flowerShopComboBox.getSelectionModel().isSelected(0)) {

					borderPane29.setCenter(imageView5);

				}

				else if (flowerShopComboBox.getSelectionModel().isSelected(1)) {

					borderPane29.setCenter(imageView6);

				}

				else if (flowerShopComboBox.getSelectionModel().isSelected(2)) {

					borderPane29.setCenter(imageView11);

				} else {

					borderPane29.setCenter(imageView15);

				}

			}
		};

		flowerShopComboBox.setOnAction(event);

		flowerShopCheckBoxRose = new CheckBox("LILY");
		flowerShopCheckBoxLily = new CheckBox("ROSE");
		flowerShopCheckBoxSunFlower = new CheckBox("SUN FLOWER ");
		flowerShopCheckBoxTulip = new CheckBox("TULIP");

		tfFlowerRose = new TextField();
		tfFlowerLily = new TextField();
		tfFlowerSunFlower = new TextField();
		tfFlowerTulip = new TextField();

		btnBack30 = new Button("BACK");
		btnBack30.setScaleX(1.5);
		btnBack30.setScaleY(1.5);

		btnBack30.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(servicesScene);
			}
		});
		btnCalculatePriceFlowerShop = new Button("CALCULATE PRICE");
		btnCalculatePriceFlowerShop.setScaleX(1.5);
		btnCalculatePriceFlowerShop.setScaleY(1.5);

		lbCustomizeFlowerShop = new Label("CUSTOMIZE YOUR OWN PACKAGE HERE👇👇👇");

		lbCustomizeFlowerShop.setFont(new Font("Forte", 25));

		hbox48 = new HBox(10);
		hbox48.getChildren().addAll(flowerShopCheckBoxRose, tfFlowerRose);

		hbox49 = new HBox(10);
		hbox49.getChildren().addAll(flowerShopCheckBoxLily, tfFlowerLily);

		hbox50 = new HBox(10);
		hbox50.getChildren().addAll(flowerShopCheckBoxSunFlower, tfFlowerSunFlower);

		hbox51 = new HBox(10);
		hbox51.getChildren().addAll(flowerShopCheckBoxTulip, tfFlowerTulip);

		hbox52 = new HBox(80);
		hbox52.getChildren().addAll(btnCalculatePriceFlowerShop, lbflowershopShowPrice, btnBack30);

		vbox35 = new VBox(10);
		vbox35.setTranslateY(200);
		vbox35.setTranslateX(800);
		vbox35.getChildren().addAll(lbCustomizeFlowerShop, hbox48, hbox49, hbox50, hbox51, hbox52);

		btnCalculatePriceFlowerShop.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (flowerShopCheckBoxRose.isSelected()) {

					rose = objFlowerShop.calcPrice2(flowerShopPriceRoseData.get(flowerShopAnswer),
							tfFlowerRose.getText());
				}

				if (flowerShopCheckBoxLily.isSelected()) {

					lily = objFlowerShop.calcPrice2(flowerShopPriceLilyData.get(flowerShopAnswer),
							tfFlowerLily.getText());
				}

				if (flowerShopCheckBoxSunFlower.isSelected()) {

					sunFlower = objFlowerShop.calcPrice2(flowerShopPriceSunFlowerData.get(flowerShopAnswer),
							tfFlowerSunFlower.getText());
				}

				if (flowerShopCheckBoxTulip.isSelected()) {

					tulip = objFlowerShop.calcPrice2(flowerShopPriceTulipData.get(flowerShopAnswer),
							tfFlowerTulip.getText());
				}

				lbflowershopShowPrice.setText(String.valueOf(rose + lily + sunFlower + tulip));
			}
		});

		borderPane29 = new BorderPane();
		borderPane29.setLeft(flowerShopListView);
		borderPane29.setRight(hbox47);
		borderPane29.setTop(vbox35);

		FileInputStream input40 = null;
		try {
			input40 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-06-01 (5).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image40 = new Image(input40);
		BackgroundImage backgroundimage40 = new BackgroundImage(image40, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background40 = new Background(backgroundimage40);
		borderPane29.setBackground(background40);

		flowerShopScene = new Scene(borderPane29, 1300, 700);
//////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

		// COMPANY
		// SCENE................................................................................

		btnView4 = new Button("VIEW");
		btnView4.setScaleX(1.5);
		btnView4.setScaleY(1.5);
		btnView4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbMarketingAgencies.isSelected()) {
					stage.setScene(MarketingAgenciesScene);

				}

				else {
					stage.setScene(SponsorsScene);

				}

			}

		});

		btnBack31 = new Button("BACK");
		btnBack31.setScaleX(1.5);
		btnBack31.setScaleY(1.5);
		btnBack31.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});

		togglegroup6 = new ToggleGroup();

		rbMarketingAgencies = new RadioButton("MARKETING AGENCIES");
		rbMarketingAgencies.setScaleX(1.5);
		rbMarketingAgencies.setTextFill(WHEAT);
		rbMarketingAgencies.setFont(new Font("Forte", 25));

		rbSponsors = new RadioButton("SPONSORS");
		rbSponsors.setScaleX(1.5);
		rbSponsors.setTextFill(WHEAT);
		rbSponsors.setFont(new Font("Forte", 25));

		rbMarketingAgencies.setToggleGroup(togglegroup6);
		rbSponsors.setToggleGroup(togglegroup6);

		vbox36 = new VBox(80);
		vbox36.setSpacing(10);
		vbox36.setTranslateX(100);
		vbox36.setTranslateY(200);
		vbox36.getChildren().addAll(rbMarketingAgencies, rbSponsors);

		hbox53 = new HBox(80);
		hbox53.setTranslateX(100);
		hbox53.setTranslateY(-200);
		hbox53.getChildren().addAll(btnView4, btnBack31);

		borderPane30 = new BorderPane();
		borderPane30.setCenter(vbox36);
		borderPane30.setBottom(hbox53);

		FileInputStream input28 = null;
		try {
			input28 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-28 (7).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image28 = new Image(input28);
		BackgroundImage backgroundimage28 = new BackgroundImage(image28, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background28 = new Background(backgroundimage28);
		borderPane30.setBackground(background28);

		// stackPane4 = new StackPane(rectangle6, borderPane16);
		companyScene = new Scene(borderPane30, 800, 700);

		////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////

		// MARKETING AGENCIES
		// SCENE..............................................................

		ObservableList<String> marketingOnlineNamelist = FXCollections.observableArrayList();

		ArrayList<String> marketingOnlinePriceData = new ArrayList<String>();

		ArrayList<String> marketingOnlineBannerPriceData = new ArrayList<String>();

		ArrayList<String> marketingOnlineFliersPriceData = new ArrayList<String>();

		ArrayList<String> marketingOnlineBillBoardPriceData = new ArrayList<String>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM onlinem");
			while (result2.next()) {

				String marketingOnlineName = result2.getString(1);

				String marketingOnlinePrice = result2.getString(2);

				String marketingOnlineBannerPrice = result2.getString(3);

				String marketingOnlineFliersPrice = result2.getString(4);

				String marketingOnlineBillBoardPrice = result2.getString(5);

				marketingOnlineNamelist.add(marketingOnlineName);
				marketingOnlinePriceData.add(marketingOnlinePrice);
				marketingOnlineBannerPriceData.add(marketingOnlineBannerPrice);
				marketingOnlineFliersPriceData.add(marketingOnlineFliersPrice);
				marketingOnlineBillBoardPriceData.add(marketingOnlineBillBoardPrice);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		ObservableList<String> marketingOfflineNamelist = FXCollections.observableArrayList();

		ArrayList<String> marketingOfflinePriceData = new ArrayList<String>();

		ArrayList<String> marketingOfflineBannerPriceData = new ArrayList<String>();

		ArrayList<String> marketingOfflineFliersPriceData = new ArrayList<String>();

		ArrayList<String> marketingOfflineBillBoardPriceData = new ArrayList<String>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM offlinem");
			while (result2.next()) {

				String marketingOfflineName = result2.getString(1);

				String marketingOfflinePrice = result2.getString(2);

				String marketingOfflineBannerPrice = result2.getString(3);

				String marketingOfflineFliersPrice = result2.getString(4);

				String marketingOfflineBillBoardPrice = result2.getString(5);

				marketingOfflineNamelist.add(marketingOfflineName);
				marketingOfflinePriceData.add(marketingOfflinePrice);
				marketingOfflineBannerPriceData.add(marketingOfflineBannerPrice);
				marketingOfflineFliersPriceData.add(marketingOfflineFliersPrice);
				marketingOfflineBillBoardPriceData.add(marketingOfflineBillBoardPrice);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		ObservableList<String> marketingBothNamelist = FXCollections.observableArrayList();

		ArrayList<String> marketingBothPriceData = new ArrayList<String>();

		ArrayList<String> marketingBothBannerPriceData = new ArrayList<String>();

		ArrayList<String> marketingBothFliersPriceData = new ArrayList<String>();

		ArrayList<String> marketingBothBillBoardPriceData = new ArrayList<String>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM bothm");
			while (result2.next()) {

				String marketingBothName = result2.getString(1);

				String marketingBothPrice = result2.getString(2);

				String marketingBothBannerPrice = result2.getString(3);

				String marketingBothFliersPrice = result2.getString(4);

				String marketingBothBillBoardPrice = result2.getString(5);

				marketingBothNamelist.add(marketingBothName);
				marketingBothPriceData.add(marketingBothPrice);
				marketingBothBannerPriceData.add(marketingBothBannerPrice);
				marketingBothFliersPriceData.add(marketingBothFliersPrice);
				marketingBothBillBoardPriceData.add(marketingBothBillBoardPrice);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		lbCompanyFillForm = new Label("👇FILL IN THIS FORM TO FIND THE BEST MARKETING AGENCIES FOR YOU👇");
		lbCompanyFillForm.setFont(new Font("Arial", 40));

		lbCompanyNameEvent = new Label("EVENT NAME");
		lbCompanyNameEvent.setFont(new Font("Forte", 25));

		lbCompanyTypeOfEvent = new Label("EVENT TYPE");
		lbCompanyTypeOfEvent.setFont(new Font("Forte", 25));

		lbCompanyTypeOfMarketing = new Label("MARKETING TYPE");
		lbCompanyTypeOfMarketing.setFont(new Font("Forte", 25));

		lbCompanyDuration = new Label("DURATION");
		lbCompanyDuration.setFont(new Font("Forte", 25));

		lbCompanyChooseExtra = new Label("CHOOSE EXTRA ITEMS");
		lbCompanyChooseExtra.setFont(new Font("Forte", 25));

		lbChooseCompanyToCalcPrice = new Label("CHOOSE A COMPANY TO CALCULATE YOUR PRICE");
		lbChooseCompanyToCalcPrice.setFont(Font.font(null, FontWeight.BOLD, 15));

		lbCompanyShowPriceAnswer = new Label("----");
		lbCompanyShowPriceAnswer.setFont(new Font("Forte", 25));

		tfCompanyNameEvent = new TextField();
		tfCompanyTypeOfEvent = new TextField();
		tfCompanyDuration = new TextField();

		companyCheckBoxBanner = new CheckBox("BANNER");
		companyCheckBoxBillBoard = new CheckBox("BILLBOARD");
		companyCheckBoxFliers = new CheckBox("FLIERS");

		marketingListView = new ListView<>();
		marketingListView.setTranslateY(50);
		marketingListView.setTranslateX(-40);

		marketingListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					p = marketingListView.getSelectionModel().getSelectedIndex();
				});

		btnShowCompanies = new Button("SHOW COMPANIES");
		btnShowCompanies.setScaleX(1.5);
		btnShowCompanies.setScaleY(1.5);
		btnShowCompanies.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				if (rbOnline.isSelected()) {
					marketingListView.setItems(marketingOnlineNamelist);
					borderPane31.setCenter(marketingListView);

				}

				if (rbOffline.isSelected()) {

					marketingListView.setItems(marketingOfflineNamelist);
					borderPane31.setCenter(marketingListView);

				}

				if (rbBoth.isSelected()) {

					marketingListView.setItems(marketingBothNamelist);
					borderPane31.setCenter(marketingListView);

				}

			}
		});

		btnCalculateCompanyPrice = new Button("CALCULATE PRICE");
		
		btnCalculateCompanyPrice.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (rbOnline.isSelected()) {
					if (companyCheckBoxBanner.isSelected()) {

						banner = Integer.parseInt(marketingOnlineBannerPriceData.get(p));
						// lbCompanyShowPriceAnswer.setText(companyResult);

					}
					if (companyCheckBoxBillBoard.isSelected()) {

						billBoard = Integer.parseInt(marketingOnlineBillBoardPriceData.get(p));

					}

					if (companyCheckBoxFliers.isSelected()) {

						flier = Integer.parseInt(marketingOnlineFliersPriceData.get(p));
					}

					int bannerResult = objMarketing.calcPrice3(marketingOnlinePriceData.get(p),
							tfCompanyDuration.getText());
					lbCompanyShowPriceAnswer.setText(String.valueOf(bannerResult + billBoard + banner + flier));
				}

				else if (rbOffline.isSelected()) {

					if (companyCheckBoxBanner.isSelected()) {

						banner = Integer.parseInt(marketingOfflineBannerPriceData.get(p));
						// lbCompanyShowPriceAnswer.setText(companyResult);

					}
					if (companyCheckBoxBillBoard.isSelected()) {

						billBoard = Integer.parseInt(marketingOfflineBillBoardPriceData.get(p));

					}

					if (companyCheckBoxFliers.isSelected()) {

						flier = Integer.parseInt(marketingOfflineFliersPriceData.get(p));
					}

					int bannerResult = objMarketing.calcPrice3(marketingOfflinePriceData.get(p),
							tfCompanyDuration.getText());
					lbCompanyShowPriceAnswer.setText(String.valueOf(bannerResult + billBoard + banner + flier));

				}

				else {

					if (companyCheckBoxBanner.isSelected()) {

						banner = Integer.parseInt(marketingBothBannerPriceData.get(p));
						// lbCompanyShowPriceAnswer.setText(companyResult);

					}
					if (companyCheckBoxBillBoard.isSelected()) {

						billBoard = Integer.parseInt(marketingBothBillBoardPriceData.get(p));

					}

					if (companyCheckBoxFliers.isSelected()) {

						flier = Integer.parseInt(marketingBothFliersPriceData.get(p));
					}

					int bannerResult = objMarketing.calcPrice3(marketingBothPriceData.get(p),
							tfCompanyDuration.getText());
					lbCompanyShowPriceAnswer.setText(String.valueOf(bannerResult + billBoard + banner + flier));

				}

			}
		});
		btnBack32 = new Button("BACK");
		
		btnBack32.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(companyScene);
			}
		});
		togglegroup7 = new ToggleGroup();
		rbOnline = new RadioButton("ONLINE");
		rbOffline = new RadioButton("OFFLINE");
		rbBoth = new RadioButton("ONLINE&OFFLINE");

		rbOnline.setToggleGroup(togglegroup7);
		rbOnline.setFont(new Font("Forte", 25));

		rbOffline.setToggleGroup(togglegroup7);
		rbOffline.setFont(new Font("Forte", 25));
		
		rbBoth.setToggleGroup(togglegroup7);
		rbBoth.setFont(new Font("Forte", 25));

		hbox54 = new HBox(10);
		hbox54.getChildren().addAll(lbCompanyFillForm);

		hbox55 = new HBox(10);
		hbox55.getChildren().addAll(lbCompanyNameEvent, tfCompanyNameEvent);

		hbox56 = new HBox(10);
		hbox56.getChildren().addAll(lbCompanyTypeOfEvent, tfCompanyTypeOfEvent);

		hbox57 = new HBox(10);
		hbox57.getChildren().addAll(lbCompanyTypeOfMarketing, rbOnline, rbOffline, rbBoth);

		hbox58 = new HBox(10);
		hbox58.getChildren().addAll(lbCompanyDuration, tfCompanyDuration);

		hbox59 = new HBox(10);
		hbox59.getChildren().addAll(lbCompanyChooseExtra, companyCheckBoxBanner, companyCheckBoxBillBoard,
				companyCheckBoxFliers);

		hbox60 = new HBox(10);
		hbox60.getChildren().addAll(btnShowCompanies);

		hbox61 = new HBox(10);
		hbox61.getChildren().addAll(btnCalculateCompanyPrice, lbCompanyShowPriceAnswer, btnBack32);

		vbox37 = new VBox(30);
		vbox37.getChildren().addAll(hbox54, hbox55, hbox56, hbox57, hbox58, hbox59, hbox60);
		vbox37.setTranslateX(50);

		vbox38 = new VBox(10);
		vbox38.getChildren().addAll(lbChooseCompanyToCalcPrice, hbox61);
		vbox38.setTranslateX(-20);
		vbox38.setTranslateY(100);

		borderPane31 = new BorderPane();
		borderPane31.setLeft(vbox37);
		borderPane31.setRight(vbox38);
		
		FileInputStream input43 = null;
		try {
			input43 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-06-02 (10).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image43 = new Image(input43);
		BackgroundImage backgroundimage43 = new BackgroundImage(image43, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background43 = new Background(backgroundimage43);
		borderPane31.setBackground(background43);

		MarketingAgenciesScene = new Scene(borderPane31, 2000, 600);
		/////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////

		// BANDS
		// SCENE......................................................................................
		ObservableList<String> companyBandsNamelist = FXCollections.observableArrayList();

		ArrayList<String> videoPathData = new ArrayList<String>();

		try {

			ResultSet result4 = DBConnect2.statement2.executeQuery("SELECT * FROM bands ");
			while (result4.next()) {

				String companyBandsName = result4.getString(1);
				String videoPath = result4.getString(2);

				companyBandsNamelist.add(companyBandsName);
				videoPathData.add(videoPath);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		bandsListView = new ListView<>();
		bandsListView.setItems(companyBandsNamelist);

		bandsListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {
					vbox48.getChildren().clear();
					mediaPlayer.setAutoPlay(false);

				});

		btnShowPerformance = new Button("SHOW PERFORMANCE");
		btnShowPerformance.setScaleX(1.5);
		btnShowPerformance.setScaleY(1.5);
		btnShowPerformance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Media media1 = new Media(
						new File(videoPathData.get(bandsListView.getSelectionModel().getSelectedIndex())).toURI()
								.toString());
				MediaPlayer mediaPlayer1 = new MediaPlayer(media1);
				mediaPlayer1.setAutoPlay(true);
				mediaView1 = new MediaView(mediaPlayer1);
				mediaView1.setFitWidth(50);
				mediaView1.setFitHeight(50);
				mediaView1.setRotate(90);
				mediaView1 = new MediaView(mediaPlayer1);
				mediaView1.setFitWidth(500);
				vbox48.getChildren().add(mediaView1);
				vbox48.setRotate(270);
				vbox48.setTranslateY(-400);
				mediaPlayer.setAutoPlay(false);	
			}
		});
		btnShowPerformance.setTranslateX(-100);

		btnBack34 = new Button("BACK");
		btnBack34.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(manageEvents);
			}
		});
		btnBack34.setTranslateX(-100);
		btnBack34.setTranslateY(400);
		btnBack34.setScaleX(1.5);
		btnBack34.setScaleY(1.5);

		vbox40 = new VBox(20);
		vbox40.getChildren().addAll(btnShowPerformance, btnBack34);

		vbox40 = new VBox(20);
		vbox40.getChildren().addAll(btnShowPerformance, btnBack34);
		vbox40.setTranslateX(100);
		vbox40.setTranslateY(100);

		vbox48 = new VBox(20);
		vbox48.getChildren().addAll();

		borderPane33 = new BorderPane();
		borderPane33.setLeft(bandsListView);
		borderPane33.setRight(vbox40);
		borderPane33.setCenter(vbox48);
		
		BackgroundFill background_fill50 = new BackgroundFill(Color.BLANCHEDALMOND, null, null);
		Background background50 = new Background(background_fill50);
		borderPane33.setBackground(background50);
		
		bandsScene = new Scene(borderPane33, 1600, 1200);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// CATERING
		// SCENE.......................................................................................

		CateringListView = new ListView<>();
		CateringListView.setTranslateX(30);

		ObservableList<String> cateringNamelist = FXCollections.observableArrayList();

		ArrayList<String> cateringReviewData = new ArrayList<String>();

		ArrayList<String> cateringPackageData = new ArrayList<String>();

		ArrayList<String> cateringPackage2Data = new ArrayList<String>();

		ArrayList<String> cateringPackage3Data = new ArrayList<String>();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM catering");
			while (result2.next()) {

				cateringName = result2.getString(1);
				String cateringReview = result2.getString(2);
				cateringPackage= result2.getString(3);
				cateringPackage2= result2.getString(4);
				cateringPackage3= result2.getString(5);
				

				cateringNamelist.add(cateringName);
				cateringReviewData.add(cateringReview);
				cateringPackageData.add(cateringPackage);
				cateringPackage2Data.add(cateringPackage2);
				cateringPackage3Data.add(cateringPackage3);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		CateringListView.setItems(cateringNamelist);

		CateringListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					catering = CateringListView.getSelectionModel().getSelectedIndex();
				});

		btnShowReview = new Button("SHOW REVIEWS");
		btnShowReview.setScaleX(1.5);
		btnShowReview.setScaleY(1.5);
		btnShowReview.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Image image = null;

				try {
					image = new Image(new FileInputStream(cateringReviewData.get(catering)));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				ImageView imageView = new ImageView(image);
				// imageView.setX(1000);
				// imageView.setY(100);
				btnBack36 = new Button("BACK");
				btnBack36.setScaleX(1.5);
				btnBack36.setScaleY(1.5);
				btnBack36.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						stage.setScene(cateringScene);
					}
				});
				BorderPane borderPane35 = new BorderPane();
				borderPane35.setCenter(imageView);
				borderPane35.setBottom(btnBack36);
				cateringReviewsScene = new Scene(borderPane35, 600, 800);
				stage.setScene(cateringReviewsScene);

			}
		});
		btnShowReview.setScaleX(1.5);
		btnShowReview.setScaleY(1.5);
		btnShowReview.setTranslateX(250);
		btnShowReview.setTranslateY(-150);

		btnShowPriceRange = new Button("SHOW PRICE RANGE");
		btnShowPriceRange.setScaleX(1.5);
		btnShowPriceRange.setScaleY(1.5);
		Button btnBack35 = new Button("BACK");
		btnBack35.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(servicesScene);
			}
		});
		btnBack35.setTranslateX(500);
		btnBack35.setTranslateY(100);
		btnBack35.setScaleX(1.5);
		btnBack35.setScaleY(1.5);

		btnCateringGo = new Button("SHOW");
		btnCateringGo.setScaleX(1.5);
		btnCateringGo.setScaleY(1.5);
		btnCateringGo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				if (rbPackage.isSelected()) {

					try {

						ResultSet result2 = DBConnect2.statement2
								.executeQuery("SELECT * FROM catering ");
						while (result2.next()) {

					

							Image image = new Image(new FileInputStream(cateringPackageData.get(catering)));
							ImageView imageView = new ImageView(image);
							imageView.setFitHeight(400);
							imageView.setFitWidth(400);

							Image image2 = new Image(new FileInputStream(cateringPackage2Data.get(catering)));
							ImageView imageView2 = new ImageView(image2);
							imageView2.setFitHeight(400);
							imageView2.setFitWidth(400);

							Image image3 = new Image(new FileInputStream(cateringPackage3Data.get(catering)));
							ImageView imageView3 = new ImageView(image3);
							imageView3.setFitHeight(400);
							imageView3.setFitWidth(400);

							hbox64 = new HBox(30);
							hbox64.getChildren().addAll(imageView, imageView2, imageView3);
							hbox64.setTranslateX(50);

							btnBack37 = new Button("BACK");
							btnBack37.setOnAction(new EventHandler<ActionEvent>() {
								@Override
								public void handle(ActionEvent event) {
									stage.setScene(cateringScene);
								}
							});
							btnBack37.setTranslateX(600);
							borderPane36 = new BorderPane();
							borderPane36.setCenter(hbox64);
							borderPane36.setBottom(btnBack37);

							PackageScene = new Scene(borderPane36, 1300, 600);

							stage.setScene(PackageScene);

						}
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				else {
					stage.setScene(ItemScene);
				}

			}
		});

		btnCateringGo.setTranslateX(30);

		togglegroup9 = new ToggleGroup();
		rbCateringWedding = new RadioButton("WEDDING");
		rbCateringBirthDay = new RadioButton("BIRTHDAY");
		rbCateringGraduation = new RadioButton("GRADUATION");
		rbCateringEngagement = new RadioButton("ENGAGEMENT");
		rbCateringOpeningCeremony = new RadioButton("OPENING CEREMONY");

		rbCateringWedding.setToggleGroup(togglegroup9);
		rbCateringWedding.setTextFill(WHEAT);
		rbCateringWedding.setFont(new Font("Forte", 25));

		rbCateringBirthDay.setToggleGroup(togglegroup9);
		rbCateringBirthDay.setTextFill(WHEAT);
		rbCateringBirthDay.setFont(new Font("Forte", 25));

		rbCateringGraduation.setToggleGroup(togglegroup9);
		rbCateringGraduation.setTextFill(WHEAT);
		rbCateringGraduation.setFont(new Font("Forte", 25));

		rbCateringEngagement.setToggleGroup(togglegroup9);
		rbCateringEngagement.setTextFill(WHEAT);
		rbCateringEngagement.setFont(new Font("Forte", 25));

		rbCateringOpeningCeremony.setToggleGroup(togglegroup9);
		rbCateringOpeningCeremony.setTextFill(WHEAT);
		rbCateringOpeningCeremony.setFont(new Font("Forte", 25));

		togglegroup10 = new ToggleGroup();
		rbPackage = new RadioButton("PACKAGE");
		rbItem = new RadioButton("ITEMS");

		rbPackage.setToggleGroup(togglegroup10);
		rbPackage.setTextFill(WHEAT);
		rbPackage.setFont(new Font("Forte", 25));

		rbItem.setToggleGroup(togglegroup10);
		rbItem.setTextFill(WHEAT);
		rbItem.setFont(new Font("Forte", 25));

		lbCateringChoose = new Label("CHOOSE WHAT IS SUITABLE:");
		lbCateringChoose.setTextFill(WHEAT);
		lbCateringChoose.setFont(new Font("Forte", 25));

		lbCateringChooseEvent = new Label("CHOOSE EVENT");
		lbCateringChooseEvent.setTextFill(WHEAT);
		lbCateringChooseEvent.setFont(new Font("Forte", 25));

		hbox63 = new HBox(20);
		hbox63.getChildren().addAll(lbCateringChoose, rbPackage, rbItem, btnCateringGo);

		vbox41 = new VBox(20);
		vbox41.getChildren().addAll(lbCateringChooseEvent, rbCateringWedding, rbCateringBirthDay, rbCateringGraduation,
				rbCateringEngagement, rbCateringOpeningCeremony, btnShowReview);

		vbox42 = new VBox(30);
		vbox42.getChildren().addAll(vbox41, hbox63, btnBack35);
		vbox42.setTranslateX(100);
		vbox42.setTranslateY(50);

		borderPane34 = new BorderPane();
		borderPane34.setLeft(CateringListView);
		borderPane34.setCenter(vbox42);
		
		FileInputStream input61 = new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-06-03 (41).png");
		Image image61 = new Image(input61);

		BackgroundImage backgroundimage61 = new BackgroundImage(image61, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background61 = new Background(backgroundimage61);

		borderPane34.setBackground(background61);

		
		
		cateringScene = new Scene(borderPane34, 1300, 700);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// ITEMS
		// SCENE........................................................................................

		Image imageDessert = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(16) WhatsApp - Google Chrome 5_31_2020 4_28_17 PM.png"));
		ImageView imageViewDessert = new ImageView(imageDessert);

		Image imageMainDiches = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(19) WhatsApp - Google Chrome 5_31_2020 4_22_41 PM.png"));
		ImageView imageViewMainDishes = new ImageView(imageMainDiches);

		Image imageAppetizers = new Image(new FileInputStream(
				"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\(16) WhatsApp - Google Chrome 5_31_2020 4_29_44 PM.png"));
		ImageView imageViewAppetizers = new ImageView(imageAppetizers);

		lbCateringDessert = new Label("DESSERTS");
		lbCateringDessert.setFont(new Font("Forte", 25));

		lbCateringAppetizers = new Label("APPETIZERS");
		lbDressCode.setFont(new Font("Forte", 25));

		lbCateringMainDishes = new Label("MAIN DISHES");
		lbCateringMainDishes.setFont(new Font("Forte", 25));

		lbCateringPriceAnswer = new Label("----");
		lbCateringPriceAnswer.setFont(new Font("Forte", 25));

		lbCateringEnterNumberOfPeople = new Label("ENTER NUMBER OF PEOPLE:");
		lbCateringEnterNumberOfPeople.setFont(new Font("Forte", 25));

		tfCateringEnterNumberOfPeople = new TextField();

		cateringCheckBoxDessert1 = new CheckBox("CUPCAKES");
		cateringCheckBoxDessert2 = new CheckBox("BROWNIES");
		cateringCheckBoxDessert3 = new CheckBox("CHEESECAKE");
		cateringCheckBoxDessert4 = new CheckBox("MINI GATEAU");
		cateringCheckBoxDessert5 = new CheckBox("WAFFELS");

		cateringCheckBoxMainDishes1 = new CheckBox("STEAK");
		cateringCheckBoxMainDishes2 = new CheckBox("CHICKEN");
		cateringCheckBoxMainDishes3 = new CheckBox("BURGERS");
		cateringCheckBoxMainDishes4 = new CheckBox("PASTA");
		cateringCheckBoxMainDishes5 = new CheckBox("PIZZA");

		cateringCheckBoxAppetizers1 = new CheckBox("CHESSY FINGERS");
		cateringCheckBoxAppetizers2 = new CheckBox("NACHOS");
		cateringCheckBoxAppetizers3 = new CheckBox("SALADES");
		cateringCheckBoxAppetizers4 = new CheckBox("CHICKEN FINGERS");
		cateringCheckBoxAppetizers5 = new CheckBox("MINI PIZZA");

		int steak = 200;
		int chicken = 150;
		int burger = 250;
		int pasta = 170;
		int pizza = 180;

		int chessyFingers = 75;
		int nachos = 90;
		int salads = 40;
		int chickenFingers = 90;
		int miniPizza = 30;

		int cupCakes = 90;
		int brownies = 70;
		int cheeseCake = 50;
		int miniGateau = 10;
		int waffels = 20;

		btnBack38 = new Button("BACK");
		btnBack38.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(cateringScene);
			}
		});
		// btnBack38.setTranslateY(300);

		ArrayList<Integer> prices = new ArrayList<Integer>();

		prices.add(steak);
		prices.add(chicken);
		prices.add(burger);
		prices.add(pasta);
		prices.add(pizza);

		prices.add(chessyFingers);
		prices.add(nachos);
		prices.add(salads);
		prices.add(chickenFingers);
		prices.add(miniPizza);

		prices.add(cupCakes);
		prices.add(brownies);
		prices.add(cheeseCake);
		prices.add(miniGateau);
		prices.add(waffels);

		ArrayList<CheckBox> catering = new ArrayList<CheckBox>();

		catering.add(cateringCheckBoxMainDishes1);
		catering.add(cateringCheckBoxMainDishes2);
		catering.add(cateringCheckBoxMainDishes3);
		catering.add(cateringCheckBoxMainDishes4);
		catering.add(cateringCheckBoxMainDishes5);

		catering.add(cateringCheckBoxAppetizers1);
		catering.add(cateringCheckBoxAppetizers2);
		catering.add(cateringCheckBoxAppetizers3);
		catering.add(cateringCheckBoxAppetizers4);
		catering.add(cateringCheckBoxAppetizers5);

		catering.add(cateringCheckBoxDessert1);
		catering.add(cateringCheckBoxDessert2);
		catering.add(cateringCheckBoxDessert3);
		catering.add(cateringCheckBoxDessert4);
		catering.add(cateringCheckBoxDessert5);

		btnCateringCalculateItemPrice = new Button("CALCULATE PRICE RANGE:");
		btnCateringCalculateItemPrice.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				sum = 0;

				for (int i = 0; i < catering.size(); i++) {

					if (catering.get(i).isSelected()) {

						sum = sum + prices.get(i);
					}

				}

				System.out.print(sum);

				// String equal = objCatering.total(sum,
				// tfCateringEnterNumberOfPeople.getText());
				lbCateringPriceAnswer.setText(String.valueOf(sum));

			}
		});

		hbox65 = new HBox(20);
		hbox65.getChildren().addAll(lbCateringMainDishes, imageViewMainDishes);

		hbox66 = new HBox(20);
		hbox66.getChildren().addAll(cateringCheckBoxMainDishes1, cateringCheckBoxMainDishes2,
				cateringCheckBoxMainDishes3, cateringCheckBoxMainDishes4, cateringCheckBoxMainDishes5);

		vbox43 = new VBox(20);
		vbox43.getChildren().addAll(hbox65, hbox66);

		hbox67 = new HBox(20);
		hbox67.getChildren().addAll(lbCateringAppetizers, imageViewAppetizers);

		hbox68 = new HBox(20);
		hbox68.getChildren().addAll(cateringCheckBoxAppetizers1, cateringCheckBoxAppetizers2,
				cateringCheckBoxAppetizers3, cateringCheckBoxAppetizers4, cateringCheckBoxAppetizers5);

		vbox44 = new VBox(20);
		vbox44.getChildren().addAll(hbox67, hbox68);

		hbox69 = new HBox(20);
		hbox69.getChildren().addAll(lbCateringDessert, imageViewDessert);

		hbox70 = new HBox(20);
		hbox70.getChildren().addAll(cateringCheckBoxDessert1, cateringCheckBoxDessert2, cateringCheckBoxDessert3,
				cateringCheckBoxDessert4, cateringCheckBoxDessert5);

		vbox45 = new VBox(20);
		vbox45.getChildren().addAll(hbox69, hbox70);

		hbox71 = new HBox(20);
		hbox71.getChildren().addAll(btnCateringCalculateItemPrice, lbCateringPriceAnswer, btnBack38);
		hbox71.setTranslateX(700);
		hbox71.setTranslateY(-400);

		vbox46 = new VBox(20);
		vbox46.getChildren().addAll(vbox43, vbox44, vbox45, hbox71);
		vbox46.setTranslateX(30);

		hbox72 = new HBox(10);
		hbox72.getChildren().addAll(lbCateringEnterNumberOfPeople, tfCateringEnterNumberOfPeople);
		hbox72.setTranslateX(-100);
		hbox72.setTranslateY(600);

		borderPane37 = new BorderPane();
		borderPane37.setCenter(vbox46);
		borderPane37.setRight(hbox72);
		
		BackgroundFill background_fill70 = new BackgroundFill(Color.BLANCHEDALMOND, null, null);
		Background background70 = new Background(background_fill70);
		borderPane37.setBackground(background70);

		ItemScene = new Scene(borderPane37, 1300, 1200);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// SPONSORS
		// SCENE......................................................................................

		ObservableList<String> sponsorsFoodEventlist = FXCollections.observableArrayList();

		ObservableList<String> sponsorsFitnessEventlist = FXCollections.observableArrayList();

		ObservableList<String> sponsorsMusicEventlist = FXCollections.observableArrayList();

		ObservableList<String> sponsorsCharityEventlist = FXCollections.observableArrayList();

		try {

			ResultSet result2 = DBConnect2.statement2.executeQuery("SELECT * FROM sponsors");
			while (result2.next()) {

				String sponsorsFoodEvent = result2.getString(1);

				String sponsorsFitnessEvent = result2.getString(2);

				String sponsorsMusicEvent = result2.getString(3);

				String sponsorsCharityEvent = result2.getString(4);

				sponsorsFoodEventlist.add(sponsorsFoodEvent);

				sponsorsFitnessEventlist.add(sponsorsFitnessEvent);

				sponsorsMusicEventlist.add(sponsorsMusicEvent);

				sponsorsCharityEventlist.add(sponsorsCharityEvent);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		lbSponsorsFillForm = new Label("👇FILL IN THIS FORM TO FIND THE BEST SPONSORS FOR YOU👇");
		lbSponsorsFillForm.setFont(new Font("Arial", 40));

		lbSponsorsNameEvent = new Label("EVENT NAME");
		lbSponsorsNameEvent.setFont(new Font("Forte", 25));

		lbSponsorsTypeOfEvent = new Label("EVENT TYPE");
		lbSponsorsTypeOfEvent.setFont(new Font("Forte", 25));

		lbSponsorDuration = new Label("DURATION");
		lbSponsorDuration.setFont(new Font("Forte", 25));

		tfSponsorNameEvent = new TextField();
		tfSponsorDuration = new TextField();

		SponsorsListView = new ListView<>();
		SponsorsListView.setTranslateY(50);
		SponsorsListView.setTranslateX(-40);

		SponsorsListView.getSelectionModel().selectedItemProperty()
				.addListener((ObservableValue<? extends String> ov2, String old_val2, String new_val2) -> {

					indexSponsor = SponsorsListView.getSelectionModel().getSelectedIndex();
				});

		btnShowSponsors = new Button("SHOW SPONSORS");
		btnShowSponsors.setScaleX(1.5);
		btnShowSponsors.setScaleY(1.5);
		btnShowSponsors.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				if (rbSponsorFood.isSelected()) {
					SponsorsListView.setItems(sponsorsFoodEventlist);
					borderPane38.setCenter(SponsorsListView);

				}

				if (rbSponsorFitness.isSelected()) {

					SponsorsListView.setItems(sponsorsFitnessEventlist);
					borderPane38.setCenter(SponsorsListView);

				}

				if (rbSponsorMusic.isSelected()) {

					SponsorsListView.setItems(sponsorsMusicEventlist);
					borderPane38.setCenter(SponsorsListView);

				}

				if (rbSponsorCharity.isSelected()) {

					SponsorsListView.setItems(sponsorsCharityEventlist);
					borderPane38.setCenter(SponsorsListView);

				}

			}
		});

		btnBack39 = new Button("BACK");
		btnBack39.setScaleX(1.5);
		btnBack39.setScaleY(1.5);
		btnBack39.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(companyScene);
			}
		});

		togglegroup11 = new ToggleGroup();
		rbSponsorFood = new RadioButton("FOOD");
		rbSponsorFitness = new RadioButton("FITNESS");
		rbSponsorMusic = new RadioButton("MUSIC");
		rbSponsorCharity = new RadioButton("CHARITY");

		rbSponsorFood.setToggleGroup(togglegroup11);
		// rbOnline.setTextFill(WHEAT);
		rbSponsorFood.setFont(new Font("Forte", 25));

		rbSponsorFitness.setToggleGroup(togglegroup11);
		// rbOffline.setTextFill(WHEAT);
		rbSponsorFitness.setFont(new Font("Forte", 25));

		rbSponsorMusic.setToggleGroup(togglegroup11);
		// rbOnlineAndOffline.setTextFill(WHEAT);
		rbSponsorMusic.setFont(new Font("Forte", 25));

		rbSponsorCharity.setToggleGroup(togglegroup11);
		// rbOnlineAndOffline.setTextFill(WHEAT);
		rbSponsorCharity.setFont(new Font("Forte", 25));

		hbox73 = new HBox(10);
		hbox73.getChildren().addAll(lbSponsorsFillForm);

		hbox74 = new HBox(10);
		hbox74.getChildren().addAll(lbSponsorsNameEvent, tfSponsorNameEvent);

		hbox75 = new HBox(10);
		hbox75.getChildren().addAll(lbSponsorsTypeOfEvent, rbSponsorFood, rbSponsorFitness, rbSponsorMusic,
				rbSponsorCharity);

		hbox76 = new HBox(10);
		hbox76.getChildren().addAll(lbSponsorDuration, tfSponsorDuration);

		hbox77 = new HBox(80);
		hbox77.getChildren().addAll(btnShowSponsors, btnBack39);

		vbox47 = new VBox(30);
		vbox47.getChildren().addAll(hbox73, hbox74, hbox75, hbox76, hbox77);
		vbox47.setTranslateX(50);

		borderPane38 = new BorderPane();
		borderPane38.setLeft(vbox47);
		
		FileInputStream input44 = null;
		try {
			input44 = new FileInputStream("C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-06-02 (15).png");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Image image44 = new Image(input44);
		BackgroundImage backgroundimage44 = new BackgroundImage(image44, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(1.0, 1.0, true, true, false, false));
		Background background44 = new Background(backgroundimage44);
		borderPane38.setBackground(background44);

		SponsorsScene = new Scene(borderPane38, 1600, 700);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		stage.setScene(welcomeScene);
		stage.setTitle("4M EVENTS");
		stage.show();
	}

	public class Private1 {
		String eventType, location, numberOfGuests, dressCode, date, time, email;

		public Private1(String eventType, String location, String numberOfGuests, String dressCode1, String date,
				String time, String email) {
			this.eventType = eventType;
			this.location = location;
			this.numberOfGuests = numberOfGuests;
			this.dressCode = dressCode1;
			this.date = date;
			this.time = time;
			this.email = email;
		}

		public String getEventType() {
			return eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getNumberOfGuests() {
			return numberOfGuests;
		}

		public void setNumberOfGuests(String numberOfGuests) {
			this.numberOfGuests = numberOfGuests;
		}

		public String getDressCode() {
			return dressCode;
		}

		public void setDressCode(String dressCode) {
			this.dressCode = dressCode;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email1) {
			this.email = email1;
		}

	}

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////

//FUNCTIONS OF LOGIN PAGE.......................................................
	public HBox getHBox2() {
		lbPassWord = new Label("PASSWORD:");
		lbPassWord.setFont(new Font("Forte", 25));
		lbPassWord.setTextFill(WHEAT);
		// lbPassWord.setFont(Font.font(null, FontWeight.BOLD, 15));
		tfPassWord = new PasswordField();
		hbox2 = new HBox(5);
		hbox2.getChildren().addAll(lbPassWord, tfPassWord);
		hbox2.setTranslateX(20);
		return hbox2;
	}

	public HBox getHBox3() {
		lbUserName = new Label("USERNAME:");
		lbUserName.setFont(new Font("Forte", 25));
		lbUserName.setTextFill(WHEAT);
		// lbUserName.setFont(Font.font(null, FontWeight.BOLD, 15));
		tfUserName = new TextField();
		tfUserName.setScaleX(1);
		hbox3 = new HBox(5);
		hbox3.getChildren().addAll(lbUserName, tfUserName);
		hbox3.setTranslateX(20);
		return hbox3;
	}

	public HBox getHBox4() {
		btnJumpIn = new Button("JUMP IN");
		btnJumpIn.setScaleX(1.5);
		btnJumpIn.setScaleY(1.5);
		btnJumpIn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				/*
				 * String email = tfEmail.getText().toString(); String password =
				 * tfPassWord.getText().toString();
				 * 
				 * String sql = "SELECT * FROM client WHERE email = ? and password = ?"; try{
				 * PreparedStatement stmt; stmt= DBConnect.connect().prepareStatement(sql);
				 * 
				 * stmt.setString(1, email); stmt.setString(2, password); ResultSet
				 * rs=stmt.executeQuery();
				 * 
				 * if(rs.next()){ stage.setScene(homeScene); }else{
				 * stage.setScene(welcomeScene);
				 * 
				 * } } catch(Exception e){ e.printStackTrace(); }
				 * 
				 */
				try {
					String userName = null;
					String passWord = null;
					int x = 0;
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "Medhat15",
							"fmaamito15");
					String query = "SELECT * FROM client";
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query);
					while (rs.next()) {

						if (tfUserName.getText().equals(rs.getString("username"))
								&& tfPassWord.getText().equals(rs.getString("password"))) {

							x = 1;
						}

					}
					if (x == 1) {
						stage.setScene(homeScene);
					} else {
						vbox1.getChildren().add(lbError);
					}
					st.close();
					// System.out.format("%s\n",userName);
					// System.out.format("%s\n",passWord);

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				tfUserName.clear();
				tfPassWord.clear();

			}
		});

		btnBack1 = new Button("BACK");
		btnBack1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(welcomeScene);
			}
		});
		btnBack1.setScaleX(1.5);
		btnBack1.setScaleY(1.5);

		hbox4 = new HBox(70);
		hbox4.getChildren().addAll(btnJumpIn, btnBack1);
		hbox4.setTranslateX(160);
		hbox4.setTranslateY(-110);
		return hbox4;
	}

	public VBox getVBox1() {
		lbError = new Label("ERROR");
		lbError.setFont(new Font("Forte", 25));
		// lbError.setFont(new Font("Cambria", 12));
		lbError.setTextFill(RED);
		// lbError.setFont(Font.font(null, FontWeight.BOLD, 20));
		lbError.setTranslateX(350);
		lbError.setTranslateY(-90);
		vbox1 = new VBox(30);
		vbox1.getChildren().addAll(getHBox3(), getHBox2());
		vbox1.setTranslateY(150);
		vbox1.setTranslateX(50);
		return vbox1;
	}
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////

	// FUNCTIONS OF SIGNUP PAGE..................................................

	public HBox getHBox5() {// USERNAME TEXTFIELD,LABEL
		lbstarError1 = new Label("*");
		lbstarError1.setFont(new Font("Cambria", 12));

		lbEnterUserName = new Label("USERNAME:");
		lbEnterUserName.setFont(new Font("Forte", 25));

		// lbEnterUserName.setFont(Font.font(null, FontWeight.BOLD, 15));
		tfEnterUserName = new TextField();
		tfEnterUserName.setScaleX(1);
		hbox5 = new HBox(5);
		hbox5.getChildren().addAll(lbEnterUserName, tfEnterUserName);
		hbox5.setTranslateX(20);
		return hbox5;
	}

	public HBox getHBox6() {// FIRST NAME TEXTFIELD,LABEL
		lbstarError2 = new Label("*");
		lbstarError2.setFont(new Font("Cambria", 12));
		lbstarError2.setTextFill(RED);

		lbFirstName = new Label("FIRST NAME:");
		lbFirstName.setFont(new Font("Forte", 25));

		// lbFirstName.setFont(Font.font(null, FontWeight.BOLD, 15));

		tfFirstName = new TextField();
		tfFirstName.setScaleX(1);
		hbox6 = new HBox(5);
		hbox6.getChildren().addAll(lbFirstName, tfFirstName);
		hbox6.setTranslateX(20);
		return hbox6;
	}

	public HBox getHBox7() {// LAST NAME TEXTFIELD,LABEL
		lbstarError3 = new Label("*");
		lbstarError3.setFont(new Font("Cambria", 12));
		lbstarError3.setTextFill(RED);

		lbLastName = new Label("LAST NAME:");
		lbLastName.setFont(new Font("Forte", 25));
		// lbLastName.setFont(Font.font(null, FontWeight.BOLD, 15));

		tfLastName = new TextField();
		tfUserName.setScaleX(1);
		hbox7 = new HBox(5);
		hbox7.getChildren().addAll(lbLastName, tfLastName);
		hbox7.setTranslateX(20);
		return hbox7;
	}

	public HBox getHBox8() {// PASSWORD TEXTFIELD,LABEL
		lbstarError4 = new Label("*");
		lbstarError4.setFont(new Font("Cambria", 12));
		lbstarError4.setTextFill(RED);

		lbEnterPassWord = new Label("PASSWORD:");
		lbEnterPassWord.setFont(new Font("Forte", 25));
		// lbEnterPassWord.setFont(Font.font(null, FontWeight.BOLD, 15));

		tfNewPassWord = new PasswordField();
		tfNewPassWord.setScaleX(1);
		hbox8 = new HBox(5);
		hbox8.getChildren().addAll(lbEnterPassWord, tfNewPassWord);
		hbox8.setTranslateX(20);
		return hbox8;
	}

	public HBox getHBox9() {// CONFIRM TEXTFIELD,LABEL
		lbstarError5 = new Label("*");
		lbstarError5.setFont(new Font("Cambria", 12));
		lbstarError5.setTextFill(RED);
		lbErrorPass = new Label("*INCORRECT PASSWORD*");
		lbErrorPass.setFont(new Font("Cambria", 12));
		lbErrorPass.setTextFill(RED);

		lbConfirmPassWord = new Label("CONFIRM:");
		lbConfirmPassWord.setFont(new Font("Forte", 25));
		// lbConfirmPassWord.setFont(Font.font(null, FontWeight.BOLD, 15));

		tfConfirmPassWord = new PasswordField();
		tfConfirmPassWord.setScaleX(1);
		hbox9 = new HBox(5);
		hbox9.getChildren().addAll(lbConfirmPassWord, tfConfirmPassWord);
		hbox9.setTranslateX(20);
		return hbox9;
	}

	public HBox getHBox10() {// EMAIL TEXTFIELD,EMAIL LABEL
		lbstarError6 = new Label("*");
		lbstarError6.setFont(new Font("Cambria", 12));
		lbstarError6.setTextFill(RED);

		lbEmail = new Label("EMAIL:");
		lbEmail.setFont(new Font("Forte", 25));
		// lbEmail.setFont(Font.font(null, FontWeight.BOLD, 15));

		tfEmail = new TextField();
		tfEmail.setScaleX(1);
		hbox10 = new HBox(5);
		hbox10.getChildren().addAll(lbEmail, tfEmail);
		hbox10.setTranslateX(20);
		return hbox10;
	}

	public HBox getHBox11() {// BUTTONS
		btnBack3 = new Button("BACK");
		btnBack3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(welcomeScene);
			}
		});
		btnBack3.setScaleX(1.5);
		btnBack3.setScaleY(1.5);

		btnNewSignUp = new Button("SIGN UP");
		btnNewSignUp.setScaleX(1.5);
		btnNewSignUp.setScaleY(1.5);
		btnNewSignUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				ArrayList<TextField> al = new ArrayList<TextField>();
				al.add(tfFirstName);
				al.add(tfLastName);
				al.add(tfEmail);
				al.add(tfNewPassWord);
				al.add(tfConfirmPassWord);
				al.add(tfEnterUserName);

				if (tfConfirmPassWord.getText().equals(tfNewPassWord.getText()) && !tfFirstName.getText().isEmpty()
						&& !tfLastName.getText().isEmpty() && !tfEmail.getText().isEmpty()
						&& !tfNewPassWord.getText().isEmpty() && !tfConfirmPassWord.getText().isEmpty()
						&& !tfEnterUserName.getText().isEmpty()) {
					//stage.setScene(loginScene);

					Properties properties = new Properties();
					properties.put("mail.smtp.host", "smtp.gmail.com");
					properties.put("mail.smtp.post", "465");
					properties.put("mail.smtp.auth", "true");
					properties.put("mail.smtp.socketFactory.port", "465");
					properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

					Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(myAccountEmail, password);
						}
					});

					try {
						Message message = new MimeMessage(session);
						message.setFrom(new InternetAddress(myAccountEmail));
						message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tfEmail.getText()));
						message.setSubject("4M EVENTS");
						message.setText("HEY " + tfFirstName.getText() + "🙋‍🙋‍️"
								+ "\n YOUR ACCOUNT HAS BEEN ADDED SUCCESSFULLY 😌😌");
						Transport.send(message);
					}

					catch (MessagingException e) {

						e.printStackTrace();
					}

					try {
						// TODO MYSQL
						DBConnect.statement.executeUpdate(
								"INSERT INTO client (firstName , lastName,email, password ,username ) VALUES ( '"
										+ tfFirstName.getText() + "' , '" + tfLastName.getText() + "' , '"
										+ tfEmail.getText() + "' , '" + tfNewPassWord.getText() + "' , '"
										+ tfEnterUserName.getText() + "' ) ");
					} catch (SQLException ex) {
						System.err.println("Got an exception!");

						Logger.getLogger(EVENTS.class.getName()).log(Level.SEVERE, null, ex);
					}

					tfFirstName.clear();
					tfLastName.clear();
					tfEmail.clear();
					tfNewPassWord.clear();
					tfConfirmPassWord.clear();
					tfEnterUserName.clear();
					lbErrorPass.setVisible(false);
					lbstarError1.setVisible(false);
					lbstarError2.setVisible(false);
					lbstarError3.setVisible(false);
					lbstarError4.setVisible(false);
					lbstarError5.setVisible(false);
					lbstarError6.setVisible(false);
				}

				else {

					int i = 0;

					while (i <= 5) {
						if (al.get(0).getText().isEmpty()) {
							hbox6.getChildren().add(lbstarError2);
						}
						if (al.get(1).getText().isEmpty()) {
							hbox7.getChildren().add(lbstarError3);
						}
						if (al.get(2).getText().isEmpty()) {
							hbox10.getChildren().add(lbstarError6);
						}
						if (al.get(3).getText().isEmpty()) {
							hbox8.getChildren().add(lbstarError4);
						}
						if (al.get(5).getText().isEmpty()) {
							hbox5.getChildren().add(lbstarError1);
						}
						if (!al.get(4).getText().equals(al.get(3).getText())) {
							hbox9.getChildren().add(lbErrorPass);
						}
						i++;
					}

				}
			}
		});

		hbox11 = new HBox(70);
		hbox11.getChildren().addAll(btnBack3, btnNewSignUp);
		hbox11.setTranslateX(100);
		return hbox11;
	}

	public VBox getVBox2() {
		vbox2 = new VBox(30);
		vbox2.getChildren().addAll(getHBox6(), getHBox7(), getHBox10(), getHBox8(), getHBox9(), getHBox5(),
				getHBox11());
		vbox2.setTranslateY(70);
		vbox2.setTranslateX(100);
		return vbox2;
	}
	//////////////////////////////////////////////////////////////////////////////
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	//////////////////////////////////////////////////////////////////////////////

	// FUNNCTIONS CHECK EVENTS PAGE............................................

	public class Music {
		String name1;
		String time1;
		String description1;
		String phoneNumber1;
		String location1;
		Button btnShow1;

		public Music(String time1, String description1, String phoneNumber1, String location1) {
			this.time1 = time1;
			this.description1 = description1;
			this.phoneNumber1 = phoneNumber1;
			this.location1 = location1;
		}

		Music(String a1) {

			name1 = a1;

			this.btnShow1 = new Button("SHOW DETAILS");

			btnShow1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					table1a = new TableView();
					table1a.setMaxWidth(Region.USE_PREF_SIZE);
					table1a.prefWidthProperty();
					table1a.setEditable(true);

					ObservableList<Music> data1a = FXCollections.observableArrayList();
					lbMusicTitlea = new Label("🎻🎺MUSIC🎺🎻");
					lbMusicTitlea.setTextFill(WHEAT);
					lbMusicTitlea.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbMusicTitlea.setTranslateX(10);

					btnBack8a = new Button("BACK");
					btnBack8a.setTranslateX(225);
					btnBack8a.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(MusicTable);
						}
					});
					btnBack8a.setScaleX(1.5);
					btnBack8a.setScaleY(1.5);
					btnBack8a.setTranslateX(700);
					btnBack8a.setTranslateY(-100);

					time1a = new TableColumn<Music, String>("TIME");
					time1a.setCellValueFactory(new PropertyValueFactory<Music, String>("time1"));
					time1a.setMinWidth(10);

					description1a = new TableColumn<Music, String>("DESCRIPTION");
					description1a.setCellValueFactory(new PropertyValueFactory<Music, String>("description1"));
					description1a.setMinWidth(10);

					phoneNumber1a = new TableColumn<Music, String>("PHONE NUMBER");
					phoneNumber1a.setCellValueFactory(new PropertyValueFactory<Music, String>("phoneNumber1"));
					phoneNumber1a.setMinWidth(10);

					location1a = new TableColumn<Music, String>("LOCATION");
					location1a.setCellValueFactory(new PropertyValueFactory<Music, String>("location1"));
					location1a.setMinWidth(10);

					try {

						ResultSet result1 = DBConnect.statement
								.executeQuery("SELECT * FROM music WHERE name = '" + name1 + "'");
						while (result1.next()) {
							String time1a = result1.getString(2);
							String description1a = result1.getString(3);
							String phoneNumber1a = result1.getString(4);
							String location1a = result1.getString(5);
							data1a.addAll(new Music(time1a, description1a, phoneNumber1a, location1a));

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table1a.setItems(data1a);
					table1a.getColumns().addAll(time1a, description1a, phoneNumber1a, location1a);

					vbox5a = new VBox();
					vbox5a.setSpacing(5);
					vbox5a.getChildren().addAll(lbMusicTitlea, table1a);
					vbox5a.setTranslateX(125);

					borderPane8a = new BorderPane();
					borderPane8a.setCenter(vbox5a);
					borderPane8a.setBottom(btnBack8a);

					FileInputStream input21 = null;
					try {
						input21 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (4).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image21 = new Image(input21);
					BackgroundImage backgroundimage21 = new BackgroundImage(image21, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background21 = new Background(backgroundimage21);
					borderPane8a.setBackground(background21);

					musicDetails = new Scene(borderPane8a, 800, 700);
					stage.setScene(musicDetails);

				}

			});
		}

		public String getTime1() {
			return time1;
		}

		public void setTime1(String time1) {
			this.time1 = time1;
		}

		public String getDescription1() {
			return description1;
		}

		public void setDescription1(String description1) {
			this.description1 = description1;
		}

		public String getPhoneNumber1() {
			return phoneNumber1;
		}

		public void setPhoneNumber1(String phoneNumber1) {
			this.phoneNumber1 = phoneNumber1;
		}

		public String getLocation1() {
			return location1;
		}

		public void setLocation1(String location1) {
			this.location1 = location1;
		}

		public String getName() {
			return name1;
		}

		public Button getBtnShow1() {
			return btnShow1;
		}

		public void setBtnShow1(Button btnShow1) {
			this.btnShow1 = btnShow1;
		}

		public void setName(String name1) {
			this.name1 = name1;
		}

	}

	/*
	
	
	*/

	public class Arts {
		String name2;
		String time2;
		String description2;
		String phoneNumber2;
		String location2;
		Button btnShow2;

		public Arts(String time2, String description2, String phoneNumber2, String location2) {

			this.time2 = time2;
			this.description2 = description2;
			this.phoneNumber2 = phoneNumber2;
			this.location2 = location2;
		}

		Arts(String a2) {
			name2 = a2;
			this.btnShow2 = new Button("SHOW DETAILS");
			btnShow2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					table2a = new TableView();
					table2a.setMaxWidth(Region.USE_PREF_SIZE);
					table2a.prefWidthProperty();
					table2a.setEditable(true);

					ObservableList<Arts> data2a = FXCollections.observableArrayList();
					lbArtsTitlea = new Label("🎭ARTS🎭");
					lbArtsTitlea.setTextFill(WHEAT);
					lbArtsTitlea.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbArtsTitlea.setTranslateX(10);

					btnBack9a = new Button("BACK");
					btnBack9a.setTranslateX(225);
					btnBack9a.setScaleX(1.5);
					btnBack9a.setScaleY(1.5);

					btnBack9a.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(ArtsTable);
						}
					});
					btnBack9a.setTranslateX(700);
					btnBack9a.setTranslateY(-100);

					time2a = new TableColumn<Arts, String>("TIME");
					time2a.setCellValueFactory(new PropertyValueFactory<Arts, String>("time2"));
					time2a.setMinWidth(10);

					description2a = new TableColumn<Arts, String>("DESCRIPTION");
					description2a.setCellValueFactory(new PropertyValueFactory<Arts, String>("description2"));
					description2a.setMinWidth(10);

					phoneNumber2a = new TableColumn<Arts, String>("PHONE NUMBER");
					phoneNumber2a.setCellValueFactory(new PropertyValueFactory<Arts, String>("phoneNumber2"));
					phoneNumber2a.setMinWidth(10);

					location2a = new TableColumn<Arts, String>("LOCATION");
					location2a.setCellValueFactory(new PropertyValueFactory<Arts, String>("location2"));
					location2a.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement
								.executeQuery("SELECT * FROM arts WHERE name = '" + name2 + "'");
						while (result.next()) {
							String time2a = result.getString(2);
							String description2a = result.getString(3);
							String phoneNumber2a = result.getString(4);
							String location2a = result.getString(5);
							data2a.addAll(new Arts(time2a, description2a, phoneNumber2a, location2a));

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table2a.setItems(data2a);
					table2a.getColumns().addAll(time2a, description2a, phoneNumber2a, location2a);

					vbox6a = new VBox();
					vbox6a.setSpacing(5);
					vbox6a.getChildren().addAll(lbArtsTitlea, table2a);
					vbox6a.setTranslateX(125);

					borderPane9a = new BorderPane();
					borderPane9a.setCenter(vbox6a);
					borderPane9a.setBottom(btnBack9a);

					FileInputStream input22 = null;
					try {
						input22 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (8).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image22 = new Image(input22);
					BackgroundImage backgroundimage22 = new BackgroundImage(image22, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background22 = new Background(backgroundimage22);
					borderPane9a.setBackground(background22);

					artsDetails = new Scene(borderPane9a, 800, 700);
					stage.setScene(artsDetails);

				}
			});
		}

		public Button getBtnShow2() {
			return btnShow2;
		}

		public void setBtnShow2(Button btnShow2) {
			this.btnShow2 = btnShow2;
		}

		public String getName() {
			return name2;
		}

		public void setName(String name2) {
			this.name2 = name2;
		}

		public String getTime2() {
			return time2;
		}

		public void setTime2(String time2) {
			this.time2 = time2;
		}

		public String getDescription2() {
			return description2;
		}

		public void setDescription2(String description2) {
			this.description2 = description2;
		}

		public String getPhoneNumber2() {
			return phoneNumber2;
		}

		public void setPhoneNumber2(String phoneNumber2) {
			this.phoneNumber2 = phoneNumber2;
		}

		public String getLocation2() {
			return location2;
		}

		public void setLocation2(String location2) {
			this.location2 = location2;
		}

	}

	/*
	
	
	*/

	public class Fitness {
		String name3;
		String time3;
		String description3;
		String phoneNumber3;
		String location3;
		Button btnShow3;

		public Fitness(String time3, String description3, String phoneNumber3, String location3) {
			super();
			this.time3 = time3;
			this.description3 = description3;
			this.phoneNumber3 = phoneNumber3;
			this.location3 = location3;
		}

		Fitness(String a3) {
			name3 = a3;

			this.btnShow3 = new Button("SHOW DETAILS");
			btnShow3.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					table3a = new TableView();
					table3a.setMaxWidth(Region.USE_PREF_SIZE);
					table3a.prefWidthProperty();
					table3a.setEditable(true);

					ObservableList<Fitness> data3a = FXCollections.observableArrayList();
					lbFitnessTitlea = new Label("🤸‍FITNESS🤸");
					lbFitnessTitlea.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbFitnessTitlea.setTranslateX(10);

					btnBack10a = new Button("BACK");
					btnBack10a.setTranslateX(225);
					btnBack10a.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(FitnessTable);
						}
					});
					btnBack10a.setScaleX(1.5);
					btnBack10a.setScaleY(1.5);
					btnBack10a.setTranslateX(700);
					btnBack10a.setTranslateY(-100);

					time3a = new TableColumn<Fitness, String>("TIME");
					time3a.setCellValueFactory(new PropertyValueFactory<Fitness, String>("time3"));
					time3a.setMinWidth(10);

					description3a = new TableColumn<Fitness, String>("DESCRIPTION");
					description3a.setCellValueFactory(new PropertyValueFactory<Fitness, String>("description3"));
					description3a.setMinWidth(10);

					phoneNumber3a = new TableColumn<Fitness, String>("PHONE NUMBER");
					phoneNumber3a.setCellValueFactory(new PropertyValueFactory<Fitness, String>("phoneNumber3"));
					phoneNumber3a.setMinWidth(10);

					location3a = new TableColumn<Fitness, String>("LOCATION");
					location3a.setCellValueFactory(new PropertyValueFactory<Fitness, String>("location3"));
					location3a.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement
								.executeQuery("SELECT * FROM fitness WHERE name = '" + name3 + "'");
						while (result.next()) {
							String time3a = result.getString(2);
							String description3a = result.getString(3);
							String phoneNumber3a = result.getString(4);
							String location3a = result.getString(5);
							data3a.addAll(new Fitness(time3a, description3a, phoneNumber3a, location3a));

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table3a.setItems(data3a);
					table3a.getColumns().addAll(time3a, description3a, phoneNumber3a, location3a);

					vbox7a = new VBox();
					vbox7a.setSpacing(5);
					vbox7a.getChildren().addAll(lbFitnessTitlea, table3a);
					vbox7a.setTranslateX(125);

					borderPane10a = new BorderPane();
					borderPane10a.setCenter(vbox7a);
					borderPane10a.setBottom(btnBack10a);

					FileInputStream input23 = null;
					try {
						input23 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (11).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image23 = new Image(input23);
					BackgroundImage backgroundimage23 = new BackgroundImage(image23, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background23 = new Background(backgroundimage23);
					borderPane10a.setBackground(background23);

					fitnessDetails = new Scene(borderPane10a, 800, 700);
					stage.setScene(fitnessDetails);

				}

			});

		}

		public Button getBtnShow3() {
			return btnShow3;
		}

		public void setBtnShow3(Button btnShow3) {
			this.btnShow3 = btnShow3;
		}

		public String getName() {
			return name3;
		}

		public void setName(String name3) {
			this.name3 = name3;
		}

		public String getTime3() {
			return time3;
		}

		public void setTime3(String time3) {
			this.time3 = time3;
		}

		public String getDescription3() {
			return description3;
		}

		public void setDescription3(String description3) {
			this.description3 = description3;
		}

		public String getPhoneNumber3() {
			return phoneNumber3;
		}

		public void setPhoneNumber3(String phoneNumber3) {
			this.phoneNumber3 = phoneNumber3;
		}

		public String getLocation3() {
			return location3;
		}

		public void setLocation3(String location3) {
			this.location3 = location3;
		}

	}

	/*
	
	
	*/

	public class Food {
		String name4;
		String time4;
		String description4;
		String phoneNumber4;
		String location4;
		Button btnShow4;

		public Food(String time4, String description4, String phoneNumber4, String location4) {
			super();
			this.time4 = time4;
			this.description4 = description4;
			this.phoneNumber4 = phoneNumber4;
			this.location4 = location4;
		}

		Food(String a4) {
			name4 = a4;
			this.btnShow4 = new Button("SHOW DETAILS");
			btnShow4.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					table4a = new TableView();
					table4a.setMaxWidth(Region.USE_PREF_SIZE);
					table4a.prefWidthProperty();
					table4a.setEditable(true);

					ObservableList<Food> data4a = FXCollections.observableArrayList();
					lbFoodTitlea = new Label("🍩🍕FOOD🍕🍩");
					lbFoodTitlea.setTextFill(WHEAT);
					lbFoodTitlea.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbFoodTitlea.setTranslateX(10);

					btnBack12a = new Button("BACK");
					btnBack12a.setTranslateX(225);
					btnBack12a.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(FoodTable);
						}
					});
					btnBack12a.setTranslateX(700);
					btnBack12a.setTranslateY(-100);
					btnBack12a.setScaleX(1.5);
					btnBack12a.setScaleY(1.5);

					time4a = new TableColumn<Food, String>("TIME");
					time4a.setCellValueFactory(new PropertyValueFactory<Food, String>("time4"));
					time4a.setMinWidth(10);

					description4a = new TableColumn<Food, String>("DESCRIPTION");
					description4a.setCellValueFactory(new PropertyValueFactory<Food, String>("description4"));
					description4a.setMinWidth(10);

					phoneNumber4a = new TableColumn<Food, String>("PHONE NUMBER");
					phoneNumber4a.setCellValueFactory(new PropertyValueFactory<Food, String>("phoneNumber4"));
					phoneNumber4a.setMinWidth(10);

					location4a = new TableColumn<Food, String>("LOCATION");
					location4a.setCellValueFactory(new PropertyValueFactory<Food, String>("location4"));
					location4a.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement
								.executeQuery("SELECT * FROM food WHERE name = '" + name4 + "'");
						while (result.next()) {
							String time4a = result.getString(2);
							String description4a = result.getString(3);
							String phoneNumber4a = result.getString(4);
							String location4a = result.getString(5);
							data4a.addAll(new Food(time4a, description4a, phoneNumber4a, location4a));

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table4a.setItems(data4a);
					table4a.getColumns().addAll(time4a, description4a, phoneNumber4a, location4a);

					vbox8a = new VBox();
					vbox8a.setSpacing(5);
					vbox8a.getChildren().addAll(lbFoodTitlea, table4a);
					vbox8a.setTranslateX(125);

					borderPane11a = new BorderPane();
					borderPane11a.setCenter(vbox8a);
					borderPane11a.setBottom(btnBack12a);

					FileInputStream input25 = null;
					try {
						input25 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (15).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image25 = new Image(input25);
					BackgroundImage backgroundimage25 = new BackgroundImage(image25, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background25 = new Background(backgroundimage25);
					borderPane11a.setBackground(background25);

					foodDetails = new Scene(borderPane11a, 800, 700);
					stage.setScene(foodDetails);

				}
			});
		}

		public Button getBtnShow4() {
			return btnShow4;
		}

		public void setBtnShow4(Button btnShow4) {
			this.btnShow4 = btnShow4;
		}

		public String getName() {
			return name4;
		}

		public void setName(String name4) {
			this.name4 = name4;
		}

		public String getTime4() {
			return time4;
		}

		public void setTime4(String time4) {
			this.time4 = time4;
		}

		public String getDescription4() {
			return description4;
		}

		public void setDescription4(String description4) {
			this.description4 = description4;
		}

		public String getPhoneNumber4() {
			return phoneNumber4;
		}

		public void setPhoneNumber4(String phoneNumber4) {
			this.phoneNumber4 = phoneNumber4;
		}

		public String getLocation4() {
			return location4;
		}

		public void setLocation4(String location4) {
			this.location4 = location4;
		}

	}

	/*
	    
	    
	    */
	public class Charity {
		String name5;
		String time5;
		String description5;
		String phoneNumber5;
		String location5;
		Button btnShow5;

		public Charity(String time5, String description5, String phoneNumber5, String location5) {

			this.time5 = time5;
			this.description5 = description5;
			this.phoneNumber5 = phoneNumber5;
			this.location5 = location5;
		}

		Charity(String a5) {
			name5 = a5;

			this.btnShow5 = new Button("SHOW DETAILS");
			btnShow5.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {

					table5a = new TableView();
					table5a.setMaxWidth(Region.USE_PREF_SIZE);
					table5a.prefWidthProperty();
					table5a.setEditable(true);

					ObservableList<Charity> data5a = FXCollections.observableArrayList();
					lbCharityTitlea = new Label("🎡🎪CHARITY🎪🎡");
					lbCharityTitlea.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbCharityTitlea.setTranslateX(10);

					btnBack13a = new Button("BACK");
					btnBack13a.setTranslateX(225);
					btnBack13a.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(CharityTable);
						}
					});
					btnBack13a.setScaleX(1.5);
					btnBack13a.setScaleY(1.5);
					btnBack13a.setTranslateX(700);
					btnBack13a.setTranslateY(-100);

					time5a = new TableColumn<Charity, String>("TIME");
					time5a.setCellValueFactory(new PropertyValueFactory<Charity, String>("time5"));
					time5a.setMinWidth(10);

					description5a = new TableColumn<Charity, String>("DESCRIPTION");
					description5a.setCellValueFactory(new PropertyValueFactory<Charity, String>("description5"));
					description5a.setMinWidth(10);

					phoneNumber5a = new TableColumn<Charity, String>("PHONE NUMBER");
					phoneNumber5a.setCellValueFactory(new PropertyValueFactory<Charity, String>("phoneNumber5"));
					phoneNumber5a.setMinWidth(10);

					location5a = new TableColumn<Charity, String>("LOCATION");
					location5a.setCellValueFactory(new PropertyValueFactory<Charity, String>("location5"));
					location5a.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement
								.executeQuery("SELECT * FROM charity WHERE name = '" + name5 + "'");
						while (result.next()) {
							String time5a = result.getString(2);
							String description5a = result.getString(3);
							String phoneNumber5a = result.getString(4);
							String location5a = result.getString(5);
							data5a.addAll(new Charity(time5a, description5a, phoneNumber5a, location5a));

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table5a.setItems(data5a);
					table5a.getColumns().addAll(time5a, description5a, phoneNumber5a, location5a);

					vbox9a = new VBox();
					vbox9a.setSpacing(5);
					vbox9a.getChildren().addAll(lbCharityTitlea, table5a);
					vbox9a.setTranslateX(125);

					borderPane12a = new BorderPane();
					borderPane12a.setCenter(vbox9a);
					borderPane12a.setBottom(btnBack13a);

					FileInputStream input24 = null;
					try {
						input24 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (13).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image24 = new Image(input24);
					BackgroundImage backgroundimage24 = new BackgroundImage(image24, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background24 = new Background(backgroundimage24);
					borderPane12a.setBackground(background24);

					charityDetails22 = new Scene(borderPane12a, 800, 700);
					stage.setScene(charityDetails22);

				}
			});
		}

		public Button getBtnShow5() {
			return btnShow5;
		}

		public void setBtnShow5(Button btnShow5) {
			this.btnShow5 = btnShow5;
		}

		public String getName() {
			return name5;
		}

		public void setName(String name5) {
			this.name5 = name5;
		}

		public String getTime5() {
			return time5;
		}

		public void setTime5(String time5) {
			this.time5 = time5;
		}

		public String getDescription5() {
			return description5;
		}

		public void setDescription5(String description5) {
			this.description5 = description5;
		}

		public String getPhoneNumber5() {
			return phoneNumber5;
		}

		public void setPhoneNumber5(String phoneNumber5) {
			this.phoneNumber5 = phoneNumber5;
		}

		public String getLocation5() {
			return location5;
		}

		public void setLocation5(String location5) {
			this.location5 = location5;
		}

	}

	public HBox getHBox13() throws Exception {
		hbox13 = new HBox(70);

		btnShow = new Button("SHOW");
		btnShow.setScaleX(1.5);
		btnShow.setScaleY(1.5);
		btnShow.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				/*
				  
				  
				  */
				if (rbMusic.isSelected()) {

					table1 = new TableView();
					table1.setMaxWidth(Region.USE_PREF_SIZE);
					table1.prefWidthProperty();
					table1.setEditable(true);

					ObservableList<Music> data1 = FXCollections.observableArrayList();
					lbMusicTitle = new Label("🎻🎺MUSIC🎺🎻");
					lbMusicTitle.setTextFill(WHEAT);
					lbMusicTitle.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbMusicTitle.setTranslateX(10);

					btnBack8 = new Button("BACK");
					btnBack8.setTranslateX(225);
					btnBack8.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(checkEvents);
						}
					});
					btnBack8.setScaleX(1.5);
					btnBack8.setScaleY(1.5);
					btnBack8.setTranslateX(700);
					btnBack8.setTranslateY(-100);

					name1 = new TableColumn<Music, String>("NAME");
					name1.setCellValueFactory(new PropertyValueFactory<>("name"));
					name1.setMinWidth(10);

					showDetails1 = new TableColumn<Music, String>("Music Details");
					showDetails1.setCellValueFactory(new PropertyValueFactory<Music, String>("btnShow1"));
					showDetails1.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM music");
						while (result.next()) {
							String name1 = result.getString(1);
							Music currentMusic = new Music(name1);
							data1.add(currentMusic);

						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table1.setItems(data1);
					table1.getColumns().addAll(name1, showDetails1);

					vbox5 = new VBox();
					vbox5.setSpacing(5);
					vbox5.getChildren().addAll(lbMusicTitle, table1);
					vbox5.setTranslateX(125);

					borderPane8 = new BorderPane();
					borderPane8.setCenter(vbox5);
					borderPane8.setBottom(btnBack8);

					FileInputStream input21 = null;
					try {
						input21 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (4).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image21 = new Image(input21);
					BackgroundImage backgroundimage21 = new BackgroundImage(image21, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background21 = new Background(backgroundimage21);
					borderPane8.setBackground(background21);

					MusicTable = new Scene(borderPane8, 800, 700);
					stage.setScene(MusicTable);

				}
				/*
				
				
				*/

				else if (rbArt.isSelected()) {
					table2 = new TableView();
					table2.setMaxWidth(Region.USE_PREF_SIZE);
					table2.prefWidthProperty();
					table2.setEditable(true);

					ObservableList<Arts> data2 = FXCollections.observableArrayList();

					lbArtsTitle = new Label("🎭ARTS🎭");
					lbArtsTitle.setTextFill(WHEAT);
					lbArtsTitle.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbArtsTitle.setTranslateX(50);

					btnBack9 = new Button("BACK");
					btnBack9.setTranslateX(225);
					btnBack9.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(checkEvents);
						}
					});
					btnBack9.setTranslateX(700);
					btnBack9.setTranslateY(-100);

					btnBack9.setScaleX(1.5);
					btnBack9.setScaleY(1.5);

					name2 = new TableColumn<Arts, String>("NAME");
					name2.setMinWidth(200);
					name2.setCellValueFactory(new PropertyValueFactory<>("name"));

					showDetails2 = new TableColumn<Arts, String>("Art Details");
					showDetails2.setCellValueFactory(new PropertyValueFactory<Arts, String>("btnShow2"));
					showDetails2.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM arts");
						while (result.next()) {
							String name2 = result.getString(1);
							data2.add(new Arts(name2));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					table2.setItems(data2);
					table2.getColumns().addAll(name2, showDetails2);

					vbox6 = new VBox();
					vbox6.setSpacing(5);
					vbox6.setTranslateX(125);

					vbox6.getChildren().addAll(lbArtsTitle, table2);
					borderPane9 = new BorderPane();
					borderPane9.setCenter(vbox6);
					borderPane9.setBottom(btnBack9);
					FileInputStream input22 = null;
					try {
						input22 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (8).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image22 = new Image(input22);
					BackgroundImage backgroundimage22 = new BackgroundImage(image22, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background22 = new Background(backgroundimage22);
					borderPane9.setBackground(background22);

					ArtsTable = new Scene(borderPane9, 800, 700);
					stage.setScene(ArtsTable);
					/*
					
					
					*/

				} else if (rbFitness.isSelected()) {
					table3 = new TableView();
					table3.setMaxWidth(Region.USE_PREF_SIZE);
					table3.prefWidthProperty();
					table3.setEditable(true);

					ObservableList<Fitness> data3 = FXCollections.observableArrayList();

					lbFitnessTitle = new Label("🤸‍FITNESS🤸‍");
					lbFitnessTitle.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbFitnessTitle.setTranslateX(50);

					btnBack10 = new Button("BACK");
					btnBack10.setTranslateX(225);
					btnBack10.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(checkEvents);
						}
					});
					btnBack10.setScaleX(1.5);
					btnBack10.setScaleY(1.5);
					btnBack10.setTranslateX(700);
					btnBack10.setTranslateY(-100);

					name3 = new TableColumn<Fitness, String>("NAME");
					name3.setMinWidth(200);
					name3.setCellValueFactory(new PropertyValueFactory<>("name"));

					showDetails3 = new TableColumn<Fitness, String>("Art Details");
					showDetails3.setCellValueFactory(new PropertyValueFactory<Fitness, String>("btnShow3"));
					showDetails3.setMinWidth(10);

//                                        
					try {

						ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM fitness");
						while (result.next()) {
							String name3 = result.getString(1);
							data3.add(new Fitness(name3));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					table3.setItems(data3);
					table3.getColumns().addAll(name3, showDetails3);

					vbox7 = new VBox();
					vbox7.setSpacing(5);
					vbox7.setTranslateX(125);
					vbox7.getChildren().addAll(lbFitnessTitle, table3);

					borderPane10 = new BorderPane();
					borderPane10.setCenter(vbox7);
					borderPane10.setBottom(btnBack10);

					FileInputStream input23 = null;
					try {
						input23 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (11).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image23 = new Image(input23);
					BackgroundImage backgroundimage23 = new BackgroundImage(image23, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background23 = new Background(backgroundimage23);
					borderPane10.setBackground(background23);

					FitnessTable = new Scene(borderPane10, 800, 700);

					stage.setScene(FitnessTable);

				}
				/*
				
				
				*/

				else if (rbFood.isSelected()) {

					table4 = new TableView();

					table4.setMaxWidth(Region.USE_PREF_SIZE);
					table4.prefWidthProperty();
					table4.setEditable(true);

					ObservableList<Food> data4 = FXCollections.observableArrayList();
					lbFoodTitle = new Label("🍩🍕FOOD🍕🍩");
					lbFoodTitle.setTextFill(WHEAT);
					lbFoodTitle.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbFoodTitle.setTranslateX(10);

					btnBack12 = new Button("BACK");
					btnBack12.setTranslateX(225);
					btnBack12.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(checkEvents);
						}
					});
					btnBack12.setTranslateX(700);
					btnBack12.setTranslateY(-100);
					btnBack12.setScaleX(1.5);
					btnBack12.setScaleY(1.5);

					name4 = new TableColumn<Food, String>("NAME");
					name4.setCellValueFactory(new PropertyValueFactory<>("name"));
					name4.setMinWidth(10);

					showDetail4 = new TableColumn<Food, String>("FOOD Details");
					showDetail4.setCellValueFactory(new PropertyValueFactory<Food, String>("btnShow4"));
					showDetail4.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM food");
						while (result.next()) {
							String name4 = result.getString(1);
							data4.add(new Food(name4));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table4.setItems(data4);
					table4.getColumns().addAll(name4, showDetail4);

					vbox8 = new VBox();
					vbox8.setSpacing(5);
					vbox8.getChildren().addAll(lbFoodTitle, table4);
					vbox8.setTranslateX(125);

					borderPane11 = new BorderPane();
					borderPane11.setCenter(vbox8);
					borderPane11.setBottom(btnBack12);

					FileInputStream input25 = null;
					try {
						input25 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (15).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image25 = new Image(input25);
					BackgroundImage backgroundimage25 = new BackgroundImage(image25, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background25 = new Background(backgroundimage25);
					borderPane11.setBackground(background25);

					FoodTable = new Scene(borderPane11, 800, 700);
					stage.setScene(FoodTable);

				}
				/*
				
				
				*/
				else if (rbCharity.isSelected()) {

					table5 = new TableView();

					table5.setMaxWidth(Region.USE_PREF_SIZE);
					table5.prefWidthProperty();
					table5.setEditable(true);

					ObservableList<Charity> data5 = FXCollections.observableArrayList();
					lbCharityTitle = new Label("🎡🎪CHARITY🎪🎡");

					lbCharityTitle.setFont(Font.font(null, FontWeight.BOLD, 32));
					lbCharityTitle.setTranslateX(10);

					btnBack13 = new Button("BACK");
					btnBack13.setTranslateX(225);
					btnBack13.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							stage.setScene(checkEvents);
						}
					});
					btnBack13.setTranslateX(700);
					btnBack13.setTranslateY(-100);
					btnBack13.setScaleX(1.5);
					btnBack13.setScaleY(1.5);

					name5 = new TableColumn<Charity, String>("NAME");
					name5.setCellValueFactory(new PropertyValueFactory<>("name"));
					name5.setMinWidth(10);

					showDetail5 = new TableColumn<Charity, String>("Charity Details");
					showDetail5.setCellValueFactory(new PropertyValueFactory<Charity, String>("btnShow5"));
					showDetail5.setMinWidth(10);

					try {

						ResultSet result = DBConnect.statement.executeQuery("SELECT * FROM charity");
						while (result.next()) {
							String name5 = result.getString(1);
							data5.add(new Charity(name5));
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

					table5.setItems(data5);
					table5.getColumns().addAll(name5, showDetail5);

					vbox9 = new VBox();
					vbox9.setSpacing(5);
					vbox9.getChildren().addAll(lbCharityTitle, table5);
					vbox9.setTranslateX(125);

					borderPane12 = new BorderPane();
					borderPane12.setCenter(vbox9);
					borderPane12.setBottom(btnBack13);

					FileInputStream input24 = null;
					try {
						input24 = new FileInputStream(
								"C:\\Users\\Medhat Ahmed\\eclipse-workspace\\EventProject\\src\\pkg4m\\events\\4M EVENTS PICTURES\\2020-05-31 (13).png");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Image image24 = new Image(input24);
					BackgroundImage backgroundimage24 = new BackgroundImage(image24, BackgroundRepeat.NO_REPEAT,
							BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
							new BackgroundSize(1.0, 1.0, true, true, false, false));
					Background background24 = new Background(backgroundimage24);
					borderPane12.setBackground(background24);

					CharityTable = new Scene(borderPane12, 800, 700);
					stage.setScene(CharityTable);

				}

			}
		});
		btnBack7 = new Button("BACK");
		btnBack7.setScaleX(1.5);
		btnBack7.setScaleY(1.5);

		btnBack7.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(privateOrPublicScene);
			}
		});
		hbox13.getChildren().addAll(btnShow, btnBack7);
		hbox13.setTranslateY(-150);
		hbox13.setTranslateX(300);
		return hbox13;
	}

	public HBox getHBox12() {
		togglegroup1 = new ToggleGroup();
		rbMusic = new RadioButton("MUSIC");
		rbFood = new RadioButton("FOOD");
		rbCharity = new RadioButton("CHARITY");
		rbArt = new RadioButton("ARTS");
		rbFitness = new RadioButton("FITNESS");

		rbMusic.setToggleGroup(togglegroup1);
		rbMusic.setTextFill(WHEAT);
		rbMusic.setFont(new Font("Forte", 25));

		rbFood.setToggleGroup(togglegroup1);
		rbFood.setTextFill(WHEAT);
		rbFood.setFont(new Font("Forte", 25));

		rbCharity.setToggleGroup(togglegroup1);
		rbCharity.setTextFill(WHEAT);
		rbCharity.setFont(new Font("Forte", 25));

		rbArt.setToggleGroup(togglegroup1);
		rbArt.setTextFill(WHEAT);
		rbArt.setFont(new Font("Forte", 25));

		rbFitness.setToggleGroup(togglegroup1);
		rbFitness.setTextFill(WHEAT);
		rbFitness.setFont(new Font("Forte", 25));

		hbox12 = new HBox();
		hbox12.setSpacing(10);
		hbox12.setTranslateX(45);
		hbox12.setTranslateY(300);
		hbox12.getChildren().addAll(rbMusic, rbArt, rbFitness, rbCharity, rbFood);
		return hbox12;
	}

	public static void main(String[] args) {
		launch(args);

	}
}
