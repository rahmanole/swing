
package service;

import student.Student;

public interface CommomDAO {
   public void insertData(Student s);
   public void updateData(Student s);
   public void deleteData();
   public Student getById(int id);
   public void deleteById();
}
