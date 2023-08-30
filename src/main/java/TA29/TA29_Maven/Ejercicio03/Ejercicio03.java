package TA29.TA29_Maven.Ejercicio03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ejercicio03 {
	
	private static int countButton1 = 0;
    private static int countButton2 = 0;
    
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Contador de Botones");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());
	        frame.setSize(300, 150);

	        // Etiquetas
	        JPanel labelPanel = new JPanel();
	        labelPanel.setLayout(new GridLayout(2, 1));

	        // Crear
	        JLabel labelButton1 = new JLabel("Botón 1: 0 veces", SwingConstants.CENTER);
	        JLabel labelButton2 = new JLabel("Botón 2: 0 veces", SwingConstants.CENTER);

	        labelPanel.add(labelButton1);
	        labelPanel.add(labelButton2);

	        frame.add(labelPanel, BorderLayout.CENTER);

	        // ButtonPanel
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new FlowLayout());

	        // Crea y añade cantidad de clics a cada boton
	        JButton button1 = new JButton("Botón 1");
	        button1.addActionListener((ActionEvent e) -> {
	            countButton1++;
	            labelButton1.setText("Botón 1: " + countButton1 + " veces");
	        });

	        JButton button2 = new JButton("Botón 2");
	        button2.addActionListener((ActionEvent e) -> {
	            countButton2++;
	            labelButton2.setText("Botón 2: " + countButton2 + " veces");
	        });

	        // Añadir botones al panel
	        buttonPanel.add(button1);
	        buttonPanel.add(button2);

	        // Añadir panel de botones a la ventana
	        frame.add(buttonPanel, BorderLayout.SOUTH);

	        frame.setVisible(true);
	    }
}
