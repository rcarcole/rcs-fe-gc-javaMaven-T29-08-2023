package TA29.TA29_Maven.Ejercicio08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Ejercicio08 {
	 private static final double RATE_TO_EURO = 1 / 166.386;

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Conversor Pesetas-Euros");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new GridLayout(4, 2, 10, 10));
	        frame.setSize(350, 200);

	        JLabel inputLabel = new JLabel("Cantidad:");
	        JTextField inputField = new JTextField();

	        // Botones
	        JButton toEuroButton = new JButton("A Euros");
	        JButton toPesetasButton = new JButton("A Pesetas");
	        JButton clearButton = new JButton("Borrar");

	        // Etiqueta
	        JLabel resultLabel = new JLabel("Resultado: ");

	        frame.add(inputLabel);
	        frame.add(inputField);
	        frame.add(toEuroButton);
	        frame.add(toPesetasButton);
	        frame.add(clearButton);
	        frame.add(resultLabel);

	        // Acciones
	        ActionListener convertToEuro = e -> {
	            try {
	                double pesetas = Double.parseDouble(inputField.getText());
	                double euros = pesetas * RATE_TO_EURO;
	                resultLabel.setText("Resultado: " + String.format("%.2f", euros) + " euros");
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Por favor, introduce un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        };

	        ActionListener convertToPesetas = e -> {
	            try {
	                double euros = Double.parseDouble(inputField.getText());
	                double pesetas = euros / RATE_TO_EURO;
	                resultLabel.setText("Resultado: " + String.format("%.2f", pesetas) + " pesetas");
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(frame, "Por favor, introduce un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        };

	        // Acciones a los botones
	        toEuroButton.addActionListener(convertToEuro);
	        toPesetasButton.addActionListener(convertToPesetas);
	        clearButton.addActionListener(e -> {
	            inputField.setText("");
	            resultLabel.setText("Resultado: ");
	        });

	       inputField.getActionMap().put("convertToEuro", new AbstractAction() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                convertToEuro.actionPerformed(e);
	            }
	        });
	        inputField.getActionMap().put("convertToPesetas", new AbstractAction() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                convertToPesetas.actionPerformed(e);
	            }
	        });
	        frame.setVisible(true);
	    }
}
