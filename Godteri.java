public class Godteri extends Matvare {
    int phVerdi;
    double mva = 0.2;
    Godteri(double pris, int sunnhetsgrad, String navn, int phVerdi){
        super(pris, sunnhetsgrad, navn);
        this.phVerdi =phVerdi;

    }
    //Overloader konstruktøren
    Godteri(double pris, int sunnhetsgrad, String navn){
        this(pris, sunnhetsgrad, navn, -1);
    }

    @Override
    double beregnFullPris(){
        return pris += pris * mva;
    }
    @Override
    boolean erNokkelhullsmerket(){
        return  sunnhetsgrad >= 9 && sunnhetsgrad > 10; 
    }
}
