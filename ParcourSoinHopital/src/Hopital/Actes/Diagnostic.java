/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital.Actes;

import Hopital.Maladie;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dany
 */
public class Diagnostic extends Acte {
    
    private ArrayList<Maladie> maladies;

    public Diagnostic(String medecin, Date date) {
        super(medecin, date);
        maladies = new ArrayList<>();
    }
    
    public void ajouterMaladie(Maladie maladie){
        maladies.add(maladie);
    }
   
    public void retirerMaladie(Maladie maladie){
        maladies.remove(maladie);
    }
   
    public void afficherDiagnostic(){
        System.out.println("Medecin: " + getNomMedecin());
        System.out.println("Date: " + date);
        System.out.println("Maladies diagnostiquees: ");
        for (Maladie maladie : maladies){
            System.out.println(" - " + maladie);
        }
    }
    
}
