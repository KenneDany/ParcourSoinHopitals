/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital.Actes;

import Hopital.Materiel;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dany
 */
public class Soin extends Acte{
    
    private String nom;
    private ArrayList<Materiel> materiels;
    
    public Soin(String medecin, Date date, String nom) {
        super(medecin, date);
        materiels = new ArrayList<>();
        this.nom = nom;
    }
    
    public void ajouterMateriel(Materiel materiel){
        materiels.add(materiel);
    }
    
    public void retirerMateriel(Materiel materiel){
        materiels.remove(materiel);
    }
    
    public void afficherMateriel(){
         System.out.println("Liste de matériels pour le soin '" + nom + "':");
        for (Materiel materiel : materiels) {
            System.out.println("- " + materiel.nomMateriel + " (Quantité: " + materiel.quantite + ")");
        }
    }
    
    
    
}
