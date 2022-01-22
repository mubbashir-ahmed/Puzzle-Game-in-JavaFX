package application;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class InputTile extends StackPane {
	TextField inputTile = new TextField();
	public InputTile() {
		inputTile.setPrefSize(50, 50);
		inputTile.setFont(Font.font(20));
		inputTile.setAlignment(Pos.CENTER);
		inputTile.setBorder(new Border(new BorderStroke(Color.BLACK, 
													   BorderStrokeStyle.SOLID, 
													   CornerRadii.EMPTY, 
													   BorderWidths.DEFAULT)));
		inputTile.setFocusTraversable(false);
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(inputTile);
	}
	
	public boolean isInputTextEmpty() {
		boolean isEmpty = false;
		if(inputTile.getText().isEmpty()) {
			return isEmpty = true;
		}
		return isEmpty = false;
	}
	
	public String InputTextValue() {
		String txtValue = inputTile.getText().toString();
		return txtValue;
	}
}
