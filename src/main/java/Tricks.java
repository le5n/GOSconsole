public enum Tricks {

    //// TODO: 02.01.2017 add more tricks
    KICK_FLIP(3), HEEL_FLIP(3), VARIAL_FLIP(3), HARD_FLIP(6), TRE_FLIP(7), SHOVE_IT(2);

    private int difficulty;

    Tricks(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
