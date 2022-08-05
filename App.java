package app_1;

import java.awt.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);

        // Buttons
        // First Row
        JButton b1 = new JButton("1");
        b1.setBounds(10, 10, 50, 50);
        frame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(70, 10, 50, 50);
        frame.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(130, 10, 50, 50);
        frame.add(b3);

        // Second Row
        JButton b4 = new JButton("4");
        b4.setBounds(10, 70, 50, 50);
        frame.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(70, 70, 50, 50);
        frame.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(130, 70, 50, 50);
        frame.add(b6);

        // Third Row
        JButton b7 = new JButton("7");
        b7.setBounds(10, 130, 50, 50);
        frame.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(70, 130, 50, 50);
        frame.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(130, 130, 50, 50);
        frame.add(b9);

        frame.setPreferredSize(new Dimension(190, 300));
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
