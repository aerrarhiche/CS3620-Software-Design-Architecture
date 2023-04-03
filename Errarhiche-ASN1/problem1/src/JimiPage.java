class JimiPage extends RockLegend {

    @Override
    void display() {
        System.out.println("This is Jimi Page");
    }

    public JimiPage() {
        guitar = new FenderStratocaster();
        soloAct = new SetTheGuitarOnFire();
    }
}
