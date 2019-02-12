/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtteri
 */
public class Maksukortti {
    private double saldo;
    
    public Maksukortti(double alkuSaldo){
        this.saldo=alkuSaldo;
    }
    public String toString(){
        return "Kortilla on rahaa "+saldo+" euroa";
    }

    public static void main(String[] args) {
        Maksukortti kortti = new Maksukortti(50);
        System.out.println(kortti);
    }

    public void syoEdullisesti() {
        if (this.saldo >= 2.60) {
            this.saldo = saldo - 2.60;
        } else {
            this.saldo = this.saldo;
        }
    }

    public void syoMaukkaasti() {
        if (this.saldo >= 4.60) {
            this.saldo = saldo - 4.60;
        } else {
            this.saldo = this.saldo;
        }
    }

    public void lataaRahaa(double rahamaara) {
        this.saldo = this.saldo + rahamaara;
        if (this.saldo >= 150.0) {
            this.saldo = 150.0;
        }else if(rahamaara<0){
            this.saldo=this.saldo-rahamaara;
        }
    }

}

