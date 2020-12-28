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
                if (Grille_Finale_Facile[i][j]=="B"){ // pourquoi il reconnait pas wesh 
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
    
    //Fonction apparaitre au bout de 4 secondes si il n'a pas été cliqué 
    //Trouver moyen pour qu'il apparaisse plus tot si cliqué 
    public boolean Eteindre_Bouton(){
        //A utiliser pour la partie graphique correspond a cliquer
        //si le bouton est bien eteint on renvoie true 
        boolean Bouton_Eteint; 
        Bouton_Eteint = true; 
        return Bouton_Eteint; 
    }
    
    public boolean Allumer_Bouton(){ //retourne true si un nouveau bouton est allumé 
        boolean bouton_allume=false; 
        if (bouton==true){ //des boutons sont encore présents dans le jeu 
            for (int i=0; i<Grille_Finale_Facile; i++){
                for (int j=0; j<Grille_Finale_Facile; j++){
                while (Grille_Finale[i][j]!= "B"){
                    bouton_allume = false; 
                }
                if (Grille_Finale[i][j]== "B"){
                    bouton_allume = true; 
                }
            }
            }
        }
        return bouton_allume; 
    }
    
    public void Apparition_Bouton(){ //marche pas
        Timer Chrono_Apparition = new Timer(); 
        Chrono_Apparition.schedule(new Apparition_Chrono() , 4000, 4000);         
        //Se repete toutes les 4 secondes 
        //Temps en ms donc correspond a 4s 
    
            
            
    //disparaitre
    //changer de couleur au bout d'un certain temps 
    //changer de place au bout d'un certain temps
    //bouton où on doit cliquer plusieurs fois
}
}