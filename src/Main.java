public class Main {
    public static void main(String[] args) {
        ComputerGame compGame = new ComputerGame(
                "The Witcher 3: Wild Hunt",
                PegiAgeRating.P18,
                81.0,
                2048,
                40,
                6,
                4,
                3.3);
        PCGame game = new ComputerGameAdapter(compGame);
        String description = game.getTitle() + " is AAA game? " +
                game.isTripleAGame() + ", min age: " + game.getPegiAllowedAge() + ", " + game.getRequirements();
        System.out.println(description);
    }
}
