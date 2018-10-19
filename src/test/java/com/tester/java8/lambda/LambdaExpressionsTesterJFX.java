package com.tester.java8.lambda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LambdaExpressionsTesterJFX extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		TextArea txtArea = new TextArea();
		txtArea.setMaxWidth(Double.valueOf("700"));
		txtArea.setMaxHeight(Double.valueOf("400"));

		// Version original
		Button classicBtn = new Button();
		classicBtn.setText("Classic button");
		classicBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String msg = "Classic button pressed!";
				System.out.println(msg);
				txtArea.setText(txtArea.getText() + "\n" + msg);
			}
		});

		// Version Lambda
		Button lambdaBtn = new Button();
		lambdaBtn.setText("Lambda button");
		lambdaBtn.setOnAction(e -> {
			String msg = "Lambda button pressed!";
			System.out.println(msg);
			txtArea.setText(txtArea.getText() + "\n" + msg);
		});

		HBox row1 = new HBox();
		row1.getChildren().addAll(classicBtn, lambdaBtn);
		HBox row2 = new HBox();
		row2.getChildren().addAll(txtArea);

		VBox rootPane = new VBox();
		rootPane.getChildren().addAll(row1, row2);
		Scene scene = new Scene(rootPane, 800, 550);

		showStage(primaryStage, scene);
	}

	private void showStage(Stage primaryStage, Scene scene) {
		primaryStage.setTitle("LambdaExpressionsTesterJFX!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
