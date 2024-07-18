package school;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int apparition, int nobility, int honor, int bravery) {
        super(name, magic, apparition);
        if (isScoreValid(nobility) && isScoreValid(honor) && isScoreValid(bravery)) {
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        } else {
            throw new IllegalArgumentException("Score should be between 0 and 100.");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (isScoreValid(nobility)) {
            this.nobility = nobility;
        } else {
            System.out.println("Nobility score should be between 0 and 100.");
        }
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (isScoreValid(honor)) {
            this.honor = honor;
        } else {
            System.out.println("Honor score should be between 0 and 100.");
        }
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (isScoreValid(bravery)) {
            this.bravery = bravery;
        } else {
            System.out.println("Bravery score should be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public void compareGryffindorStudents(Gryffindor anotherStudent) {
        if (anotherStudent == null) {
            System.out.println("You cannot compare to null");
            return;
        }

        int thisScore = this.totalScore();
        int anotherScore = anotherStudent.totalScore();

        if (thisScore > anotherScore) {
            System.out.println(this.getName() + " is a better Gryffindor student than " + anotherStudent.getName());
        } else if (anotherScore > thisScore) {
            System.out.println(anotherStudent.getName() + " is a better Gryffindor student than " + this.getName());
        } else {
            System.out.println(this.getName() + " and " + anotherStudent.getName() + " are equally good Gryffindor students.");
        }
    }

    protected int totalScore() {
        return nobility + honor + bravery;
    }
}
