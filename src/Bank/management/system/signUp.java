package Bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp extends JFrame implements ActionListener {
    JTextField textName, textFather, textEmail, textAddress,  textCity, pinCode, textState;
    JDateChooser dateChooser;
    JRadioButton genderSelect1, genderSelect2, other, y, n;
    JButton next;

    Random r = new Random();
    long firstFour = (r.nextLong()% 9000L) +100L;
    String first = "" + Math.abs(firstFour);

    signUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png")); // importing image, to be used as bg of login frame
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20, 600,40);
        label1.setFont(new Font("Courier", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel( "  Page 1");
        label2.setFont(new Font("Courier", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Courier", Font.BOLD, 22));
        label3.setBounds(290,100,600,30);
        add(label3);

        JLabel labelName = new JLabel(("Name :"));
        labelName.setFont(new Font("Courier", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100 , 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Courier" , Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel Father = new JLabel(("Father's Name :"));
        Father.setFont(new Font("Courier", Font.BOLD, 20));
        Father.setBounds(100, 240, 200 , 30);
        add(Father);

        textFather = new JTextField();
        textFather.setFont(new Font("Courier" , Font.BOLD, 14));
        textFather.setBounds(300, 240, 400, 30);
        add(textFather);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Courier", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200,30);
        add(labelG);

        genderSelect1= new JRadioButton("Male");
        genderSelect1.setFont(new Font( "Courier", Font.BOLD, 14));
        genderSelect1.setBounds(300, 290, 60 , 30);
        genderSelect1.setBackground(new Color(222, 254, 227));
        add(genderSelect1);

        genderSelect2= new JRadioButton("Female");
        genderSelect2.setFont(new Font( "Courier", Font.BOLD, 14));
        genderSelect2.setBounds(400, 290, 100 , 30);
        genderSelect2.setBackground(new Color(222, 254, 227));
        add(genderSelect2);

        other = new JRadioButton("Others");
        other.setFont(new Font( "Courier", Font.BOLD, 14));
        other.setBounds(500, 290, 100 , 30);
        other.setBackground(new Color(222, 254, 227));
        add(other);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(genderSelect1);
        buttonGroup.add(genderSelect2);
        buttonGroup.add(other);

        JLabel DOB= new JLabel(("Date of Birth :"));
        DOB.setFont(new Font("Courier", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200 , 30);
        add( DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Courier", Font.BOLD, 20));
        email.setBounds(100, 390, 200,30);
        add(email);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Courier", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel married = new JLabel("Marital Status :");
        married.setFont(new Font("Courier", Font.BOLD, 20));
        married.setBounds(100, 440, 200,30);
        add(married);

        y = new JRadioButton("Married");
        y.setFont(new Font( "Courier", Font.BOLD, 14));
        y.setBounds(300, 440, 90 , 30);
        y.setBackground(new Color(222, 254, 227));
        add(y);

        n = new JRadioButton("Unmarried");
        n.setFont(new Font( "Courier", Font.BOLD, 14));
        n.setBounds(400, 440, 100 , 30);
        n.setBackground(new Color(222, 254, 227));
        add(n);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(y);
        buttonGroup2.add(n);

        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Courier", Font.BOLD, 20));
        address.setBounds(100, 490, 200,30);
        add(address);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Courier", Font.BOLD, 14));
        textAddress.setBounds(300, 490, 400, 30);
        add(textAddress);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Courier", Font.BOLD, 20));
        city.setBounds(100, 540, 200,30);
        add(city);

        textCity = new JTextField();
        textCity.setFont(new Font("Courier", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add( textCity);

        JLabel pin = new JLabel("Pin Code :");
        pin.setFont(new Font("Courier", Font.BOLD, 20));
        pin.setBounds(100, 590, 200,30);
        add(pin);

        pinCode = new JTextField();
        pinCode.setFont(new Font("Courier", Font.BOLD, 14));
        pinCode.setBounds(300, 590, 400, 30);
        add(pinCode);

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Courier", Font.BOLD, 20));
        state.setBounds(100, 640, 200,30);
        add(state);

        textState = new JTextField();
        textState.setFont(new Font("Courier", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Courier", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.magenta);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 254, 227));
        setLayout(null);
        setSize(850,800);
        setLocation(350, 15);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String formNo = first;
            String name = textName.getText();
            String FatherName = textFather.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

            String gender = null;
            if(genderSelect1.isSelected()){
                gender = "Male";
            } else if(genderSelect2.isSelected()){
                gender = "Female";
            }else if (other.isSelected()) gender ="other";
                String email = textEmail.getText();

            String marital = null;
            if(y.isSelected()) marital ="Married";
            else if(n.isSelected()) marital = "Unmarried";

            String address = textAddress.getText();
            String city = textCity.getText();
            String pin = pinCode.getText();
            String state = textState.getText();

            if(textName.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                con con1 = new con();
                String q = "insert into signup values('"+formNo+"','"+name+"','"+FatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signUp();
    }
}
