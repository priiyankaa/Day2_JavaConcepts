
package javacollection;
import java.util.*;

public class Arraylist 
{
    public static void main(String[] args) 
    {
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("initial size of a1 is " + a1.size());
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        System.out.println("size of a1 after addition is " + a1.size());
        a1.remove("A");
        a1.remove(3);
        System.out.println("a1 has following items" + a1);
        
    }
    
    
  
    
}
