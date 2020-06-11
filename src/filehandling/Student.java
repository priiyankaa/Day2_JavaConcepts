
package filehandling;

import java.io.Serializable;


public class Student implements Serializable
{
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String tostring()
    {
        return id + " " +name + " "+ password;
    }
    Student (int id,String name,String password)
    {
        this.id=id;
        this.name=name;
        this.password=password;
    }

}
