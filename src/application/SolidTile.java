package application;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SolidTile extends StackPane {
	public SolidTile() {
		Rectangle solidTile = new Rectangle(50, 50);
		solidTile.setFill(Color.BLACK);
		solidTile.setStroke(Color.BLACK);
		
		getChildren().addAll(solidTile);
	}
}
