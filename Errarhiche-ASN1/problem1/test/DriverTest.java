public class DriverTest {

    public static void main(String[] args) {

        RockLegend player1 = new TheEdge();
        RockLegend player2 = new JimiPage();
        RockLegend player3 = new DavidGilmour();

        System.out.println("---------------------------------");

        player1.display();
        player1.playGuitar();
        player1.performSoloAct();

        System.out.println("---------------------------------");

        player2.display();
        player2.playGuitar();
        player2.performSoloAct();

        System.out.println("---------------------------------");

        player3.display();
        player3.playGuitar();
        player3.performSoloAct();

        System.out.println("---------------------------------");
    }

}
