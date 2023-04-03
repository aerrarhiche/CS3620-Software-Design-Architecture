abstract class RockLegend {
    Guitar guitar;
    SoloAct soloAct;

    public RockLegend() {
    }

    public void setGuitarBehavior(Guitar guitar1){guitar = guitar1;}

    public void setSoloActBehavior(SoloAct soloAct1){
        soloAct = soloAct1;
    }
    public void playGuitar() {guitar.play();}
    public void performSoloAct() {
        soloAct.perform();
    }

    abstract void display();
}
