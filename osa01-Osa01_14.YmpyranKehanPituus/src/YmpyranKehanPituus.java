
import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       
        // Toteuta ohjelmasi tähän.
        System.out.println("Anna ympyrän säde: ");
        int sade = Integer.parseInt(lukija.nextLine());
        double vastaus= 1.0*sade*2*Math.PI;
        System.out.println("ympyrän kehä: " +vastaus);
     
    }
}
