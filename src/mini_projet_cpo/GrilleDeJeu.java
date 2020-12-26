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
//pareil pour niveau 2
        if (Initialiser_Partie.Niveau==2){
            String[][] Grille_Actuelle = new String[6][6]; 
            String[][] Grille_Finale = new String [6][6]; 
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
                j = 5;
                if (Grille_Actuelle[i][j] == "Bou"){
                    Grille_Finale[i][j]=="B"; //je comprends pas l'erreur la
                }
                else{ 
                    Gille_Finale[i][j]==" ";
                }
           
       } 
        return Grille_Finale[i][j]; 
        } 
            //meme processus pour niveau 3
            if (Initialiser_Partie.Niveau==3){
            String[][] Grille_Actuelle = new String[7][7]; 
            String[][] Grille_Finale = new String [7][7]; 
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
            
           j = 5;
                if (Grille_Actuelle[i][j] == "Bou"){
                    Grille_Finale[i][j]=="B"; //je comprends pas l'erreur la
                }
                else{ 
                    Gille_Finale[i][j]==" ";
                }
            j = 6;
                if (Grille_Actuelle[i][j] == "Bou"){
                    Grille_Finale[i][j]=="B"; //je comprends pas l'erreur la
                }
                else{ 
                    Gille_Finale[i][j]==" ";
                }
       } 
       return Grille_Finale[i][j]; 
        } 
       
    }
  //Creer fonction afficher grille 
}