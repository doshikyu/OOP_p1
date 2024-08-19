package school;

public class Main {
    public static void main(String[] args) {
        // Gryffindor
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 60, 70, 85, 89, 90);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 97, 95, 90, 90, 30);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 40, 50, 88, 67, 5);

        // Hufflepuff
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 65, 60, 75, 80, 85);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 90, 85, 95, 90, 92);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 70, 65, 80, 75, 70);

        // Ravenclaw
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 85, 80, 92, 90, 88, 85);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 75, 70, 85, 80, 85, 82);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 80, 75, 88, 85, 80, 78);

        // Slytherin
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 80, 75, 92, 88, 95, 85, 90);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 75, 70, 85, 80, 82, 75, 88);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 60, 55, 75, 70, 78, 65, 80);

        System.out.println(dracoMalfoy);
        System.out.println(padmaPatil);

        harryPotter.compareGryffindorStudents(hermioneGranger);
        harryPotter.compareToStudent(hermioneGranger);
        ronWeasley.compareGryffindorStudents(ronWeasley);
        ronWeasley.compareToStudent(ronWeasley);

        zachariasSmith.compareHufflepuffStudents(cedricDiggory);
        choChang.compareRavenclawStudents(marcusBelby);
    }
}
