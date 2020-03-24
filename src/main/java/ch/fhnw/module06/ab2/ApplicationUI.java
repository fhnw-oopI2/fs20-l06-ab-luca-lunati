package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox{
private Button button;
private Label label;
private TextField textField;
private TextArea textArea;

public ApplicationUI(){
	initializeControls();
	layoutControls();
}
private void initializeControls() {
	label = new Label("Ein Label");
	textField = new TextField("text field");
	textArea = new TextArea("text area");
	button = new Button("Ein Button");
}
private void layoutControls() {
	// TODO Auto-generated method stub
	this.setPadding(new Insets(10));
	this.getChildren().addAll(label,textField,textArea,button);
}
}
