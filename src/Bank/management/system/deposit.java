package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
    String pin, cardNo;
    JTextField  textField;
    JButton b1, b2;

    deposit(String pin){
        super("DEPOSIT");
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("ENTER THE AMOUNT TO BE DEPOSITED : ");
        l2.setForeground(Color.red);
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 180, 400, 35);
        l1.add(l2);

        textField = new JTextField();
        textField.setBackground(new Color(222, 254, 227));
        textField.setForeground(Color.DARK_GRAY);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Courier",Font.BOLD, 22));
        l1.add(textField);

        b1 = new JButton("DEPOSIT");
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
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the amount to be deposited.");
                } else {
                    con con4 = new con();
                    con4.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" has been deposited.");
                    new mainClass(pin, cardNo);
                    setVisible(false);
                }

            } else if (e.getSource() == b2) {
                setVisible(false);
                new mainClass(pin ,cardNo);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new deposit("");
    }
}
