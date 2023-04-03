public class SteelRoom extends MazeRoom {
    public SteelRoom(String description) {
        super(description);
    }

    @Override
    public MazeDoor createDoor(String wall) {
        return new NumericLockDoor(1234, wall);
    }
}