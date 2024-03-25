/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hopital;

/**
 *
 * @author dany
 */
public class Maladie {
    
    private String nomMaladie, cause;
    
    public Maladie(String nomMaladie, String cause){
        this.nomMaladie = nomMaladie;
        this.cause = cause;
    }

    @Override
    public String toString() {
        return nomMaladie + " (Cause: " + cause + ")"; 
    }

    
    
}
