/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital;

/**
 *
 * @author dany
 */
public class Medicament {
    
    private String nom;
    private int quantite;
    private String unite;
    private String frequencePrise;

    public Medicament(String nom, int quantite, String unite, String frequencePrise) {
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;
        this.frequencePrise = frequencePrise;
    }

    @Override
    public String toString() {
        return nom + " - Quantite: " + quantite + ""+unite + " - Frequence de Prise: " +frequencePrise; 
    }
    
    
    
}
