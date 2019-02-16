package service;

import java.util.List;
import swingjdbc.Student;

public interface CommomDAO {
    void save(Student s);
    void update(Student s);
    void delete(int id);
    void deleteById();
    Student getById(int id);
    List<Object> findAll();
}
