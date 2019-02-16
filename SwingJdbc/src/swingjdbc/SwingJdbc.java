
package swingjdbc;

import connection.ConnectionDemo;
import createTable.CreateTable;
import service.CommomDAO;
import service.StudentService;

public class SwingJdbc {
    public static void main(String[] args) {
        CreateTable ct = new CreateTable();
        //ct.createTable();
        Student s = new Student("MInhaz", "abc@gmail.com", "Dhaka");
        CommomDAO service = new StudentService();
        service.save(s);
    }    
}
