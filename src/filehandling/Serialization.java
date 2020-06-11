
package filehandling;

import java.io.*;
public class Serialization 
{
     static Object o[];
    public static void main(String[] args) 
    {
        try
        {
            File f= new File ("code.txt");
            boolean c=f.createNewFile();
            Student s1= new Student (1,"raju","raju123");
            Student s2= new Student (2,"raja","raja123");
            Employee e1= new Employee (1,"ram","ram123");
            Employee e2= new Employee (2,"raj","raj123");
            
            
            
            
                    o=new Object[4];
            o[0]=s1;
            o[1]=s2;
            o[2]=e1;
            o[3]=e2;
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
