package Bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    String formNo;
    JTextField textPan, textAadhaar;
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JRadioButton seniorCitizenY, seniorCitizenN, accountExistY, accountExistN;
    JButton next;

    signup2(String formNo){
        super("APPLICATION FORM");
        this.formNo = formNo;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Courier", Font.BOLD, 22));
        l1.setBounds(380,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Information");
        l2.setFont(new Font("Courier", Font.BOLD, 22));
        l2.setBounds(300,70,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Courier", Font.BOLD, 18));
        l3.setBounds(100,120,200,30);
        add(l3);

        String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(222, 254, 227));
        comboBox.setFont(new Font("Courier", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Courier", Font.BOLD, 18));
        l4.setBounds(100,170,200,30);
        add(l4);

        String[] category = {"General", "OBC", "SC", "ST", "Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(222, 254, 227));
        comboBox2.setFont(new Font("Courier", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Courier", Font.BOLD, 18));
        l5.setBounds(100,220,200,30);
        add(l5);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "<5,00000", "upto 10,00,000", "above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(222, 254, 227));
        comboBox3.setFont(new Font("Courier", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Courier", Font.BOLD, 18));
        l6.setBounds(100,270,200,30);
        add(l6);

        String[] education = {"Non graduate", "Graduate", "Post graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(222, 254, 227));
        comboBox4.setFont(new Font("Courier", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Courier", Font.BOLD, 18));
        l7.setBounds(100,340,200,30);
        add(l7);

        String[] occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(222, 254, 227));
        comboBox5.setFont(new Font("Courier", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN :");
        l8.setFont(new Font("Courier", Font.BOLD, 18));
        l8.setBounds(100,390,200,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Courier", Font.BOLD, 14));
        textPan.setBounds(350,390,320,30);
        add(textPan);

        JLabel l9 = new JLabel("AADHAAR NO :");
        l9.setFont(new Font("Courier", Font.BOLD, 18));
        l9.setBounds(100,440,200,30);
        add(l9);

        textAadhaar = new JTextField();
        textAadhaar.setFont(new Font("Courier", Font.BOLD, 14));
        textAadhaar.setBounds(350,440,320,30);
        add(textAadhaar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Courier", Font.BOLD, 18));
        l10.setBounds(100, 490, 200,30);
        add(l10);

        seniorCitizenY = new JRadioButton("Yes");
        seniorCitizenY.setFont(new Font( "Courier", Font.BOLD, 14));
        seniorCitizenY.setBounds(350, 490, 60 , 30);
        seniorCitizenY.setBackground(new Color(222, 254, 227));
        add(seniorCitizenY);

        seniorCitizenN = new JRadioButton("No");
        seniorCitizenN.setFont(new Font( "Courier", Font.BOLD, 14));
        seniorCitizenN.setBounds(500, 490, 60 , 30);
        seniorCitizenN.setBackground(new Color(222, 254, 227));
        add(seniorCitizenN);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(seniorCitizenY);
        buttonGroup.add(seniorCitizenN);

        JLabel l11 = new JLabel("Account Exists :");
        l11.setFont(new Font("Courier", Font.BOLD, 18));
        l11.setBounds(100, 540, 200,30);
        add(l11);

        accountExistY = new JRadioButton("Yes");
        accountExistY.setFont(new Font( "Courier", Font.BOLD, 14));
        accountExistY.setBounds(350, 540, 60 , 30);
        accountExistY.setBackground(new Color(222, 254, 227));
        add(accountExistY);

        accountExistN = new JRadioButton("No");
        accountExistN.setFont(new Font( "Courier", Font.BOLD, 14));
        accountExistN.setBounds(500, 540, 60 , 30);
        accountExistN.setBackground(new Color(222, 254, 227));
        add(accountExistN);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(accountExistY);
        buttonGroup1.add(accountExistN);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Courier", Font.BOLD, 16));
        l12.setBounds(600, 30, 80,30);
        add(l12);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Courier", Font.BOLD, 16));
        l13.setBounds(690, 30, 200,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Courier", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.magenta);
        next.setBounds(650, 600, 80, 30);
        next.addActionListener(this);
        add(next);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // importing image, to be used as bg of login frame
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,5,100,100);
        add(image);

        setLayout(null);
        setSize(850,750);
        setLocation(400,40);
        getContentPane().setBackground(new Color(222, 254, 227));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String religion = (String) comboBox.getSelectedItem();
            String category = (String) comboBox2.getSelectedItem();
            String income = (String) comboBox3.getSelectedItem();
            String  education = (String) comboBox4.getSelectedItem();
            String occupation = (String) comboBox5.getSelectedItem();
            String pan = textPan.getText();
            String aadhaar = textAadhaar.getText();
            String s_citizen = null;
            if(seniorCitizenY.isSelected()){
                s_citizen = "Yes";
            } else if(seniorCitizenN.isSelected()){
                s_citizen = "No";
            }
            String e_acc = null;
            if(accountExistY.isSelected()) e_acc = "Yes";
            else if (accountExistN.isSelected()) e_acc = "No";

            if(textPan.getText().isEmpty() || textAadhaar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                con con2 = new con();
                String q = "insert into signuptwo values('"+formNo+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhaar+"','"+s_citizen+"','"+e_acc+"')";
                con2.statement.executeUpdate(q);
                new signup3(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup2("");
    }
}
