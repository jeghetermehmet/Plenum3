public abstract class Matvare extends Vare {
    int sunnhetsgrad;
    String navn;
    double mva = 0.14;
    Matvare(double pris, int sunnhetsgrad, String navn){
        super(pris);
        if (sunnhetsgrad > 10 || sunnhetsgrad < 1){
            this.sunnhetsgrad = 1;
        } else{
            this.sunnhetsgrad = sunnhetsgrad;
        }
        this.navn = navn;
    }
    public String hentNavn() {
        return navn;
    }
    @Override
    double beregnFullPris(){
        return pris += pris * mva;
    }
    boolean erNokkelhullsmerket(){
        return  sunnhetsgrad >= 6; 
    }
    
}
