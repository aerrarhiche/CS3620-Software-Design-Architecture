public class BrickRoom extends MazeRoom {
    public BrickRoom(String description) {
        super(description);
    }

    @Override
    public MazeDoor createDoor(String wall) {
        return new PasswordLockDoor(wall, "secret");
    }
}