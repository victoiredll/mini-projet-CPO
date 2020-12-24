/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet_cpo;

/**
 *
 * @author margot
 */
public class GrilleDeJeu {
    //creation des attributs
    int Taille; 
    
    
    //creation du constructeur 
    //public GrilleDeJeu (int taille){
       // Taille=taille; 
    //}
    
    //creation des methodes 
    public void Creer_Grille_Facile(){
       Cellule[][] Grille_Actuelle = new Cellule[5][5]; 
    }
    public void Creer_Grille_Moyenne(){
        Cellule[][] Grille_Actuelle = new Cellule [6][6]; 
    }
    public void Creer_Grille_Difficile(){
        Cellule[][] Grille_Actuelle = new Cellule [7][7]; 
    }
}
