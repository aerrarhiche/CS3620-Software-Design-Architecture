public class NumericLockDoor extends MazeDoor {
    private int code;

    public NumericLockDoor(int code, String type) {
        super(type);
        this.code = code;
    }

    @Override
    public void open() {
        if (locked) {
            System.out.println("The door is locked.");
            return;
        }
        if (open) {
            System.out.println("The door is already open.");
            return;
        }
        System.out.println("The door opens.");
        open = true;
    }

    @Override
    public void unlock(Object key) {
        if (locked) {
            if (key instanceof Integer) {
                int numericKey = (int) key;
                if (numericKey == code) {
                    System.out.println("The door unlocks.");
                    locked = false;
                } else {
                    System.out.println("Incorrect numeric code.");
                }
            } else {
                System.out.println("Invalid key type.");
            }
        } else {
            System.out.println("The door is already unlocked.");
        }
    }

    @Override
    public void showQuiz() {
        System.out.println("This door doesn't have a quiz.");
    }
}
