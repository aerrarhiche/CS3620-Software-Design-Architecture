public class SimpleDoor extends MazeDoor {
    private String wall;

    public SimpleDoor(String wall) {
        super("simple");
        this.wall = wall;
    }

    @Override
    public void open() {
        System.out.println("The " + wall + " door opens.");
        open = true;
    }

    @Override
    public void unlock(Object key) {
        System.out.println("This door doesn't have a lock.");
    }

    @Override
    public void showQuiz() {
        // do nothing, since simple doors do not have quizzes
    }
}