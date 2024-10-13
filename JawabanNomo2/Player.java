package JawabanNomo2;

public class Player {
    protected String name;
    protected int age;
    protected String position;
    protected int skills;

    public Player(String name, int age, String position, int skills) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skills = skills;
    }

    public void train() {
        skills += 10;
        System.out.println(name + " is training. Skills improved to " + skills);
    }

    public void play() {
        System.out.println(name + " is playing in the position of " + position);
    }

    public String getName() {
        return name;
    }
}
