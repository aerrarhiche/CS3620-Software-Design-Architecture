public class GlassRoom extends MazeRoom {
    public GlassRoom(String description) {
        super(description);
    }

    @Override
    public MazeDoor createDoor(String wall) {
        return new QuizDoor(wall, "What is the capital of France?", "Paris");
    }
}