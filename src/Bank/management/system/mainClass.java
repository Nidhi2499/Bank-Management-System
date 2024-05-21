package Bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainClass extends JFrame implements ActionListener {
    JButton b1, b2, b3 , b4, b5, b6, b7;
    String pin, cardNo;

    mainClass(String pin, String cardNo){
        super("SERVICES");
        this.pin = pin;
        this.cardNo = cardNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Please select your transaction");
        l2.setBounds(430, 180, 700, 35);
        l2.setForeground(Color.red);
        l2.setFont(new Font("System",Font.BOLD,28));
        l1.add(l2);

        b1 = new JButton("Deposit");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128 ));
        b1.setBounds(410, 272, 150,35);
        b1.setFont(new Font("System",Font.BOLD,20));
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Cash Withdrawal");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128 ));
        b2.setBounds(650, 272, 200,35);
        b2.setFont(new Font("System",Font.BOLD,20));
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Fast Cash");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128 ));
        b3.setBounds(410, 318, 150,35);
        b3.setFont(new Font("System",Font.BOLD,20));
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("Mini Statement");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128 ));
        b4.setBounds(650, 318, 200,35);
        b4.setFont(new Font("System",Font.BOLD,20));
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("Pin Change");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128 ));
        b5.setBounds(410, 362, 150,35);
        b5.setFont(new Font("System",Font.BOLD,20));
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("Balance Enquiry");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128 ));
        b6.setBounds(650, 362, 200,35);
        b6.setFont(new Font("System",Font.BOLD,20));
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("Exit");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128 ));
        b7.setBounds(650, 406, 200,35);
        b7.setFont(new Font("System",Font.BOLD,20));
        b7.addActionListener(this);
        l1.add(b7);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        try {
            if (e.getSource() == b1){
                new deposit(pin);
                setVisible(false);
            } else if (e.getSource() == b7){
                System.exit(0);
            } else if (e.getSource() == b2) {
                new withdrawal(pin);
                setVisible(false);
            } else if (e.getSource() == b6) {
                new balanceInquiry(pin);
                setVisible(false);
            } else if (e.getSource() == b3) {
                new fastCash(pin);
                setVisible(false);
            } else if (e.getSource() == b5) {
                new pinChange(pin , cardNo);
                setVisible(false);
            } else if (e.getSource() == b4) {
                new miniStatement(pin);
            }
        } catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new mainClass("", "");
    }
}
