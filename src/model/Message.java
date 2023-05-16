/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Abdelhaq
 */
public class Message {
    int id;
    String message;
    Utilisateur expéditeur;
    Utilisateur déstinataire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Utilisateur getExpéditeur() {
        return expéditeur;
    }

    public void setExpéditeur(Utilisateur expéditeur) {
        this.expéditeur = expéditeur;
    }

    public Utilisateur getDéstinataire() {
        return déstinataire;
    }

    public void setDéstinataire(Utilisateur déstinataire) {
        this.déstinataire = déstinataire;
    }
    
}
