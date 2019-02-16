package createTable;

import connection.ConnectionDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTable {
    
    public void createTable(){
        Connection conn =  ConnectionDemo.connect();
        String createTable = "create table students(id int(11) not null  primary key auto_increment,name varchar(50),email varchar(55),address varchar(55))";
        try {
            PreparedStatement ps = conn.prepareStatement(createTable);
            ps.execute();
            System.out.println("Table created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
