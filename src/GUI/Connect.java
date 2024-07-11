/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.HeadlessException;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author S Siva Arunachalam
 */
public class Connect {
   
        public static Connection ConnectDB(){
            
          //String dbURL = "jdbc:ucanaccess://C:/Users/jude/Documents/NetBeansProjects/School Management System Code/Student.accdb";
        try{
            //Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            //Connection con = DriverManager.getConnection(dbURL); 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventdb","root","");
            //JOptionPane.showMessageDialog(null,"Connected");
            return con;
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }      
    }
}