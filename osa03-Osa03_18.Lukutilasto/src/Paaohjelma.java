
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto1 = new Lukutilasto();
        Lukutilasto tilasto2 = new Lukutilasto();
        Lukutilasto tilasto3 = new Lukutilasto();

        System.out.println("Anna lukuja: ");
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku != (-1)) {
                tilasto1.lisaaLuku(luku);
                if (luku % 2 == 0) {
                    tilasto2.lisaaLuku(luku);
                } else if (luku % 2 == 1) {
                    tilasto3.lisaaLuku(luku);
                }
            } else {
                System.out.println("Summa: " + tilasto1.summa());
                System.out.println("Parillisten summa: " + tilasto2.summa());
                System.out.println("Parittomien summa: " + tilasto3.summa());
                break;
            }
        }
    }

    // voit tehdä testikoodia tänne
    // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi
    // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
    //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
    //  ja viimeisenä parittomien summan laskeva olio)!
}
