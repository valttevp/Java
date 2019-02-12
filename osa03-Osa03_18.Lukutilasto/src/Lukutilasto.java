
public class Lukutilasto {
    private int lukujenMaara;
    private int summa=0;

    public Lukutilasto() {
        this.lukujenMaara=0;
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara++;
        this.summa=this.summa +luku;
    }

    public int haeLukujenMaara() {
        return (this.lukujenMaara);
    }

    public int summa() {
        return this.summa;
    }

    public double keskiarvo() {
        double keskiarvo=0;
        if(this.lukujenMaara>0){
            keskiarvo=(double) this.summa/ this.lukujenMaara;
        }
        return keskiarvo;
    }
}