package application;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Tile extends StackPane {
	public Tile(String value) {
		Rectangle tileBorder = new Rectangle(50, 50);
		tileBorder.setFill(Color.WHITE);
		tileBorder.setStroke(Color.BLACK);

		Text txt = new Text(value);
		txt.setFont(Font.font(20));
		
		setAlignment(Pos.CENTER);
		getChildren().addAll(tileBorder, txt);
	}
}
