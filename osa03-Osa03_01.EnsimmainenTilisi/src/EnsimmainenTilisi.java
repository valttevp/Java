
public class EnsimmainenTilisi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili valtterinTili=new Tili("Valtterin tili", 100.00);
        System.out.println("Alkutilanne");
        System.out.println(valtterinTili);
        valtterinTili.pano(20);
        System.out.println("Lopputilanne");
        System.out.println(valtterinTili);
    }
}