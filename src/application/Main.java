package application;
	
import java.lang.reflect.Method;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			GameLevels gl = new GameLevels();
			Method mmMethod = GameLevels.class.getDeclaredMethod("MainMenu"); 
			mmMethod.setAccessible(true); 
			mmMethod.invoke(gl);
			
			stage.setScene(new Scene((Parent) mmMethod.invoke(gl, null)));
			stage.setResizable(false);
			stage.setTitle("Puzzle Game");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
