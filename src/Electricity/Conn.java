package Electricity;

import java.sql.*;  

public class Conn{
    Connection c=null;
    Statement s=null;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","root");
            s =c.createStatement();  
            
           
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}  