
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

   

    Kassapaate() {
        rahaa=1000.0;
    }

    public double syoEdullisesti(double maksu) {
        if (maksu >= 2.50) {
            rahaa += 2.50;
            edulliset++;
            return maksu - 2.50;
        } else {
            return maksu;
        }

    }
    // edullinen lounas maksaa 2.50 euroa.
    // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
    // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan

    public double syoMaukkaasti(double maksu) {
        if (maksu >= 4.30) {
            rahaa += 4.30;
            maukkaat++;
            return maksu - 4.30;
        } else {
            return maksu;
        }
        // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.saldo() >= 2.50) {
            kortti.otaRahaa(2.50);
            edulliset++;
            return true;
        } else {
            return false;
        }
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.saldo() >= 4.30) {
            kortti.otaRahaa(4.30);
            maukkaat++;
            return true;
        } else {
            return false;
        }
    }
    public void lataaRahaaKortille(Maksukortti kortti, double summa){
        if(summa>0){
            kortti.lataaRahaa(summa);
            rahaa+=summa;
        }
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }

}
