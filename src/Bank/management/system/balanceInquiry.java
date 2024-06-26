package Bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceInquiry extends JFrame implements ActionListener {
    String pin, cardNo;
    JLabel l3;
    JButton b1;

    balanceInquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Your Current balance is Rs.");
        l2.setForeground(Color.red);
        l2.setFont(new Font("System", Font.BOLD, 16));
        l2.setBounds(430, 180, 400, 35);
        l1.add(l2);

        l3 = new JLabel();
        l3.setForeground(Color.red);
        l3.setFont(new Font("System", Font.BOLD, 16));
        l3.setBounds(430, 220, 400, 35);
        l1.add(l3);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(65,125,128 ));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);

        int balance =0;
        try{
            con c= new con();
            ResultSet result = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (result.next()){
                if (result.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(result.getString("amount"));
                } else {
                    balance -= Integer.parseInt(result.getString("amount"));
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        l3.setText(""+ balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new mainClass(pin, cardNo);
    }

    public static void main(String[] args) {
        new balanceInquiry("");
    }
}
