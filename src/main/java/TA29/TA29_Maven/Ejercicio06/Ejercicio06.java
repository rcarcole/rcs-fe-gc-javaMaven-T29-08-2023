package TA29.TA29_Maven.Ejercicio06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio06 {
	 public static void main(String[] args) {
	        // Crear ventana principal
	        JFrame frame = new JFrame("Calculadora de IMC");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new GridLayout(5, 2, 10, 10));
	        frame.setSize(300, 200);

	        // Label y texto para el peso
	        JLabel weightLabel = new JLabel("Peso (en kilos):");
	        JTextField weightField = new JTextField();

	        // Label y texto para la altura
	        JLabel heightLabel = new JLabel("Altura (en metros):");
	        JTextField heightField = new JTextField();

	        // Botón calcular IMC
	        JButton calculateButton = new JButton("Calcular IMC");
	        JLabel resultLabel = new JLabel("IMC: ");

	        frame.add(weightLabel);
	        frame.add(weightField);
	        frame.add(heightLabel);
	        frame.add(heightField);
	        frame.add(calculateButton);
	        frame.add(resultLabel);

	        // Acción del botóm
	        calculateButton.addActionListener((ActionEvent e) -> {
	            try {
	                double weight = Double.parseDouble(weightField.getText());
	                double height = Double.parseDouble(heightField.getText());
	                double imc = weight / (height * height);
	                resultLabel.setText("IMC: " + String.format("%.2f", imc));
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Por favor, introduce valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        });
	        
	        frame.pack();
	        frame.setVisible(true);
	    }
}
