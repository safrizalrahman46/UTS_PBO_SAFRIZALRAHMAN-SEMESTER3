package JawabanNomo2;

public class FootballManager {
    public static void main(String[] args) {
        // Create Player instance
        Player player = new Player("John Doe", 25, "Forward", 75);

        // Create Midfielder instance
        Midfielder midfielder = new Midfielder("Jane Smith", 27, 80);

        // Create DefensiveMidfielder instance
        DefensiveMidfielder defensiveMidfielder = new DefensiveMidfielder("Jack Brown", 26, 85);

        // Perform actions
        player.train();
        player.play();

        midfielder.train();
        midfielder.play();
        midfielder.pass();

        defensiveMidfielder.train();
        defensiveMidfielder.play();
        defensiveMidfielder.pass();
        defensiveMidfielder.defend();

        // Show the number of tackles made by the DefensiveMidfielder
        System.out.println(defensiveMidfielder.getName() + " has made " + defensiveMidfielder.getTacklesMade() + " tackles.");
    }
}
