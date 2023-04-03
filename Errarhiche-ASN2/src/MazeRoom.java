import java.util.ArrayList;
import java.util.List;

public abstract class MazeRoom {
    private String description;
    private List<MazeDoor> doors;

    public MazeRoom(String description) {
        this.description = description;
        this.doors = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void addDoor(MazeDoor door) {
        doors.add(door);
    }

    public List<MazeDoor> getDoors() {
        return doors;
    }

    public abstract MazeDoor createDoor(String wall);
}
