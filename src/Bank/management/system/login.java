package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField1;
    JPasswordField password1;
    JButton loginButton, signUPButton, clearButton;

    login(){
        super("Bank Management System");// heading

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // importing image, to be used as bg of login frame
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png")); // importing image, to be used as bg of login frame
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("Welcome to ATM");
        label1.setForeground(Color.darkGray);
        label1.setFont(new Font("Courier", Font.BOLD, 40));
        label1.setBounds(230, 125,450,40 );
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setForeground(Color.darkGray);
        label2.setFont(new Font("Courier",Font.BOLD, 28));
        label2.setBounds(150, 190,375,30 );
        add(label2);

        textField1 = new JTextField(15);
        textField1.setBounds(325,190,230,30);
        textField1.setFont(new Font("Courier", Font.BOLD, 14));
        add(textField1);

        label3 = new JLabel("PIN:");
        label3.setForeground(Color.darkGray);
        label3.setFont(new Font("Courier",Font.BOLD, 28));
        label3.setBounds(150, 250,375,30 );
        add(label3);

        password1 = new JPasswordField(15);
        password1.setBounds(325,250,230,30);
        password1.setFont(new Font("Courier", Font.BOLD, 14));
        add(password1);

        loginButton = new JButton("LOG IN");
        loginButton.setFont(new Font("Courier", Font.BOLD, 14));
        loginButton.setForeground(Color.MAGENTA);
        loginButton.setBackground(Color.BLACK);
        loginButton.setBounds(300, 300, 100, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton = new JButton("CLEAR");
        clearButton.setFont(new Font("Courier", Font.BOLD, 14));
        clearButton.setForeground(Color.MAGENTA);
        clearButton.setBackground(Color.BLACK);
        clearButton.setBounds(430, 300, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        signUPButton = new JButton("SIGN UP");
        signUPButton.setFont(new Font("Courier", Font.BOLD, 14));
        signUPButton.setForeground(Color.MAGENTA);
        signUPButton.setBackground(Color.BLACK);
        signUPButton.setBounds(300, 350, 230, 30);
        signUPButton.addActionListener(this);
        add(signUPButton);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png")); // importing image, to be used as bg of login frame
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480); //frame size
        setLocation(450 , 200); //where on screen, right now center
        //setUndecorated(true);
        setVisible(true); // default hidden , so true to display
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == loginButton){
                con c = new con();
                if(textField1.getText().equals("") || password1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter all the fields correctly");
                }
                String cardNo = textField1.getText();
                String pin = password1.getText();
                String q = "Select * from login where card_no ='"+cardNo+"' and  pin = '"+pin+"'";
                ResultSet result = c.statement.executeQuery(q);
                if(result.next()) {
                    setVisible(false);
                    new mainClass(pin, cardNo);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN");
                }

            } else if(e.getSource() == clearButton){
                textField1.setText("");
                password1.setText("");
            } else if(e.getSource() == signUPButton) {
                new signUp();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
