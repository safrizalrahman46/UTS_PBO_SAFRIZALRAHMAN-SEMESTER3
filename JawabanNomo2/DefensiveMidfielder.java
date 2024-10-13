package JawabanNomo2;

public class DefensiveMidfielder extends Midfielder {
    private int tacklesMade;

    public DefensiveMidfielder(String name, int age, int skills) {
        super(name, age, skills);
        this.tacklesMade = 0;
    }

    public void defend() {
        System.out.println(getName() + " made a tackle.");
        tacklesMade++;
    }

    // Getter for tacklesMade
    public int getTacklesMade() {
        return tacklesMade;
    }
}
