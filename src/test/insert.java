/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class insert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","root");
//            Statement stmt=con.createStatement();
//            Resultset rs=stmt.executeQuery("")
              PreparedStatement stmt=con.prepareStatement("insert into emp values (?,?,?)");
              stmt.setString(1, "4");
              stmt.setString(2, "ttt");
              stmt.setString(3, "aaa");
              int i=stmt.executeUpdate();
              System.out.println("Record inserted " +i);
              con.close();
        } catch (Exception e) {
            System.out.println("Erro" +e);
        }
    }
}
