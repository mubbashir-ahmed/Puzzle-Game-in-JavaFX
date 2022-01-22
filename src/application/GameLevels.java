package application;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GameLevels {
	public Parent MainMenu() {
		Pane MainMenuScene = new Pane();
		MainMenuScene.setPrefSize(450, 400);
		
		Label gameHeading = new Label("Puzzle Game");
		gameHeading.setFont(Font.font(50));
		gameHeading.setTranslateX(80);
		gameHeading.setTranslateY(0);
		
		Label gameTagline = new Label("A Game of Mind!");
		gameTagline.setFont(Font.font(20));
		gameTagline.setTranslateX(140);
		gameTagline.setTranslateY(60);
		
		Button playBtn = new Button("PLAY");
		playBtn.setPrefSize(150, 50);
		playBtn.setFont(Font.font(20));
		playBtn.setTranslateX(140);
		playBtn.setTranslateY(100);
		playBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				playBtn.getScene().setRoot(Level1());
			}
		});
		
		Button quitBtn = new Button("QUIT");
		quitBtn.setPrefSize(150, 50);
		quitBtn.setFont(Font.font(20));
		quitBtn.setTranslateX(140);
		quitBtn.setTranslateY(170);
		quitBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Alert confirmQuit = new Alert(AlertType.CONFIRMATION);
				confirmQuit.setTitle("Quit Game");
				confirmQuit.setContentText("Are You Sure You Want To Quit?");
				Optional<ButtonType> result = confirmQuit.showAndWait();
				if (result.get() == ButtonType.OK){
					Stage stage = (Stage) quitBtn.getScene().getWindow();
					stage.close();
				}
				else {
					
				}
			}
		});
		
		MainMenuScene.getChildren().addAll(gameHeading, gameTagline,
								  playBtn, quitBtn);
		
		return MainMenuScene;
	}
	
	private Parent Level1() {
		Pane Level1Scene = new Pane();
		
		Tile tile1 = new Tile("7");
		tile1.setTranslateX(100);
		tile1.setTranslateY(0);
		
		Tile tile2 = new Tile("+");
		tile2.setTranslateX(150);
		tile2.setTranslateY(0);
		
		Tile tile3 = new Tile("5");
		tile3.setTranslateX(200);
		tile3.setTranslateY(0);
		
		Tile tile4 = new Tile("=");
		tile4.setTranslateX(250);
		tile4.setTranslateY(0);
		
		InputTile inputtile1 = new InputTile();
		inputtile1.setTranslateX(300);
		inputtile1.setTranslateY(0);
		
		Tile tile5 = new Tile("+");
		tile5.setTranslateX(100);
		tile5.setTranslateY(50);
		
		SolidTile solidtile1 = new SolidTile();
		solidtile1.setTranslateX(150);
		solidtile1.setTranslateY(50);
		
		Tile tile6 = new Tile("+");
		tile6.setTranslateX(200);
		tile6.setTranslateY(50);
		
		SolidTile solidtile2 = new SolidTile();
		solidtile2.setTranslateX(250);
		solidtile2.setTranslateY(50);
		
		Tile tile7 = new Tile("+");
		tile7.setTranslateX(300);
		tile7.setTranslateY(50);
		
		Tile tile8 = new Tile("1");
		tile8.setTranslateX(100);
		tile8.setTranslateY(100);
		
		Tile tile9 = new Tile("+");
		tile9.setTranslateX(150);
		tile9.setTranslateY(100);
		
		Tile tile10 = new Tile("4");
		tile10.setTranslateX(200);
		tile10.setTranslateY(100);
		
		Tile tile11 = new Tile("=");
		tile11.setTranslateX(250);
		tile11.setTranslateY(100);
		
		InputTile inputtile2 = new InputTile();
		inputtile2.setTranslateX(300);
		inputtile2.setTranslateY(100);
		
		Tile tile12 = new Tile("=");
		tile12.setTranslateX(100);
		tile12.setTranslateY(150);
		
		SolidTile solidtile3 = new SolidTile();
		solidtile3.setTranslateX(150);
		solidtile3.setTranslateY(150);
		
		Tile tile13 = new Tile("=");
		tile13.setTranslateX(200);
		tile13.setTranslateY(150);
		
		SolidTile solidtile4 = new SolidTile();
		solidtile4.setTranslateX(250);
		solidtile4.setTranslateY(150);
		
		Tile tile14 = new Tile("=");
		tile14.setTranslateX(300);
		tile14.setTranslateY(150);
		
		InputTile inputtile3 = new InputTile();
		inputtile3.setTranslateX(100);
		inputtile3.setTranslateY(200);
		
		Tile tile15 = new Tile("+");
		tile15.setTranslateX(150);
		tile15.setTranslateY(200);
		
		InputTile inputtile4 = new InputTile();
		inputtile4.setTranslateX(200);
		inputtile4.setTranslateY(200);
		
		Tile tile16 = new Tile("=");
		tile16.setTranslateX(250);
		tile16.setTranslateY(200);
		
		Tile tile17 = new Tile("17");
		tile17.setTranslateX(300);
		tile17.setTranslateY(200);
		
		Label lvl1Label = new Label("Level 1");
		lvl1Label.setTranslateX(168);
		lvl1Label.setTranslateY(260);
		lvl1Label.setFont(Font.font(40));
		
		Button checkAnsBtn = new Button("Check Answers");
		checkAnsBtn.setPrefSize(150, 50);
		checkAnsBtn.setTranslateX(40);
		checkAnsBtn.setTranslateY(330);
		checkAnsBtn.setFont(Font.font(15));
		checkAnsBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.InputTextValue().equals("12") && inputtile2.InputTextValue().equals("5") && 
						   inputtile3.InputTextValue().equals("8") && inputtile4.InputTextValue().equals("9")) {
					DialogBoxes db = new DialogBoxes();
					db.CorrectAnswerDialogBox();
				}
				else {
					DialogBoxes db = new DialogBoxes();
					db.WrongAnswerDialogBox();
				}
			}
		});
		
		Button nextLvlBtn = new Button("Continue To Level 2!");
		nextLvlBtn.setPrefSize(200, 50);
		nextLvlBtn.setTranslateX(210);
		nextLvlBtn.setTranslateY(330);
		nextLvlBtn.setFont(Font.font(15));
		nextLvlBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.isInputTextEmpty() && inputtile2.isInputTextEmpty() && 
				   inputtile3.isInputTextEmpty() && inputtile4.isInputTextEmpty()) {
					DialogBoxes db = new DialogBoxes();
					db.NullValueException();
				}
				else if(inputtile1.InputTextValue().equals("12") && inputtile2.InputTextValue().equals("5") && 
				 	    inputtile3.InputTextValue().equals("8") && inputtile4.InputTextValue().equals("9")) {
					nextLvlBtn.getScene().setRoot(Level2());
				}
			}
		});

		Level1Scene.getChildren().addAll(tile1, tile2, tile3, tile4, inputtile1, 
								  tile5, solidtile1, tile6, solidtile2, tile7,
								  tile8, tile9, tile10, tile11, inputtile2,
								  tile12, solidtile3, tile13, solidtile4, tile14,
								  inputtile3, tile15, inputtile4, tile16, tile17,
								  lvl1Label, nextLvlBtn, checkAnsBtn);
		return Level1Scene;
	}
	
	private Parent Level2() {
		Pane Level2Scene = new Pane();
		
		Tile tile1 = new Tile("8");
		tile1.setTranslateX(100);
		tile1.setTranslateY(0);
		
		Tile tile2 = new Tile("+");
		tile2.setTranslateX(150);
		tile2.setTranslateY(0);
		
		Tile tile3 = new Tile("4");
		tile3.setTranslateX(200);
		tile3.setTranslateY(0);
		
		Tile tile4 = new Tile("=");
		tile4.setTranslateX(250);
		tile4.setTranslateY(0);
		
		InputTile inputtile1 = new InputTile();
		inputtile1.setTranslateX(300);
		inputtile1.setTranslateY(0);
		
		Tile tile5 = new Tile("+");
		tile5.setTranslateX(100);
		tile5.setTranslateY(50);
		
		SolidTile solidtile1 = new SolidTile();
		solidtile1.setTranslateX(150);
		solidtile1.setTranslateY(50);
		
		Tile tile6 = new Tile("+");
		tile6.setTranslateX(200);
		tile6.setTranslateY(50);
		
		SolidTile solidtile2 = new SolidTile();
		solidtile2.setTranslateX(250);
		solidtile2.setTranslateY(50);
		
		Tile tile7 = new Tile("+");
		tile7.setTranslateX(300);
		tile7.setTranslateY(50);
		
		Tile tile8 = new Tile("3");
		tile8.setTranslateX(100);
		tile8.setTranslateY(100);
		
		Tile tile9 = new Tile("+");
		tile9.setTranslateX(150);
		tile9.setTranslateY(100);
		
		Tile tile10 = new Tile("8");
		tile10.setTranslateX(200);
		tile10.setTranslateY(100);
		
		Tile tile11 = new Tile("=");
		tile11.setTranslateX(250);
		tile11.setTranslateY(100);
		
		InputTile inputtile2 = new InputTile();
		inputtile2.setTranslateX(300);
		inputtile2.setTranslateY(100);
		
		Tile tile12 = new Tile("=");
		tile12.setTranslateX(100);
		tile12.setTranslateY(150);
		
		SolidTile solidtile3 = new SolidTile();
		solidtile3.setTranslateX(150);
		solidtile3.setTranslateY(150);
		
		Tile tile13 = new Tile("=");
		tile13.setTranslateX(200);
		tile13.setTranslateY(150);
		
		SolidTile solidtile4 = new SolidTile();
		solidtile4.setTranslateX(250);
		solidtile4.setTranslateY(150);
		
		Tile tile14 = new Tile("=");
		tile14.setTranslateX(300);
		tile14.setTranslateY(150);
		
		InputTile inputtile3 = new InputTile();
		inputtile3.setTranslateX(100);
		inputtile3.setTranslateY(200);
		
		Tile tile15 = new Tile("+");
		tile15.setTranslateX(150);
		tile15.setTranslateY(200);
		
		InputTile inputtile4 = new InputTile();
		inputtile4.setTranslateX(200);
		inputtile4.setTranslateY(200);
		
		Tile tile16 = new Tile("=");
		tile16.setTranslateX(250);
		tile16.setTranslateY(200);
		
		InputTile inputtile5 = new InputTile();
		inputtile5.setTranslateX(300);
		inputtile5.setTranslateY(200);
		
		Label lvl1Label = new Label("Level 2");
		lvl1Label.setTranslateX(168);
		lvl1Label.setTranslateY(260);
		lvl1Label.setFont(Font.font(40));
		
		Button checkAnsBtn = new Button("Check Answers");
		checkAnsBtn.setPrefSize(150, 50);
		checkAnsBtn.setTranslateX(40);
		checkAnsBtn.setTranslateY(330);
		checkAnsBtn.setFont(Font.font(15));
		checkAnsBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.InputTextValue().equals("12") && inputtile2.InputTextValue().equals("11") && 
				   inputtile3.InputTextValue().equals("11") && inputtile4.InputTextValue().equals("12") && 
				   inputtile5.InputTextValue().equals("23")) {
					DialogBoxes db = new DialogBoxes();
					db.CorrectAnswerDialogBox();
				}
				else {
					DialogBoxes db = new DialogBoxes();
					db.WrongAnswerDialogBox();
				}
			}
		});
		
		Button nextLvlBtn = new Button("Continue To Level 3!");
		nextLvlBtn.setPrefSize(200, 50);
		nextLvlBtn.setTranslateX(210);
		nextLvlBtn.setTranslateY(330);
		nextLvlBtn.setFont(Font.font(15));
		nextLvlBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.isInputTextEmpty() && inputtile2.isInputTextEmpty() && 
				   inputtile3.isInputTextEmpty() && inputtile4.isInputTextEmpty() && 
				   inputtile5.isInputTextEmpty()) {
					DialogBoxes db = new DialogBoxes();
					db.NullValueException();
				}
				else if(inputtile1.InputTextValue().equals("12") && inputtile2.InputTextValue().equals("11") && 
						   inputtile3.InputTextValue().equals("11") && inputtile4.InputTextValue().equals("12") && 
						   inputtile5.InputTextValue().equals("23")) {
					nextLvlBtn.getScene().setRoot(Level3());
				}
			}
		});

		Level2Scene.getChildren().addAll(tile1, tile2, tile3, tile4, inputtile1, 
								  tile5, solidtile1, tile6, solidtile2, tile7,
								  tile8, tile9, tile10, tile11, inputtile2,
								  tile12, solidtile3, tile13, solidtile4, tile14,
								  inputtile3, tile15, inputtile4, tile16, inputtile5,
								  lvl1Label, nextLvlBtn, checkAnsBtn);
		return Level2Scene;
	}
	
	private Parent Level3() {
		Pane Level3Scene = new Pane();
		
		Tile tile1 = new Tile("5");
		tile1.setTranslateX(100);
		tile1.setTranslateY(0);
		
		Tile tile2 = new Tile("+");
		tile2.setTranslateX(150);
		tile2.setTranslateY(0);
		
		Tile tile3 = new Tile("6");
		tile3.setTranslateX(200);
		tile3.setTranslateY(0);
		
		Tile tile4 = new Tile("=");
		tile4.setTranslateX(250);
		tile4.setTranslateY(0);
		
		InputTile inputtile1 = new InputTile();
		inputtile1.setTranslateX(300);
		inputtile1.setTranslateY(0);
		
		Tile tile5 = new Tile("+");
		tile5.setTranslateX(100);
		tile5.setTranslateY(50);
		
		SolidTile solidtile1 = new SolidTile();
		solidtile1.setTranslateX(150);
		solidtile1.setTranslateY(50);
		
		Tile tile6 = new Tile("+");
		tile6.setTranslateX(200);
		tile6.setTranslateY(50);
		
		SolidTile solidtile2 = new SolidTile();
		solidtile2.setTranslateX(250);
		solidtile2.setTranslateY(50);
		
		Tile tile7 = new Tile("+");
		tile7.setTranslateX(300);
		tile7.setTranslateY(50);
		
		Tile tile8 = new Tile("6");
		tile8.setTranslateX(100);
		tile8.setTranslateY(100);
		
		Tile tile9 = new Tile("+");
		tile9.setTranslateX(150);
		tile9.setTranslateY(100);
		
		Tile tile10 = new Tile("5");
		tile10.setTranslateX(200);
		tile10.setTranslateY(100);
		
		Tile tile11 = new Tile("=");
		tile11.setTranslateX(250);
		tile11.setTranslateY(100);
		
		InputTile inputtile2 = new InputTile();
		inputtile2.setTranslateX(300);
		inputtile2.setTranslateY(100);
		
		Tile tile12 = new Tile("=");
		tile12.setTranslateX(100);
		tile12.setTranslateY(150);
		
		SolidTile solidtile3 = new SolidTile();
		solidtile3.setTranslateX(150);
		solidtile3.setTranslateY(150);
		
		Tile tile13 = new Tile("=");
		tile13.setTranslateX(200);
		tile13.setTranslateY(150);
		
		SolidTile solidtile4 = new SolidTile();
		solidtile4.setTranslateX(250);
		solidtile4.setTranslateY(150);
		
		Tile tile14 = new Tile("=");
		tile14.setTranslateX(300);
		tile14.setTranslateY(150);
		
		InputTile inputtile3 = new InputTile();
		inputtile3.setTranslateX(100);
		inputtile3.setTranslateY(200);
		
		Tile tile15 = new Tile("+");
		tile15.setTranslateX(150);
		tile15.setTranslateY(200);
		
		InputTile inputtile4 = new InputTile();
		inputtile4.setTranslateX(200);
		inputtile4.setTranslateY(200);
		
		Tile tile16 = new Tile("=");
		tile16.setTranslateX(250);
		tile16.setTranslateY(200);
		
		Tile tile17 = new Tile("22");
		tile17.setTranslateX(300);
		tile17.setTranslateY(200);
		
		Label lvl1Label = new Label("Level 3");
		lvl1Label.setTranslateX(168);
		lvl1Label.setTranslateY(260);
		lvl1Label.setFont(Font.font(40));
		
		Button checkAnsBtn = new Button("Check Answers");
		checkAnsBtn.setPrefSize(150, 50);
		checkAnsBtn.setTranslateX(40);
		checkAnsBtn.setTranslateY(330);
		checkAnsBtn.setFont(Font.font(15));
		checkAnsBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.InputTextValue().equals("11") && inputtile2.InputTextValue().equals("11") && 
				   inputtile3.InputTextValue().equals("11") && inputtile4.InputTextValue().equals("11")) {
					DialogBoxes db = new DialogBoxes();
					db.CorrectAnswerDialogBox();
				}
				else {
					DialogBoxes db = new DialogBoxes();
					db.WrongAnswerDialogBox();
				}
			}
		});
		
		Button nextLvlBtn = new Button("Continue To Level 4!");
		nextLvlBtn.setPrefSize(200, 50);
		nextLvlBtn.setTranslateX(210);
		nextLvlBtn.setTranslateY(330);
		nextLvlBtn.setFont(Font.font(15));
		nextLvlBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.isInputTextEmpty() && inputtile2.isInputTextEmpty() && 
						   inputtile3.isInputTextEmpty() && inputtile4.isInputTextEmpty()) {
							DialogBoxes db = new DialogBoxes();
							db.NullValueException();
						}
						else if(inputtile1.InputTextValue().equals("11") && inputtile2.InputTextValue().equals("11") && 
								inputtile3.InputTextValue().equals("11") && inputtile4.InputTextValue().equals("11")) {
							nextLvlBtn.getScene().setRoot(Level4());
						}
			}
		});

		Level3Scene.getChildren().addAll(tile1, tile2, tile3, tile4, inputtile1, 
								  tile5, solidtile1, tile6, solidtile2, tile7,
								  tile8, tile9, tile10, tile11, inputtile2,
								  tile12, solidtile3, tile13, solidtile4, tile14,
								  inputtile3, tile15, inputtile4, tile16, tile17,
								  lvl1Label, nextLvlBtn, checkAnsBtn);
		return Level3Scene;
	}
	
	private Parent Level4() {
		Pane Level4Scene = new Pane();
		
		Tile tile1 = new Tile("7");
		tile1.setTranslateX(100);
		tile1.setTranslateY(0);
		
		Tile tile2 = new Tile("+");
		tile2.setTranslateX(150);
		tile2.setTranslateY(0);
		
		InputTile inputtile1 = new InputTile();
		inputtile1.setTranslateX(200);
		inputtile1.setTranslateY(0);
		
		Tile tile4 = new Tile("=");
		tile4.setTranslateX(250);
		tile4.setTranslateY(0);
		
		Tile tile3 = new Tile("11");
		tile3.setTranslateX(300);
		tile3.setTranslateY(0);
		
		Tile tile5 = new Tile("+");
		tile5.setTranslateX(100);
		tile5.setTranslateY(50);
		
		SolidTile solidtile1 = new SolidTile();
		solidtile1.setTranslateX(150);
		solidtile1.setTranslateY(50);
		
		Tile tile6 = new Tile("+");
		tile6.setTranslateX(200);
		tile6.setTranslateY(50);
		
		SolidTile solidtile2 = new SolidTile();
		solidtile2.setTranslateX(250);
		solidtile2.setTranslateY(50);
		
		Tile tile7 = new Tile("+");
		tile7.setTranslateX(300);
		tile7.setTranslateY(50);
		
		Tile tile8 = new Tile("1");
		tile8.setTranslateX(100);
		tile8.setTranslateY(100);
		
		Tile tile9 = new Tile("+");
		tile9.setTranslateX(150);
		tile9.setTranslateY(100);
		
		InputTile inputtile2 = new InputTile();
		inputtile2.setTranslateX(200);
		inputtile2.setTranslateY(100);
		
		Tile tile11 = new Tile("=");
		tile11.setTranslateX(250);
		tile11.setTranslateY(100);
		
		Tile tile10 = new Tile("10");
		tile10.setTranslateX(300);
		tile10.setTranslateY(100);
		
		Tile tile12 = new Tile("=");
		tile12.setTranslateX(100);
		tile12.setTranslateY(150);
		
		SolidTile solidtile3 = new SolidTile();
		solidtile3.setTranslateX(150);
		solidtile3.setTranslateY(150);
		
		Tile tile13 = new Tile("=");
		tile13.setTranslateX(200);
		tile13.setTranslateY(150);
		
		SolidTile solidtile4 = new SolidTile();
		solidtile4.setTranslateX(250);
		solidtile4.setTranslateY(150);
		
		Tile tile14 = new Tile("=");
		tile14.setTranslateX(300);
		tile14.setTranslateY(150);
		
		InputTile inputtile3 = new InputTile();
		inputtile3.setTranslateX(100);
		inputtile3.setTranslateY(200);
		
		Tile tile15 = new Tile("+");
		tile15.setTranslateX(150);
		tile15.setTranslateY(200);
		
		InputTile inputtile4 = new InputTile();
		inputtile4.setTranslateX(200);
		inputtile4.setTranslateY(200);
		
		Tile tile16 = new Tile("=");
		tile16.setTranslateX(250);
		tile16.setTranslateY(200);
		
		InputTile inputtile5 = new InputTile();
		inputtile5.setTranslateX(300);
		inputtile5.setTranslateY(200);
		
		Label lvl1Label = new Label("Level 4");
		lvl1Label.setTranslateX(168);
		lvl1Label.setTranslateY(260);
		lvl1Label.setFont(Font.font(40));
		
		Button checkAnsBtn = new Button("Check Answers");
		checkAnsBtn.setPrefSize(150, 50);
		checkAnsBtn.setTranslateX(40);
		checkAnsBtn.setTranslateY(330);
		checkAnsBtn.setFont(Font.font(15));
		checkAnsBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.InputTextValue().equals("4") && inputtile2.InputTextValue().equals("9") && 
				   inputtile3.InputTextValue().equals("8") && inputtile4.InputTextValue().equals("13") && 
				   inputtile5.InputTextValue().equals("21")) {
					DialogBoxes db = new DialogBoxes();
					db.CorrectAnswerDialogBox();
				}
				else {
					DialogBoxes db = new DialogBoxes();
					db.WrongAnswerDialogBox();
				}
			}
		});
		
		Button nextLvlBtn = new Button("Finish!");
		nextLvlBtn.setPrefSize(200, 50);
		nextLvlBtn.setTranslateX(210);
		nextLvlBtn.setTranslateY(330);
		nextLvlBtn.setFont(Font.font(15));
		nextLvlBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(inputtile1.isInputTextEmpty() && inputtile2.isInputTextEmpty() && 
						   inputtile3.isInputTextEmpty() && inputtile4.isInputTextEmpty() && 
						   inputtile5.isInputTextEmpty()) {
					DialogBoxes db = new DialogBoxes();
					db.NullValueException();
				}
				else if(inputtile1.InputTextValue().equals("4") && inputtile2.InputTextValue().equals("9") && 
					   inputtile3.InputTextValue().equals("8") && inputtile4.InputTextValue().equals("13") && 
					   inputtile5.InputTextValue().equals("21")){
					DialogBoxes db = new DialogBoxes();
					db.WinDialogBox();
				}
			}
		});

		Level4Scene.getChildren().addAll(tile1, tile2, tile3, tile4, inputtile1, 
								  tile5, solidtile1, tile6, solidtile2, tile7,
								  tile8, tile9, tile10, tile11, inputtile2,
								  tile12, solidtile3, tile13, solidtile4, tile14,
								  inputtile3, tile15, inputtile4, tile16, inputtile5,
								  lvl1Label, nextLvlBtn, checkAnsBtn);
		return Level4Scene;
	}
}