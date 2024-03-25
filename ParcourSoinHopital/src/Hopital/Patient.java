/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital;

import Hopital.Actes.Diagnostic;
import Hopital.Actes.Soin;

/**
 *
 * @author dany
 */
public class Patient {
    
    private String nom, prenom;
    private String sexe;
    private Prescription prescription;
    private Diagnostic diagnostic;

    public Patient(String nom, String prenom, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
    }
    
    public void setPrescription(Prescription prescription){
        this.prescription = prescription;
    }
    
    public void setDiagnostic(Diagnostic diagnostic){
        this.diagnostic = diagnostic;
    }
    
    public void afficherSoin(){
        System.out.println("Nombre de soins: " + prescription.soins.size());
        System.out.println("listes des soins: ");
        for (Soin soin : prescription.soins){
            System.out.println("- " + soin);
        }
    }
    
    public void afficherDiagnostic(){
        diagnostic.afficherDiagnostic();
    }
    
    public void afficherMedicaments(){
        System.out.println("Nombre de medicaments: " + prescription.medicaments.size());
        System.out.println("Listes des medicaments: ");
        for (Medicament medicament : prescription.medicaments){
            System.out.println("-" + medicament);
        }
    }
    
}
