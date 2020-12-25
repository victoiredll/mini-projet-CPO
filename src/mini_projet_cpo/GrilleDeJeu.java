/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet_cpo;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author margot
 */
public class GrilleDeJeu {
    //creation des attributs
    //int Taille; 
    Random nbAleat = new Random();
    //boolean Bouton = false; 
    int j; 
    int i; 
    //creation du constructeur 
    //public GrilleDeJeu (int taille){
       // Taille=taille; 
    //}
    
    //creation des methodes 
    
    //on cree les grilles selon le choix et on génère les boutons 


    public String Creer_Grille(Partie Initialiser_Partie){
        //Pour le niveau facile, il faudra cliquer sur 10 boutons 
        //Elle formera une grille de 6 lignes 
         
        if (Initialiser_Partie.Niveau==1){
       String[][] Grille_Actuelle = new String[5][5]; 
       String[][] Grille_Finale = new String [5][5]; 
       for (int i=0; i<12; i++){
           int Ligne_Bouton = nbAleat.nextInt(5);  
           int Colonne_Bouton = nbAleat.nextInt(5); 
           Grille_Actuelle[Ligne_Bouton][Colonne_Bouton]= "Bou"; //Bou car bouton utilisé trop souvent 
        }
       for (int i=0; i<Grille_Actuelle.length; i++){
           j=0; 
           if (Grille_Actuelle[i][j]=="Bou"){
               Grille_Finale[i][j]="B"; 
           }
           else {
               Grille_Finale[i][j]=" ";
           }
           j=1; 
           if (Grille_Actuelle[i][j]=="Bou"){
               Grille_Finale[i][j]="B"; 
           }
           else {
               Grille_Finale[i][j]=" ";
           }
           j=2; 
           if (Grille_Actuelle[i][j]=="Bou"){
               Grille_Finale[i][j]="B";
           }
           else {
               Grille_Finale[i][j]=" ";
           }
           j=3; 
           if (Grille_Actuelle[i][j]=="Bou"){
               Grille_Finale[i][j]="B"; 
           }
           else {
               Grille_Finale[i][j]=" ";
           }
           j=4; 
           if (Grille_Actuelle[i][j]=="Bou"){
               Grille_Finale[i][j]="B";
           }
           else {
               Grille_Finale[i][j]=" ";
           }
           
       } 
       return Grille_Finale[i][j]; 
        } 
    }
    
    public void Creer_Grille_Moyenne(){
        //Pour le niveau moyen il faudra cliquer sur 15 boutons. 
        Cellule[][] Grille_Actuelle = new Cellule [6][6]; 
    }
    public void Creer_Grille_Difficile(){
        //Pour le niveau difficile il faudra cliquer sur 20 boutons 
        Cellule[][] Grille_Actuelle = new Cellule [7][7]; 
    }
    
   


}