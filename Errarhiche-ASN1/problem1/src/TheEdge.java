class TheEdge extends RockLegend {
    @Override
    void display() {
        System.out.println("This is The Edge");
    }

    public TheEdge() {
        guitar = new GibsonSG();
        soloAct = new SmashTheGuitar();
    }
}

