
import java.util.Scanner;

public class PositiivisenLuvunLisaaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        int summa = Integer.parseInt(lukija.nextLine());
        System.out.println(" ");
        int luettu = Integer.parseInt(lukija.nextLine());
        if (luettu > 0) {
            summa += luettu;
            System.out.println("Summa: " + summa);
        }else if(luettu <0){
            System.out.println("Summa: "+ summa);
        }
    }
}
