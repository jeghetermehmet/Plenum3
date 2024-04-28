public abstract class Vare{
    double pris;
    double mva = 0.25;
    Vare(double pris){
        this.pris = pris;
    }
    double beregnFullPris(){
        return pris += pris * mva;
    }
}