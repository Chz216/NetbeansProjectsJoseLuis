/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NAMAN
 */
public class Conexion {

    public Connection getConnection() {

        Connection conexion = null;

         try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String serverDb = "jdbc:mysql://localhost:3306/classicmodels";
        String userDb = "root";
        String passwordDb ="";
        conexion = DriverManager.getConnection(serverDb, userDb, passwordDb);
    
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"the Driver was not Found");
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null,"the Driver was" + e.getMessage());
    }finally{
        return conexion;
    }
  }
}
