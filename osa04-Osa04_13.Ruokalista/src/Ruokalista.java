
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;
    int i=0;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }
    public void lisaaAteria(String ateria){
        if (!ateriat.contains(ateria)){
            ateriat.add(ateria);
        }
    }
    public void tulostaAteriat(){
        while(i<ateriat.size()){
            System.out.println(ateriat.get(i));
            i++;
        }
    }
    public void tyhjennaRuokalista(){
        ateriat.clear();
    }

    // toteuta tänne tarvittavat metodit
}
