
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]: ");
        int pisteet = Integer.parseInt(lukija.nextLine());
        if (pisteet < 0){
            System.out.println("Mahdotonta!");
        } else if(pisteet >-1 && pisteet<51){
            System.out.println("Hylätty");
        } else if(pisteet >50 && pisteet<61){
            System.out.println("1");
        } else if(pisteet >60 && pisteet<71){
            System.out.println("2");
        } else if(pisteet >70 && pisteet<81){
            System.out.println("3");
        } else if(pisteet >80 && pisteet<91){
            System.out.println("4");
        } else if(pisteet >90 && pisteet<101){
            System.out.println("5");
        } else if(pisteet>99){
            System.out.println("uskomatonta!");
        }

    }
}
