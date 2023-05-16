/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import java.util.ArrayList;
import model.Déchet;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdelhaq
 */
public class DéchetData {
    public static void ajouter(Déchet déchet){
        String query="INSERT INTO déchets(Produit,Propriétaire,Date) VALUES('"+déchet.getProduit()+"','"+déchet.getProprétaire()+"','"+déchet.getDate()+"')";
        DB.setDataOrDelete(query, "Déchet ajouté avec succès");
    }
    public static ArrayList<Déchet> getAll(){
        ArrayList<Déchet>listDéchets=new ArrayList<>();
        try {
            ResultSet rs= DB.getData("SELECT * FROM déchets INNER JOIN utilisateurs ON déchets.Propriétaire=utilisateurs.id;");
            while(rs.next()){
                Déchet déchet= new Déchet();
                déchet.setId(rs.getInt("id"));
                déchet.setProduit(rs.getString("Produit"));
                déchet.setProprétaire(rs.getInt("Propriétaire"));
                déchet.setDate(rs.getString("Date"));
                listDéchets.add(déchet);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listDéchets;
    }
    public static void supprimer(int id){
        String query="DELETE FROM déchets WHERE id='"+id+"'";
        DB.setDataOrDelete(query, "supprimé avec succès");
    }
    
}
