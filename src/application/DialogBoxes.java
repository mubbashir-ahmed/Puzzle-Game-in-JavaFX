package application;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.InputMismatchException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class DialogBoxes {
	public void NullValueException() {
		InputTile inputtile = new InputTile();
		if(inputtile.InputTextValue().isEmpty()) {
			Alert ExAlert = new Alert(AlertType.ERROR);
			ExAlert.setTitle("NullValueException - Error Occurred");
			ExAlert.setHeaderText("You Cannot Leave the Fields Empty!");
			ExAlert.setContentText(null);
			ExAlert.showAndWait();
		}
	}
	public void InputMismatchExceptionDialogBox() {
		Alert ExAlert = new Alert(AlertType.ERROR);
		ExAlert.setTitle("InputMismatchException - Error Occurred");
		ExAlert.setHeaderText("You Cannot Write Alphabets or Symbols! You Can Only Write Numbers!");
		ExAlert.setContentText(null);

		Exception e = new InputMismatchException("You Cannot Write Alphabets or Symbols! You Can Only Write Numbers!");

		StringWriter StrWtr = new StringWriter();
		PrintWriter PrtWtr = new PrintWriter(StrWtr);
		e.printStackTrace(PrtWtr);
		String exceptionText = StrWtr.toString();

		Label label = new Label("The exception stacktrace was:");

		TextArea textArea = new TextArea(exceptionText);
		textArea.setEditable(false);
		textArea.setWrapText(true);

		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);

		GridPane expContent = new GridPane();
		expContent.setMaxWidth(Double.MAX_VALUE);
		expContent.add(label, 0, 0);
		expContent.add(textArea, 0, 1);

		ExAlert.getDialogPane().setExpandableContent(expContent);
		ExAlert.showAndWait();
	}
	
	public void CorrectAnswerDialogBox() {
		Alert correctAnsAlert = new Alert(AlertType.INFORMATION);
		correctAnsAlert.setTitle(null);
		correctAnsAlert.setHeaderText(null);
		correctAnsAlert.setContentText("You have given all correct answers!");
		correctAnsAlert.showAndWait();
	}
	
	public void WinDialogBox() {
		Alert finishAlert = new Alert(AlertType.INFORMATION);
		finishAlert.setTitle("Congradulation!");
		finishAlert.setHeaderText(null);
		finishAlert.setContentText("You Win!");
		finishAlert.showAndWait();
	}
	
	public void WrongAnswerDialogBox() {
		Alert wrongAnsAlert = new Alert(AlertType.WARNING);
		wrongAnsAlert.setTitle("Wrong Answer!");
		wrongAnsAlert.setHeaderText(null);
		wrongAnsAlert.setContentText("Wrong Answer! Carefully look at your answers!");
		wrongAnsAlert.showAndWait();
	}
}
