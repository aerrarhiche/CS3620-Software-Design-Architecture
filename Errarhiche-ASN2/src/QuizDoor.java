public class QuizDoor extends MazeDoor {
    private String quiz;
    private String answer;

    public QuizDoor(String type, String quiz, String answer) {
        super(type);
        this.quiz = quiz;
        this.answer = answer;
        this.locked = true;
    }

    @Override
    public void open() {
        if (!this.locked) {
            System.out.println("The " + this.type + " door is already open!");
            return;
        }
        System.out.println("You need to unlock the " + this.type + " door with the correct answer.");
    }

    @Override
    public void unlock(Object key) {
        if (!this.locked) {
            System.out.println("The " + this.type + " door is already unlocked!");
            return;
        }
        String inputAnswer = (String) key;
        if (inputAnswer.equals(this.answer)) {
            this.locked = false;
            System.out.println("You have unlocked the " + this.type + " door!");
        } else {
            System.out.println("Incorrect answer. The " + this.type + " door remains locked.");
        }
    }

    @Override
    public void showQuiz() {
        System.out.println("The quiz for the " + this.type + " door is: " + this.quiz);
    }
}
