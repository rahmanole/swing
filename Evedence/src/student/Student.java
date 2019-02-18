/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ccsl-pc
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String gender;
    private String courses;
    private String round;
    private String message;
    
    public Student() {
    }

    public Student(String name, int age, String email, String gender, String courses, String round, String message) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.courses = courses;
        this.round = round;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getCourses() {
        return courses;
    }

    public String getRound() {
        return round;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
