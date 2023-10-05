public abstract class game {
    protected String name;
    protected String type;

    public game(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract int calculateScore();
    // In this funtion we calculate the score of the player based on
    // the type of game 
} 
