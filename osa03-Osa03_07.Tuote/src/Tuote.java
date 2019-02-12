/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtteri
 */
public class Tuote {
    private String nimi;
    private double hinta;
    private int lukuMaara;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.nimi = nimiAlussa;
        this.lukuMaara = maaraAlussa;
        this.hinta = hintaAlussa;     
    }
    public void tulostaTuote(){
        System.out.println(this.nimi);
        System.out.println(this.hinta);
        System.out.println(this.lukuMaara);
        
    }
            
    
}
