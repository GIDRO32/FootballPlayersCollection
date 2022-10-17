import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        Scanner key = new Scanner(System.in);
        boolean isTyping = true;
        String symbol = null;
        String option = null;
        int find = 1;
        System.out.println("Welcome to the Football Players collection app.");
        while (isTyping) {
            System.out.println("\nType a word to choose an option.");
            System.out.println("\nexit - exit program\nadd player - add player to the collection\nprint - print all players\nsort - sort players by goals\nfind team- find players by team name\nfind nation - find players by nation\nfind name - find players by their names");
            option = key.nextLine();

            if (option.toLowerCase().equals("exit")) {
                break;
            } else if (option.toLowerCase().equals("add player")) {
                System.out.println("Type a player data(name, surname, team-name, Player's nation, number of goals.)\nNote: if Team name or country has more than one word, divide them with a hyphen.\nFor example: Let-the-bodies-hit-the-floor");
                String playerIn = key.nextLine();
                Player pl = new Player();
                pl.stringToProperties(playerIn);
                players.add(pl);

            }
            System.out.println("Continue? Y/N");
            String answer = key.nextLine();

            if (answer.toLowerCase().equals("y")) {
                isTyping = true;
                option = null;
                System.out.println("\nChoose an option.\nexit - exit program\nadd player - add player to the collection\nprint - print all players\nsort - sort players by goals\nfind team- find players by team name\nfind nation - find players by nation\nfind name - find players by their names");
                option = key.nextLine();
            } else
            {
                isTyping = false;
            }
            int i = 0;
            if (option.toLowerCase().equals("print"))
            {
                for (i = 0; i < players.size(); i++)
                {
                    System.out.println("\nPlayer " + (i + 1) + ":");
                    players.get(i).printFullInfo();
                }
            }
            else if (option.toLowerCase().equals("sort"))
            {
                for (i = 0; i < players.size(); i++) {
                    System.out.println("\nPlayer " + (i + 1) + ":");
                    players.sortPlayers();
                    players.get(i).printFullInfo();
                }
            }
            else if (option.toLowerCase().equals("find team"))
            {
                symbol = key.nextLine();
                players.findPlayerTeam(symbol);
            }
            else if (option.toLowerCase().equals("find nation"))
            {
                symbol = key.nextLine();
                players.findPlayerNation(symbol);
            }
            else if (option.toLowerCase().equals("find name"))
            {
                symbol = key.nextLine();
                System.out.println(symbol);
                players.findPlayerName(symbol);
            }
        }
    }

}