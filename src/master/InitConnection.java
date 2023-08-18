/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master;

import java.sql.Connection;
import java.sql.DriverManager;

public class InitConnection {
    public static Connection initConn()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver DOne");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
