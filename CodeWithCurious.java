import javax.swing.*;
import java.awt.event.*;

public class CodeWithCurious {

    public static void converter() {
        JFrame frame = new JFrame("Currency Converter");

        JLabel labelRupee = new JLabel("Rupees:");
        labelRupee.setBounds(20, 40, 60, 30);

        JLabel labelDollar = new JLabel("Dollars:");
        labelDollar.setBounds(170, 40, 60, 30);

        JTextField textRupee = new JTextField("0");
        textRupee.setBounds(80, 40, 80, 30);

        JTextField textDollar = new JTextField("0");
        textDollar.setBounds(240, 40, 80, 30);

        JButton btnToDollar = new JButton("INR ➜ USD");
        btnToDollar.setBounds(50, 100, 100, 30);

        JButton btnToRupee = new JButton("USD ➜ INR");
        btnToRupee.setBounds(190, 100, 100, 30);

        JButton btnClose = new JButton("Close");
        btnClose.setBounds(130, 160, 100, 30);

        final double rate = 83.10;

        btnToDollar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rupees = Double.parseDouble(textRupee.getText());
                    double dollars = rupees / rate;
                    textDollar.setText(String.format("%.2f", dollars));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number in Rupees");
                }
            }
        });

        btnToRupee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dollars = Double.parseDouble(textDollar.getText());
                    double rupees = dollars * rate;
                    textRupee.setText(String.format("%.2f", rupees));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Enter a valid number in Dollars");
                }
            }
        });

        btnClose.addActionListener(e -> frame.dispose());

        frame.add(labelRupee);
        frame.add(labelDollar);
        frame.add(textRupee);
        frame.add(textDollar);
        frame.add(btnToDollar);
        frame.add(btnToRupee);
        frame.add(btnClose);

        frame.setLayout(null);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        converter();
    }
}
