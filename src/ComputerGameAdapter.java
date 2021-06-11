public class ComputerGameAdapter implements PCGame {
    private ComputerGame game;

    public ComputerGameAdapter(ComputerGame game) {
        this.game = game;
    }

    @Override
    public String getTitle() {
        return game.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (game.getPegiAgeRating()) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        return 0;
    }

    @Override
    public boolean isTripleAGame() {
        return game.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(
                game.getMinimumGpuMemoryInMegabytes() / 1024,
                game.getDiskSpaceNeededInGB(),
                game.getRamNeededInGb(),
                game.getCoreSpeedInGhz(),
                game.getCoresNeeded());
    }
}
