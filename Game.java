import java.util.*;

public class Game {
    List<Player> players;


    public Game() {
        players = new ArrayList<>();
    }

    public void initPlayers() {
        players.add(new Player("Антон"));
        players.add(new Player("Борис"));
        players.add(new Player("Данил"));
        players.add(new Player("Евгений"));
        players.add(new Player("Константин"));
        players.add(new Player("Феодосия"));
        Collections.sort(players, new ComparatorPlayer());
    }

    public void add(Player player) {
        List<String> namesPlayers = new ArrayList<>();
        for (Player currentPlayer : players) {
            namesPlayers.add(currentPlayer.getName());
        }
        int index = Collections.binarySearch(namesPlayers, player.getName());
        if (index < 0) {
            players.add(-index - 1, player);
        }
    }

    public List<Player> getWinners() {
        List<Player> winners = new ArrayList<>();
        Collections.shuffle(players);

        for (int i = 0; i < 3; i++) {
            winners.add(players.get(i));
        }
        return winners;
    }

    public List<Player> getPlayers() {
        Collections.reverse(players);
        return players;
    }
}
