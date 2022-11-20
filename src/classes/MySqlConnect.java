/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Acer
 */
public class MySqlConnect {
  Connection conn=null;
public static Connection ConnectDB(){
   try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/students","root","Abhi@123");
//       JOptionPane.showMessageDialog(null,"Connected to Database");
       return conn;
   } 
catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
    return null;        
    }
}
}