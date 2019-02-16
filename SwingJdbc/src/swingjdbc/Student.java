package swingjdbc;

public class Student {
    private String name;
    private String email;
    private String address;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Student(){
        
    }
    
    public Student(String name,String email,String address){
        this.name = name;
        this.email = email;
        this.address = address;
    }
    
    public Student(String name,String email,String address,int id){
        this.name = name;
        this.email = email;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
    
    public int getid() {
        return id;
    }
}
