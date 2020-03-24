package ch.fhnw.module06.ab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(new ApplicationUI());
		primaryStage.setTitle("Hello Second Title");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.show();
	}

}
