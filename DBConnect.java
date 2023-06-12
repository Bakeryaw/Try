
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {
    
    final static String JdbcDriver = "com.mysql.cj.jdbc.Driver";
    final static String DbUrl = "jdbc:mysql://localhost:3306/admin";
    
    final static String user = "root";
    final static String pass = "";
    
    public static Connection connect(){
    
        try{
            Class.forName(JdbcDriver);
            Connection con = DriverManager.getConnection(DbUrl,user,pass);
            
            return con;
        }
        
        catch(ClassNotFoundException | SQLException ex){
        
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
    }
}
