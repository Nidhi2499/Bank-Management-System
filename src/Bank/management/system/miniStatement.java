package Bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class miniStatement extends JFrame implements ActionListener {
    String pin;
    JButton b1;

    miniStatement(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setSize(500,700);
        setLocation(20,20);

        JLabel l1 = new JLabel();
        l1.setBounds(40,120,400,400);
        add(l1);

        JLabel l2 = new JLabel("Indian Bank");
        l2.setFont(new Font("System", Font.BOLD, 20));
        l2.setBounds(200,25,200,25);
        add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(40,80,400,30);
        add(l3);

        JLabel l4 = new JLabel();
        l4.setBounds(40,550,300,20);
        add(l4);

        try {
            con c = new con();
            ResultSet result = c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while(result.next()){
                l3.setText("Card Number: "+ result.getString("card_no").substring(0,4)+"-XXXX-XXXX-"+result.getString("card_no").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            con c= new con();
            ResultSet result = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while (result.next()){
                l1.setText(l1.getText()+"<html>"+result.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result.getString("amount")+"<br><br><html>");
                if(result.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(result.getString("amount"));
                } else {
                    balance -= Integer.parseInt(result.getString("amount"));
                }
            }
            l4.setText("Your Balance: "+balance);
        } catch (Exception e){
            e.printStackTrace();
        }

        b1 = new JButton("Exit");
        b1.setBounds(200,600,100,25);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128 ));
        b1.setFont(new Font("System",Font.BOLD,18));
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }

    public static void main(String[] args) {
        new miniStatement("");
    }
}
