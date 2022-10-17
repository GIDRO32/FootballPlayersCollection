public class Players
{
    private Player[] players;
        private int length = 0;
        private int option = 0;
    public void sortPlayers()
    {
        boolean isSorted = false;
        int outIterations = 0;

        while (!isSorted)
        {
            isSorted = true;

            for (int j = 0; j < length - outIterations - 1; j++)
            {
                if (players[j].goals > players[j + 1].goals)
                {
                    isSorted = false;
                    // Swap the elements
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }

            }
            outIterations++;
        }
    }
    public void findPlayerName(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (players[i].name.contains(searchKey))
                players[i].printFullInfo();
    }
    public void findPlayerTeam(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (players[i].teamName.contains(searchKey))
                players[i].printFullInfo();
    }
    public void findPlayerNation(String searchKey)
    {
        for (int i = 0; i < length; i++)
            if (players[i].nation.contains(searchKey))
                players[i].printFullInfo();
    }
    public void addPlayer(Player arg)
    {

        // increasing array by 1 element every time addPlayer() is called
        // Also possible to uses Arrays.copyOf()
        Player[] arr = new Player[length+1];
        for(int i=0; i < arr.length-1; i++)
        {
            arr[i] = players[i];
        }
        arr[length] = arg;
        length++;
        players = arr;
    }

}
