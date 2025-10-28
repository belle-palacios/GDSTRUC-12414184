import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player[] arcanePlayers = {
                new Player(1, "Jinx", 5),
                new Player(2, "Vi", 4),
                new Player(3, "Warwick", 2),
                new Player(4, "Jayce", 5),
                new Player(5, "Viktor", 5),
                new Player(6, "Ekko", 3),
                new Player(7, "Renata Glasc", 4),
                new Player(8, "Silco", 5),
        };

        SimpleHashtable hashtable = new SimpleHashtable();

        for (Player p : arcanePlayers) {
            hashtable.put(p.getUserName(), p);
        }
        System.out.println("(TFT themed hashtable :D)\n");
        System.out.println("====== Champions in Your Bench ======\n");
        hashtable.printHashtable();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter a champion's name to remove (or type 'random' to remove a random one, 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("random")) {
                hashtable.removeRandom();
            } else {
                Player target = hashtable.get(input);
                if (target == null) {
                    System.out.println("Invalid name. Try again.");
                    continue;
                } else {
                    hashtable.remove(input);
                }
            }

            System.out.println("\nUpdated Hashtable:");
            hashtable.printHashtable();
        }

        scanner.close();
    }
}
