package Bank.management.system;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
    String pin, cardNo;
    JButton b1, b2, b3 , b4, b5, b6, b7;

    fastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        l2.setBounds(430, 180, 700, 35);
        l2.setForeground(Color.red);
        l2.setFont(new Font("System",Font.BOLD,24));
        l1.add(l2);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128 ));
        b1.setBounds(410, 272, 150,35);
        b1.setFont(new Font("System",Font.BOLD,20));
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128 ));
        b2.setBounds(650, 272, 200,35);
        b2.setFont(new Font("System",Font.BOLD,20));
        b2.addActionListener(this);
        l1.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128 ));
        b3.setBounds(410, 318, 150,35);
        b3.setFont(new Font("System",Font.BOLD,20));
        b3.addActionListener(this);
        l1.add(b3);

        b4 = new JButton("Rs. 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128 ));
        b4.setBounds(650, 318, 200,35);
        b4.setFont(new Font("System",Font.BOLD,20));
        b4.addActionListener(this);
        l1.add(b4);

        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128 ));
        b5.setBounds(410, 362, 150,35);
        b5.setFont(new Font("System",Font.BOLD,20));
        b5.addActionListener(this);
        l1.add(b5);

        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128 ));
        b6.setBounds(650, 362, 200,35);
        b6.setFont(new Font("System",Font.BOLD,20));
        b6.addActionListener(this);
        l1.add(b6);

        b7 = new JButton("BACK");
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

    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == b7){
                new mainClass(pin, cardNo);
                setVisible(false);
            } else {
                String amount = ((JButton)e.getSource()).getText().substring(4);
                con c= new con();
                Date date = new Date();
                ResultSet result = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while (result.next()){
                    if(result.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(result.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(result.getString("amount"));
                    }
                } String num = "17";
                if(e.getSource()!= b7 && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs."+amount+" debited successfully");
                new mainClass(pin, cardNo);
                setVisible(false);
            }
        } catch( Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new fastCash("");
    }

}
