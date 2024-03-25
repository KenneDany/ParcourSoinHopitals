/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital.Actes;

import java.util.Date;

/**
 *
 * @author dany
 */
public class Acte {
    
    private String medecin;
    Date date;
    
    public Acte(String medecin, Date date){
        this.medecin = medecin;
        this.date = date;
    }

    public String getNomMedecin() {
        return medecin;
    }
    
    
    
}
