
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String luettu = lukija.nextLine();
        int i = 0;
        
        while(i<luettu.length()){
            System.out.println((i+1)+". kirjain:" +luettu.charAt(i));
            i++;
        }
        
    }
}
