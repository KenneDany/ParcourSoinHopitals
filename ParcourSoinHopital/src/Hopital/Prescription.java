/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital;

import Hopital.Actes.Soin;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dany
 */
public class Prescription {
    
    private String nom;
    private Date date;
    ArrayList<Soin> soins;
    ArrayList<Medicament> medicaments;

    public Prescription(String nom, Date date) {
        this.nom = nom;
        this.date = date;
        this.soins = new ArrayList<>();
        this.medicaments = new ArrayList<>();
    }
    
    public void ajouterSoin(Soin soin){
        soins.add(soin);
    }
    
    public void retirerSoin(Soin soin){
        soins.remove(soin);
    }
    
    public void ajouterMedicament(Medicament medicament){
        medicaments.add(medicament);
    }
    
    public void retirerMedicament(Medicament medicament){
        medicaments.remove(medicament);
    }
    
    public void afficherPrescription(){
        System.out.println("Nom: " + nom);
        System.out.println("Date: " + date);
        System.out.println("Soins:");
        for (Soin soin : soins){
            System.out.println(" - " + soin);
        }
        System.out.println("Medicaments:");
        for (Medicament medicament : medicaments){
            System.out.println(" - " + medicament);
        }
    }
}
