import java.util.*;

public class Bracket {
    String name;
    ArrayList<Player> players;
    public Bracket(String bName)
    {
        this.name = bName;
    }

    public boolean addPlayer(String playerName)
    {
        Player newPlayer = new Player(playerName);
        players.add(newPlayer);
        return true;
    }

    public static void main(String[] args) {
        Bracket test = new Bracket("test");
        
    }
}
