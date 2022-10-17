public class Players
{
    private Players[] player;
    public String name;
    public String surname;
    public String teamName;
    public String nation;
    public int goals;
    private int length = 0;
    private int option = 0;
    public void printFullInfo()
    {
        System.out.println("Full Name: " + name + " " + surname + "\nTeam Name: " + teamName + "\nNation: " + nation + "\nGoals: " + goals);
    }
    public void sortPlayers()
    {
        boolean isSorted = false;
        int outIterations = 0;

        while (!isSorted)
        {
            isSorted = true;

            for (int j = 0; j < length - outIterations - 1; j++)
            {
                if (player[j].goals > player[j + 1].goals)
                {
                    isSorted = false;
                    // Swap the elements
                    Players temp = player[j];
                    player[j] = player[j + 1];
                    player[j + 1] = temp;
                }

            }
            outIterations++;
        }
    }
    public void findPlayerName(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (player[i].name.contains(searchKey))
                player[i].printFullInfo();
    }
    public void findPlayerTeam(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (player[i].teamName.contains(searchKey))
                player[i].printFullInfo();
    }
    public void findPlayerNation(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (player[i].nation.contains(searchKey))
                player[i].printFullInfo();
    }
    public void addPlayer(Players arg)
    {

        // increasing array by 1 element every time addPlayer() is called
        // Also possible to uses Arrays.copyOf()
        Players[] arr = new Players[length+1];
        for(int i=0; i < arr.length-1; i++)
        {
            arr[i] = player[i];
        }
        arr[length] = arg;
        length++;
        player = arr;
    }
    public void stringToProperties(String playerTag)
    {
        String[] playerArr = playerTag.trim().split(" ");
        this.name = playerArr[0];
        this.surname = playerArr[1];
        this.teamName = playerArr[2];
        this.nation = playerArr[3];
        this.goals = Integer.parseInt(playerArr[4]);
    }
}
