package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDemo {

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "1234");
            System.out.println("::Connected::");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
