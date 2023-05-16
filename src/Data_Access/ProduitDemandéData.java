/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Déchet;
import model.ProduitDemandé;

/**
 *
 * @author Abdelhaq
 */
public class ProduitDemandéData {
    public static void ajouter(ProduitDemandé produit){
        String query="INSERT INTO produits_demandés(produit,quantité,date,propriétaire,etat) VALUES('"+produit.getProduit()+"','"+produit.getQuantité()+"','"+produit.getDate()+"','"+produit.getPropriétaire()+"','')";
        DB.setDataOrDelete(query, "Besoin déclaré avec succès veuillez attendre la validation de l'admin");
    }
    public static void modifier(ProduitDemandé produit){
        String query="UPDATE produits_demandés SET produit='"+produit.getProduit()+"',quantité='"+produit.getQuantité()+"',date='"+produit.getDate()+"',propriétaire='"+produit.getPropriétaire()+"',etat='"+produit.getEtat()+"' WHERE id='"+produit.getId()+"'";
        DB.setDataOrDelete(query, "Modifié avec succès");
        
    }
    public static ArrayList<ProduitDemandé> getAll(){
        ArrayList<ProduitDemandé>listProduits=new ArrayList<>();
        try {
            ResultSet rs= DB.getData("SELECT * FROM produits_demandés");
            while(rs.next()){
                ProduitDemandé produit= new ProduitDemandé();
                produit.setId(rs.getInt("id"));
                produit.setProduit(rs.getString("Produit"));
                produit.setPropriétaire(rs.getInt("Propriétaire"));
                produit.setDate(rs.getString("Date"));
                produit.setEtat(rs.getString("etat"));
                produit.setQuantité(rs.getString("quantité"));
                listProduits.add(produit);
           
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listProduits;
    }
    public static void supprimer(int id){
        String query="DELETE FROM produits_demandés WHERE id='"+id+"'";
        DB.setDataOrDelete(query, "supprimé avec succès");
    }
    
}
