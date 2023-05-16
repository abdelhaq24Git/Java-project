/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Abdelhaq
 */
public class Utilisateur {
    private int id;
    private String nom;
    private String prénom;
    private String email;
    private String mdp;
    private String rôle;
    private String statut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMdp(){
        return mdp;
    }
    public void setMdp(String mdp){
        this.mdp=mdp;
    }

    public String getRôle() {
        return rôle;
    }

    public void setRôle(String rôle) {
        this.rôle = rôle;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public boolean equals(Object o) {
        Utilisateur utilisateur=(Utilisateur)o;
        if(o==this)
            return true;
        if(!(o instanceof Utilisateur))
            return false;
        return (this.getEmail().equals(utilisateur.getEmail()) && this.getMdp().equals(utilisateur.getMdp()));
        
    }
    
    
}
