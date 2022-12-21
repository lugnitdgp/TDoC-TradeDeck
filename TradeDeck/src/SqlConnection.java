import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SqlConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/User_Information","Admin","chandra123");
        return con;
    }
    
}
