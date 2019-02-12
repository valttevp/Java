
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirjat> kirjaLista = new ArrayList<>();
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.parseInt(lukija.nextLine());
            System.out.print("Kirjoutusvuosi: ");
            int kirjoitusVuosi = Integer.parseInt(lukija.nextLine());
            Kirjat k = new Kirjat(nimi, sivuja, kirjoitusVuosi);
            kirjaLista.add(k);
        }
        System.out.println("Mitä tulostetaan? ");
        String tulostus = lukija.nextLine();
        if (tulostus.equals("kaikki")) {
            for (int i = 0; i < kirjaLista.size(); i++) {
                System.out.println(kirjaLista.get(i));
            }
        } else if (tulostus.equals("nimi")) {
            for (int i = 0; i < kirjaLista.size(); i++) {
                System.out.println(kirjaLista.get(i).getNimi());
            }

            // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
            // kirjoja sekä tarkastella niitä
        }
    }
}
