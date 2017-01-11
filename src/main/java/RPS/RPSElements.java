package RPS;

public enum RPSElements {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    String name;

    RPSElements(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
