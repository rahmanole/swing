
package connect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
    public static Connection connect(){
        Connection conn = null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "1234");
            System.out.println("::Connected::");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
}
