package TA29.TA29_Maven.Ejercicio04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio04 {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Logger de Eventos de Ventana");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());
	        frame.setSize(400, 300);

	        // Crear etiqueta
	        JLabel label = new JLabel("Eventos de Ventana:", SwingConstants.CENTER);
	        frame.add(label, BorderLayout.NORTH);

	        // Mostrar los eventos
	        JTextArea textArea = new JTextArea();
	        textArea.setEditable(false);  // Hacerlo no editable
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        frame.add(scrollPane, BorderLayout.CENTER);

	        // Listener de WindowAdapter
	        frame.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowOpened(WindowEvent e) {
	                textArea.append("Ventana Abierta\n");
	            }

	            @Override
	            public void windowClosing(WindowEvent e) {
	                textArea.append("Ventana Cerrándose\n");
	            }

	            @Override
	            public void windowClosed(WindowEvent e) {
	                textArea.append("Ventana Cerrada\n");
	            }

	            @Override
	            public void windowIconified(WindowEvent e) {
	                textArea.append("Ventana Minimizada\n");
	            }

	            @Override
	            public void windowDeiconified(WindowEvent e) {
	                textArea.append("Ventana Restaurada\n");
	            }

	            @Override
	            public void windowActivated(WindowEvent e) {
	                textArea.append("Ventana Activada\n");
	            }

	            @Override
	            public void windowDeactivated(WindowEvent e) {
	                textArea.append("Ventana Desactivada\n");
	            }
	        });

	        frame.setVisible(true);
	    }
}
