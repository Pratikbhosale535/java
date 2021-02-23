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
public class Retrieve {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from emp");
            while(rs.next()){
                System.out.println(rs.getString(1)+" is id ," + rs.getString(2)+" is name , " +rs.getString(3)+ " Location, ");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Erro" +e);
        }
    }
}
