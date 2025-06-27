import java.util.*;

class Tournament {
    String name, game;
    ArrayList<Player> players;
    public Tournament(String tName, String tGame)
    {
        this.name = tName;
        this.game = tGame;
    }

    // Adds a player to the bracket
    public int addPlayer(String bracket)
    {// TODO
        //players.add 
        return 0;
    }

    // Creates a bracket
    public int bracketMaker()
    {// TODO
        return 0;
    }

    public String nameChanger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to name your tournament? ");
        this.name = scan.nextLine();
        scan.close();
        return this.name;
    }
    public static void main(String[] args)
    {
        Tournament testtourn = new Tournament();
        System.out.println("Welcome to the tournament maker!");
        testtourn.nameChanger();
        Player test = new Player("test");
        System.out.println(test.getName());
    }
}