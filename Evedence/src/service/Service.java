/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.mysql.jdbc.Connection;
import connect.EstablishConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.Student;

/**
 *
 * @author ccsl-pc
 */
public class Service implements CommomDAO {

    @Override
    public void insertData(Student s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String insertData = "insert into studentsForEvdnc(name,age,email,gender,course,round,message) values(?,?,?,?,?,?,?)";

        Connection conn = EstablishConnection.connect();

        try {
            PreparedStatement ps = conn.prepareStatement(insertData);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getGender());
            ps.setString(5, s.getCourses());
            ps.setString(6, s.getRound());
            ps.setString(7, s.getMessage());
            ps.executeUpdate();
            System.out.println("Data inserted Succesfully");
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void updateData(Student s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String updateData = "update studentsForEvdnc set name=?,age=?,email=?,gender=?,courses=?,round=?,message=? where id = ?";
        Connection conn = EstablishConnection.connect();

        try {
            PreparedStatement ps = conn.prepareStatement(updateData);
            ps.setString(1, s.getName());
            ps.setString(2, s.getName());
            ps.setString(3, s.getName());
            ps.setString(4, s.getName());
            ps.setString(5, s.getName());
            ps.setString(6, s.getName());
            ps.setString(7, s.getName());
            ps.executeUpdate();
            System.out.println("data updated successfully");

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteData() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Student s = new Student();
        String searchData = "select * from studentsForEvdnc where id = ?";
        Connection conn = EstablishConnection.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(searchData);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setEmail(rs.getString(4));
                s.setGender(rs.getString(5));
                s.setCourses(rs.getString(6));
                s.setRound(rs.getString(7));
                s.setMessage(rs.getString(8));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s;
    }

    @Override
    public void deleteById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
