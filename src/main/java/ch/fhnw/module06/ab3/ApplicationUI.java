package ch.fhnw.module06.ab3;

import java.util.stream.Stream;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane {
	private Button buttonTop;
	private Button buttonBottom;
	private Button buttonLeft;
	private Button buttonRight;
	private TextArea textArea;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		buttonTop = new Button("Top");
		buttonBottom = new Button("Bottom");
		buttonLeft = new Button("Left");
		buttonRight = new Button("Right");
		textArea = new TextArea();
	}

	private void layoutControls() {
		// TODO Auto-generated method stub
		Stream.of(buttonTop, buttonBottom).forEach(button -> button.setMaxWidth(Double.MAX_VALUE));
		setTop(buttonTop);
		setBottom(buttonBottom);
		setLeft(buttonLeft);
		setRight(buttonRight);
		setCenter(textArea);
		getChildren().stream().forEach(child -> setMargin(child, new Insets(5)));

	}
}
