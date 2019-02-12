
import java.util.Scanner;

public class KelvollistenLukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int i = 0;
        while (true){
            System.out.println("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku>=-140 && luku<=20){
                i++;
            }else if (luku<=-141 && luku>=21){
                System.out.println("Kelvoton luku");
            }else if(luku==9999){
                break;
            }                              
        }
        System.out.println("Kelvollisia lukuja yhteensä " +i);  
    }
}

