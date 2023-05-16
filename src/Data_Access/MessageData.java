/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_Access;

import model.Message;
import java.util.ArrayList;
import model.Utilisateur;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdelhaq
 */
public class MessageData {

    public static void ajouter(Message msg) {
        String query = "INSERT INTO messages(Message,Expéditeur,Destinataire) values('" + msg.getMessage() + "','" + msg.getExpéditeur().getEmail() + "','" + msg.getDéstinataire().getEmail() + "')";
        DB.setDataOrDelete(query, "");
    }

    public static ArrayList<Message> getMsgs(Utilisateur utilisateur1, Utilisateur utilisateur2) {
        ArrayList<Message> listMsgs = new ArrayList<>();
        System.out.println(utilisateur1.getEmail() + " " + utilisateur2.getEmail());
        try {
            String query = "SELECT * FROM messages WHERE (Expéditeur='" + utilisateur1.getEmail() + "' AND Destinataire='" + utilisateur2.getEmail() + "') OR (Expéditeur='" + utilisateur2.getEmail() + "' AND Destinataire='" + utilisateur1.getEmail() + "');";
            ResultSet rs = DB.getData(query);
            while (rs.next()) {
                Message msg = new Message();
                Utilisateur expéditeur=UtilisateurData.trouver(rs.getString("Expéditeur"));
                Utilisateur destinataire=UtilisateurData.trouver(rs.getString("Destinataire"));
                msg.setId(rs.getInt("id"));
                msg.setMessage(rs.getString("Message"));
                msg.setExpéditeur(expéditeur);
                msg.setDéstinataire(destinataire);
                System.out.println(rs.getInt("id") + " hh " + rs.getString("Message") + " hh " + rs.getString("Expéditeur"));
                listMsgs.add(msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des messages", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return listMsgs;
    }

    public static ArrayList<Message> getConvos(Utilisateur utilisateur) {
        Message msg;
        Utilisateur expéditeur;
        Utilisateur déstinataire;
        ArrayList<Message>listMsgs=new ArrayList<>();
        //String query = "SELECT * FROM messages WHERE Expéditeur='"+utilisateur.getEmail()+"' GROUP BY Expéditeur";
        String query = "SELECT * FROM messages WHERE Expéditeur='"+utilisateur.getEmail()+"' OR Destinataire='"+utilisateur.getEmail()+"' GROUP BY Expéditeur='"+utilisateur.getEmail()+"'OR Destinataire='"+utilisateur.getEmail()+"'";
        try {
            ResultSet rs = DB.getData(query);
            while (rs.next()) {
                msg = new Message();
                int id=rs.getInt("id");
                String message=rs.getString("Message");
                String emailExpéditeur=rs.getString("Expéditeur");
                String emailDéstinataire=rs.getString("Destinataire");
                expéditeur=UtilisateurData.trouver(emailExpéditeur);
                déstinataire=UtilisateurData.trouver(emailDéstinataire);
                msg.setId(id);
                msg.setMessage(message);
                msg.setExpéditeur(expéditeur);
                msg.setDéstinataire(déstinataire);
                listMsgs.add(msg);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return listMsgs;
    }

}
