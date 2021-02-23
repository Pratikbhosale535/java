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
public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","root");

              PreparedStatement stmt=con.prepareStatement("update emp set name=? where id=?");
              stmt.setString(1, "abc");
              stmt.setString(2, "1");
              int i=stmt.executeUpdate();
              System.out.println("Record Updated  " +i);
              con.close();
        } catch (Exception e) {
            System.out.println("Erro" +e);
        }
    }
}
