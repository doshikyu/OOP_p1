package school;

public abstract class Hogwarts {
    private int magic;
    private int apparition; // трансгрессия

    public Hogwarts(int magic, int apparition) {
        this.magic = magic;
        this.apparition = apparition;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getApparition() {
        return apparition;
    }

    public void setApparition(int apparition) {
        this.apparition = apparition;
    }
}
