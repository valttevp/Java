/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtteri
 */
public class Kirjat {
    private String nimi;
    private int sivuja;
    private int kirjoitusVuosi;
    
    public Kirjat(String nimi, int sivuja, int kirjoitusVuosi){
        this.nimi=nimi;
        this.sivuja=sivuja;
        this.kirjoitusVuosi=kirjoitusVuosi;
    }
    public String getNimi(){
        return this.nimi;
    }
    public int getVuosi(){
        return this.kirjoitusVuosi;
    }
    public int getSivuja(){
        return this.sivuja;
    }
    public String toString(){
        return this.nimi + ", "+this.sivuja+ " sivua, " +this.kirjoitusVuosi;
    }
    
}
