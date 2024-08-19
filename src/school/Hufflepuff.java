package school;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int apparition, int hardWork, int loyalty, int honesty) {
        super(name, magic, apparition);
        if (isScoreValid(hardWork) && isScoreValid(loyalty) && isScoreValid(honesty)) {
            this.hardWork = hardWork;
            this.loyalty = loyalty;
            this.honesty = honesty;
        } else {
            throw new IllegalArgumentException("Score should be between 0 and 100.");
        }
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        if (isScoreValid(hardWork)) {
            this.hardWork = hardWork;
        } else {
            System.out.println("Hard work score should be between 0 and 100.");
        }
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (isScoreValid(loyalty)) {
            this.loyalty = loyalty;
        } else {
            System.out.println("Loyalty score should be between 0 and 100.");
        }
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (isScoreValid(honesty)) {
            this.honesty = honesty;
        } else {
            System.out.println("Honesty score should be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString() +
                ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} ";
    }

    public void compareHufflepuffStudents(Hufflepuff anotherStudent) {
        if (anotherStudent == null) {
            System.out.println("You cannot compare to null");
            return;
        }

        int thisScore = this.totalScore();
        int anotherScore = anotherStudent.totalScore();

        if (thisScore > anotherScore) {
            System.out.println(this.getName() + " is a better Hufflepuff student than " + anotherStudent.getName());
        } else if (anotherScore > thisScore) {
            System.out.println(anotherStudent.getName() + " is a better Hufflepuff student than " + this.getName());
        } else {
            System.out.println(this.getName() + " and " + anotherStudent.getName() + " are equally good Hufflepuff students.");
        }
    }

    protected int totalScore() {
        return hardWork + loyalty + honesty;
    }
}
