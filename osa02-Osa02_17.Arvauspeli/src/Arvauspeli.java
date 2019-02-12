
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int i=0;

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        while (true){
            System.out.println("Arvaa luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if(luku!=7 && luku<=10 && luku>0){
                System.out.println("Ei ollut!");
                i++;
            } else if(luku>10 && luku<1){
                System.out.println("Epäkelpo luku!");
            } else if(luku==7){
                i++;
                break;
            }    
        }
        System.out.println("Oikein! Arvauksia yhteensä: "+i);

    }
}
