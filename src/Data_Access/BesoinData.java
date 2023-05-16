/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ProduitDemandé;
import model.Utilisateur;

/**
 *
 * @author Abdelhaq
 */
public class BesoinData {
    public static void ajouter(ProduitDemandé produit){
        String query="INSERT INTO besoins_créés(produit,propriétaire) VALUES('"+produit.getProduit()+"','"+produit.getPropriétaire()+"')";
        DB.setDataOrDelete(query, "Produit ajouté avec succès");
    }
    public static ArrayList<ProduitDemandé> getAll(Utilisateur utilisateur){
        ArrayList<ProduitDemandé>listProduits=new ArrayList<>();
        try {
            //ResultSet rs= DB.getData("SELECT * FROM besoins_créés INNER JOIN utilisateurs ON besoins_créés.propriétaire=utilisateurs.id;");
            ResultSet rs= DB.getData("SELECT * FROM besoins_créés WHERE propriétaire='"+utilisateur.getId()+"';");
            while(rs.next()){
                ProduitDemandé produit= new ProduitDemandé();
                produit.setId(rs.getInt("id"));
                produit.setProduit(rs.getString("Produit"));
                produit.setPropriétaire(rs.getInt("Propriétaire"));
                listProduits.add(produit);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listProduits;
    }
    public static void supprimer(int id){
        String query="DELETE FROM besoins_créés WHERE id='"+id+"'";
        DB.setDataOrDelete(query, "supprimé avec succès");
    }
}
