/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valtteri
 */
import java.util.ArrayList;

public class Puhelinmuistio {

    private ArrayList<Henkilo> muistio;

    public Puhelinmuistio() {
        this.muistio = new ArrayList();
    }

    public void lisaa(String nimi, String numero) {
        muistio.add(new Henkilo(nimi, numero));
    }

    public void tulostaKaikki() {
        int i = 0;
        while (i < muistio.size()) {
            Henkilo ssd = muistio.get(i);
            System.out.println(ssd);
            i++;
        }
    }

    public String haeNumero(String nimi) {
        int i = 0;
        while (i < muistio.size()) {
            Henkilo henkilo = muistio.get(i);
            String qwe = henkilo.haeNimi();
            if (qwe.equals(nimi)) {
                return henkilo.haeNumero();
            }
            i++;
        }
        return "numeroa ei tiedossa";
    }
}
