public class WoodenRoom extends MazeRoom {
    public WoodenRoom(String description) {
        super(description);
    }

    @Override
    public MazeDoor createDoor(String wall) {
        return new SimpleDoor(wall);
    }
}





