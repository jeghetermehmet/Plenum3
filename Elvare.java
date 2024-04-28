public abstract class Elvare extends Vare {
    int batteritid;
    int aarSidenKjop;
    double mva = 0.3;
    Elvare(double pris, int batteritid, int aarSidenKjop){
        super(pris);
        this.batteritid = batteritid;
        this.aarSidenKjop = aarSidenKjop;
    }
    public abstract int beregnBatteritid();
    
    int hentbatteritid(){
        return batteritid;
    }
    @Override
    double beregnFullPris(){
        return pris += pris * mva;
    }


    
}
