import java.util.List;
import java.util.ArrayList;

class GameManager {
    private List<game> games;

    public GameManager() {
        games = new ArrayList<>();
    }

    public void addGame(Game game) {
        games.add(game);
    }
}
