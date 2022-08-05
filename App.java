package app_1;

import java.awt.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JLabel textLabel = new JLabel("1", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        JButton b1 = new JButton("1");
        b1.setBounds(50, 100, 95, 30);
        frame.getContentPane().add(b1);

        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
