/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital;

/**
 *
 * @author dany
 */
public class Materiel {
    
    public String nomMateriel;
    public int quantite;

    public Materiel(String nomMateriel, int quantite) {
        this.nomMateriel = nomMateriel;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return nomMateriel + " - Quantite" + quantite;
    }
    
    
}
