package school;

public abstract class Hogwarts {


    private String name;
    private int magic;
    private int apparition; // трансгрессия

    public Hogwarts(String name, int magic, int apparition) {
        if (!name.isEmpty() && isScoreValid(magic) && isScoreValid(apparition)) {
            this.name = name;
            this.magic = magic;
            this.apparition = apparition;
        } else {
            throw new IllegalArgumentException("Score should be between 0 and 100.");
        }
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (isScoreValid(magic)) {
            this.magic = magic;
        } else {
            System.out.println("Magic score should be between 0 and 100.");
        }
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        if (isScoreValid(apparition)) {
            this.apparition = apparition;
        } else {
            System.out.println("Apparition score should be between 0 and 100.");
        }
    }

    protected boolean isScoreValid(int score) {
        if (score >= 0 && score <= 100) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", magic=" + magic +
                ", apparition=" + apparition;
    }

    public void compareToStudent(Hogwarts anotherStudent) {
        if (anotherStudent == null) {
            System.out.println("You cannot compare to null");
            return;
        }

        compareSkills(this.magic, anotherStudent.magic, "magic", anotherStudent);
        compareSkills(this.apparition, anotherStudent.apparition, "apparition", anotherStudent);
    }

    private void compareSkills(int thisSkillScore, int anotherSkillValue, String attributeName, Hogwarts otherStudent) {
        if (thisSkillScore == anotherSkillValue) {
            System.out.println(this.getName() + " and " + otherStudent.getName() + " have equally strong " + attributeName + ".");
        } else if (thisSkillScore > anotherSkillValue) {
            System.out.println(this.getName() + " has stronger " + attributeName + " than " + otherStudent.getName());
        } else {
            System.out.println(otherStudent.getName() + " has stronger " + attributeName + " than " + this.getName());
        }
    }
}
