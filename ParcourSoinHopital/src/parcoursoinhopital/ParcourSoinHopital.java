
package parcoursoinhopital;

import Hopital.Actes.Diagnostic;
import Hopital.Actes.Soin;
import Hopital.Maladie;
import Hopital.Materiel;
import Hopital.Medicament;
import Hopital.Patient;
import Hopital.Prescription;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dany
 */
public class ParcourSoinHopital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instaciation de la classe Diagnostic
        String nomMedecinDiagnostic = "L'etudiant 1 du groupe";
        Date dateDuJour = new Date();
        Diagnostic diagnostic = new Diagnostic(nomMedecinDiagnostic, dateDuJour);
        
        //Ajout de trois maladies 
        Maladie M1 = new Maladie("Grippe", "Virus");
        Maladie M2 = new Maladie("Rhume", "Virus");
        Maladie M3 = new Maladie("Angine", "Baterie");
        diagnostic.ajouterMaladie(M1);
        diagnostic.ajouterMaladie(M2);
        diagnostic.ajouterMaladie(M3);
        
        //Instanciation de la classe soin
        String nomMedecinSoin = "L'etudiant 2 du groupe";
        Soin soin = new Soin(nomMedecinSoin, dateDuJour, "Soin1");
         //ajour de trois materiels 
         Materiel Mat1 = new Materiel("Compresse", 4);
         Materiel Mat2 = new Materiel("Pince", 1);
         Materiel Mat3 = new Materiel("Betadine", 1);
         soin.ajouterMateriel(Mat1);
         soin.ajouterMateriel(Mat2);
         soin.ajouterMateriel(Mat3);
         
         //Retrait d'un materiel de la soin
         soin.retirerMateriel(Mat3);
         
         //Creation de 3 medicaments
         Medicament med1 = new Medicament("Paracetamol", 1000, "mg", "2 fois par jour");
         Medicament med2 = new Medicament("Efferalgan", 500, "mg", "1 fois par jour");
         Medicament med3 = new Medicament("Codex", 20, "mg", "2 fois par jour");
         
         //Instanciation de la classe Prescription
        String nomPrescription = "PRSOO1";
        Prescription prescription = new Prescription(nomPrescription, dateDuJour);
        //ajout du soin et des 3 medicaments a la prescription
        prescription.ajouterSoin(soin);
        prescription.ajouterMedicament(med1);
        prescription.ajouterMedicament(med2);
        prescription.ajouterMedicament(med3);
        
        //Retrait d'un medicament de la classe prescription
        prescription.retirerMedicament(med1);
        
        //parametres du patient entre au clavier
        Scanner sc = new Scanner(System.in);
        //On demande a l'utilisateur d'entrer les parametres du patient
        System.out.println("Entrez le nom du patient");
        String nomPatient = sc.nextLine();
        System.out.println("Entrez le prenom du patient");
        String prenomPatient = sc.nextLine();
        System.out.println("Entrez le sexe du patient");
        String sexePatient  = sc.nextLine();
        sc.close();
        
        //Instantiation de la classe patient
        Patient patient = new Patient(nomPatient, prenomPatient, sexePatient);
        //Ajout de la prescription et du diagnostic au patient
        patient.setPrescription(prescription);
        patient.setDiagnostic(diagnostic);
        System.out.println("**********************************************");
        //Afficher information du patient
        System.out.println("Information du patient:");
        System.out.println("Nom: " + nomPatient);
        System.out.println("prennom: " + prenomPatient);
        System.out.println("Sexe: " + sexePatient);
        System.out.println("**********************************************");
        
        //Appel des methodes pour afficher les informations
        System.out.println("Diagnostic du patient");
        patient.afficherDiagnostic();
        System.out.println("**********************************************");
        System.out.println("Soins du patient");
        patient.afficherSoin();
        soin.afficherMateriel();
        System.out.println("**********************************************");
        System.out.println("Medicament du patient");
        patient.afficherMedicaments();
        System.out.println("***********************************************");
        
        System.out.println("***********By Kenne Njamen Dany*****************");
        
    }
    
}
