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
import java.util.Timer; 
import java.util.TimerTask; 

public class Partie {
    //creation des attributs 
    
    Joueur Joueur_Actuel; 
    GrilleDeJeu Grille_Actuelle = new GrilleDeJeu(); 
    int Niveau; 
    Partie Partie_Actuelle; 
            
    public void Initialiser_Partie() {
        //il faudra vider la grille avant de commencer une nouvelle partie 
        Scanner sc= new Scanner(System.in); 
        System.out.println("Choix du pseudo du joueur: ");
        Joueur Joueur_Courant = new Joueur(sc.nextLine()); 
        Joueur_Actuel=Joueur_Courant; 
        
        //choix du niveau 
        Scanner sc2 = new Scanner(System.in); 
        System.out.println("Choix du niveau (facile 1, moyen 2 ou difficile 3): "); 
        int Choix_Niveau = sc2.nextInt( );
        Niveau= Choix_Niveau; 
        
        //On initialise suivant le niveau directement dans cette fonction 
        //les boutons sont generes aleatoirement dans les fonctions 
        if (Niveau==1){
            Grille_Actuelle.Creer_Grille_Facile(); 
        }
        if (Niveau==2){
            Grille_Actuelle.Creer_Grille_Moyenne(); 
        }
        if (Niveau==3){
            Grille_Actuelle.Creer_Grille_Difficile(); 
        }
        if ((Niveau!=1)&&(Niveau!=2)&&(Niveau!=3)) {
            System.out.println ("Erreur, veuillez rentrer un chiffre valide. "); 
        }
        
        
    }
  public void Debuter_Partie(){
      Initialiser_Partie(); 
      Demarrer_Chrono(); 
  }
  
  public void Demarrer_Chrono(){ //on fait un chrono ? 
      int heure=0; 
      int minute=0;
      int seconde=0; 
      int reccord; 
      Timer Chronometre = new Timer(); 
      Chronometre.schedule(new TimerTask(){
          
      }, heure, reccord);
      
      
  }  
}
    

