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
import java.util.Timer; 
import java.util.TimerTask; 

public class Bouton {
    //creation des attributs du bouton 
    String Couleur; 
    boolean bouton; 
    
    //creation du constructeur 
    public Bouton (String couleur, boolean bouton1){ //normalement le constructeur cree des instances 
        Couleur=couleur; 
        bouton = bouton1; //on instancie l'objet 
    }
    
    //creation des methodes 
    //Fonction présence du bouton 
    public boolean Presence_Bouton_Facile(GrilleDeJeu Creer_Grille_Facile){ //Verification de la présence du bouton
      String Grille2 = GrilleDeJeu.Creer_Grille_Facile();  //recup une variable retournee 
        for (int i=0; i<6; i++ ){
            for (int j=0; j<6; j++){
                if (Grille_Finale_Facile[i][j]=="B"){ // pourqioi il reconnait pas wesh 
                    bouton=true; 
                }
                else{
                    bouton=false; 
                }
            }
        }
            
        return bouton;   //comment recup cette variable   
    }
    
    //Fonction faire apparaitre nouveau bouton 
    public void Apparaitre_Bouton(){
        
    }
    //Fonction apparaitre au bout de 4 secondes si il n'a pas été cliqué 
    //Trouver moyen pour qu'il apparaisse plus tot si cliqué 
    
    //public void Apparition_Temps(){
        Timer ChronoApparition = new Timer(); 
        int time = 40; //faire i-- pour que le jeu s'arrete au bout de 40 secondes 
            while (time!=0){
        //ChronoApparition.schedule(new TimerTask(){
            
            //Apparaitre_Bouton(); 
            //i--; 
            //}, 4000, 4000); //En ms donc correspond a 4s, recommence toutes les 4 secondes 
            //} 
    
    //Timer ChronoApparition = new Timer(); 
    
    
    
            
            
    //disparaitre
    //changer de couleur au bout d'un certain temps 
    //changer de place au bout d'un certain temps
    //bouton où on doit cliquer plusieurs fois
}