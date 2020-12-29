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
import java.util.TimerTask; 

public class Apparition_Chrono extends TimerTask { //creation de l'action à répeter 
    //probleme d'abstraction 
    Bouton bouton; 
    int time=10; 
    @Override
    public void run(){ //action dans la boucle 
        while (time!=0){ //permet de creer un nombre fini de bouton 
            bouton.Allumer_Bouton_Facile(); 
            time--; 
        }
        
        
    }
    
}
