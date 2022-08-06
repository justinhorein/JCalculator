package app_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.ws.Action;

public class App extends JFrame implements ActionListener {

    String s0, s1, s2;

    static JTextField out;

    App() {
        s0 = s1 = s2 = "";
    }

    public static void main(String[] args) {
        App calc = new App();

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 250, 400);
        panel.setLayout(null);
        panel.setBackground(new Color(51, 23, 105));

        out = new JTextField("0");
        out.setBounds(10, 10, 230, 50);
        out.setEditable(false);
        panel.add(out);

        // Buttons
        // First Row
        JButton bplus = new JButton("+");
        bplus.setBounds(10, 70, 50, 50);
        bplus.addActionListener(calc);
        panel.add(bplus);

        JButton bminus = new JButton("-");
        bminus.setBounds(70, 70, 50, 50);
        bminus.addActionListener(calc);
        panel.add(bminus);

        JButton bmult = new JButton("x");
        bmult.setBounds(130, 70, 50, 50);
        bmult.addActionListener(calc);
        panel.add(bmult);

        JButton bdiv = new JButton("÷");
        bdiv.setBounds(190, 70, 50, 50);
        bdiv.addActionListener(calc);
        panel.add(bdiv);

        // Second Row
        JButton b7 = new JButton("7");
        b7.setBounds(10, 130, 50, 50);
        b7.addActionListener(calc);
        panel.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(70, 130, 50, 50);
        b8.addActionListener(calc);
        panel.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(130, 130, 50, 50);
        b9.addActionListener(calc);
        panel.add(b9);

        JButton bequals = new JButton("=");
        bequals.setBounds(190, 130, 50, 230);
        bequals.addActionListener(calc);
        panel.add(bequals);

        // Third Row
        JButton b4 = new JButton("4");
        b4.setBounds(10, 190, 50, 50);
        b4.addActionListener(calc);
        panel.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(70, 190, 50, 50);
        b5.addActionListener(calc);
        panel.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(130, 190, 50, 50);
        b6.addActionListener(calc);
        panel.add(b6);

        // Fourth Row
        JButton b1 = new JButton("1");
        b1.setBounds(10, 250, 50, 50);
        b1.addActionListener(calc);
        panel.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(70, 250, 50, 50);
        b2.addActionListener(calc);
        panel.add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(130, 250, 50, 50);
        b3.addActionListener(calc);
        panel.add(b3);

        // Fifth Row

        JButton b0 = new JButton("0");
        b0.setBounds(10, 310, 50, 50);
        b0.addActionListener(calc);
        panel.add(b0);

        JButton bdot = new JButton(".");
        bdot.setBounds(70, 310, 50, 50);
        bdot.addActionListener(calc);
        panel.add(bdot);

        JButton bclear = new JButton("AC");
        bclear.setBounds(130, 310, 50, 50);
        bclear.addActionListener(calc);
        panel.add(bclear);

        frame.add(panel);
        frame.setPreferredSize(new Dimension(250, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.pack();
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;

            out.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'A') {
            s0 = s1 = s2 = "";

            out.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
            double te;

            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("÷"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));

            out.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);

            s1 = s2 = "";
        }
        else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;

                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("÷"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);
                s1 = s;
                s2 = "";

            }

            out.setText(s0 + s1 + s2);
        }
    }
}
