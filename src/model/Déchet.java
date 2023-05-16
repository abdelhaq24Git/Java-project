/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Abdelhaq
 */
public class Déchet {
    private int id;
    private String date;
    private String produit;
    private int proprétaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getProprétaire() {
        return proprétaire;
    }

    public void setProprétaire(int proprétaire) {
        this.proprétaire = proprétaire;
    }
    
}
