/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdelhaq
 */
public class DB {
    public static void setDataOrDelete(String query, String msg){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaprojet","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            if(!msg.equals("")){
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static ResultSet getData(String query){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaprojet","root","");
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
