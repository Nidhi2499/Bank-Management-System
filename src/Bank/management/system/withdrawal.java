package Bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawal extends JFrame implements ActionListener {
    String pin, cardNo;
    JTextField  textField;
    JButton b1, b2;

    withdrawal(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("MAXIMUM WITHDRAWAL IS Rs.10,000 ");
        l2.setForeground(Color.red);
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(460, 180, 400, 35);
        l1.add(l2);

        JLabel l3 = new JLabel("PLEASE ENTER THE AMOUNT ");
        l3.setForeground(Color.red);
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(460, 220, 400, 35);
        l1.add(l3);

        textField = new JTextField();
        textField.setBackground(new Color(222, 254, 227));
        textField.setForeground(Color.DARK_GRAY);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Courier",Font.BOLD, 22));
        l1.add(textField);

        b1 = new JButton("WITHDRAW");
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
            if(e.getSource() == b1){
                String amount = textField.getText();
                Date date = new Date();
                if(textField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "please enter the amount");
                } else {
                    con c = new con();
                    ResultSet result = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (result.next()) {
                        if (result.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(result.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(result.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient BaLance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','Withdraw','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " debited successfully");
                    setVisible(false);
                    new mainClass(pin, cardNo);

                }
            }else if(e.getSource() == b2){
                setVisible(false);
                new mainClass(pin, cardNo);
            }

        } catch( Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new withdrawal("");
    }
}
