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
public class Status {
    public static void main(String[] args) {
        try {
             Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","root");
            int count=0;
             Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select count(id)as id from emp where id like  '"+'%'+3+'%'+"'");
            if(rs.next()){
                int status=rs.getInt("id");
                count=status+1;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/a","root","root");
                PreparedStatement stmt1=con.prepareStatement("insert into emp values (?,?,?,?)");
              stmt1.setString(1, "3");
              stmt1.setString(2, "ttt");
              stmt1.setString(3, "aaa");
              stmt1.setInt(4,count);
              int i=stmt1.executeUpdate();
              System.out.println("Record inserted " +i);
              con.close();
            
                
            }
            System.out.println("count is " +count);
//              PreparedStatement stmt=con.prepareStatement("insert into emp value(?,?,?,?)");
//              stmt.setString(1, "4");
//              stmt.setString(2, "ttt");
//              stmt.setString(3, "aaa");
//              stmt.setString(4, "1");
//              int i=stmt.executeUpdate();
//              System.out.println("Record inserted " +i);

            con.close();
            
            
        } catch (Exception e) {
            System.out.println("Error" +e);
        }
    }
}
