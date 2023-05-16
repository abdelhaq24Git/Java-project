/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Abdelhaq
 */
public class PtVente {
    private Utilisateur Responsable;
    private ProduitDemandé produit;
    public ArrayList<String> besoins=new ArrayList<>();

    public Utilisateur getResponsable() {
        return Responsable;
    }

    public void setResponsable(Utilisateur Responsable) {
        this.Responsable = Responsable;
    }

    

    public ProduitDemandé getProduit() {
        return produit;
    }

    public void setProduit(ProduitDemandé produit) {
        this.produit = produit;
    }
    
}
