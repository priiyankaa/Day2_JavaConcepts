/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;
import java.util.*;
public class set 
{
    public static void main(String[] args) 
    {
        HashSet<String> h1= new HashSet<String>();
        h1.add("Ekta");
        h1.add("Nidaan");
        h1.add("kiran");
        h1.add("pooja");
        h1.add("radha");
        System.out.println(h1);
        
        TreeSet<String> t1= new TreeSet<String>();
        t1.add("Ekta");
        t1.add("Nidaan");
        t1.add("kiran");
        t1.add("pooja");
        t1.add("radha");
        System.out.println(t1.subSet("Ekta", "kiran"));
        
        
        
        
    }
    
}
