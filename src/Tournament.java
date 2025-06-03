import java.util.Scanner;

class Tournament {
    String tName = "";
    public int addPlayer()
    {// TODO
        return 0;
    }
    public int bracketMaker()
    {// TODO
        return 0;
    }

    public String nameChanger() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to name your tournament? ");
        this.tName = scan.nextLine();
        scan.close();
        return this.tName;
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