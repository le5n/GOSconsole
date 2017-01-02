public enum RCPElements {
    ROCK("Rock"), PAPER("Paper"), SCISSORS("Scissors");
    String name;

    RCPElements(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
