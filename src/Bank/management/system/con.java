package Bank.management.system;
import java.sql.*;

public class con {
    public Statement statement;
    Connection connection;
    public con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem1", "root", "1234567");
            statement = connection.createStatement();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
