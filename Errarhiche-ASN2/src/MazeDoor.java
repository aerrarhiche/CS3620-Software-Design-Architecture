public abstract class MazeDoor {
    protected String type;
    protected boolean locked;
    protected boolean open;

    public MazeDoor(String type) {
        this.type = type;
        this.locked = false;
        this.open = false;
    }

    public abstract void open();

    public abstract void unlock(Object key);

    public abstract void showQuiz();

    public String getType() {
        return type;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isOpen() {
        return open;
    }
}
