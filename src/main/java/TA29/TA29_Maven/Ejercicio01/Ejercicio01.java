package TA29.TA29_Maven.Ejercicio01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio01 {

    private static JLabel label;
    private static JSlider slider;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con Título");
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        label = new JLabel("Esta es una etiqueta.", SwingConstants.CENTER);
        frame.add(label, BorderLayout.CENTER);

        // Slider para cambiar tamaño de letra
        slider = new JSlider(10, 50, 16);
        slider.addChangeListener(e -> {
            int value = slider.getValue();
            label.setFont(new Font("Serif", Font.PLAIN, value));
        });
        frame.add(slider, BorderLayout.SOUTH);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}