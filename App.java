package app_1;

import java.awt.*;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);

        JTextField out = new JTextField("0");
        out.setBounds(10, 10, 230, 50);
        out.setEditable(false);
        frame.add(out);

        // Buttons
        // First Row
        JButton bplus = new JButton("+");
        bplus.setBounds(10, 70, 50, 50);
        frame.add(bplus);

        JButton bminus = new JButton("-");
        bminus.setBounds(70, 70, 50, 50);
        frame.add(bminus);

        JButton bmult = new JButton("x");
        bmult.setBounds(130, 70, 50, 50);
        frame.add(bmult);

        JButton bdiv = new JButton("÷");
        bdiv.setBounds(190, 70, 50, 50);
        frame.add(bdiv);

        // Second Row
        JButton b7 = new JButton("7");
        b7.setBounds(10, 130, 50, 50);
        frame.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(70, 130, 50, 50);
        frame.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(130, 130, 50, 50);
        frame.add(b9);

        JButton bequals = new JButton("=");
        bequals.setBounds(190, 130, 50, 230);
        frame.add(bequals);

        // Third Row
        JButton b4 = new JButton("4");
        b4.setBounds(10, 190, 50, 50);
        frame.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(70, 190, 50, 50);
        frame.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(130, 190, 50, 50);
        frame.add(b6);

        // Fourth Row
        JButton b1 = new JButton("1");
        b1.setBounds(10, 250, 50, 50);
        frame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(70, 250, 50, 50);
        frame.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(130, 250, 50, 50);
        frame.add(b3);

        // Fifth Row

        JButton b0 = new JButton("0");
        b0.setBounds(10, 310, 50, 50);
        frame.add(b0);

        JButton bdot = new JButton(".");
        bdot.setBounds(70, 310, 50, 50);
        frame.add(bdot);

        JButton bclear = new JButton("AC");
        bclear.setBounds(130, 310, 50, 50);
        frame.add(bclear);


        frame.setPreferredSize(new Dimension(250, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
