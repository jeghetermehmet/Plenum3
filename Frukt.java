public class Frukt extends Matvare {
    Frukt(double pris, int sunnhetsgrad, String navn){
        super(pris, sunnhetsgrad, navn);
    }
    @Override
    double beregnFullPris(){
        return pris;
    }
    boolean erNokkelhullsmerket(){
        return true;
    }
    
}
