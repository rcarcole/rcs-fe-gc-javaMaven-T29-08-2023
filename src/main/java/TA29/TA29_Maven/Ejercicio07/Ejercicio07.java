package TA29.TA29_Maven.Ejercicio07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio07 {
	private static final double RATE_TO_EURO = 1 / 166.386;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor Pesetas-Euros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.setSize(350, 150);

        JLabel inputLabel = new JLabel("Cantidad:");
        JTextField inputField = new JTextField();

        // Botones
        JButton toEuroButton = new JButton("A Euros");
        JButton toPesetasButton = new JButton("A Pesetas");

        // Etiqueta
        JLabel resultLabel = new JLabel("Resultado: ");

        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(toEuroButton);
        frame.add(toPesetasButton);
        frame.add(resultLabel);

        // Acciones
        toEuroButton.addActionListener((ActionEvent e) -> {
            try {
                double pesetas = Double.parseDouble(inputField.getText());
                double euros = pesetas * RATE_TO_EURO;
                resultLabel.setText("Resultado: " + String.format("%.2f", euros) + " euros");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, introduce un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        toPesetasButton.addActionListener((ActionEvent e) -> {
            try {
                double euros = Double.parseDouble(inputField.getText());
                double pesetas = euros / RATE_TO_EURO;
                resultLabel.setText("Resultado: " + String.format("%.2f", pesetas) + " pesetas");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, introduce un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
