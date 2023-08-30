package TA29.TA29_Maven.Ejercicio02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio02 {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Botones y Etiqueta");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());
	        frame.setSize(300, 150);

	        // Etiqueta
	        JLabel label = new JLabel("Pulsa un botón", SwingConstants.CENTER);
	        frame.add(label, BorderLayout.CENTER);

	        // Panel para botones
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new FlowLayout());

	        // Crear boton y añadirle un evento
	        JButton button1 = new JButton("Botón 1");
	        button1.addActionListener((ActionEvent e) -> {
	            label.setText("Has pulsado: Botón 1");
	        });

	        JButton button2 = new JButton("Botón 2");
	        button2.addActionListener((ActionEvent e) -> {
	            label.setText("Has pulsado: Botón 2");
	        });

	        // Añadir botones al panel
	        buttonPanel.add(button1);
	        buttonPanel.add(button2);

	        // Añadir panel de botones a la ventana
	        frame.add(buttonPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);
	    }
}
