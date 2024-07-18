package school;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int magic, int apparition, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, magic, apparition);
        if (isScoreValid(cunning) && isScoreValid(determination) && isScoreValid(ambition) && isScoreValid(resourcefulness) && isScoreValid(power)) {
            this.cunning = cunning;
            this.determination = determination;
            this.ambition = ambition;
            this.resourcefulness = resourcefulness;
            this.power = power;
        } else {
            throw new IllegalArgumentException("Score should be between 0 and 100.");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (isScoreValid(cunning)) {
            this.cunning = cunning;
        } else {
            System.out.println("Cunning score should be between 0 and 100.");
        }
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (isScoreValid(determination)) {
            this.determination = determination;
        } else {
            System.out.println("Determination score should be between 0 and 100.");
        }
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (isScoreValid(ambition)) {
            this.ambition = ambition;
        } else {
            System.out.println("Ambition score should be between 0 and 100.");
        }
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (isScoreValid(resourcefulness)) {
            this.resourcefulness = resourcefulness;
        } else {
            System.out.println("Resourcefulness score should be between 0 and 100.");
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (isScoreValid(power)) {
            this.power = power;
        } else {
            System.out.println("Power score should be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                "} ";
    }

    public void compareSlytherinStudents(Slytherin anotherStudent) {
        if (anotherStudent == null) {
            System.out.println("You cannot compare to null");
            return;
        }

        int thisScore = this.totalScore();
        int anotherScore = anotherStudent.totalScore();

        if (thisScore > anotherScore) {
            System.out.println(this.getName() + " is a better Slytherin student than " + anotherStudent.getName());
        } else if (anotherScore > thisScore) {
            System.out.println(anotherStudent.getName() + " is a better Slytherin student than " + this.getName());
        } else {
            System.out.println(this.getName() + " and " + anotherStudent.getName() + " are equally good Slytherin students.");
        }
    }

    protected int totalScore() {
        return cunning + determination + ambition + resourcefulness + power;
    }
}
