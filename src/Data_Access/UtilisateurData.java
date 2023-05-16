/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;
import model.Utilisateur;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdelhaq
 */
public class UtilisateurData {
    public static void ajouter(Utilisateur utilisateur){
        String query="insert into utilisateurs(Nom,Prénom,Email,MotDePasse,Rôle,Statut) values('"+utilisateur.getNom()+"','"+utilisateur.getPrénom()+"','"+utilisateur.getEmail()+"','"+utilisateur.getMdp()+"','"+utilisateur.getRôle()+"','"+utilisateur.getStatut()+"')";
        DB.setDataOrDelete(query, "Ajouté avec succès Attendez l'admin pour qu'il rend le compte actif");
    }
    public static Utilisateur login(String email, String mdp){
        Utilisateur utilisateur=null;
        String query="SELECT * FROM utilisateurs WHERE email='"+email+"'and MotDePasse='"+mdp+"'";
        try {
            ResultSet rs=DB.getData(query);
            while(rs.next()){
                utilisateur= new Utilisateur();
                utilisateur.setStatut(rs.getString("Statut"));
                utilisateur.setEmail(rs.getString("Email"));
                utilisateur.setRôle(rs.getString("Rôle"));
                utilisateur.setMdp(rs.getString("MotDePasse"));
                utilisateur.setId(rs.getInt("id"));
                utilisateur.setNom(rs.getString("Nom"));
                utilisateur.setPrénom(rs.getString("Prénom"));
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return utilisateur;
        
    }
    public static Utilisateur trouver(int id){
        Utilisateur utilisateur=new Utilisateur();
        String query="SELECT * FROM utilisateurs WHERE id='"+id+"'";
        try {
            ResultSet rs=DB.getData(query);
            while(rs.next()){
                String nom=rs.getString("Nom");
                String prénom=rs.getString("Prénom");
                String email=rs.getString("Email");
                String mdp=rs.getString("MotDePasse");
                String role=rs.getString("Rôle");
                String statut=rs.getString("Statut");
                utilisateur.setId(id);
                utilisateur.setNom(nom);
                utilisateur.setPrénom(prénom);
                utilisateur.setEmail(email);
                utilisateur.setMdp(mdp);
                utilisateur.setRôle(role);
                utilisateur.setStatut(statut);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche de l'utilisateur","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        return utilisateur;
    }
    public static Utilisateur trouver(String email){
        Utilisateur utilisateur=new Utilisateur();
        String query="SELECT * FROM utilisateurs WHERE Email='"+email+"'";
        try {
            ResultSet rs=DB.getData(query);
            while(rs.next()){
                int id=rs.getInt("id");
                String nom=rs.getString("Nom");
                String prénom=rs.getString("Prénom");
                String mdp=rs.getString("MotDePasse");
                String role=rs.getString("Rôle");
                String statut=rs.getString("Statut");
                utilisateur.setId(id);
                utilisateur.setNom(nom);
                utilisateur.setPrénom(prénom);
                utilisateur.setEmail(email);
                utilisateur.setMdp(mdp);
                utilisateur.setRôle(role);
                utilisateur.setStatut(statut);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la recherche de l'utilisateur","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        return utilisateur;
    }
    public static ArrayList<Utilisateur> getAll(){
        ArrayList<Utilisateur> users=new ArrayList<>();
        String query="SELECT * FROM utilisateurs WHERE Rôle='Responsable  restaurant' OR Rôle='Responsable point de vente'";
        try {
            ResultSet rs=DB.getData(query);
            while(rs.next()){
                Utilisateur user=new Utilisateur();
                user.setId(rs.getInt("id"));
                user.setNom(rs.getString("Nom"));
                user.setPrénom(rs.getString("Prénom"));
                user.setEmail(rs.getString("Email"));
                user.setMdp(rs.getString("MotDePasse"));
                user.setRôle(rs.getString("Rôle"));
                user.setStatut(rs.getString("Statut"));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    public static void modifier(Utilisateur u){
        String query="UPDATE utilisateurs SET Nom='"+u.getNom()+"',Prénom='"+u.getPrénom()+"',Email='"+u.getEmail()+"',MotDePasse='"+u.getMdp()+"',Rôle='"+u.getRôle()+"',Statut='"+u.getStatut()+"' WHERE id='"+u.getId()+"'";
        DB.setDataOrDelete(query, "Modifié avec succès");
    }
    public static void supprimer(Utilisateur utilisateur){
        String query="DELETE FROM utilisateurs WHERE id='"+utilisateur.getId()+"'";
        DB.setDataOrDelete(query, "Supprimé avec succès");
    }
    
}
