public class PasswordLockDoor extends MazeDoor {
    private String password;

    public PasswordLockDoor(String type, String password) {
        super(type);
        this.password = password;
    }

    @Override
    public void open() {
        if (!locked && !open) {
            System.out.println("The " + type + " door opens.");
            open = true;
        } else if (open) {
            System.out.println("The " + type + " door is already open.");
        } else {
            System.out.println("The " + type + " door is locked.");
        }
    }

    @Override
    public void unlock(Object key) {
        if (key instanceof String) {
            String inputPassword = (String) key;
            if (inputPassword.equals(password)) {
                System.out.println("The " + type + " door is unlocked.");
                locked = false;
            } else {
                System.out.println("Incorrect password for " + type + " door.");
            }
        } else {
            System.out.println("Invalid input for " + type + " door password.");
        }
    }

    @Override
    public void showQuiz() {
        System.out.println("This " + type + " door does not have a quiz.");
    }
}
