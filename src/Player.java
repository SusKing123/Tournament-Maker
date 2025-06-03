class Player {
    // name, rank, standing
    String name;
    int rank, standing;
    public Player(String pName) {
        this.name = pName;
        this.rank = 0;
        this.standing = 0;
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

    public static void main(String[] args)
    {
        System.out.println("I am a Player!");
    }
}