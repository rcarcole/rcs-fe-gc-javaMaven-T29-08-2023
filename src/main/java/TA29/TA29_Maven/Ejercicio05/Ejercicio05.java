package TA29.TA29_Maven.Ejercicio05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio05 {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Logger de Eventos del Ratón");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new BorderLayout());
	        frame.setSize(400, 300);

	        // Mostrar los eventos
	        JTextArea textArea = new JTextArea();
	        textArea.setEditable(false);  // Hacerlo no editable
	        JScrollPane scrollPane = new JScrollPane(textArea);
	        frame.add(scrollPane, BorderLayout.CENTER);

	        // Listener de mouse event
	        textArea.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                textArea.append("Ratón clicado\n");
	            }

	            @Override
	            public void mousePressed(MouseEvent e) {
	                textArea.append("Ratón presionado\n");
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {
	                textArea.append("Ratón liberado\n");
	            }

	            @Override
	            public void mouseEntered(MouseEvent e) {
	                textArea.append("Ratón entró en el área\n");
	            }

	            @Override
	            public void mouseExited(MouseEvent e) {
	                textArea.append("Ratón salió del área\n");
	            }
	        });

	        // Botón limpiar
	        JButton clearButton = new JButton("Limpiar");
	        clearButton.addActionListener(e -> textArea.setText(""));
	        frame.add(clearButton, BorderLayout.SOUTH);

	        frame.setVisible(true);
	    }
}
