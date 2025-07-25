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

    private static void mergeSort(int[] array)
    {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i < length; i++)
        {
            if(i < middle) {
                left[i] = array[i];
            }
            else {
                right[j] = array[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }

    private static void merge(int[] left, int[] right, int[] array)
    {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize)
        {
            if(left[l] < right[r])
            {
                array[i] = left[l];
                i++;
                l++;
            }
            else
            {
                array[i] = right[r];
                i++;
                r++;
            }
        }
        while(l < leftSize)
        {
            array[i] = left[l];
            i++;
            l++;
        }
        while(r < rightSize)
        {
            array[i] = right[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        Bracket test = new Bracket("test");
        
    }
}
