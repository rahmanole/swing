/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.PreparedStatement;
import java.util.List;
import swingjdbc.Student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ccsl-pc
 */
public class StudentService implements CommomDAO{

    @Override
    public void save(Student s) {
        Connection conn = null;
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            conn = connection.ConnectionDemo.connect();
            String insertSql = "insert into students(name,email,address) values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insertSql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.execute();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void update(Student s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = connection.ConnectionDemo.connect();
        String updateSql = "update students set name=?,email=?,address=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(updateSql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setInt(4,s.getid());
            ps.executeUpdate();
            System.out.println("Updated successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void delete(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String deleteSql = "delete from students where id = ?";
        Connection conn = connection.ConnectionDemo.connect();
        
        try {
            PreparedStatement ps = conn.prepareStatement(deleteSql);
            ps.setInt(1, id);
            ps.execute();
            System.out.println("Data deleted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void deleteById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn = connection.ConnectionDemo.connect();
        String getSql = "select * from students where id = ?";
        Student s = null;
        String name = "";
        String email = "";
        String address = "";
        
        try {
            PreparedStatement ps = conn.prepareStatement(getSql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                name = rs.getString(2);
                email = rs.getString(3);
                address = rs.getString(4);
            }
            
            s = new Student(name, email, address);
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       return s; 
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
