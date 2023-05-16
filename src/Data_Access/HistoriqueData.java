/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Déchet;

/**
 *
 * @author Abdelhaq
 */
public class HistoriqueData {
    public static void ajouter(String produit, String date){
        String query="INSERT INTO historique_restaurant(Produit,Date) VALUES('"+produit+"','"+date+"')";
        DB.setDataOrDelete(query, "");
    }
    public static ArrayList<Déchet> getAll(){
        ArrayList<Déchet>listDéchets=new ArrayList<>();
        try {
            ResultSet rs= DB.getData("SELECT * FROM historique_restaurant");
            while(rs.next()){
                Déchet déchet= new Déchet();
                déchet.setId(rs.getInt("id"));
                déchet.setProduit(rs.getString("Produit"));
                déchet.setDate(rs.getString("Date"));
                listDéchets.add(déchet);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listDéchets;
    }
}
