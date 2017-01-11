package skate;

public enum Tricks {

    //// TODO: 02.01.2017 add more tricks
    KICK_FLIP(3, "kick flip"), HEEL_FLIP(3, "heel flip"), VARIAL_FLIP(3, "varial flip"), HARD_FLIP(6, "hard flip"),
    TRE_FLIP(7, "360 flip"), SHOVE_IT(2, "shove it"), SW_TRE_DOUBLE_FLIP(10, "switch 360 double flip");

    private int difficulty;
    private String name;

    Tricks(int difficulty, String name) {
        this.difficulty = difficulty;
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return name;
    }
}
