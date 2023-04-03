class DavidGilmour extends RockLegend {

    @Override
    void display() {
        System.out.println("This is David Gilmour");
    }

    public DavidGilmour() {
        guitar = new GibsonLesPaul();
        soloAct = new JumpOffTheStage();
    }

}
