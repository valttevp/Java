
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        // Toteuta ohjelmasi tähän.
        while(true){
            System.out.println("Anna salasana: ");
            String sana = lukija.nextLine();
            if(sana.equals(salasana)){
                System.out.println("Oikein!\\cisco on elämä<3");
                break;
            }else{
                System.out.println("Väärin!");
            }
        }
    }
}
