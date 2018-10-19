/**
 * 
 */
package com.tester.java8.lambda;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author sergio.platas
 *
 */
public class LambdaExpressionsTester {

	static Frame frame = new Frame("Lambda Expessions Test");
	static Panel mainPanel = new Panel();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		testLambdaExpressionsForAnnonimousClasses();

	}

	/**
	 * Ejemplo donde se muestra como reemplazar el uso de una Clase Anonima
	 * utilizando una Lambda Expression.
	 */
	private static void testLambdaExpressionsForAnnonimousClasses() {

		final TextField textField = new TextField(50);

		// Version original
		Button classicButton = new Button("Button standard");
		classicButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textField.setText("ClassicButton clickled!!");
			}
		});

		// Version lambda.
		Button lambdaButton = new Button("Lambda button");
		lambdaButton.addActionListener(e -> textField.setText("LambdaButton clicked!!"));
		
		// ----------- //
		mainPanel.setMinimumSize(new Dimension(1000, 500));
		mainPanel.add(classicButton);
		mainPanel.add(lambdaButton);
		mainPanel.add(textField);

		frame.add(mainPanel);
		frame.setMinimumSize(mainPanel.getMinimumSize());
		frame.setVisible(true);
	}

}
