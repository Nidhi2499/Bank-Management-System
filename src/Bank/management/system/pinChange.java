package Bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class pinChange extends JFrame implements ActionListener {
    String pin, cardNo;
    JButton b1,b2;
    JPasswordField  p1, p2;

    pinChange(String pin, String cardNo){
        this.pin = pin;
        this.cardNo = cardNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("CHANGE YOUR PIN ");
        l2.setForeground(Color.red);
        l2.setFont(new Font("System", Font.BOLD, 24));
        l2.setBounds(510, 180, 400, 35);
        l1.add(l2);

        JLabel l3 = new JLabel("New PIN : ");
        l3.setForeground(Color.red);
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(420, 230, 400, 35);
        l1.add(l3);

        p1 = new JPasswordField();
        p1.setForeground(Color.red);
        p1.setFont(new Font("System", Font.BOLD, 16));
        p1.setBounds(600, 230, 200, 35);
        p1.setBackground(new Color(222, 254, 227));
        l1.add(p1);

        JLabel l4 = new JLabel(" Re-Enter New PIN : ");
        l4.setForeground(Color.red);
        l4.setFont(new Font("System", Font.BOLD, 16));
        l4.setBounds(420, 280, 400, 35);
        l1.add(l4);

        p2= new JPasswordField();
        p2.setForeground(Color.red);
        p2.setFont(new Font("System", Font.BOLD, 16));
        p2.setBounds(600, 280, 200, 35);
        p2.setBackground(new Color(222, 254, 227));
        l1.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128 ));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,402,150,35);
        b2.setBackground(new Color(65,125,128 ));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l1.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == b2) {
                new mainClass(pin, cardNo);
                setVisible(false);
            } else {
                String newPin = p1.getText();
                String re_renterPin = p2.getText();
                if (newPin.length() != 4) {
                    JOptionPane.showMessageDialog(null, "The PIN should be of 4 digits");
                    return;
                } else if (!newPin.equals(re_renterPin)) {
                    JOptionPane.showMessageDialog(null, "The PIN doesn't match");
                    return;
                }
                if(p1.getText().isEmpty() || p2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the pin");
                }

                con c = new con();

                String q1 = "update bank set pin = '"+newPin+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+newPin+"' where pin = '"+pin+"' and card_no = '"+cardNo+"'";
                String q3 = "update signupthree set pin = '"+newPin+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN change Successful...");
                new mainClass(pin, cardNo);
                setVisible(false);
            }
        } catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new pinChange("", "");
    }

}
