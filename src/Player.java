class Player {
    // name, rank, seed
    String name;
    int rank, seed;
    public Player(String pName) {
        this.name = pName;
        this.rank = 0;
        this.seed = 0;
    }

    // Getters and Setters
    public void setName(String rename) {
        this.name = rename;
    }

    public String getName() {
        return this.name;
    }

    public void setRank(int rerank) {
        this.rank = rerank;
    }

    public int getRank() {
        return this.rank;
    }

    public void setSeed(int newSeed)
    {
        this.seed = newSeed;
    }

    public int getSeed()
    {
        return this.seed;
    }

    public static void main(String[] args)
    {
        System.out.println("I am a Player!");
    }
}