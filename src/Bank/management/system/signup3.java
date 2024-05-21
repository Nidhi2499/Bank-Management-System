package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;
    String formNo;

    signup3(String first) {
        super("APPLICATION FORM");
        this.formNo = first;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // importing image, to be used as bg of login frame
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Courier", Font.BOLD, 22));
        l1.setBounds(380,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Courier", Font.BOLD, 25));
        l2.setBounds(335,70,600,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Courier", Font.BOLD, 18));
        l3.setBounds(100,120,200,30);
        add(l3);

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Courier", Font.BOLD, 14));
        r1.setBackground(new Color(222, 254, 227));
        r1.setBounds(200,150,200,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit");
        r2.setFont(new Font("Courier", Font.BOLD, 14));
        r2.setBackground(new Color(222, 254, 227));
        r2.setBounds(400,150,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Courier", Font.BOLD, 14));
        r3.setBackground(new Color(222, 254, 227));
        r3.setBounds(200,190,200,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Courier", Font.BOLD, 14));
        r4.setBackground(new Color(222, 254, 227));
        r4.setBounds(400,190,300,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number");
        l4.setFont(new Font("Courier", Font.BOLD, 18));
        l4.setBounds(100,250,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Courier", Font.BOLD, 9));
        l5.setBounds(100,270,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Courier", Font.BOLD, 18));
        l6.setBounds(300,250,300,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on the atm card/cheque book and statements.)");
        l7.setFont(new Font("Courier", Font.BOLD, 9));
        l7.setBounds(300,270,500,20);
        add(l7);

        JLabel l8 = new JLabel("Pin :");
        l8.setFont(new Font("Courier", Font.BOLD, 18));
        l8.setBounds(100,320,200,30);
        add(l8);

        JLabel l9 = new JLabel("(4-digit Password)");
        l9.setFont(new Font("Courier", Font.BOLD, 9));
        l9.setBounds(100,340,300,20);
        add(l9);

        JLabel l10 = new JLabel("XXXX");
        l10.setFont(new Font("Courier", Font.BOLD, 18));
        l10.setBounds(300,320,200,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required :");
        l11.setFont(new Font("Courier", Font.BOLD, 18));
        l11.setBounds(100,390,200,30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(222, 254, 227));
        c1.setFont(new Font("Courier", Font.BOLD, 14));
        c1.setBounds(200,420,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(222, 254, 227));
        c2.setFont(new Font("Courier", Font.BOLD, 14));
        c2.setBounds(400,420,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(222, 254, 227));
        c3.setFont(new Font("Courier", Font.BOLD, 14));
        c3.setBounds(200,460,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(222, 254, 227));
        c4.setFont(new Font("Courier", Font.BOLD, 14));
        c4.setBounds(400,460,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(222, 254, 227));
        c5.setFont(new Font("Courier", Font.BOLD, 14));
        c5.setBounds(200,500,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statements");
        c6.setBackground(new Color(222, 254, 227));
        c6.setFont(new Font("Courier", Font.BOLD, 14));
        c6.setBounds(400,500,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setBackground(new Color(222, 254, 227));
        c7.setFont(new Font("Courier", Font.BOLD, 16));
        c7.setBounds(100,600,700,30);
        add(c7);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Courier", Font.BOLD, 16));
        l12.setBounds(600, 30, 80,30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Courier", Font.BOLD, 16));
        l13.setBounds(690, 30, 100,30);
        add(l13);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Courier", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.magenta);
        cancel.setBounds(280, 660, 120, 30);
        cancel.addActionListener(this);
        add(cancel);

        submit = new JButton("Submit");
        submit.setFont(new Font("Courier", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.magenta);
        submit.setBounds(430, 660, 120, 30);
        submit.addActionListener(this);
        add(submit);

        getContentPane().setBackground(new Color(222, 254, 227));
        setSize(850,800);
        setLayout(null);
        setLocation(300,15);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String acc_type = null;
            if(r1.isSelected()) acc_type = "Savings Account";
            else if (r2.isSelected()) acc_type = "Fixed Deposit";
            else if (r3.isSelected()) acc_type = "Current Account";
            else if (r4.isSelected()) acc_type = "Recurring Deposit Account";

            Random ran = new Random();
            long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
            String cardNo = "" + Math.abs(first7);

            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = "" + Math.abs(first3);

            String fac = "";
            if(c1.isSelected()){
                fac += "ATM Card";
            } else if (c2.isSelected()) {
                fac += "Internet Banking";
            } else if (c3.isSelected()) {
                fac += "Mobile Banking";
            } else if (c4.isSelected()) {
                fac += "EMAIL Alerts";
            } else if (c5.isSelected()) {
                fac += "Cheque Book";
            } else if (c6.isSelected()) {
                fac += "E-Statement";
            }

            if(e.getSource()== submit) {
                if(acc_type.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    con con3 = new con();
                    String q1 = "insert into signupthree values('"+formNo+"','"+acc_type+"','"+cardNo+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+formNo+"','"+cardNo+"','"+pin+"')";
                    con3.statement.executeUpdate(q1);
                    con3.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : "+ cardNo+ "\n PIN : "+ pin);
                    new deposit(pin);
                    setVisible(false);
                }
            }else if (e.getSource() == cancel) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup3("");
    }
}
