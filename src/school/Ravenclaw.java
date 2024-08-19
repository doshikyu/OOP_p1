package school;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magic, int apparition, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magic, apparition);

        if (isScoreValid(intelligence) && isScoreValid(wisdom) && isScoreValid(wit) && isScoreValid(creativity)) {
            this.intelligence = intelligence;
            this.wisdom = wisdom;
            this.wit = wit;
            this.creativity = creativity;
        } else {
            throw new IllegalArgumentException("Score should be between 0 and 100.");
        }
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (isScoreValid(intelligence)) {
            this.intelligence = intelligence;
        } else {
            System.out.println("Intelligence score should be between 0 and 100.");
        }
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (isScoreValid(wisdom)) {
            this.wisdom = wisdom;
        } else {
            System.out.println("Wisdom score should be between 0 and 100.");
        }
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (isScoreValid(wit)) {
            this.wit = wit;
        } else {
            System.out.println("Wit score should be between 0 and 100.");
        }
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (isScoreValid(creativity)) {
            this.creativity = creativity;
        } else {
            System.out.println("Creativity score should be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} ";
    }

    public void compareRavenclawStudents(Ravenclaw anotherStudent) {
        if (anotherStudent == null) {
            System.out.println("You cannot compare to null");
            return;
        }

        int thisScore = this.totalScore();
        int anotherScore = anotherStudent.totalScore();

        if (thisScore > anotherScore) {
            System.out.println(this.getName() + " is a better Ravenclaw student than " + anotherStudent.getName());
        } else if (anotherScore > thisScore) {
            System.out.println(anotherStudent.getName() + " is a better Ravenclaw student than " + this.getName());
        } else {
            System.out.println(this.getName() + " and " + anotherStudent.getName() + " are equally good Ravenclaw students.");
        }
    }

    protected int totalScore() {
        return intelligence + wisdom + wit + creativity;
    }
}
