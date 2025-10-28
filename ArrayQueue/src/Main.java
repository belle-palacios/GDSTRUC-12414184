import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue playerQueue = new ArrayQueue(50);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int nextPlayerId = 1;
        int gamesMade = 0;

        System.out.println("==============================================================\n");
        System.out.println("WELCOME TO THE BORDERLAND\n");
        System.out.println("To survive, you must play 10 games to extend your visa.");
        System.out.println("Each game requires at least five participants, maximum of 7.\n");
        System.out.println("==============================================================");

        for(; gamesMade < 10; System.out.println("Remaining participants in queue: " + playerQueue.size())) {
            System.out.print("\nPress ENTER to register partcipants...");
            String input = scanner.nextLine();
            int newPlayers = rand.nextInt(7) + 1;
            System.out.println("Adding " + newPlayers + " new participants to the game...");

            for(int i = 0; i < newPlayers; ++i) {
                int level = rand.nextInt(100) + 1;
                Player newPlayer = new Player(nextPlayerId, "Player" + nextPlayerId, level);
                playerQueue.enqueue(newPlayer);
                System.out.println("Registered (Enqueued): " + String.valueOf(newPlayer));
                ++nextPlayerId;
            }

            if (playerQueue.size() < 5) {
                System.out.println("Not enough participants to start the game (" + playerQueue.size() + "/5 in queue).");
            } else {
                System.out.println("\n===================================================");
                System.out.println("\nGame " + (gamesMade + 1) + " will now commence.\n");
                System.out.println("Participants in this match:");

                for(int i = 0; i < 5; ++i) {
                    Player player = playerQueue.dequeue();
                    System.out.println(" - " + String.valueOf(player));
                }

                ++gamesMade;
                System.out.println("\nGame " + gamesMade + " started!\n");
                System.out.println("===================================================");
            }
        }

        System.out.println("\n10 GAMES COMPLETED. THANK YOU FOR PLAYING :D");
        scanner.close();
    }
}
