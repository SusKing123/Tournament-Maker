import java.util.*;

public class Bracket {
    String name;
    ArrayList<Player> players;
    public Bracket(String bName)
    {
        this.name = bName;
    }

    // Adds a player to the bracket
    public boolean addPlayer(String playerName)
    {
        Player newPlayer = new Player(playerName);
        players.add(newPlayer);
        return true;
    }

    // Removes player from the bracket
    public boolean removePlayer(String playerName)
    {
        for(int i = 0; i < players.size(); i++)
        {
            if(players.get(i).getName() == playerName)
            {
                players.remove(i);
                return true;
            }
        }
        System.out.println("Player does not exist. ");
        return false;
    }

    // Changes the name of the bracket
    public void bracketName(String newName)
    {
        this.name = newName;
    }

    // Sorts the bracket
    //TODO
    private void bracketSorter()
    {
        ArrayList<Player> temp = players;
    }

    public static void main(String[] args) {
        Bracket test = new Bracket("test");
        
    }
}
