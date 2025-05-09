/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing;

import java.sql.*;
/**
 *
 * @author HP
 */
public class DbCon  {
    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    public ResultSet rs;
    public String query;
    public DbCon()
    {
        try{
          
           con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/billingsys","root","Password@123");  
            st = con.createStatement();
            st = con.prepareStatement(query);
           
        }catch(SQLException e){}
        
    
    }
}
