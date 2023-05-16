/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import model.ProduitDemandé;
import model.PtVente;
import model.Utilisateur;

/**
 *
 * @author Abdelhaq
 */
public class PtVenteData {

    public static ArrayList<String> trouverDéchets(Utilisateur utilisateur) {
        ArrayList<String> déchets = new ArrayList<>();
        try {
            String query = "SELECT * FROM déchets WHERE Propriétaire='" + utilisateur.getId() + "'";
            ResultSet rs = DB.getData(query);
            while (rs.next()) {
                déchets.add(rs.getString("Produit"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return déchets;
    }

    public static ArrayList<PtVente> getALl(Utilisateur utilisateur) {
        ArrayList<String> déchets = trouverDéchets(utilisateur);
        ArrayList<PtVente> listPoints = new ArrayList<>();
        try {
            //String query = "SELECT * FROM utilisateurs INNER JOIN produits_demandés ON utilisateurs.id=produits_demandés.propriétaire WHERE etat='validé';";
            String query = "SELECT *, GROUP_CONCAT(produit SEPARATOR ',') as list_produits FROM (utilisateurs INNER JOIN produits_demandés ON utilisateurs.id=produits_demandés.propriétaire) group by Nom;";
            ResultSet rs = DB.getData(query);
            while (rs.next()) {
                PtVente pt = new PtVente();
                Utilisateur u = new Utilisateur();
                ProduitDemandé p = new ProduitDemandé();
                u.setId(rs.getInt("propriétaire"));
                u.setNom(rs.getString("Nom"));
                u.setPrénom(rs.getString("Prénom"));
                p.setDate(rs.getString("date"));
                pt.setResponsable(u);
                pt.setProduit(p);
                System.out.println(déchets.toString());
                for (String element : déchets) {
                    if (rs.getString("list_produits").contains(element)) {
                        pt.besoins.add(rs.getString("list_produits"));
                        listPoints.add(pt);
                    }

                }
//                pt.besoins.add(rs.getString("list_produits"));
//                listPoints.add(pt);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'obtention des enregistrements des points de ventes", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listPoints;
    }

}
