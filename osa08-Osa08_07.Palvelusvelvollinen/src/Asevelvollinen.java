/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtteri
 */
public class Asevelvollinen implements Palvelusvelvollinen {
    private int paivia;
    public Asevelvollinen(int paivia){
        this.paivia=paivia;
    }
    public int paiviaJaljella(){
        return this.paivia;
    }
    public void palvele(){
        if(this.paivia>0){
            this.paivia--;
        }
        
    }
    
}
