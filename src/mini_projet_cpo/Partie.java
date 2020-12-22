/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet_cpo;

/**
 *
 * @author margo
 */
import java.util.Scanner;
public class Partie {
    //creation des attributs 
    
    Joueur Joueur_Actuel; 
    GrilleDeJeu Grille_Actuelle;
    
    public void Initialiser_Partie() {
        //il faudra vider la grille avant de commencer une nouvelle partie 
        Scanner sc= new Scanner(System.in); 
        System.out.println("Choix du pseudo du joueur: ");
        Joueur Joueur_Actuel = new Joueur(sc.nextLine()); 
    
}
    
}
