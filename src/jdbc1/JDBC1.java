
package jdbc1;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBC1 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
        System.out.println("login succeess");
         System.out.println("Creating database...");
      Statement statement = (Statement) connection.createStatement();
      
      String sql = "CREATE DATABASE STUDENTS";
      statement.executeUpdate(sql);
      System.out.println("Database created successfully...");
      System.out.println("Creating table in given database...");
      statement = (Statement) connection.createStatement();
      
      String table_sql = "CREATE TABLE ADMISSION " +"(id INTEGER not NULL, " +" first VARCHAR(25), " + " last VARCHAR(25), " + " age INTEGER, " +" PRIMARY KEY ( id ))"; 

      statement.executeUpdate(table_sql);
      System.out.println("Table created in database");
      
      System.out.println("Inserting records into the table...");
      statement = (Statement) connection.createStatement();
      
      String insert_sql = "INSERT INTO ADMISSION " +
                   "VALUES (100, 'Zara', 'Ali', 18)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO Registration " +
                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO Registration " +
                   "VALUES (102, 'Zaid', 'Khan', 30)";
      statement.executeUpdate(insert_sql);
      insert_sql = "INSERT INTO Registration " +
                   "VALUES(103, 'Sumit', 'Mittal', 28)";
      statement.executeUpdate(insert_sql);
      System.out.println("Inserted records into the table...");
    }
    
    
}
