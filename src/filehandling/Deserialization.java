
package filehandling;
import static filehandling.Serialization.o;
import java.io.*;

public class Deserialization implements Serializable
{
    public static void main(String[] args) 
    {
        try
        {
           File f= new File ("code.txt");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(fin);
            Object readObject []= (Object[]) oin.readObject();
            for (Object d :readObject)
            {
                if(d instanceof Student)
                {
                    Student s = (Student)d;
                    Student p = (Student)oin.readObject();
                    p.getId();
                    p.getName();
                    p.getPassword();
                }  
                else
                {
                    Employee e= (Employee)d;
                    Employee l=(Employee)oin.readObject();
                    l.getId();
                    l.getName();
                    l.getPassword();
                }
            }
        }
        catch(IOException | ClassNotFoundException p)
        {
            System.out.println(p);
        }
        
    }
    
}
