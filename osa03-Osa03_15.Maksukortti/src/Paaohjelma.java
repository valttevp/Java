
public class Paaohjelma {

    public static void main(String[] args) {
        Maksukortti pekanKortti = new Maksukortti (20);
        Maksukortti matinKortti = new Maksukortti (30);
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
        System.out.println("Pekka: Kortilla on rahaa "+pekanKortti);
        System.out.println("Matti: Kortilla on rahaa "+matinKortti);
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
        System.out.println("Pekka: Kortilla on rahaa "+pekanKortti);
        System.out.println("Matti: Kortilla on rahaa "+matinKortti);
        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
        matinKortti.lataaRahaa(50);
        System.out.println("Pekka: Kortilla on rahaa "+pekanKortti);
        System.out.println("Matti: Kortilla on rahaa "+matinKortti);
        
        
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!

    }
}
