public class Datamaskin extends Elvare {
    int RAM;
    String merke;
    double batteristatus;
    Datamaskin(double pris, int batteritid, int aarSidenKjop, int RAM, String merke, double batteristatus){
        super(pris, batteritid, aarSidenKjop);
        this.RAM = RAM;
        this.merke = merke;
        this.batteristatus = batteristatus;
    }
    @Override
    public int beregnBatteritid(){
        return (int) (batteritid * batteristatus);
    }
    
}
