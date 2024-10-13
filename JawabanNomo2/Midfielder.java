package JawabanNomo2;

public class Midfielder extends Player {
    protected int assistCount;

    public Midfielder(String name, int age, int skills) {
        super(name, age, "Midfielder", skills);
        this.assistCount = 0;
    }

    public void pass() {
        System.out.println(name + " made a pass.");
        assistCount++;
    }
}
