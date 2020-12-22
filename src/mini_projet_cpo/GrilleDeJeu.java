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
public class GrilleDeJeu {
    //creation des attributs
    int Taille; 
    
    //creation du constructeur 
    public GrilleDeJeu (int taille){
        Taille=taille; 
    }
    
    //creation des methodes 
    
    public void Initialiser_Grille(Partie bla){
        if (bla.Niveau=="facile"){
            System.out.println ("cest bon"); 
            
        }
    }
}
